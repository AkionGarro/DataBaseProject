package com.View;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author garroakion
 */
public class login extends javax.swing.JFrame {

    private int xMousePosition, yMousePosition;

    public login() {
        initComponents();

        background.setLocation(0, 0);
        homePanel.removeAll();
        homePanel.add(background, BorderLayout.CENTER);
        homePanel.revalidate();
        homePanel.repaint();

        loginSection.setLocation(0, 0);
        content.removeAll();
        content.add(loginSection, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();

        registerSection.setVisible(false);
        registerSection.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        loginPanel = new javax.swing.JPanel();
        logoPanel = new javax.swing.JPanel();
        part1 = new javax.swing.JLabel();
        part2 = new javax.swing.JLabel();
        loginSection = new javax.swing.JPanel();
        exitPanel = new javax.swing.JPanel();
        exitButton = new javax.swing.JLabel();
        iniciarLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        userLabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        usernameTextField = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        userPasswordField = new javax.swing.JPasswordField();
        panelLogin = new javax.swing.JPanel();
        loginButton = new javax.swing.JLabel();
        registerPanel = new javax.swing.JPanel();
        registerButton = new javax.swing.JLabel();
        content = new javax.swing.JPanel();
        registerSection = new javax.swing.JPanel();
        backPanel = new javax.swing.JPanel();
        backButton = new javax.swing.JLabel();
        usernameTextField1 = new javax.swing.JTextField();
        passwordLabel1 = new javax.swing.JLabel();
        passwordTextField = new javax.swing.JTextField();
        emailLabel = new javax.swing.JLabel();
        emailTextField = new javax.swing.JTextField();
        countryLabel = new javax.swing.JLabel();
        countryComboBox = new javax.swing.JComboBox<>();
        provinciaLabel = new javax.swing.JLabel();
        provinciaComboBox = new javax.swing.JComboBox<>();
        cantonLabel = new javax.swing.JLabel();
        cantonComboBox = new javax.swing.JComboBox<>();
        distritoLabel = new javax.swing.JLabel();
        distritoComboBox = new javax.swing.JComboBox<>();
        direccionLabel = new javax.swing.JLabel();
        direccionTextField = new javax.swing.JTextField();
        part3 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        exitPanel1 = new javax.swing.JPanel();
        exitButton1 = new javax.swing.JLabel();
        registerButtonPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        usuarioLabel1 = new javax.swing.JLabel();
        nombreLabel1 = new javax.swing.JLabel();
        nombreLabel2 = new javax.swing.JLabel();
        usernameTextField2 = new javax.swing.JTextField();
        jSeparator10 = new javax.swing.JSeparator();
        usernameTextField3 = new javax.swing.JTextField();
        jSeparator11 = new javax.swing.JSeparator();
        usernameTextField4 = new javax.swing.JTextField();
        jSeparator12 = new javax.swing.JSeparator();
        nombreLabel3 = new javax.swing.JLabel();
        countryComboBox1 = new javax.swing.JComboBox<>();
        nombreLabel4 = new javax.swing.JLabel();
        usernameTextField5 = new javax.swing.JTextField();
        jSeparator13 = new javax.swing.JSeparator();
        nombreLabel5 = new javax.swing.JLabel();
        nombreLabel6 = new javax.swing.JLabel();
        usernameTextField6 = new javax.swing.JTextField();
        jSeparator14 = new javax.swing.JSeparator();
        nombreLabel7 = new javax.swing.JLabel();
        usernameTextField7 = new javax.swing.JTextField();
        jSeparator15 = new javax.swing.JSeparator();
        nombreLabel8 = new javax.swing.JLabel();
        countryComboBox2 = new javax.swing.JComboBox<>();
        jSeparator16 = new javax.swing.JSeparator();
        nombreLabel9 = new javax.swing.JLabel();
        usernameTextField8 = new javax.swing.JTextField();
        jSeparator17 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        nombreLabel10 = new javax.swing.JLabel();
        homePanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(1280, 600));
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setMinimumSize(new java.awt.Dimension(0, 0));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        loginPanel.setBackground(new java.awt.Color(0, 0, 102));
        loginPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logoPanel.setBackground(new java.awt.Color(0, 0, 102));
        logoPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        part1.setBackground(new java.awt.Color(255, 255, 255));
        part1.setFont(new java.awt.Font("Roboto", 1, 70)); // NOI18N
        part1.setForeground(new java.awt.Color(255, 255, 255));
        part1.setText("JDA");
        logoPanel.add(part1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 150, -1));

