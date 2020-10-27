## Mã nguồn thô bài tập lớn LTM

### Mô hình ứng dụng chat client - server (Java Socket)

![](https://i.imgur.com/CBiYmtX.png)

### 2. Mã nguồn

# Client

    /*
     * To change this license header, choose License Headers in Project Properties.
     * To change this template file, choose Tools | Templates
     * and open the template in the editor.
     */
    package com.mycompany.btl_client;
    
    import com.mycompany.btl_libs.ChatMessageSocket;
    import java.net.Socket;
    import javax.swing.JOptionPane;
    
    /**
     *
     * @author erik
     */
    public class ChatClientForm extends javax.swing.JFrame {
        
        ChatMessageSocket mSocket;
        /**
         * Creates new form ChatServerForm
         */
        public ChatClientForm() {
            initComponents();
        }
    
        /**
         * This method is called from within the constructor to initialize the form.
         * WARNING: Do NOT modify this code. The content of this method is always
         * regenerated by the Form Editor.
         */
        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
        private void initComponents() {
    
            jLabel1 = new javax.swing.JLabel();
            jSeparator1 = new javax.swing.JSeparator();
            jLabel2 = new javax.swing.JLabel();
            txtPort = new javax.swing.JTextField();
            btnConnect = new javax.swing.JButton();
            jLabel3 = new javax.swing.JLabel();
            txtMessage = new javax.swing.JTextField();
            btnSend = new javax.swing.JButton();
            jLabel4 = new javax.swing.JLabel();
            txtServerHost = new javax.swing.JTextField();
            jScrollPane2 = new javax.swing.JScrollPane();
            txpMessageBoard = new javax.swing.JTextPane();
    
            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    
            jLabel1.setText("Chat Client");
    
            jLabel2.setText("Port  : ");
    
            txtPort.setText("1429");
    
            btnConnect.setText("connect");
            btnConnect.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnConnectActionPerformed(evt);
                }
            });
    
            jLabel3.setText("Message");
    
            btnSend.setText("Send");
            btnSend.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnSendActionPerformed(evt);
                }
            });
    
            jLabel4.setText("Host");
    
            txtServerHost.setText("localhost");
    
            jScrollPane2.setViewportView(txpMessageBoard);
    
            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(189, 189, 189))
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnSend, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(0, 0, Short.MAX_VALUE)
                                    .addComponent(jLabel4)
                                    .addGap(27, 27, 27)
                                    .addComponent(txtServerHost, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtPort, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnConnect, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addContainerGap(25, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jScrollPane2)
                            .addContainerGap())))
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(39, 39, 39)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(txtPort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnConnect, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)
                        .addComponent(txtServerHost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(txtMessage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(0, 0, Short.MAX_VALUE))
                        .addComponent(btnSend, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addContainerGap())
            );
    
            pack();
        }// </editor-fold>                        
    
        private void btnConnectActionPerformed(java.awt.event.ActionEvent evt) {                                           
            try {
                int port = Integer.parseInt(txtPort.getText());
                Socket socket = new Socket(txtServerHost.getText(),  port);
                
                mSocket = new ChatMessageSocket(socket, txpMessageBoard);
                txpMessageBoard.setText(txpMessageBoard.getText() + "\nConnected!");
            } catch (Exception e) {
            }
        }                                          
    
        private void btnSendActionPerformed(java.awt.event.ActionEvent evt) {                                        
            if(txtMessage.getText().equals("")) return;
            mSocket.send(txtMessage.getText());
        }                                       
    
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
                java.util.logging.Logger.getLogger(ChatClientForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                java.util.logging.Logger.getLogger(ChatClientForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                java.util.logging.Logger.getLogger(ChatClientForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                java.util.logging.Logger.getLogger(ChatClientForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
            //</editor-fold>
            //</editor-fold>
    
            /* Create and display the form */
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new ChatClientForm().setVisible(true);
                }
            });
        }
    
        // Variables declaration - do not modify                     
        private javax.swing.JButton btnConnect;
        private javax.swing.JButton btnSend;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JScrollPane jScrollPane2;
        private javax.swing.JSeparator jSeparator1;
        private javax.swing.JTextPane txpMessageBoard;
        private javax.swing.JTextField txtMessage;
        private javax.swing.JTextField txtPort;
        private javax.swing.JTextField txtServerHost;
        // End of variables declaration                   
    }


