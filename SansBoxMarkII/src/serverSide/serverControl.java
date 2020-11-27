package serverSide;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.awt.Color;

public class serverControl {

    private int port;
    private List<User> clients;
    private ServerSocket server;

    public static void main(String[] args) throws IOException {
        new serverControl(1249).run();
    }

    public serverControl(int port) {
        this.port = port;
        this.clients = new ArrayList<User>();
    }

    public void run() throws IOException {
        server = new ServerSocket(port) {
            protected void finalize() throws IOException {
                this.close();
            }
        };
        System.out.println("Port 1249 is now open.");

        while (true) {

            Socket client = server.accept();// khoi tao client socket

//            System.out.println(client.toString());
            String nickname = (new Scanner(client.getInputStream())).nextLine();// lay ten cua user
            nickname = nickname.replace(",", ""); //  ',' use for serialisation
            nickname = nickname.replace(" ", "_");
            System.out.println("New Client: \"" + nickname + "\"\n\t     Host:" + client.getInetAddress().getHostAddress());

            User newUser = new User(client, nickname);// tao moi doi tuong nguoi dung

            this.clients.add(newUser);// them doi tuong nguoi dung vao list

            newUser.getOutStream().println(newUser.toString());// gui lai ten inchat cho nguoi dung

            new Thread(new UserHandler(this, newUser)).start();// chay luong bat tin nhan moi cua nguoi dung
        }
    }

    public void removeUser(User user) { // xoa nguoi dung khoi danh sach
        this.clients.remove(user);
    }

    public void broadcastMessages(String msg, User userSender) { // gui tin nhan cho toan bo nguoi trong group
        for (User client : this.clients) {
            System.out.println("Su dunging");
            String DAMN = userSender.getNickname();
            System.out.println(userSender.toString() + " : " + msg); // master_erik : xin chao
//            client.getOutStream().println(userSender.toString() + " : " + msg + "\n");
            client.getOutStream().println( "@ " + DAMN +" : "+msg);
        }
    }

    public void broadcastAllUsers() {// gui danh sach nguoi dang onlne cho cac nguoi dung khac
        for (User client : this.clients) {
            client.getOutStream().println(this.clients);
        }
    }

    public void sendMessageToUser(String msg, User userSender, String user) {// gui tin nhan an danh rieng tu
        boolean find = false;
        for (User client : this.clients) {
            if (client.getNickname().equals(user) && client != userSender) {
                find = true;
                userSender.getOutStream().println(userSender.toString() + " -> " + client.toString() + ": " + msg);
                System.out.println(userSender.toString() + " : " + msg);
                client.getOutStream().println(userSender.toString() + " : " + msg);
            }
        }
        if (!find) {
            userSender.getOutStream().println(userSender.toString() + " -> (<b>no one!</b>): " + msg);
        }
    }
}

class UserHandler implements Runnable {

    private serverControl server; // khai bao server
    private User user;// khai bao nguoi dung

    public UserHandler(serverControl server, User user) {
        this.server = server;
        this.user = user;
        this.server.broadcastAllUsers();
    }

    public void run() {
        String message;
        
        Scanner sc = new Scanner(this.user.getInputStream());// Nhan duoc tin nhan thi gui cho tat ca
        
        while (sc.hasNextLine()) {
            message = sc.nextLine();
            
            if (message.charAt(0) == '@') { // chat an danh
                if (message.contains(" ")) {
                    System.out.println("Private");
                    System.out.println("private msg : " + message);
                    int firstSpace = message.indexOf(" ");
                    String userPrivate = message.substring(1, firstSpace);
                    server.sendMessageToUser(message.substring(firstSpace + 1, message.length()), user, userPrivate);
                }

            // doi mau ten 
            } else if (message.charAt(0) == '#') {
                user.changeColor(message);
                // update color for all other users
                this.server.broadcastAllUsers();
            } else {
                // update user list
                System.out.println("Public");
                server.broadcastMessages(message, user);
            }
        }
        // end of Thread
        server.removeUser(user);
        this.server.broadcastAllUsers();
        sc.close();
    }
}

class User {

    private static int nbUser = 0;
    private int userId;
    private PrintStream streamOut;
    private InputStream streamIn;
    private String nickname;
    private Socket client;
    private String color;

    // constructor
    public User(Socket client, String name) throws IOException {
        this.streamOut = new PrintStream(client.getOutputStream());
        this.streamIn = client.getInputStream();
        this.client = client;
        this.nickname = name;
        this.userId = nbUser;
        this.color = ColorInt.getColor(this.userId);
        nbUser += 1;
    }

    // change color user
    public void changeColor(String hexColor) {
        // check if it's a valid hexColor
        Pattern colorPattern = Pattern.compile("#([0-9a-f]{3}|[0-9a-f]{6}|[0-9a-f]{8})");
        Matcher m = colorPattern.matcher(hexColor);
        if (m.matches()) {
            Color c = Color.decode(hexColor);
            // if the Color is too Bright don't change
            double luma = 0.2126 * c.getRed() + 0.7152 * c.getGreen() + 0.0722 * c.getBlue(); // per ITU-R BT.709
            if (luma > 160) {
                this.getOutStream().println("<b>Color Too Bright</b>");
                return;
            }
            this.color = hexColor;
            this.getOutStream().println("<b>Color changed successfully</b> " + this.toString());
            return;
        }
        this.getOutStream().println("<b>Failed to change color</b>");
    }

    // getteur
    public PrintStream getOutStream() {
        return this.streamOut;
    }

    public InputStream getInputStream() {
        return this.streamIn;
    }

    public String getNickname() {
        return this.nickname;
    }

    // print user with his color
    public String toString() {

//        return "<u><span style='color:"+ this.color
//                +"'>" + this.getNickname() + "</span></u>";
        return this.getNickname();
    }
}

class ColorInt {

    public static String[] mColors = {
        "#3079ab", // dark blue
        "#e15258", // red
        "#f9845b", // orange
        "#7d669e", // purple
        "#53bbb4", // aqua
        "#51b46d", // green
        "#e0ab18", // mustard
        "#f092b0", // pink
        "#e8d174", // yellow
        "#e39e54", // orange
        "#d64d4d", // red
        "#4d7358", // green
    };

    public static String getColor(int i) {
        return mColors[i % mColors.length];
    }
}
