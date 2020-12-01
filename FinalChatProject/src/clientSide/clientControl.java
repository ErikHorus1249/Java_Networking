package clientSide;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import javax.swing.JFrame;

/**
 *
 * @author erik
 */
public class clientControl {

    private String HOST;
    private int PORT;
    private boolean darkMode;
    private String oldMsg = "";
    private String nickName;
    private Thread read;
    private BufferedReader input;
    private PrintWriter output;
    private Socket socket;
    private Scanner sc;
    private clientView view;

    public clientControl() {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(clientView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(clientView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(clientView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(clientView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        view = new clientView();
        view.setVisible(true);
    }

    public void listen() throws IOException {
        while (true) {
            HOST = view.getHost();
            PORT = view.getPort();
            nickName = view.getNickname();
            if (view.getConnectStatus()) {
                run();
                break;
            }
        }
    }

    public void run() throws IOException {

        socket = new Socket(HOST, PORT);
//        System.out.println("Host: " + HOST + " port: " + PORT + " nickname: " + nickName);
        view.getNotify("Welcome " + nickName, "Connect Successful", 1);

        view.changeStage(0);

        view.setTextDisplay("Connecting to " + socket.getRemoteSocketAddress() + "\n");

        this.oldMsg += "Connected to " + socket.getRemoteSocketAddress() + "\n";

        input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        output = new PrintWriter(socket.getOutputStream(), true);
        output.println(nickName); // gui ten cho server
        view.disableTextField();
        read = new Receive();
        read.start();
        while (!Thread.currentThread().isInterrupted()) {
            if (view.getSendStatus()) {
                sendMessage();
                view.setSendStatus(false);
            }
        }
    }

    public void connect() throws IOException {
        socket = new Socket(HOST, PORT);
        view.getNotify("Welcome " + nickName, "Connect Successful", 1);
    }

    public void sendMessage() {

        String message = view.getMessageFromTextField().trim();

        if (message.equals("")) {
            return;
        }

        output.println(message);

        view.clearMessageTextField();

    }

    class Receive extends Thread {

        public void run() {
            String message;
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    message = input.readLine();
                    System.out.println("truoc " + message);

                    if (message != null) {

                        if (message.charAt(0) == '[') {
                            message = message.substring(1, message.length() - 1);
                            ArrayList<String> ListUser = new ArrayList<String>(
                                    Arrays.asList(message.split(","))
                            );

                            view.clearOnlineListDisplay();
                            String userListDis = "";
                            for (String user : ListUser) {
                                userListDis += "\n#" + user;
                            }
                            view.setOnlineListDisplay(userListDis);
                            System.out.println(userListDis);
                        } else if (message.charAt(0)=='%') {
                            message = message.substring(5,message.length());
                            System.out.println("Tin nhan cu "+message);
                            System.out.println(oldMsg);
                            oldMsg += "\n" + message;
                            view.setTextDisplay(oldMsg);
                        } else {
                            System.out.println(oldMsg);
                            oldMsg += "\n" + message;
                            view.setTextDisplay(oldMsg);
                        }
                    }
                } catch (IOException ex) {
                    System.err.println("Failed to parse incoming message");
                }
            }
        }
    }

}
