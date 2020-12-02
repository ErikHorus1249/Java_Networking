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
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
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
    private Color lightText;
    private Color darkText;
    private Thread read;
    private boolean sendStatus;
    private boolean connectStatus;
    private boolean exitStatus;
    private int xMouse;
    private int yMouse;
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
        this.lightText = new Color(5,254,226);
        this.darkText = new Color(41,4,62);
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
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        bg = new javax.swing.JPanel();
        topbar = new javax.swing.JPanel();
        jLabel_exit = new javax.swing.JLabel();
        move = new javax.swing.JLabel();
        jLabel_hiden = new javax.swing.JLabel();
        sidePane = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel_modestatus = new javax.swing.JLabel();
        jPanel_chatbox = new javax.swing.JPanel();
        chatLogo = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel_settings = new javax.swing.JPanel();
        settingsLogo = new javax.swing.JLabel();
        jPanel_aboutus = new javax.swing.JPanel();
        aboutLogo = new javax.swing.JLabel();
        jPanel_daynight = new javax.swing.JPanel();
        dayLogo = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
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
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jLabel19 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
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

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/finalblack.png"))); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/git.png"))); // NOI18N
        jLabel6.setText("+");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);

        bg.setBackground(new java.awt.Color(22, 13, 26));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        topbar.setBackground(new java.awt.Color(127, 190, 240));
        topbar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                topbarMouseDragged(evt);
            }
        });
        topbar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                topbarMousePressed(evt);
            }
        });

        jLabel_exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-xbox-x-20 (1).png"))); // NOI18N
        jLabel_exit.setToolTipText("Exit");
        jLabel_exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_exitMouseClicked(evt);
            }
        });

        move.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                moveMouseDragged(evt);
            }
        });
        move.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                moveMousePressed(evt);
            }
        });

        jLabel_hiden.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/minisize.png"))); // NOI18N
        jLabel_hiden.setToolTipText("hiden");
        jLabel_hiden.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_hiden.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_hidenMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout topbarLayout = new javax.swing.GroupLayout(topbar);
        topbar.setLayout(topbarLayout);
        topbarLayout.setHorizontalGroup(
            topbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, topbarLayout.createSequentialGroup()
                .addComponent(move, javax.swing.GroupLayout.PREFERRED_SIZE, 715, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_hiden)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel_exit)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        topbarLayout.setVerticalGroup(
            topbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(move, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
            .addGroup(topbarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(topbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_hiden)
                    .addComponent(jLabel_exit))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bg.add(topbar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 50));

        sidePane.setBackground(new java.awt.Color(254, 254, 254));
        sidePane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/final.png"))); // NOI18N
        sidePane.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, -1, -1));

        jLabel_modestatus.setFont(new java.awt.Font("Chandas", 0, 14)); // NOI18N
        jLabel_modestatus.setForeground(new java.awt.Color(38, 124, 229));
        jLabel_modestatus.setText("light");
        sidePane.add(jLabel_modestatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, -1, -1));

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

        chatLogo.setFont(new java.awt.Font("Cantarell Thin", 1, 14)); // NOI18N
        chatLogo.setForeground(new java.awt.Color(41, 4, 62));
        chatLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/home.png"))); // NOI18N
        chatLogo.setText("chat box");

        jLabel13.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(67, 95, 252));

        javax.swing.GroupLayout jPanel_chatboxLayout = new javax.swing.GroupLayout(jPanel_chatbox);
        jPanel_chatbox.setLayout(jPanel_chatboxLayout);
        jPanel_chatboxLayout.setHorizontalGroup(
            jPanel_chatboxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_chatboxLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(chatLogo)
                .addGap(33, 33, 33)
                .addComponent(jLabel13)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_chatboxLayout.setVerticalGroup(
            jPanel_chatboxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_chatboxLayout.createSequentialGroup()
                .addComponent(chatLogo)
                .addGap(0, 2, Short.MAX_VALUE))
            .addGroup(jPanel_chatboxLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        sidePane.add(jPanel_chatbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 230, 50));

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

        settingsLogo.setFont(new java.awt.Font("Cantarell Thin", 1, 14)); // NOI18N
        settingsLogo.setForeground(new java.awt.Color(41, 4, 62));
        settingsLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-settings-48 (1).png"))); // NOI18N
        settingsLogo.setText("settings");

        javax.swing.GroupLayout jPanel_settingsLayout = new javax.swing.GroupLayout(jPanel_settings);
        jPanel_settings.setLayout(jPanel_settingsLayout);
        jPanel_settingsLayout.setHorizontalGroup(
            jPanel_settingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_settingsLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(settingsLogo)
                .addContainerGap(83, Short.MAX_VALUE))
        );
        jPanel_settingsLayout.setVerticalGroup(
            jPanel_settingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_settingsLayout.createSequentialGroup()
                .addComponent(settingsLogo)
                .addGap(0, 2, Short.MAX_VALUE))
        );

        sidePane.add(jPanel_settings, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 230, 50));

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

        aboutLogo.setFont(new java.awt.Font("Cantarell Thin", 1, 14)); // NOI18N
        aboutLogo.setForeground(new java.awt.Color(41, 4, 62));
        aboutLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-about-48.png"))); // NOI18N
        aboutLogo.setText("about us");

        javax.swing.GroupLayout jPanel_aboutusLayout = new javax.swing.GroupLayout(jPanel_aboutus);
        jPanel_aboutus.setLayout(jPanel_aboutusLayout);
        jPanel_aboutusLayout.setHorizontalGroup(
            jPanel_aboutusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_aboutusLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(aboutLogo)
                .addContainerGap(78, Short.MAX_VALUE))
        );
        jPanel_aboutusLayout.setVerticalGroup(
            jPanel_aboutusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_aboutusLayout.createSequentialGroup()
                .addComponent(aboutLogo)
                .addGap(0, 2, Short.MAX_VALUE))
        );

        sidePane.add(jPanel_aboutus, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 230, 50));

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

        dayLogo.setFont(new java.awt.Font("Cantarell Thin", 1, 14)); // NOI18N
        dayLogo.setForeground(new java.awt.Color(41, 4, 62));
        dayLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-day-and-night-48.png"))); // NOI18N
        dayLogo.setText("darkmode");

        javax.swing.GroupLayout jPanel_daynightLayout = new javax.swing.GroupLayout(jPanel_daynight);
        jPanel_daynight.setLayout(jPanel_daynightLayout);
        jPanel_daynightLayout.setHorizontalGroup(
            jPanel_daynightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_daynightLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(dayLogo)
                .addContainerGap(69, Short.MAX_VALUE))
        );
        jPanel_daynightLayout.setVerticalGroup(
            jPanel_daynightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_daynightLayout.createSequentialGroup()
                .addGap(0, 2, Short.MAX_VALUE)
                .addComponent(dayLogo))
        );

        sidePane.add(jPanel_daynight, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 230, 50));
        sidePane.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, -1, -1));
        sidePane.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 140, 0));

        jPanel3.setBackground(new java.awt.Color(247, 23, 99));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        sidePane.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 60, 20));

        jPanel7.setBackground(new java.awt.Color(253, 195, 13));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        sidePane.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 70, -1));

        jPanel8.setBackground(new java.awt.Color(5, 254, 226));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        sidePane.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, 70, -1));

        jPanel9.setBackground(new java.awt.Color(124, 18, 208));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        sidePane.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 340, 90, -1));

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

        jLabel_logoSend.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/send-icon_light.png"))); // NOI18N
        jLabel_logoSend.setToolTipText("Gửi tin");
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_logoSend))
                    .addGroup(ChatBoxLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)))
                .addGap(30, 30, 30))
            .addGroup(ChatBoxLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(130, 130, 130))
        );
        ChatBoxLayout.setVerticalGroup(
            ChatBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ChatBoxLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(ChatBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(ChatBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(ChatBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel_logoSend)
                    .addComponent(jTextField_mesage, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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
        connectButton.setToolTipText("Kết nối máy chủ");
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(76, Short.MAX_VALUE)
                .addComponent(connectButton)
                .addGap(62, 62, 62)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        minmenu.addTab("tab1", jPanel5);

        jPanel6.setBackground(new java.awt.Color(239, 253, 253));

        disconnectbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-no-network-48.png"))); // NOI18N
        disconnectbutton.setToolTipText("Ngắt kết nối");
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(disconnectbutton)
                .addGap(59, 59, 59))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(74, Short.MAX_VALUE)
                .addComponent(disconnectbutton)
                .addGap(64, 64, 64)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        minmenu.addTab("tab2", jPanel6);

        Aboutus.add(minmenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 50, 180, 260));

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

        Window.setBackground(new java.awt.Color(226, 248, 244));

        jLabel10.setFont(new java.awt.Font("Chilanka", 1, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(14, 150, 212));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/final.png"))); // NOI18N
        jLabel10.setText("Vhat ");

        jLabel11.setFont(new java.awt.Font("Chilanka", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(2, 4, 32));
        jLabel11.setText("v1.3");

        jPanel1.setBackground(new java.awt.Color(254, 254, 254));

        jLabel15.setFont(new java.awt.Font("Cantarell", 0, 13)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(4, 2, 2));
        jLabel15.setText("đổi thông tin kết hợp với đảm bảo sự an toàn của người dùng trên không gian mạng. Với sứ");

        jLabel14.setFont(new java.awt.Font("Cantarell", 0, 13)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(4, 2, 2));
        jLabel14.setText("Ứng dụng tin nhắn Vhat được tạo ra với mục đích phi lợi nhuận nhằm với các tính năng trao");

        jLabel16.setFont(new java.awt.Font("Cantarell", 0, 13)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(4, 2, 2));
        jLabel16.setText("mệnh đem tinh thần công nghệ Việt vươn ra toàn cầu chúng tôi - đội ngũ phát triển Vhat đã ");

        jLabel17.setFont(new java.awt.Font("Cantarell", 0, 13)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(4, 2, 2));
        jLabel17.setText("áp dụng những công nghệ tiên tiến nhất vào sản phẩm cũng như cam kết về bảo mật thông ");

        jLabel12.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jLabel12.setText("VHAT APPLICATION  LICENSE AGREEMENT");

        jCheckBox1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jCheckBox1.setText("Tôi đồng ý với chính sách của các bạn.");
        jCheckBox1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jCheckBox2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jCheckBox2.setText("Tôi không đồng ý với chính sách.");
        jCheckBox2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Cantarell", 0, 13)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(4, 2, 2));
        jLabel19.setText("tin của các bạn.");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/git.png"))); // NOI18N
        jLabel1.setText("+");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/finalblack.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(jLabel12))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16)
                            .addComponent(jLabel17)
                            .addComponent(jLabel19))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jCheckBox1)
                        .addGap(256, 256, 256))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jCheckBox2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addGap(51, 51, 51))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel19)
                .addGap(18, 18, 18)
                .addComponent(jCheckBox1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox2)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel4)))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout WindowLayout = new javax.swing.GroupLayout(Window);
        Window.setLayout(WindowLayout);
        WindowLayout.setHorizontalGroup(
            WindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(WindowLayout.createSequentialGroup()
                .addGap(199, 199, 199)
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addGap(156, 156, 156))
            .addGroup(WindowLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        WindowLayout.setVerticalGroup(
            WindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(WindowLayout.createSequentialGroup()
                .addGroup(WindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(WindowLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel11))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, WindowLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel10)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        main.addTab("aboutus", Window);

        Settings.setBackground(new java.awt.Color(242, 254, 254));

        javax.swing.GroupLayout SettingsLayout = new javax.swing.GroupLayout(Settings);
        Settings.setLayout(SettingsLayout);
        SettingsLayout.setHorizontalGroup(
            SettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 556, Short.MAX_VALUE)
        );
        SettingsLayout.setVerticalGroup(
            SettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 358, Short.MAX_VALUE)
        );

        main.addTab("window", Settings);

        bg.add(main, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 560, 390));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 776, Short.MAX_VALUE)
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
//        System.out.println("Opennnnnnnn");
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

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void topbarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_topbarMouseDragged
        
    }//GEN-LAST:event_topbarMouseDragged

    private void topbarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_topbarMousePressed
        
    }//GEN-LAST:event_topbarMousePressed

    private void moveMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_moveMouseDragged
       int x = evt.getX();
       int y = evt.getY();
       this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_moveMouseDragged

    private void moveMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_moveMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_moveMousePressed

    private void jLabel_hidenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_hidenMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel_hidenMouseClicked

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
            chatLogo.setForeground(darkText);

            jPanel_settings.setBackground(Color.WHITE);
            settingsLogo.setForeground(darkText);

            jPanel_aboutus.setBackground(Color.WHITE);
            aboutLogo.setForeground(darkText);

            jPanel_daynight.setBackground(Color.WHITE);
            dayLogo.setForeground(darkText);

            jLabel_modestatus.setText("light");
            jLabel_modestatus.setForeground(new Color(38, 124, 229));
