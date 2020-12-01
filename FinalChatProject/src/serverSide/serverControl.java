package serverSide;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class serverControl {

    private final int PORT;
    private final List<User> users;
    private ServerSocket server;
    private String oldMessage;

    public serverControl(int port) {
        this.PORT = port;
        this.users = new ArrayList<>();
    }

    public void run() throws IOException {
        server = new ServerSocket(PORT) {
            protected void finalize() throws IOException {
                this.close();
            }
        };

        getThreadId(); // test thread

        System.out.println("Port 1249 is now open."); // thong bao server dang hoat dong

        while (!Thread.currentThread().isInterrupted()) {

            Socket socket = server.accept();// khoi tao client socket khi server accept
            String nickname = (new Scanner(socket.getInputStream())).nextLine().trim();// lay ten cua user
            nickname = validate(nickname);
            System.out.println("New Client: \"" + nickname + "\"     Host:" + socket.getInetAddress().getHostAddress());
            new Thread(new UserHandler(this, addUser(socket, nickname))).start();// chay luong bat tin nhan moi cua nguoi dung
            System.out.println("OLD "+oldMessage);
        }
    }

    private User addUser(Socket sock, String nickname) throws IOException {

        User newUser = new User(sock, nickname);// tao moi doi tuong nguoi dung
        this.users.add(newUser);// them doi tuong nguoi dung vao list
        sendNickname(newUser);
        sendOldMessage(newUser);
        return newUser;

    }

    public void removeUser(User user) { // xoa nguoi dung khoi danh sach
        this.users.remove(user);
    }

    private void sendNickname(User user) {// gui lai ten inchat cho nguoi dung
        user.getOutStream().println("Server give your nickname : " + user.toString());
    }

    private void sendOldMessage(User user) {
        if(oldMessage!=null) user.getOutStream().println("%"+getOldMessage());
    }

    public void broadcastMessages(String msg, User userSender) { // gui tin nhan cho toan bo nguoi trong group
        String sendMess = "@ " + userSender.getNickname() + " : " + msg;
        for (User client : this.users) {    
            client.getOutStream().println(sendMess);
        }
        setOldMessage("\n"+sendMess);
    }

    public void broadcastAllUsers() {// gui danh sach nguoi dang onlne cho cac nguoi dung khac
        for (User client : this.users) {
            client.getOutStream().println(this.users);
        }
    }

    private String validate(String nickname) {
        nickname = nickname.replace(",", "");
        nickname = nickname.replace(" ", "_");
        return nickname;
    }

    public void getThreadId() {
        System.out.println(Thread.currentThread().getId());
    }

    public void unicastMessages(String msg, User userSender, String user) {// gui tin nhan an danh rieng tu
        boolean find = false;
        for (User client : this.users) {
            if (client.getNickname().equals(user) && client != userSender) {
                find = true;
                userSender.getOutStream().println(userSender.toString() + " -> " + client.toString() + ": " + msg);
                System.out.println(userSender.toString() + " : " + msg);
                client.getOutStream().println(userSender.toString() + " : " + msg);
            }
        }
        if (!find) {
            userSender.getOutStream().println(userSender.toString() + " -> no one!): " + msg);
        }
    }

    public String getOldMessage() {
        return oldMessage;
    }

    public void setOldMessage(String msg) {
        this.oldMessage += msg;
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

        server.getThreadId();
        String message;
        Scanner sc = new Scanner(this.user.getInputStream());

        while (sc.hasNextLine()) {
            message = sc.nextLine();
            if (message.charAt(0) == '@') { // chat an danh
                privateSend(message);
            } else {// chat cong khai

                publicSend(message);

            }
        }
        // end of Thread
        server.removeUser(user);
        this.server.broadcastAllUsers();
        sc.close();
    }

    private void publicSend(String message) {
        System.out.println("Public");

        server.broadcastMessages(message, user);
    }

    private void privateSend(String message) {
        if (message.contains(" ")) {
            System.out.println("private msg : " + message);
            int firstSpace = message.indexOf(" ");
            String userPrivate = message.substring(1, firstSpace);
            server.unicastMessages(message.substring(firstSpace + 1, message.length()), user, userPrivate);
        }
    }
}

class User {

    private static int nbUser = 0;
    private int userId;
    private PrintStream streamOut;
    private InputStream streamIn;
    private String nickname;
    private Socket client;

    // constructor
    public User(Socket client, String name) throws IOException {
        this.streamOut = new PrintStream(client.getOutputStream());
        this.streamIn = client.getInputStream();
        this.client = client;
        this.nickname = name;
        this.userId = nbUser;
        nbUser += 1;
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

    public String toString() {
        return this.getNickname();
    }
}