        part2.setFont(new java.awt.Font("Roboto", 0, 36)); // NOI18N
        part2.setForeground(new java.awt.Color(255, 255, 255));
        part2.setText("Social Network");
        logoPanel.add(part2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 250, -1));

        loginPanel.add(logoPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 250, 310));

        background.add(loginPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 570));

        loginSection.setBackground(new java.awt.Color(255, 255, 255));
        loginSection.setEnabled(false);
        loginSection.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        exitPanel.setBackground(new java.awt.Color(255, 255, 255));

        exitButton.setBackground(new java.awt.Color(0, 0, 0));
        exitButton.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        exitButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exitButton.setText("X");
        exitButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitButtonMouseExited(evt);
            }
        });

        javax.swing.GroupLayout exitPanelLayout = new javax.swing.GroupLayout(exitPanel);
        exitPanel.setLayout(exitPanelLayout);
        exitPanelLayout.setHorizontalGroup(
            exitPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, exitPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        exitPanelLayout.setVerticalGroup(
            exitPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, exitPanelLayout.createSequentialGroup()
                .addGap(0, 1, Short.MAX_VALUE)
                .addComponent(exitButton))
        );

        loginSection.add(exitPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 0, 30, 30));

        iniciarLabel.setBackground(new java.awt.Color(255, 255, 255));
        iniciarLabel.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        iniciarLabel.setForeground(new java.awt.Color(0, 0, 0));
        iniciarLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iniciarLabel.setText("INICIAR SESIÓN");
        loginSection.add(iniciarLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 3, 480, 80));

        passwordLabel.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        passwordLabel.setForeground(new java.awt.Color(0, 0, 0));
        passwordLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        passwordLabel.setText("CONTRASEÑA");
        loginSection.add(passwordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 480, -1));

        userLabel.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        userLabel.setForeground(new java.awt.Color(0, 0, 0));
        userLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        userLabel.setText("USUARIO");
        loginSection.add(userLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 480, -1));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jSeparator1.setMinimumSize(new java.awt.Dimension(50, 20));
        jSeparator1.setPreferredSize(new java.awt.Dimension(50, 50));
        loginSection.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 480, 10));

        usernameTextField.setBackground(new java.awt.Color(255, 255, 255));
        usernameTextField.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        usernameTextField.setForeground(new java.awt.Color(255, 255, 255));
        usernameTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        usernameTextField.setText("Ingrese su nombre de usuario");
        usernameTextField.setBorder(null);
        usernameTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usernameTextFieldMouseClicked(evt);
            }
        });
        usernameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameTextFieldActionPerformed(evt);
            }
        });
        loginSection.add(usernameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 480, 30));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jSeparator2.setMinimumSize(new java.awt.Dimension(50, 20));
        jSeparator2.setPreferredSize(new java.awt.Dimension(50, 50));
        loginSection.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 480, 10));

        userPasswordField.setBackground(new java.awt.Color(255, 255, 255));
        userPasswordField.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        userPasswordField.setForeground(new java.awt.Color(255, 255, 255));
        userPasswordField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        userPasswordField.setText("**************");
        userPasswordField.setBorder(null);
        userPasswordField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userPasswordFieldMouseClicked(evt);
            }
        });
        loginSection.add(userPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 480, 30));

        panelLogin.setBackground(new java.awt.Color(0, 0, 102));
        panelLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelLogin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        loginButton.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        loginButton.setForeground(new java.awt.Color(255, 255, 255));
        loginButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginButton.setText("INICIAR");
        loginButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loginButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                loginButtonMouseExited(evt);
            }
        });
        panelLogin.add(loginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 130, 40));

        loginSection.add(panelLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 300, 130, 40));

        registerPanel.setBackground(new java.awt.Color(0, 0, 102));
        registerPanel.setForeground(new java.awt.Color(255, 255, 255));
        registerPanel.setToolTipText("");
        registerPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        registerPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        registerButton.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        registerButton.setForeground(new java.awt.Color(255, 255, 255));
        registerButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        registerButton.setText("REGISTRARSE");
        registerButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registerButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                registerButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                registerButtonMouseExited(evt);
            }
        });
        registerPanel.add(registerButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 40));

        loginSection.add(registerPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 360, 230, 40));

        background.add(loginSection, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 0, 480, 570));

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 570, Short.MAX_VALUE)
        );

        background.add(content, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 0, -1, -1));

        registerSection.setBackground(new java.awt.Color(0, 0, 102));
        registerSection.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backPanel.setBackground(new java.awt.Color(0, 0, 150));

        backButton.setBackground(new java.awt.Color(0, 0, 150));
        backButton.setFont(new java.awt.Font("Roboto", 0, 48)); // NOI18N
        backButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        backButton.setText("<");
        backButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                backButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                backButtonMouseExited(evt);
            }
        });

        javax.swing.GroupLayout backPanelLayout = new javax.swing.GroupLayout(backPanel);
        backPanel.setLayout(backPanelLayout);
        backPanelLayout.setHorizontalGroup(
            backPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        backPanelLayout.setVerticalGroup(
            backPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, Short.MAX_VALUE)
        );

        registerSection.add(backPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 30));

        usernameTextField1.setBackground(new java.awt.Color(0, 0, 102));
        usernameTextField1.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        usernameTextField1.setForeground(new java.awt.Color(255, 255, 255));
        usernameTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        usernameTextField1.setBorder(null);
        usernameTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usernameTextField1MouseClicked(evt);
            }
        });
        usernameTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameTextField1ActionPerformed(evt);
            }
        });
        registerSection.add(usernameTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 290, 120, 30));

        passwordLabel1.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        passwordLabel1.setForeground(new java.awt.Color(255, 255, 255));
        passwordLabel1.setText("CONTRASEÑA:");
        registerSection.add(passwordLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, -1, 30));

        passwordTextField.setBackground(new java.awt.Color(0, 0, 102));
        passwordTextField.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        passwordTextField.setForeground(new java.awt.Color(255, 255, 255));
        passwordTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        passwordTextField.setBorder(null);
        registerSection.add(passwordTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 320, 110, 30));

        emailLabel.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        emailLabel.setForeground(new java.awt.Color(255, 255, 255));
        emailLabel.setText("EMAIL:");
        registerSection.add(emailLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, -1, 30));

        emailTextField.setBackground(new java.awt.Color(0, 0, 102));
        emailTextField.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        emailTextField.setForeground(new java.awt.Color(255, 255, 255));
        emailTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        emailTextField.setBorder(null);
        emailTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailTextFieldActionPerformed(evt);
            }
        });
        registerSection.add(emailTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 360, 370, 30));

        countryLabel.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        countryLabel.setForeground(new java.awt.Color(255, 255, 255));
        countryLabel.setText("PAIS:");
        registerSection.add(countryLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, -1, -1));

        countryComboBox.setBackground(new java.awt.Color(0, 0, 150));
        countryComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        countryComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                countryComboBoxActionPerformed(evt);
            }
        });
        registerSection.add(countryComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 120, 30));

        provinciaLabel.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        provinciaLabel.setForeground(new java.awt.Color(255, 255, 255));
        provinciaLabel.setText("PROVINCIA:");
        registerSection.add(provinciaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 410, 110, 30));

        provinciaComboBox.setBackground(new java.awt.Color(0, 0, 150));
        provinciaComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        registerSection.add(provinciaComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 410, 120, 30));

        cantonLabel.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        cantonLabel.setForeground(new java.awt.Color(255, 255, 255));
        cantonLabel.setText("CANTÓN:");
        registerSection.add(cantonLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 130, 50));

        cantonComboBox.setBackground(new java.awt.Color(0, 0, 150));
        cantonComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cantonComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantonComboBoxActionPerformed(evt);
            }
        });
        registerSection.add(cantonComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 460, 110, 30));

        distritoLabel.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        distritoLabel.setForeground(new java.awt.Color(255, 255, 255));
        distritoLabel.setText("DISTRITO:");
        registerSection.add(distritoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 460, 90, 30));

        distritoComboBox.setBackground(new java.awt.Color(0, 0, 150));
        distritoComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        registerSection.add(distritoComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 460, 120, 30));

        direccionLabel.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        direccionLabel.setForeground(new java.awt.Color(255, 255, 255));
        direccionLabel.setText("DIRECCIÓN:");
        registerSection.add(direccionLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 500, 240, 30));

        direccionTextField.setBackground(new java.awt.Color(0, 0, 102));
        direccionTextField.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        direccionTextField.setForeground(new java.awt.Color(255, 255, 255));
        direccionTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        direccionTextField.setBorder(null);
        registerSection.add(direccionTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 490, 330, 30));

        part3.setBackground(new java.awt.Color(255, 255, 255));
        part3.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        part3.setForeground(new java.awt.Color(255, 255, 255));
        part3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        part3.setText("Registro");
        registerSection.add(part3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, -1));

        jSeparator3.setBackground(new java.awt.Color(255, 255, 255));
        registerSection.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 320, 120, 10));

        jSeparator4.setBackground(new java.awt.Color(255, 255, 255));
        registerSection.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 480, 10));

        jSeparator5.setBackground(new java.awt.Color(255, 255, 255));
        registerSection.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 350, 110, 10));

        jSeparator6.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator6.setForeground(new java.awt.Color(255, 255, 255));
        registerSection.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 390, 370, 10));

        exitPanel1.setBackground(new java.awt.Color(0, 0, 150));

        exitButton1.setBackground(new java.awt.Color(0, 0, 0));
        exitButton1.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        exitButton1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exitButton1.setText("X");
        exitButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitButton1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitButton1MouseExited(evt);
            }
        });

        javax.swing.GroupLayout exitPanel1Layout = new javax.swing.GroupLayout(exitPanel1);
        exitPanel1.setLayout(exitPanel1Layout);
        exitPanel1Layout.setHorizontalGroup(
            exitPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, exitPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(exitButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        exitPanel1Layout.setVerticalGroup(
            exitPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, exitPanel1Layout.createSequentialGroup()
                .addGap(0, 1, Short.MAX_VALUE)
                .addComponent(exitButton1))
        );

        registerSection.add(exitPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 0, 30, 30));

        registerButtonPanel.setBackground(new java.awt.Color(0, 0, 150));
        registerButtonPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        registerButtonPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registerButtonPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                registerButtonPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                registerButtonPanelMouseExited(evt);
            }
        });
        registerButtonPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel1.setText("Registrar");
        registerButtonPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        registerSection.add(registerButtonPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 530, 130, 40));

        jSeparator7.setBackground(new java.awt.Color(255, 255, 255));
        registerSection.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 520, 340, 10));

        jSeparator8.setBackground(new java.awt.Color(255, 255, 255));
        registerSection.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 480, 10));

        usuarioLabel1.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        usuarioLabel1.setForeground(new java.awt.Color(255, 255, 255));
        usuarioLabel1.setText("USUARIO:");
        registerSection.add(usuarioLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, 40));

        nombreLabel1.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        nombreLabel1.setForeground(new java.awt.Color(255, 255, 255));
        nombreLabel1.setText("Nombre:");
        registerSection.add(nombreLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, 40));

        nombreLabel2.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        nombreLabel2.setForeground(new java.awt.Color(255, 255, 255));
        nombreLabel2.setText("Primer Apellido:");
        registerSection.add(nombreLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, -1, 40));

        usernameTextField2.setBackground(new java.awt.Color(0, 0, 102));
        usernameTextField2.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        usernameTextField2.setForeground(new java.awt.Color(255, 255, 255));
        usernameTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        usernameTextField2.setBorder(null);
        usernameTextField2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usernameTextField2MouseClicked(evt);
            }
        });
        usernameTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameTextField2ActionPerformed(evt);
            }
        });
        registerSection.add(usernameTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 120, 30));

        jSeparator10.setBackground(new java.awt.Color(255, 255, 255));
        registerSection.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 120, 10));

        usernameTextField3.setBackground(new java.awt.Color(0, 0, 102));
        usernameTextField3.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        usernameTextField3.setForeground(new java.awt.Color(255, 255, 255));
        usernameTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        usernameTextField3.setBorder(null);
        usernameTextField3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usernameTextField3MouseClicked(evt);
            }
        });
        usernameTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameTextField3ActionPerformed(evt);
            }
        });
        registerSection.add(usernameTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 50, 120, 30));

        jSeparator11.setBackground(new java.awt.Color(255, 255, 255));
        registerSection.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 80, 120, 10));

        usernameTextField4.setBackground(new java.awt.Color(0, 0, 102));
        usernameTextField4.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        usernameTextField4.setForeground(new java.awt.Color(255, 255, 255));
        usernameTextField4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        usernameTextField4.setBorder(null);
        usernameTextField4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usernameTextField4MouseClicked(evt);
            }
        });
        usernameTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameTextField4ActionPerformed(evt);
            }
        });
        registerSection.add(usernameTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 130, 30));

        jSeparator12.setBackground(new java.awt.Color(255, 255, 255));
        registerSection.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 130, 10));

        nombreLabel3.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        nombreLabel3.setForeground(new java.awt.Color(255, 255, 255));
        nombreLabel3.setText("Segundo Apellido:");
        registerSection.add(nombreLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, 30));

        countryComboBox1.setBackground(new java.awt.Color(0, 0, 150));
        countryComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        countryComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                countryComboBox1ActionPerformed(evt);
            }
        });
        registerSection.add(countryComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 410, 110, 30));

        nombreLabel4.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        nombreLabel4.setForeground(new java.awt.Color(255, 255, 255));
        nombreLabel4.setText("Tipo:");
        registerSection.add(nombreLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, 50, 40));

        usernameTextField5.setBackground(new java.awt.Color(0, 0, 102));
        usernameTextField5.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        usernameTextField5.setForeground(new java.awt.Color(255, 255, 255));
        usernameTextField5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        usernameTextField5.setBorder(null);
        usernameTextField5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usernameTextField5MouseClicked(evt);
            }
        });
        usernameTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameTextField5ActionPerformed(evt);
            }
        });
        registerSection.add(usernameTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 150, 30));

        jSeparator13.setBackground(new java.awt.Color(255, 255, 255));
        registerSection.add(jSeparator13, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 150, 10));

        nombreLabel5.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        nombreLabel5.setForeground(new java.awt.Color(255, 255, 255));
        nombreLabel5.setText("Edad:");
        registerSection.add(nombreLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 160, -1, 30));

        nombreLabel6.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        nombreLabel6.setForeground(new java.awt.Color(255, 255, 255));
        nombreLabel6.setText("Identificación:");
        registerSection.add(nombreLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, 30));

        usernameTextField6.setBackground(new java.awt.Color(0, 0, 102));
        usernameTextField6.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        usernameTextField6.setForeground(new java.awt.Color(255, 255, 255));
        usernameTextField6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        usernameTextField6.setBorder(null);
        usernameTextField6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usernameTextField6MouseClicked(evt);
            }
        });
        usernameTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameTextField6ActionPerformed(evt);
            }
        });
        registerSection.add(usernameTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 120, 30));

        jSeparator14.setBackground(new java.awt.Color(255, 255, 255));
        registerSection.add(jSeparator14, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 120, 10));

        nombreLabel7.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        nombreLabel7.setForeground(new java.awt.Color(255, 255, 255));
        nombreLabel7.setText("Seleccionar foto:");
        registerSection.add(nombreLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 230, -1, 30));

        usernameTextField7.setBackground(new java.awt.Color(0, 0, 102));
        usernameTextField7.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        usernameTextField7.setForeground(new java.awt.Color(255, 255, 255));
        usernameTextField7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        usernameTextField7.setBorder(null);
        usernameTextField7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usernameTextField7MouseClicked(evt);
            }
        });
        usernameTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameTextField7ActionPerformed(evt);
            }
        });
        registerSection.add(usernameTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 150, 120, 30));

        jSeparator15.setBackground(new java.awt.Color(255, 255, 255));
        registerSection.add(jSeparator15, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 180, 120, 10));

        nombreLabel8.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        nombreLabel8.setForeground(new java.awt.Color(255, 255, 255));
        nombreLabel8.setText("Fecha Nacimiento:");
        registerSection.add(nombreLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, 30));

        countryComboBox2.setBackground(new java.awt.Color(0, 0, 150));
        countryComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        countryComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                countryComboBox2ActionPerformed(evt);
            }
        });
        registerSection.add(countryComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 110, 110, 30));

        jSeparator16.setBackground(new java.awt.Color(255, 255, 255));
        registerSection.add(jSeparator16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 480, 10));

        nombreLabel9.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        nombreLabel9.setForeground(new java.awt.Color(255, 255, 255));
        nombreLabel9.setText("Nacionalidad:");
        registerSection.add(nombreLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, 30));

        usernameTextField8.setBackground(new java.awt.Color(0, 0, 102));
        usernameTextField8.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        usernameTextField8.setForeground(new java.awt.Color(255, 255, 255));
        usernameTextField8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        usernameTextField8.setBorder(null);
        usernameTextField8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usernameTextField8MouseClicked(evt);
            }
        });
        usernameTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameTextField8ActionPerformed(evt);
            }
        });
        registerSection.add(usernameTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 120, 30));

        jSeparator17.setBackground(new java.awt.Color(255, 255, 255));
        registerSection.add(jSeparator17, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 120, 10));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        registerSection.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 230, -1, -1));

        nombreLabel10.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        nombreLabel10.setForeground(new java.awt.Color(255, 255, 255));
        nombreLabel10.setText("Telefono:");
        registerSection.add(nombreLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, 30));

        background.add(registerSection, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 0, -1, 570));

        homePanel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout homePanelLayout = new javax.swing.GroupLayout(homePanel);
        homePanel.setLayout(homePanelLayout);
        homePanelLayout.setHorizontalGroup(
            homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
        );
        homePanelLayout.setVerticalGroup(
            homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 570, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(homePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(homePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed

        xMousePosition = evt.getX();
        yMousePosition = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMousePosition, y - yMousePosition);
    }//GEN-LAST:event_formMouseDragged

    private void usernameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameTextFieldActionPerformed

    private void usernameTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usernameTextFieldMouseClicked

        if (usernameTextField.getText().equals("Ingrese su nombre de usuario")) {
            usernameTextField.setText("");
            usernameTextField.setForeground(Color.black);
        }
        if (String.valueOf(userPasswordField.getPassword()).isEmpty()) {
            userPasswordField.setText("**************");
            userPasswordField.setForeground(Color.GRAY);
        }

    }//GEN-LAST:event_usernameTextFieldMouseClicked

    private void userPasswordFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userPasswordFieldMouseClicked

        if (String.valueOf(userPasswordField.getPassword()).equals("**************")) {
            userPasswordField.setText("");
            userPasswordField.setForeground(Color.black);
        }
        if (usernameTextField.getText().isEmpty()) {
            usernameTextField.setText("Ingrese su nombre de usuario");
            usernameTextField.setForeground(Color.GRAY);
        }

    }//GEN-LAST:event_userPasswordFieldMouseClicked

    private void loginButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginButtonMouseExited
        panelLogin.setBackground(new Color(0, 0, 102));
    }//GEN-LAST:event_loginButtonMouseExited

    private void loginButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginButtonMouseEntered
        panelLogin.setBackground(new Color(0, 0, 150));
    }//GEN-LAST:event_loginButtonMouseEntered

    private void registerButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerButtonMouseExited
        registerPanel.setBackground(new Color(0, 0, 102));
    }//GEN-LAST:event_registerButtonMouseExited

    private void registerButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerButtonMouseEntered
        registerPanel.setBackground(new Color(0, 0, 150));
    }//GEN-LAST:event_registerButtonMouseEntered

    private void registerButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerButtonMouseClicked
        loginPanel.setBackground(Color.black);
        logoPanel.setBackground(Color.black);

        registerSection.setSize(480, 570);
        registerSection.setLocation(0, 0);
        content.removeAll();
        content.add(registerSection, BorderLayout.CENTER);
        registerSection.setEnabled(true);
        registerSection.setVisible(true);
        content.revalidate();
        content.repaint();

    }//GEN-LAST:event_registerButtonMouseClicked

    private void exitButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitButtonMouseExited
        exitPanel.setBackground(Color.white);
    }//GEN-LAST:event_exitButtonMouseExited

    private void exitButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitButtonMouseEntered
        exitPanel.setBackground(Color.red);
    }//GEN-LAST:event_exitButtonMouseEntered

    private void exitButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitButtonMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitButtonMouseClicked

    private void loginButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginButtonMouseClicked
        if (usernameTextField.getText().equals("admin")) {
            homeAdmin h1 = new homeAdmin();
            h1.setSize(900, 570);
            h1.setLocation(0, 0);
            homePanel.removeAll();
            homePanel.add(h1, BorderLayout.CENTER);
            homePanel.revalidate();
            homePanel.repaint();
        }else{
        home h1 = new home();
        h1.setSize(900, 570);
        h1.setLocation(0, 0);
        homePanel.removeAll();
        homePanel.add(h1, BorderLayout.CENTER);
        homePanel.revalidate();
        homePanel.repaint();
        }

    }//GEN-LAST:event_loginButtonMouseClicked

    private void backButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backButtonMouseClicked
        loginPanel.setBackground(new Color(0, 0, 102));
        logoPanel.setBackground(new Color(0, 0, 102));

        loginSection.setLocation(0, 0);
        content.removeAll();
        content.add(loginSection, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_backButtonMouseClicked

    private void backButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backButtonMouseEntered
        backPanel.setBackground(Color.red);
    }//GEN-LAST:event_backButtonMouseEntered

    private void backButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backButtonMouseExited
        backPanel.setBackground(new Color(0, 0, 150));
    }//GEN-LAST:event_backButtonMouseExited

    private void usernameTextField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usernameTextField1MouseClicked

    }//GEN-LAST:event_usernameTextField1MouseClicked

    private void usernameTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameTextField1ActionPerformed

    private void exitButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitButton1MouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitButton1MouseClicked

    private void exitButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitButton1MouseEntered
        exitPanel1.setBackground(Color.red);
    }//GEN-LAST:event_exitButton1MouseEntered

    private void exitButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitButton1MouseExited
        exitPanel1.setBackground(new Color(0, 0, 150));
    }//GEN-LAST:event_exitButton1MouseExited

    private void registerButtonPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerButtonPanelMouseClicked

        loginPanel.setBackground(new Color(0, 0, 102));
        logoPanel.setBackground(new Color(0, 0, 102));

        loginSection.setLocation(0, 0);
        content.removeAll();
        content.add(loginSection, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_registerButtonPanelMouseClicked

    private void registerButtonPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerButtonPanelMouseEntered

    }//GEN-LAST:event_registerButtonPanelMouseEntered

    private void registerButtonPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerButtonPanelMouseExited

    }//GEN-LAST:event_registerButtonPanelMouseExited

    private void emailTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailTextFieldActionPerformed

    private void countryComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_countryComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_countryComboBoxActionPerformed

    private void cantonComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantonComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cantonComboBoxActionPerformed

    private void usernameTextField2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usernameTextField2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameTextField2MouseClicked

    private void usernameTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameTextField2ActionPerformed

    private void usernameTextField3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usernameTextField3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameTextField3MouseClicked

    private void usernameTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameTextField3ActionPerformed

    private void usernameTextField4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usernameTextField4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameTextField4MouseClicked

    private void usernameTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameTextField4ActionPerformed

    private void countryComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_countryComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_countryComboBox1ActionPerformed

    private void usernameTextField5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usernameTextField5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameTextField5MouseClicked

    private void usernameTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameTextField5ActionPerformed

    private void usernameTextField6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usernameTextField6MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameTextField6MouseClicked

    private void usernameTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameTextField6ActionPerformed

    private void usernameTextField7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usernameTextField7MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameTextField7MouseClicked

    private void usernameTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameTextField7ActionPerformed

    private void countryComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_countryComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_countryComboBox2ActionPerformed

    private void usernameTextField8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usernameTextField8MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameTextField8MouseClicked

    private void usernameTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameTextField8ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    public JPanel getContent() {
        return content;
    }

    public JPanel getLoginSection() {
        return loginSection;
    }

    public JPanel getLogoPanel() {
        return logoPanel;
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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backButton;
    private javax.swing.JPanel backPanel;
    public javax.swing.JPanel background;
    private javax.swing.JComboBox<String> cantonComboBox;
    private javax.swing.JLabel cantonLabel;
    public javax.swing.JPanel content;
    private javax.swing.JComboBox<String> countryComboBox;
    private javax.swing.JComboBox<String> countryComboBox1;
    private javax.swing.JComboBox<String> countryComboBox2;
    private javax.swing.JLabel countryLabel;
    private javax.swing.JLabel direccionLabel;
    private javax.swing.JTextField direccionTextField;
    private javax.swing.JComboBox<String> distritoComboBox;
    private javax.swing.JLabel distritoLabel;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JLabel exitButton;
    private javax.swing.JLabel exitButton1;
    private javax.swing.JPanel exitPanel;
    private javax.swing.JPanel exitPanel1;
    public javax.swing.JPanel homePanel;
    private javax.swing.JLabel iniciarLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator17;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JLabel loginButton;
    public javax.swing.JPanel loginPanel;
    public javax.swing.JPanel loginSection;
    private javax.swing.JPanel logoPanel;
    private javax.swing.JLabel nombreLabel1;
    private javax.swing.JLabel nombreLabel10;
    private javax.swing.JLabel nombreLabel2;
    private javax.swing.JLabel nombreLabel3;
    private javax.swing.JLabel nombreLabel4;
    private javax.swing.JLabel nombreLabel5;
    private javax.swing.JLabel nombreLabel6;
    private javax.swing.JLabel nombreLabel7;
    private javax.swing.JLabel nombreLabel8;
    private javax.swing.JLabel nombreLabel9;
    private javax.swing.JPanel panelLogin;
    private javax.swing.JLabel part1;
    private javax.swing.JLabel part2;
    private javax.swing.JLabel part3;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JLabel passwordLabel1;
    private javax.swing.JTextField passwordTextField;
    private javax.swing.JComboBox<String> provinciaComboBox;
    private javax.swing.JLabel provinciaLabel;
    private javax.swing.JLabel registerButton;
    private javax.swing.JPanel registerButtonPanel;
    private javax.swing.JPanel registerPanel;
    private javax.swing.JPanel registerSection;
    private javax.swing.JLabel userLabel;
    private javax.swing.JPasswordField userPasswordField;
    private javax.swing.JTextField usernameTextField;
    private javax.swing.JTextField usernameTextField1;
    private javax.swing.JTextField usernameTextField2;
    private javax.swing.JTextField usernameTextField3;
    private javax.swing.JTextField usernameTextField4;
    private javax.swing.JTextField usernameTextField5;
    private javax.swing.JTextField usernameTextField6;
    private javax.swing.JTextField usernameTextField7;
    private javax.swing.JTextField usernameTextField8;
    private javax.swing.JLabel usuarioLabel1;
    // End of variables declaration//GEN-END:variables
}
