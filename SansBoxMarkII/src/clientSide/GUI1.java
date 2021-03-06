/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientSide;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextPane;
import javax.swing.text.html.HTMLDocument;
import javax.swing.text.html.HTMLEditorKit;

/**
 *
 * @author erik
 */
public class GUI1 extends javax.swing.JFrame implements Runnable {

    private String oldMsg = "";
    private Thread read;
    private String HOST;
    private int PORT;
    private String nickName;
    private int count = 0;
    BufferedReader input;
    PrintWriter output;
    Socket serverSocket;
//    private Client client = null;

    public GUI1() {
        initComponents();
        this.setLocationRelativeTo(null);

        this.HOST = jTextField_host.getText();
        this.PORT = Integer.parseInt(jTextField_port.getText());
        this.nickName = jTextField_nickname.getText();
        jButton_disconnect.setVisible(false);
        
//        jTextPane_displays.setText();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane_displays = new javax.swing.JTextPane();
        jTextField_mesage = new javax.swing.JTextField();
        jLabel_logoSend = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jTextField_host = new javax.swing.JTextField();
        jTextField_port = new javax.swing.JTextField();
        jButton_connect = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField_nickname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton_disconnect = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel_minizone = new javax.swing.JLabel();
        jLabel_exit = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextPane_listuser = new javax.swing.JTextPane();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(225, 250, 248));

        jTabbedPane1.setBackground(new java.awt.Color(86, 215, 240));
        jTabbedPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel2.setBackground(new java.awt.Color(23, 8, 33));

        jTextPane_displays.setFont(new java.awt.Font("Chilanka", 0, 16)); // NOI18N
        jTextPane_displays.setForeground(new java.awt.Color(15, 10, 80));
        jScrollPane2.setViewportView(jTextPane_displays);