//            jLabel_logoSend.setIcon(new ImageIcon("/img/send-icon_light.png"));

            
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
            chatLogo.setForeground(lightText);

            jPanel_settings.setBackground(new Color(7, 21, 51));
            settingsLogo.setForeground(lightText);

            jPanel_aboutus.setBackground(new Color(7, 21, 51));
            aboutLogo.setForeground(lightText);

            jPanel_daynight.setBackground(new Color(7, 21, 51));
            dayLogo.setForeground(lightText);

            jLabel_modestatus.setText("dark");
            jLabel_modestatus.setForeground(new Color(86, 182, 240));
            
//            jLabel_logoSend.setIcon(new ImageIcon("/img/send-icon_dark.png"));

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
//        System.out.println(this.nickname);
        return jTextField_nickname.getText();
    }

    public boolean isExitStatus() {
        return exitStatus;
    }

    public void setExitStatus(boolean exitStatus) {
        this.exitStatus = exitStatus;
    }


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
    private javax.swing.JLabel aboutLogo;
    private javax.swing.JPanel bg;
    private javax.swing.JLabel chatLogo;
    private javax.swing.JLabel connectButton;
    private javax.swing.JLabel dayLogo;
    private javax.swing.JLabel disconnectbutton;
    private javax.swing.JButton jButton5;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_exit;
    private javax.swing.JLabel jLabel_hiden;
    private javax.swing.JLabel jLabel_host;
    private javax.swing.JLabel jLabel_logoSend;
    private javax.swing.JLabel jLabel_modestatus;
    private javax.swing.JLabel jLabel_nickname;
    private javax.swing.JLabel jLabel_port;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
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
    private javax.swing.JLabel move;
    private javax.swing.JLabel settingHeader;
    private javax.swing.JLabel settingsLogo;
    private javax.swing.JPanel sidePane;
    private javax.swing.JPanel topbar;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the exitStatus
     */
}
