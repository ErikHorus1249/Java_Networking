/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientSide;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.geom.RoundRectangle2D;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author erik
 */
public class clientView extends javax.swing.JFrame {

    private String HOST;
    private int PORT;
    private String nickname;
    private boolean darkMode;
    private Color highlight;
    private Color darklight;
    private Color darkTheme;
    private Color lightTheme;
    private Thread read;
    private boolean sendStatus;
    private boolean connectStatus;
    private boolean exitStatus;
    BufferedReader input;
    PrintWriter output;
    Socket serverSocket;

    public clientView() {
        initComponents();
        this.darkMode = false;
        this.highlight = new Color(98, 62, 146);
        this.darklight = new Color(120, 194, 255);
        this.darkTheme = new Color(2, 2, 46);
        this.lightTheme = new Color(242, 254, 254);
        this.connectStatus = false;
        setShape(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 20, 20));// bo goc

        minmenu.setSelectedIndex(0);// trang thai cho connect

    }

    private boolean exit() {
        return jLabel_exit.getVerifyInputWhenFocusTarget();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton5 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        bg = new javax.swing.JPanel();
        topbar = new javax.swing.JPanel();
        jLabel_exit = new javax.swing.JLabel();
        sidePane = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel_modestatus = new javax.swing.JLabel();
        jPanel_chatbox = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel_settings = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel_aboutus = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel_daynight = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        main = new javax.swing.JTabbedPane();
        ChatBox = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane_listuser = new javax.swing.JTextPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane_displays = new javax.swing.JTextPane();
        jLabel3 = new javax.swing.JLabel();
        jLabel_logoSend = new javax.swing.JLabel();
        jTextField_mesage = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        Aboutus = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        settingHeader = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        minmenu = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        connectButton = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        disconnectbutton = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel_host = new javax.swing.JLabel();
        jLabel_port = new javax.swing.JLabel();
        jLabel_nickname = new javax.swing.JLabel();
        jTextField_host = new javax.swing.JTextField();
        jTextField_nickname = new javax.swing.JTextField();
        jTextField_port = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        Window = new javax.swing.JPanel();
        Settings = new javax.swing.JPanel();

        jButton5.setBackground(new java.awt.Color(150, 187, 243));
        jButton5.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/home.png"))); // NOI18N
        jButton5.setText("        Chat Box");
        jButton5.setToolTipText("");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);

        bg.setBackground(new java.awt.Color(22, 13, 26));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        topbar.setBackground(new java.awt.Color(127, 190, 240));

        jLabel_exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-xbox-x-20 (1).png"))); // NOI18N
        jLabel_exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_exitMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout topbarLayout = new javax.swing.GroupLayout(topbar);
        topbar.setLayout(topbarLayout);
        topbarLayout.setHorizontalGroup(
            topbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, topbarLayout.createSequentialGroup()
                .addContainerGap(750, Short.MAX_VALUE)
                .addComponent(jLabel_exit)
                .addGap(20, 20, 20))
        );
        topbarLayout.setVerticalGroup(
            topbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topbarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_exit)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bg.add(topbar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 50));

        sidePane.setBackground(new java.awt.Color(254, 254, 254));
        sidePane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-chat-80.png"))); // NOI18N
        sidePane.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, -1, -1));

        jLabel_modestatus.setFont(new java.awt.Font("Chandas", 0, 14)); // NOI18N
        jLabel_modestatus.setForeground(new java.awt.Color(38, 124, 229));
        jLabel_modestatus.setText("light");
        sidePane.add(jLabel_modestatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, -1, -1));

        jPanel_chatbox.setBackground(new java.awt.Color(254, 254, 254));
        jPanel_chatbox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel_chatboxMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel_chatboxMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel_chatboxMouseEntered(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/home.png"))); // NOI18N

        javax.swing.GroupLayout jPanel_chatboxLayout = new javax.swing.GroupLayout(jPanel_chatbox);
        jPanel_chatbox.setLayout(jPanel_chatboxLayout);
        jPanel_chatboxLayout.setHorizontalGroup(
            jPanel_chatboxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_chatboxLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel1)
                .addContainerGap(121, Short.MAX_VALUE))
        );
        jPanel_chatboxLayout.setVerticalGroup(
            jPanel_chatboxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_chatboxLayout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 2, Short.MAX_VALUE))
        );

        sidePane.add(jPanel_chatbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 210, 50));

        jPanel_settings.setBackground(new java.awt.Color(254, 254, 254));
        jPanel_settings.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel_settingsMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel_settingsMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel_settingsMouseEntered(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-settings-48 (1).png"))); // NOI18N

        javax.swing.GroupLayout jPanel_settingsLayout = new javax.swing.GroupLayout(jPanel_settings);
        jPanel_settings.setLayout(jPanel_settingsLayout);
        jPanel_settingsLayout.setHorizontalGroup(
            jPanel_settingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_settingsLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel4)
                .addContainerGap(120, Short.MAX_VALUE))
        );
        jPanel_settingsLayout.setVerticalGroup(
            jPanel_settingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_settingsLayout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGap(0, 2, Short.MAX_VALUE))
        );

        sidePane.add(jPanel_settings, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 210, 50));

        jPanel_aboutus.setBackground(new java.awt.Color(254, 254, 254));
        jPanel_aboutus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel_aboutusMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel_aboutusMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel_aboutusMouseEntered(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-about-48.png"))); // NOI18N

        javax.swing.GroupLayout jPanel_aboutusLayout = new javax.swing.GroupLayout(jPanel_aboutus);
        jPanel_aboutus.setLayout(jPanel_aboutusLayout);
        jPanel_aboutusLayout.setHorizontalGroup(
            jPanel_aboutusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_aboutusLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel5)
                .addContainerGap(118, Short.MAX_VALUE))
        );
        jPanel_aboutusLayout.setVerticalGroup(
            jPanel_aboutusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_aboutusLayout.createSequentialGroup()
                .addComponent(jLabel5)
                .addGap(0, 2, Short.MAX_VALUE))
        );

        sidePane.add(jPanel_aboutus, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 210, 50));

        jPanel_daynight.setBackground(new java.awt.Color(254, 254, 254));
        jPanel_daynight.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel_daynightMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel_daynightMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel_daynightMouseEntered(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-day-and-night-48.png"))); // NOI18N

        javax.swing.GroupLayout jPanel_daynightLayout = new javax.swing.GroupLayout(jPanel_daynight);
        jPanel_daynight.setLayout(jPanel_daynightLayout);
        jPanel_daynightLayout.setHorizontalGroup(
            jPanel_daynightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_daynightLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel6)
                .addContainerGap(119, Short.MAX_VALUE))
        );
        jPanel_daynightLayout.setVerticalGroup(
            jPanel_daynightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_daynightLayout.createSequentialGroup()
                .addGap(0, 2, Short.MAX_VALUE)
                .addComponent(jLabel6))
        );

        sidePane.add(jPanel_daynight, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 210, 50));
        sidePane.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, -1, -1));
        sidePane.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 140, 0));

        bg.add(sidePane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 240, 370));

        ChatBox.setBackground(new java.awt.Color(242, 254, 254));

        jLabel2.setFont(new java.awt.Font("Chandas", 0, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(34, 116, 191));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-admin-settings-male-48.png"))); // NOI18N
        jLabel2.setText("online");

        jTextPane_listuser.setBackground(new java.awt.Color(234, 239, 239));
        jTextPane_listuser.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTextPane_listuser.setFont(new java.awt.Font("Chilanka", 1, 18)); // NOI18N
        jScrollPane2.setViewportView(jTextPane_listuser);

        jTextPane_displays.setBackground(new java.awt.Color(234, 239, 239));
        jTextPane_displays.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTextPane_displays.setFont(new java.awt.Font("Chilanka", 0, 16)); // NOI18N
        jScrollPane1.setViewportView(jTextPane_displays);

        jLabel3.setFont(new java.awt.Font("Chandas", 0, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(34, 116, 191));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-chat-bubble-48.png"))); // NOI18N
        jLabel3.setText("chat");

        jLabel_logoSend.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-send-email-48.png"))); // NOI18N
        jLabel_logoSend.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_logoSend.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_logoSendMouseClicked(evt);
            }
        });

        jTextField_mesage.setBackground(new java.awt.Color(242, 254, 254));
        jTextField_mesage.setFont(new java.awt.Font("Chilanka", 0, 16)); // NOI18N
        jTextField_mesage.setForeground(new java.awt.Color(91, 95, 99));
        jTextField_mesage.setText("message");
        jTextField_mesage.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
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
        jTextField_mesage.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_mesageKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout ChatBoxLayout = new javax.swing.GroupLayout(ChatBox);
        ChatBox.setLayout(ChatBoxLayout);
        ChatBoxLayout.setHorizontalGroup(
            ChatBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ChatBoxLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(ChatBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ChatBoxLayout.createSequentialGroup()
                        .addGroup(ChatBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_mesage)
                            .addComponent(jSeparator6))
                        .addGap(20, 20, 20)
                        .addComponent(jLabel_logoSend))
                    .addGroup(ChatBoxLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22))
            .addGroup(ChatBoxLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(130, 130, 130))
        );
        ChatBoxLayout.setVerticalGroup(
            ChatBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ChatBoxLayout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addGroup(ChatBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(ChatBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ChatBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel_logoSend)
                    .addGroup(ChatBoxLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jTextField_mesage, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addGap(38, 38, 38))
        );

        main.addTab("chat", ChatBox);

        Aboutus.setBackground(new java.awt.Color(239, 253, 253));
        Aboutus.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(239, 253, 253));

        settingHeader.setFont(new java.awt.Font("Chandas", 0, 15)); // NOI18N
        settingHeader.setForeground(new java.awt.Color(34, 116, 191));
        settingHeader.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-settings-48.png"))); // NOI18N
        settingHeader.setText("settings");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(192, 192, 192)
                .addComponent(settingHeader)
                .addContainerGap(204, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(settingHeader)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Aboutus.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 90));

        jPanel5.setBackground(new java.awt.Color(239, 253, 253));

        connectButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-wired-network-connection-48.png"))); // NOI18N
        connectButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        connectButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                connectButtonMouseClicked(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Chandas", 1, 15)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(253, 108, 14));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/red.png"))); // NOI18N
        jLabel8.setText("Status : Offline");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel8)
                .addGap(0, 3, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(connectButton)
                .addGap(63, 63, 63))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(73, Short.MAX_VALUE)
                .addComponent(connectButton)
                .addGap(62, 62, 62)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        minmenu.addTab("tab1", jPanel5);

        jPanel6.setBackground(new java.awt.Color(239, 253, 253));

        disconnectbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-no-network-48.png"))); // NOI18N
        disconnectbutton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel7.setFont(new java.awt.Font("Chandas", 1, 15)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 222, 120));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-connection-status-on-30.png"))); // NOI18N
        jLabel7.setText("Status : Online");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jLabel7)
                .addGap(0, 6, Short.MAX_VALUE))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(disconnectbutton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(81, Short.MAX_VALUE)
                .addComponent(disconnectbutton)
                .addGap(53, 53, 53)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        minmenu.addTab("tab2", jPanel6);

        Aboutus.add(minmenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 50, 180, 280));

        jLabel_host.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-server-40.png"))); // NOI18N
        Aboutus.add(jLabel_host, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 40, 40));

        jLabel_port.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-ioxhost-40.png"))); // NOI18N
        Aboutus.add(jLabel_port, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, 40));

        jLabel_nickname.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-user-male-40.png"))); // NOI18N
        Aboutus.add(jLabel_nickname, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, 40));

        jTextField_host.setBackground(new java.awt.Color(239, 253, 253));
        jTextField_host.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextField_host.setForeground(new java.awt.Color(95, 83, 83));
        jTextField_host.setText("localhost");
        jTextField_host.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTextField_host.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField_hostFocusLost(evt);
            }
        });
        jTextField_host.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField_hostMouseClicked(evt);
            }
        });
        Aboutus.add(jTextField_host, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 140, 30));

        jTextField_nickname.setBackground(new java.awt.Color(239, 253, 253));
        jTextField_nickname.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextField_nickname.setForeground(new java.awt.Color(95, 83, 83));
        jTextField_nickname.setText("your nickname");
        jTextField_nickname.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTextField_nickname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField_nicknameFocusLost(evt);
            }
        });
        jTextField_nickname.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField_nicknameMouseClicked(evt);
            }
        });
        Aboutus.add(jTextField_nickname, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, 140, 30));

        jTextField_port.setBackground(new java.awt.Color(239, 253, 253));
        jTextField_port.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextField_port.setForeground(new java.awt.Color(95, 83, 83));
        jTextField_port.setText("1249");
        jTextField_port.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTextField_port.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField_portFocusLost(evt);
            }
        });
        jTextField_port.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField_portMouseClicked(evt);
            }
        });
        jTextField_port.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_portActionPerformed(evt);
            }
        });
        Aboutus.add(jTextField_port, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 140, 30));
        Aboutus.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 290, 140, 20));
        Aboutus.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 140, 20));
        Aboutus.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 140, 20));

        main.addTab("settings", Aboutus);

        Window.setBackground(new java.awt.Color(242, 254, 254));

        javax.swing.GroupLayout WindowLayout = new javax.swing.GroupLayout(Window);
        Window.setLayout(WindowLayout);
        WindowLayout.setHorizontalGroup(
            WindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 546, Short.MAX_VALUE)
        );
        WindowLayout.setVerticalGroup(
            WindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 358, Short.MAX_VALUE)
        );

        main.addTab("aboutus", Window);

        Settings.setBackground(new java.awt.Color(242, 254, 254));

        javax.swing.GroupLayout SettingsLayout = new javax.swing.GroupLayout(Settings);
        Settings.setLayout(SettingsLayout);
        SettingsLayout.setHorizontalGroup(
            SettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 546, Short.MAX_VALUE)
        );
        SettingsLayout.setVerticalGroup(
            SettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 358, Short.MAX_VALUE)
        );

        main.addTab("window", Settings);

        bg.add(main, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 550, 390));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 787, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 405, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jLabel_exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_exitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel_exitMouseClicked

    private void jTextField_mesageFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_mesageFocusLost
        if (jTextField_mesage.getText().trim().equals("") || jTextField_mesage.getText().trim().equals("message")) {
            jTextField_mesage.setText("message");
            jTextField_mesage.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_jTextField_mesageFocusLost

    private void jTextField_mesageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField_mesageMouseClicked
        jTextField_mesage.setText(null);
    }//GEN-LAST:event_jTextField_mesageMouseClicked

    private void jTextField_mesageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_mesageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_mesageActionPerformed

    private void jTextField_portActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_portActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_portActionPerformed

    private void connectButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_connectButtonMouseClicked

        connectStatus = true;
        System.out.println("Opennnnnnnn");
    }//GEN-LAST:event_connectButtonMouseClicked

    private void jLabel_logoSendMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_logoSendMouseClicked

        sendStatus = true;
    }//GEN-LAST:event_jLabel_logoSendMouseClicked

    private void jTextField_mesageKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_mesageKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            sendStatus = true;
            jTextField_mesage.setText(null);
        }
    }//GEN-LAST:event_jTextField_mesageKeyPressed

    private void jPanel_chatboxMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_chatboxMouseEntered

        if (darkMode) {
            jPanel_chatbox.setBackground(highlight);
        } else {
            jPanel_chatbox.setBackground(darklight);
        }
    }//GEN-LAST:event_jPanel_chatboxMouseEntered

    private void jPanel_chatboxMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_chatboxMouseExited
        if (darkMode) {
            jPanel_chatbox.setBackground(new Color(7, 21, 51));
        } else {
            jPanel_chatbox.setBackground(Color.WHITE);
        }
    }//GEN-LAST:event_jPanel_chatboxMouseExited

    private void jPanel_chatboxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_chatboxMouseClicked
        main.setSelectedIndex(0);
    }//GEN-LAST:event_jPanel_chatboxMouseClicked

    private void jPanel_settingsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_settingsMouseClicked
        main.setSelectedIndex(1);
    }//GEN-LAST:event_jPanel_settingsMouseClicked

    private void jPanel_settingsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_settingsMouseEntered
        if (darkMode) {
            jPanel_settings.setBackground(highlight);
        } else {
            jPanel_settings.setBackground(darklight);
        }
    }//GEN-LAST:event_jPanel_settingsMouseEntered

    private void jPanel_settingsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_settingsMouseExited
        if (darkMode) {
            jPanel_settings.setBackground(new Color(7, 21, 51));
        } else {
            jPanel_settings.setBackground(Color.WHITE);
        }
    }//GEN-LAST:event_jPanel_settingsMouseExited

    private void jPanel_aboutusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_aboutusMouseClicked
        main.setSelectedIndex(2);
    }//GEN-LAST:event_jPanel_aboutusMouseClicked

    private void jPanel_aboutusMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_aboutusMouseEntered
        if (darkMode) {
            jPanel_aboutus.setBackground(highlight);
        } else {
            jPanel_aboutus.setBackground(darklight);
        }
    }//GEN-LAST:event_jPanel_aboutusMouseEntered

    private void jPanel_aboutusMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_aboutusMouseExited
        if (darkMode) {
            jPanel_aboutus.setBackground(new Color(7, 21, 51));
        } else {
            jPanel_aboutus.setBackground(Color.WHITE);
        }
    }//GEN-LAST:event_jPanel_aboutusMouseExited

    private void jPanel_daynightMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_daynightMouseClicked

        setDarkMode(darkMode);

    }//GEN-LAST:event_jPanel_daynightMouseClicked

    private void jPanel_daynightMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_daynightMouseEntered
        if (darkMode) {
            jPanel_daynight.setBackground(highlight);
        } else {
            jPanel_daynight.setBackground(darklight);
        }
    }//GEN-LAST:event_jPanel_daynightMouseEntered

    private void jPanel_daynightMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_daynightMouseExited
        if (darkMode) {
            jPanel_daynight.setBackground(new Color(7, 21, 51));
        } else {
            jPanel_daynight.setBackground(Color.WHITE);
        }
    }//GEN-LAST:event_jPanel_daynightMouseExited

    private void jTextField_hostMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField_hostMouseClicked
        jTextField_host.setText(null);
    }//GEN-LAST:event_jTextField_hostMouseClicked

    private void jTextField_portMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField_portMouseClicked
        jTextField_port.setText(null);
    }//GEN-LAST:event_jTextField_portMouseClicked

    private void jTextField_nicknameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField_nicknameMouseClicked
        jTextField_nickname.setText(null);
    }//GEN-LAST:event_jTextField_nicknameMouseClicked

    private void jTextField_hostFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_hostFocusLost
        if (jTextField_host.getText().trim().equals("") || jTextField_host.getText().trim().equals("localhost")) {
            jTextField_host.setText("localhost");
            jTextField_host.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_jTextField_hostFocusLost

    private void jTextField_portFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_portFocusLost
        if (jTextField_port.getText().trim().equals("") || jTextField_port.getText().trim().equals("1249")) {
            jTextField_port.setText("1249");
            jTextField_port.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_jTextField_portFocusLost

    private void jTextField_nicknameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_nicknameFocusLost
        if (jTextField_nickname.getText().trim().equals("") || jTextField_nickname.getText().trim().equals("nickname")) {
            jTextField_nickname.setText("nickname");
            jTextField_nickname.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_jTextField_nicknameFocusLost

    public void setSendStatus(boolean status) {
        sendStatus = status;
    }

    public boolean getSendStatus() {
        return sendStatus;
    }

    public void setConnectStatus(boolean status) {
        connectStatus = status;
    }

    public boolean getConnectStatus() {
        return connectStatus;
    }

    private void setDarkMode(boolean darkMode) {
        // set panel
        if (darkMode) {
            ChatBox.setBackground(lightTheme);
            sidePane.setBackground(Color.white);
            jPanel_chatbox.setBackground(Color.WHITE);

            jPanel_settings.setBackground(Color.WHITE);

            jPanel_aboutus.setBackground(Color.WHITE);

            jPanel_daynight.setBackground(Color.WHITE);

            jLabel_modestatus.setText("light");
            jLabel_modestatus.setForeground(new Color(38, 124, 229));

            topbar.setBackground(new Color(127, 190, 240));

            Aboutus.setBackground(lightTheme);
            jPanel4.setBackground(lightTheme);
            jPanel5.setBackground(lightTheme);
            jPanel6.setBackground(lightTheme);

            this.darkMode = false;
        } else {
            ChatBox.setBackground(darkTheme);
            sidePane.setBackground(new Color(2, 2, 46));

            // set dark button
            jPanel_chatbox.setBackground(new Color(7, 21, 51));

            jPanel_settings.setBackground(new Color(7, 21, 51));

            jPanel_aboutus.setBackground(new Color(7, 21, 51));

            jPanel_daynight.setBackground(new Color(7, 21, 51));

            jLabel_modestatus.setText("dark");
            jLabel_modestatus.setForeground(new Color(86, 182, 240));

            Aboutus.setBackground(darkTheme);
            jPanel4.setBackground(darkTheme);
            jPanel5.setBackground(darkTheme);
            jPanel6.setBackground(darkTheme);

            topbar.setBackground(new Color(118, 125, 176));
            this.darkMode = true;
        }
    }

    public void getNotify(String notifyContent, String notifyHeader, int status) {
        JOptionPane.showMessageDialog(null, notifyContent, notifyHeader, status);
    }
    
    public void getErrorNotify(){
        JOptionPane.showMessageDialog(null,"Server not responding !","Error",JOptionPane.ERROR_MESSAGE);
    }
    
    public void changeStageOnline(int panelId){
        minmenu.setSelectedIndex(panelId);
    }
    
    public void changeStage(int panelIndex) {
        main.setSelectedIndex(panelIndex);
    }
    
    public void setTextDisplay(String msg) {
        jTextPane_displays.setText(msg);
    }

    public String getMessageFromTextField() {
        return jTextField_mesage.getText();
    }

    public void clearMessageTextField() {
        jTextField_mesage.requestFocus();
        jTextField_mesage.setText(null);
    }

    public void disableTextField() {
        jTextField_host.setEditable(false);
        jTextField_port.setEditable(false);
        jTextField_nickname.setEditable(false);
    }

    public void clearOnlineListDisplay() {
        jTextPane_listuser.setText(null); // lam sach danh sach ten
    }

    public void setOnlineListDisplay(String userListDis) {
        jTextPane_listuser.setText(userListDis);
        jTextPane_listuser.setForeground(new Color(78, 173, 99));
    }

    public int getPort() {
        return Integer.parseInt(jTextField_port.getText());
    }

    public String getHost() {
        return jTextField_host.getText();
    }

    public String getNickname() {
        System.out.println(this.nickname);
        return jTextField_nickname.getText();
    }

    public boolean isExitStatus() {
        return exitStatus;
    }

    public void setExitStatus(boolean exitStatus) {
        this.exitStatus = exitStatus;
    }

    /**
     * @param args the command line arguments
     */

//    public static void main(String args[]) {
//        
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(clientView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(clientView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(clientView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(clientView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new clientView().setVisible(true);
//            }
//        });
//    }
    public void display() {
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
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new clientView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Aboutus;
    private javax.swing.JPanel ChatBox;
    private javax.swing.JPanel Settings;
    private javax.swing.JPanel Window;
    private javax.swing.JPanel bg;
    private javax.swing.JLabel connectButton;
    private javax.swing.JLabel disconnectbutton;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_exit;
    private javax.swing.JLabel jLabel_host;
    private javax.swing.JLabel jLabel_logoSend;
    private javax.swing.JLabel jLabel_modestatus;
    private javax.swing.JLabel jLabel_nickname;
    private javax.swing.JLabel jLabel_port;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel_aboutus;
    private javax.swing.JPanel jPanel_chatbox;
    private javax.swing.JPanel jPanel_daynight;
    private javax.swing.JPanel jPanel_settings;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JTextField jTextField_host;
    private javax.swing.JTextField jTextField_mesage;
    private javax.swing.JTextField jTextField_nickname;
    private javax.swing.JTextField jTextField_port;
    private javax.swing.JTextPane jTextPane_displays;
    private javax.swing.JTextPane jTextPane_listuser;
    private javax.swing.JTabbedPane main;
    private javax.swing.JTabbedPane minmenu;
    private javax.swing.JLabel settingHeader;
    private javax.swing.JPanel sidePane;
    private javax.swing.JPanel topbar;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the exitStatus
     */
}