        jTextField_mesage.setText("Message");
        jTextField_mesage.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField_mesageFocusLost(evt);
            }
        });
        jTextField_mesage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField_mesageMouseClicked(evt);
            }
        });
        jTextField_mesage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_mesageActionPerformed(evt);
            }
        });

        jLabel_logoSend.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clientSide/Pinterest_UI-09-512.png"))); // NOI18N
        jLabel_logoSend.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_logoSend.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_logoSendMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_logoSendMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jTextField_mesage, javax.swing.GroupLayout.DEFAULT_SIZE, 448, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel_logoSend)
                        .addGap(21, 21, 21))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField_mesage, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_logoSend))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Chat Box", jPanel2);

        jPanel3.setBackground(new java.awt.Color(23, 8, 33));

        jTextField_host.setText("localhost");

        jTextField_port.setText("1249");

        jButton_connect.setBackground(new java.awt.Color(247, 235, 54));
        jButton_connect.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jButton_connect.setText("Connect");
        jButton_connect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_connectActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Chilanka", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(254, 254, 254));
        jLabel1.setText("Port");

        jLabel3.setFont(new java.awt.Font("Chilanka", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(254, 254, 254));
        jLabel3.setText("Host name");

        jTextField_nickname.setText("Nick name");

        jLabel4.setFont(new java.awt.Font("Chilanka", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(254, 254, 254));
        jLabel4.setText("Nick name");

        jButton_disconnect.setBackground(new java.awt.Color(34, 187, 239));
        jButton_disconnect.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jButton_disconnect.setText("Disconnect");
        jButton_disconnect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_disconnectActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_disconnect, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_host, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jTextField_port, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(59, 59, 59)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4)
                            .addComponent(jTextField_nickname, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                            .addComponent(jButton_connect, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(163, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_host, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_nickname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_port, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_connect))
                .addGap(39, 39, 39)
                .addComponent(jButton_disconnect)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Settings", jPanel3);

        jLabel2.setBackground(new java.awt.Color(250, 230, 68));
        jLabel2.setFont(new java.awt.Font("Chilanka", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(27, 202, 238));
        jLabel2.setText("Vhat App");

        jLabel_minizone.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel_minizone.setText("  -");
        jLabel_minizone.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel_minizone.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_minizone.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_minizoneMouseClicked(evt);
            }
        });

        jLabel_exit.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel_exit.setText("  X");
        jLabel_exit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel_exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_exitMouseClicked(evt);
            }
        });

        jTextPane_listuser.setBackground(new java.awt.Color(254, 254, 254));
        jTextPane_listuser.setFont(new java.awt.Font("Chilanka", 1, 18)); // NOI18N
        jScrollPane3.setViewportView(jTextPane_listuser);

        jLabel5.setBackground(new java.awt.Color(1, 196, 115));
        jLabel5.setFont(new java.awt.Font("Chilanka", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(49, 155, 190));
        jLabel5.setText("Onlines");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clientSide/logo.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addGap(153, 153, 153)
                        .addComponent(jLabel_minizone, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(jLabel_exit, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)))
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 555, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel_minizone)
                                        .addComponent(jLabel_exit)))
                                .addGap(13, 13, 13)))
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel_minizoneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_minizoneMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel_minizoneMouseClicked

    private void jLabel_exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_exitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel_exitMouseClicked

    private void jButton_connectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_connectActionPerformed

        try {
            this.HOST = jTextField_host.getText();
            this.PORT = Integer.valueOf(jTextField_port.getText());
            this.nickName = jTextField_nickname.getText();
            serverSocket = new Socket(HOST, PORT);
            // thong bao dang ket noi
            JOptionPane.showMessageDialog(null, "Welcome " + nickName, "Connect Successful", 1);
            jTextPane_displays.setText("Connecting to " + serverSocket.getRemoteSocketAddress() + "\n");
            oldMsg += "Connected to " + serverSocket.getRemoteSocketAddress() + "\n";
            // thong nao ket noii thanh cong
            jTextPane_displays.setText(oldMsg + "Connected to " + serverSocket.getRemoteSocketAddress() + "\n");
            input = new BufferedReader(new InputStreamReader(serverSocket.getInputStream()));
            output = new PrintWriter(serverSocket.getOutputStream(), true);

            // send nickname to server
            output.println(nickName);

            // chuyen cac nut
            jButton_connect.setVisible(false);
            jButton_disconnect.setVisible(true);

            read = new Read();
            read.start();
        } catch (IOException ex) {
            Logger.getLogger(GUI1.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex, "Connect Error", 3);
        }

    }//GEN-LAST:event_jButton_connectActionPerformed


    private void jTextField_mesageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_mesageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_mesageActionPerformed

    private void jTextField_mesageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField_mesageMouseClicked
        jTextField_mesage.setText(null);
    }//GEN-LAST:event_jTextField_mesageMouseClicked

    private void jTextField_mesageFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_mesageFocusLost
        if (jTextField_mesage.getText().trim().equals("") || jTextField_mesage.getText().trim().equals("message")) {
            jTextField_mesage.setText("message");
            jTextField_mesage.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_jTextField_mesageFocusLost

    private void jButton_disconnectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_disconnectActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_disconnectActionPerformed

    private void jLabel_logoSendMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_logoSendMouseClicked
        sendMessage();
    }//GEN-LAST:event_jLabel_logoSendMouseClicked

    private void jLabel_logoSendMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_logoSendMouseEntered
        jLabel_logoSend.setBackground(Color.yellow);
    }//GEN-LAST:event_jLabel_logoSendMouseEntered
    public void sendMessage() {
        try {
            String message = jTextField_mesage.getText().trim();
            if (message.equals("")) {
                return;
            }
//            this.oldMsg = message;
            output.println(message);
            jTextField_mesage.requestFocus();
            jTextField_mesage.setText(null);
        } catch (Exception ex) {
//            JOptionPane.showMessageDialog(null, ex.getMessage());
//            JOptionPane.showMessageDialog(null, ex, "Connect Error", 3);
            JOptionPane.showMessageDialog(null,"Ban chua connect may chu !","Send Error",JOptionPane.ERROR_MESSAGE);
//            System.exit(0);
        }
    }

    class Read extends Thread {

        public void run() {
            
            String message;
            while (!Thread.currentThread().isInterrupted()) {
                try {
//                    if(input.)
                    message = input.readLine();
                    System.out.println("truoc "+message);
//                    System.out.println("truoc "+ message.trim().length());
                    if (message != null) {
//                        System.out.println("sau "+message);
//                        System.out.println("sau "+message.length());
                        
                        if (message.charAt(0) == '[') {
                            message = message.substring(1, message.length() - 1);
                            ArrayList<String> ListUser = new ArrayList<String>(
                                    Arrays.asList(message.split(","))
                            );
                            jTextPane_listuser.setText(null);
                            String userListDis = "";
                            for (String user : ListUser) {
//                                appendToPane(jTextPane_listuser, "@" + user);
                                userListDis += "\n#" + user;
                            }
                            jTextPane_listuser.setText(userListDis);
                            jTextPane_listuser.setForeground(new Color(78, 173, 99));
                        } else {
//                            appendToPane(jTextPane_displays, message);
                            oldMsg += "\n"+message;
                            jTextPane_displays.setText(oldMsg);
                        }
                    }
                } catch (IOException ex) {
                    System.err.println("Failed to parse incoming message");
                }
            }
        }
    }

    public int getPort() {
        return Integer.parseInt(jTextField_port.getText().trim());
    }

    public String getHost() {
        return jTextField_host.getText().trim();
    }
    // send html to pane
//    private void appendToPane(JTextPane tp, String msg) {
//        HTMLDocument doc = (HTMLDocument) tp.getDocument();
//        HTMLEditorKit editorKit = (HTMLEditorKit) tp.getEditorKit();
//        try {
//            editorKit.insertHTML(doc, doc.getLength(), msg, 0, 0, null);
//            tp.setCaretPosition(doc.getLength());
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI1().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_connect;
    private javax.swing.JButton jButton_disconnect;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel_exit;
    private javax.swing.JLabel jLabel_logoSend;
    private javax.swing.JLabel jLabel_minizone;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField_host;
    private javax.swing.JTextField jTextField_mesage;
    private javax.swing.JTextField jTextField_nickname;
    private javax.swing.JTextField jTextField_port;
    private javax.swing.JTextPane jTextPane_displays;
    private javax.swing.JTextPane jTextPane_listuser;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