# Server 

    /*
     * To change this license header, choose License Headers in Project Properties.
     * To change this template file, choose Tools | Templates
     * and open the template in the editor.
     */
    package com.mycompany.btl_server;
    
    import com.mycompany.btl_libs.ChatMessageSocket;
    import java.net.ServerSocket;
    import java.net.Socket;
    import javax.swing.JOptionPane;
    
    /**
     *
     * @author erik
     */
    public class ChatServerForm extends javax.swing.JFrame {
        
        private ChatMessageSocket mSocket; 
        /**
         * Creates new form ChatServerForm
         */
        public ChatServerForm() {
            initComponents();
        }
    
        /**
         * This method is called from within the constructor to initialize the form.
         * WARNING: Do NOT modify this code. The content of this method is always
         * regenerated by the Form Editor.
         */
        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
        private void initComponents() {
    
            jLabel1 = new javax.swing.JLabel();
            jSeparator1 = new javax.swing.JSeparator();
            jLabel2 = new javax.swing.JLabel();
            txtPort = new javax.swing.JTextField();
            btnListen = new javax.swing.JButton();
            jLabel3 = new javax.swing.JLabel();
            txtMessage = new javax.swing.JTextField();
            btnSend = new javax.swing.JButton();
            jScrollPane2 = new javax.swing.JScrollPane();
            txpMessageBoard = new javax.swing.JTextPane();
    
            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    
            jLabel1.setText("Chat Server");
    
            jLabel2.setText("Port  : ");
    
            txtPort.setText("1429");
    
            btnListen.setText("Listen");
            btnListen.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnListenActionPerformed(evt);
                }
            });
    
            jLabel3.setText("Message");
    
            btnSend.setText("Send");
            btnSend.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnSendActionPerformed(evt);
                }
            });
    
            jScrollPane2.setViewportView(txpMessageBoard);
    
            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(189, 189, 189))
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtPort, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(152, 152, 152)
                                    .addComponent(btnListen, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                                    .addComponent(txtMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnSend, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addContainerGap(25, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jScrollPane2)
                            .addContainerGap())))
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(39, 39, 39)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(txtPort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnListen, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(txtMessage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(0, 0, Short.MAX_VALUE))
                        .addComponent(btnSend, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addContainerGap())
            );
    
            pack();
        }// </editor-fold>                        
    
        private void btnListenActionPerformed(java.awt.event.ActionEvent evt) {                                          
            try {
                int port = Integer.parseInt(txtPort.getText());
                ServerSocket serverSocket = new ServerSocket(port);
                txpMessageBoard.setText("Connected succesfully...");
                
                Thread th = new Thread(){
                   public void run(){
                       try {
                            
                            txpMessageBoard.setText(txpMessageBoard.getText());
                            Socket socket = serverSocket.accept();
                            mSocket = new ChatMessageSocket(socket, txpMessageBoard); 
                            
                       } catch (Exception e) {
                           txpMessageBoard.setText("<br> Error : " + e.getMessage());
                           e.printStackTrace();
                       }
     
                   }
                };
                th.start();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Error : "+e.getMessage());
                e.printStackTrace();
            }
        }                                         
    
        private void btnSendActionPerformed(java.awt.event.ActionEvent evt) {                                        
            if(txtMessage.getText().equals("")){
                return;
            }
            mSocket.send(txtMessage.getText());
        }                                       
    
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
                java.util.logging.Logger.getLogger(ChatServerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                java.util.logging.Logger.getLogger(ChatServerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                java.util.logging.Logger.getLogger(ChatServerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                java.util.logging.Logger.getLogger(ChatServerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
            //</editor-fold>
    
            /* Create and display the form */
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new ChatServerForm().setVisible(true);
                }
            });
        }
    
        // Variables declaration - do not modify                     
        private javax.swing.JButton btnListen;
        private javax.swing.JButton btnSend;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JScrollPane jScrollPane2;
        private javax.swing.JSeparator jSeparator1;
        private javax.swing.JTextPane txpMessageBoard;
        private javax.swing.JTextField txtMessage;
        private javax.swing.JTextField txtPort;
        // End of variables declaration                   
    }


# Libraries

    /*
     * To change this license header, choose License Headers in Project Properties.
     * To change this template file, choose Tools | Templates
     * and open the template in the editor.
     */
    package com.mycompany.btl_libs;
    
    import java.io.BufferedReader;
    import java.io.IOException;
    import java.io.InputStreamReader;
    import java.io.PrintStream;
    import java.net.Socket;
    import javax.swing.JTextArea;
    import javax.swing.JTextPane;
    
    /**
     *
     * @author erik
     */
    public class ChatMessageSocket {
        private Socket socket;
        private JTextPane txpMessageBoard;
        private  PrintStream out;
        private BufferedReader reader;
    
        public ChatMessageSocket(Socket socket, JTextPane txpMessageBoard) throws IOException{
            this.socket = socket;
            this.txpMessageBoard = txpMessageBoard;
            
            out = new PrintStream(socket.getOutputStream());
            
            reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            
            receive();
           
        }
        
        private void receive(){
            Thread th =  new Thread(){
                public void run(){
                    while(true){
                        try{
                            String  line = reader.readLine();
                            if(line != null){
                                txpMessageBoard.setText(txpMessageBoard.getText() +  "<br>" + line);
                            }
                        }catch(Exception e){
                            
                        }
                    }
                }
            };
            th.start();
        }
        
        
        public void send(String msg){
            String current = txpMessageBoard.getText();
            txpMessageBoard.setText(current + "<br> sent: " + msg);
            out.println(msg);
            out.flush();
        }
        
        public void close(){
            try {
                out.close();
                reader.close();
                socket.close();
            } catch (Exception e) {
            }
        }        
    }


