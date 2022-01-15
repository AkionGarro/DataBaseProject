package com.View;

import com.Controllers.Controller_City;
import com.Controllers.Controller_Country;
import com.Controllers.Controller_District;
import com.Controllers.Controller_Identification;
import com.Controllers.Controller_Main;
import java.awt.BorderLayout;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JPanel;

/**
 *
 * @author garroakion
 */
public class login extends javax.swing.JFrame {

    private int xMousePosition, yMousePosition;
    private Controller_Main mainCont = Controller_Main.getContMain();
    private Controller_Country controllerCountry;
    private Controller_City controllerCity;
    private Controller_District controllerDistrict;
    private Controller_Identification controllerIdentification;

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
        controllerCountry = mainCont.getContCountry();
        controllerCity = mainCont.getContCity();
        controllerDistrict = mainCont.getContDistrict();
        controllerIdentification = mainCont.getContIdentification();
        this.fillCountry();
        this.fillComboCitizen();
        this.fillComboCodeCountry();
        this.fillComboIdentificationType();
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
        usernameField = new javax.swing.JTextField();
        passwordLabel1 = new javax.swing.JLabel();
        passwordTextField = new javax.swing.JTextField();
        emailLabel = new javax.swing.JLabel();
        emailTextField = new javax.swing.JTextField();
        countryLabel = new javax.swing.JLabel();
        comboCitizenship = new javax.swing.JComboBox<>();
        provinciaLabel = new javax.swing.JLabel();
        comboCity = new javax.swing.JComboBox<>();
        distritoLabel = new javax.swing.JLabel();
        comboDistrict = new javax.swing.JComboBox<>();
        part3 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        exitPanel1 = new javax.swing.JPanel();
        exitButton1 = new javax.swing.JLabel();
        registerButtonPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        usuarioLabel1 = new javax.swing.JLabel();
        nombreLabel1 = new javax.swing.JLabel();
        nombreLabel2 = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        jSeparator10 = new javax.swing.JSeparator();
        lastNameField = new javax.swing.JTextField();
        jSeparator11 = new javax.swing.JSeparator();
        secondLastNameField = new javax.swing.JTextField();
        jSeparator12 = new javax.swing.JSeparator();
        nombreLabel3 = new javax.swing.JLabel();
        comboCountry = new javax.swing.JComboBox<>();
        nombreLabel4 = new javax.swing.JLabel();
        identificationField = new javax.swing.JTextField();
        jSeparator13 = new javax.swing.JSeparator();
        nombreLabel6 = new javax.swing.JLabel();
        comboIdentification = new javax.swing.JComboBox<>();
        jSeparator16 = new javax.swing.JSeparator();
        nombreLabel9 = new javax.swing.JLabel();
        phoneField = new javax.swing.JTextField();
        jSeparator17 = new javax.swing.JSeparator();
        PhoneNumber = new javax.swing.JLabel();
        comboCodeCountry = new javax.swing.JComboBox<>();
        nombreLabel5 = new javax.swing.JLabel();
        homePanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1000, 700));
        setResizable(false);
        setSize(new java.awt.Dimension(1000, 700));
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
        background.setMinimumSize(new java.awt.Dimension(1000, 700));
        background.setPreferredSize(new java.awt.Dimension(1000, 700));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        loginPanel.setBackground(new java.awt.Color(62, 114, 179));
        loginPanel.setMinimumSize(new java.awt.Dimension(420, 700));
        loginPanel.setPreferredSize(new java.awt.Dimension(420, 700));
        loginPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logoPanel.setBackground(new java.awt.Color(62, 114, 179));
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

        background.add(loginPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 700));

        loginSection.setBackground(new java.awt.Color(255, 255, 255));
        loginSection.setEnabled(false);
        loginSection.setMinimumSize(new java.awt.Dimension(580, 700));
        loginSection.setPreferredSize(new java.awt.Dimension(580, 700));
        loginSection.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        exitPanel.setBackground(new java.awt.Color(255, 255, 255));

        exitButton.setBackground(new java.awt.Color(0, 0, 0));
        exitButton.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        exitButton.setForeground(new java.awt.Color(0, 0, 0));
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
            .addGroup(exitPanelLayout.createSequentialGroup()
                .addComponent(exitButton)
                .addGap(0, 1, Short.MAX_VALUE))
        );

        loginSection.add(exitPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 0, 30, 30));

        iniciarLabel.setBackground(new java.awt.Color(255, 255, 255));
        iniciarLabel.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        iniciarLabel.setForeground(new java.awt.Color(0, 0, 0));
        iniciarLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iniciarLabel.setText("INICIAR SESIÓN");
        loginSection.add(iniciarLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 3, 480, 80));

        passwordLabel.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        passwordLabel.setForeground(new java.awt.Color(0, 0, 0));
        passwordLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        passwordLabel.setText("CONTRASEÑA");
        loginSection.add(passwordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 480, -1));

        userLabel.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        userLabel.setForeground(new java.awt.Color(0, 0, 0));
        userLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        userLabel.setText("USUARIO");
        loginSection.add(userLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 580, -1));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jSeparator1.setMinimumSize(new java.awt.Dimension(50, 20));
        jSeparator1.setPreferredSize(new java.awt.Dimension(50, 50));
        loginSection.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 480, 10));

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
        loginSection.add(usernameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 480, 30));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jSeparator2.setMinimumSize(new java.awt.Dimension(50, 20));
        jSeparator2.setPreferredSize(new java.awt.Dimension(50, 50));
        loginSection.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 480, 10));

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
        loginSection.add(userPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 480, 30));

        panelLogin.setBackground(new java.awt.Color(62, 114, 179));
        panelLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelLogin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        loginButton.setBackground(new java.awt.Color(62, 114, 179));
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

        loginSection.add(panelLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 340, 130, 40));

        registerPanel.setBackground(new java.awt.Color(62, 114, 179));
        registerPanel.setForeground(new java.awt.Color(255, 255, 255));
        registerPanel.setToolTipText("");
        registerPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        registerPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        registerButton.setBackground(new java.awt.Color(62, 114, 179));
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

        loginSection.add(registerPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 400, 230, 40));

        background.add(loginSection, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 0, -1, -1));

        content.setPreferredSize(new java.awt.Dimension(580, 700));

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 580, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );

        background.add(content, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 0, -1, -1));

        registerSection.setBackground(new java.awt.Color(62, 114, 179));
        registerSection.setMinimumSize(new java.awt.Dimension(580, 700));
        registerSection.setPreferredSize(new java.awt.Dimension(580, 700));
        registerSection.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backPanel.setBackground(new java.awt.Color(62, 114, 179));

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

        usernameField.setBackground(new java.awt.Color(62, 114, 179));
        usernameField.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        usernameField.setForeground(new java.awt.Color(255, 255, 255));
        usernameField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        usernameField.setBorder(null);
        usernameField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usernameFieldMouseClicked(evt);
            }
        });
        usernameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameFieldActionPerformed(evt);
            }
        });
        registerSection.add(usernameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 420, 120, 30));

        passwordLabel1.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        passwordLabel1.setForeground(new java.awt.Color(255, 255, 255));
        passwordLabel1.setText("Password:");
        registerSection.add(passwordLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 430, -1, 30));

        passwordTextField.setBackground(new java.awt.Color(62, 114, 179));
        passwordTextField.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        passwordTextField.setForeground(new java.awt.Color(255, 255, 255));
        passwordTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        passwordTextField.setBorder(null);
        registerSection.add(passwordTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 420, 110, 30));

        emailLabel.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        emailLabel.setForeground(new java.awt.Color(255, 255, 255));
        emailLabel.setText("E-mail:");
        registerSection.add(emailLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, -1, 30));

        emailTextField.setBackground(new java.awt.Color(62, 114, 179));
        emailTextField.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        emailTextField.setForeground(new java.awt.Color(255, 255, 255));
        emailTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        emailTextField.setBorder(null);
        emailTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailTextFieldActionPerformed(evt);
            }
        });
        registerSection.add(emailTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 470, 360, 30));

        countryLabel.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        countryLabel.setForeground(new java.awt.Color(255, 255, 255));
        countryLabel.setText("Country:");
        registerSection.add(countryLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 540, -1, -1));

        comboCitizenship.setBackground(new java.awt.Color(62, 114, 179));
        comboCitizenship.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboCitizenship.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboCitizenshipActionPerformed(evt);
            }
        });
        registerSection.add(comboCitizenship, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 120, 30));

        provinciaLabel.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        provinciaLabel.setForeground(new java.awt.Color(255, 255, 255));
        provinciaLabel.setText("City:");
        registerSection.add(provinciaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 530, 40, 40));

        comboCity.setBackground(new java.awt.Color(0, 0, 150));
        comboCity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboCity.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboCityItemStateChanged(evt);
            }
        });
        registerSection.add(comboCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 530, 100, 40));

        distritoLabel.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        distritoLabel.setForeground(new java.awt.Color(255, 255, 255));
        distritoLabel.setText("District:");
        registerSection.add(distritoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 530, 70, 40));

        comboDistrict.setBackground(new java.awt.Color(0, 0, 150));
        comboDistrict.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        registerSection.add(comboDistrict, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 530, 120, 40));

        part3.setBackground(new java.awt.Color(255, 255, 255));
        part3.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        part3.setForeground(new java.awt.Color(255, 255, 255));
        part3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        part3.setText("Sign In");
        registerSection.add(part3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 520, -1));
        registerSection.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 450, 120, 10));
        registerSection.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 580, 10));
        registerSection.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 450, 110, 10));

        jSeparator6.setForeground(new java.awt.Color(255, 255, 255));
        registerSection.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 500, 360, 10));

        exitPanel1.setBackground(new java.awt.Color(62, 114, 179));

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
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(exitButton1))
        );

        registerSection.add(exitPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 0, 30, 30));

        registerButtonPanel.setBackground(new java.awt.Color(62, 114, 179));
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

        registerSection.add(registerButtonPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 630, 130, 40));
        registerSection.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 580, 10));

        usuarioLabel1.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        usuarioLabel1.setForeground(new java.awt.Color(255, 255, 255));
        usuarioLabel1.setText("Username:");
        registerSection.add(usuarioLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, -1, 30));

        nombreLabel1.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        nombreLabel1.setForeground(new java.awt.Color(255, 255, 255));
        nombreLabel1.setText("Name:");
        registerSection.add(nombreLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, 40));

        nombreLabel2.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        nombreLabel2.setForeground(new java.awt.Color(255, 255, 255));
        nombreLabel2.setText("Surname:");
        registerSection.add(nombreLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, 40));

        nameField.setBackground(new java.awt.Color(62, 114, 179));
        nameField.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        nameField.setForeground(new java.awt.Color(255, 255, 255));
        nameField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nameField.setBorder(null);
        nameField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nameFieldMouseClicked(evt);
            }
        });
        nameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameFieldActionPerformed(evt);
            }
        });
        registerSection.add(nameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 120, 30));
        registerSection.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 120, 10));

        lastNameField.setBackground(new java.awt.Color(62, 114, 179));
        lastNameField.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        lastNameField.setForeground(new java.awt.Color(255, 255, 255));
        lastNameField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lastNameField.setBorder(null);
        lastNameField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lastNameFieldMouseClicked(evt);
            }
        });
        lastNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastNameFieldActionPerformed(evt);
            }
        });
        registerSection.add(lastNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 120, 30));
        registerSection.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 120, 10));

        secondLastNameField.setBackground(new java.awt.Color(62, 114, 179));
        secondLastNameField.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        secondLastNameField.setForeground(new java.awt.Color(255, 255, 255));
        secondLastNameField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        secondLastNameField.setBorder(null);
        secondLastNameField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                secondLastNameFieldMouseClicked(evt);
            }
        });
        secondLastNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                secondLastNameFieldActionPerformed(evt);
            }
        });
        registerSection.add(secondLastNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 80, 110, 30));
        registerSection.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 110, 110, 10));

        nombreLabel3.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        nombreLabel3.setForeground(new java.awt.Color(255, 255, 255));
        nombreLabel3.setText("Second Surname:");
        registerSection.add(nombreLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, -1, 40));

        comboCountry.setBackground(new java.awt.Color(0, 0, 150));
        comboCountry.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboCountry.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboCountryItemStateChanged(evt);
            }
        });
        comboCountry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboCountryActionPerformed(evt);
            }
        });
        registerSection.add(comboCountry, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 530, 90, 40));

        nombreLabel4.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        nombreLabel4.setForeground(new java.awt.Color(255, 255, 255));
        nombreLabel4.setText("Type:");
        registerSection.add(nombreLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 190, 50, 40));

        identificationField.setBackground(new java.awt.Color(62, 114, 179));
        identificationField.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        identificationField.setForeground(new java.awt.Color(255, 255, 255));
        identificationField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        identificationField.setBorder(null);
        identificationField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                identificationFieldMouseClicked(evt);
            }
        });
        identificationField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                identificationFieldActionPerformed(evt);
            }
        });
        registerSection.add(identificationField, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 150, 30));
        registerSection.add(jSeparator13, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 150, 10));

        nombreLabel6.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        nombreLabel6.setForeground(new java.awt.Color(255, 255, 255));
        nombreLabel6.setText("Identification:");
        registerSection.add(nombreLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, 30));

        comboIdentification.setBackground(new java.awt.Color(62, 114, 179));
        comboIdentification.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboIdentification.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboIdentificationActionPerformed(evt);
            }
        });
        registerSection.add(comboIdentification, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 120, 110, 30));
        registerSection.add(jSeparator16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 590, 580, 10));

        nombreLabel9.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        nombreLabel9.setForeground(new java.awt.Color(255, 255, 255));
        nombreLabel9.setText("Citizenship:");
        registerSection.add(nombreLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, 30));

        phoneField.setBackground(new java.awt.Color(62, 114, 179));
        phoneField.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        phoneField.setForeground(new java.awt.Color(255, 255, 255));
        phoneField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        phoneField.setBorder(null);
        phoneField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                phoneFieldMouseClicked(evt);
            }
        });
        phoneField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneFieldActionPerformed(evt);
            }
        });
        registerSection.add(phoneField, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 140, 30));
        registerSection.add(jSeparator17, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 140, 10));

        PhoneNumber.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        PhoneNumber.setForeground(new java.awt.Color(255, 255, 255));
        PhoneNumber.setText("Phone Number:");
        registerSection.add(PhoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, 30));

        comboCodeCountry.setBackground(new java.awt.Color(62, 114, 179));
        comboCodeCountry.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboCodeCountry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboCodeCountryActionPerformed(evt);
            }
        });
        registerSection.add(comboCodeCountry, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 190, 110, 30));

        nombreLabel5.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        nombreLabel5.setForeground(new java.awt.Color(255, 255, 255));
        nombreLabel5.setText("Type:");
        registerSection.add(nombreLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, 50, 40));

        background.add(registerSection, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 0, -1, -1));

        homePanel.setBackground(new java.awt.Color(255, 255, 255));
        homePanel.setMinimumSize(new java.awt.Dimension(1000, 700));
        homePanel.setPreferredSize(new java.awt.Dimension(1000, 700));

        javax.swing.GroupLayout homePanelLayout = new javax.swing.GroupLayout(homePanel);
        homePanel.setLayout(homePanelLayout);
        homePanelLayout.setHorizontalGroup(
            homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        homePanelLayout.setVerticalGroup(
            homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
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
        panelLogin.setBackground(new Color(62, 114, 179));
    }//GEN-LAST:event_loginButtonMouseExited

    private void loginButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginButtonMouseEntered
        panelLogin.setBackground(new Color(0, 0, 150));
    }//GEN-LAST:event_loginButtonMouseEntered

    private void registerButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerButtonMouseExited
        registerPanel.setBackground(new Color(62, 114, 179));
    }//GEN-LAST:event_registerButtonMouseExited

    private void registerButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerButtonMouseEntered
        registerPanel.setBackground(new Color(0, 0, 150));
    }//GEN-LAST:event_registerButtonMouseEntered

    private void registerButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerButtonMouseClicked
        loginPanel.setBackground(Color.black);
        logoPanel.setBackground(Color.black);

        registerSection.setSize(580, 700);
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
            h1.setSize(1000, 700);
            h1.setLocation(0, 0);
            homePanel.removeAll();
            homePanel.add(h1, BorderLayout.CENTER);
            homePanel.revalidate();
            homePanel.repaint();
        } else {
            home h1 = new home();
            h1.setSize(1000, 700);
            h1.setLocation(0, 0);
            homePanel.removeAll();
            homePanel.add(h1, BorderLayout.CENTER);
            homePanel.revalidate();
            homePanel.repaint();
        }

    }//GEN-LAST:event_loginButtonMouseClicked

    private void backButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backButtonMouseClicked
        loginPanel.setBackground(new Color(62,114,179));
        logoPanel.setBackground(new Color(62,114,179));

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
        backPanel.setBackground(new Color(62, 114, 179));
    }//GEN-LAST:event_backButtonMouseExited

    private void usernameFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usernameFieldMouseClicked

    }//GEN-LAST:event_usernameFieldMouseClicked

    private void usernameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameFieldActionPerformed

    private void exitButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitButton1MouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitButton1MouseClicked

    private void exitButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitButton1MouseEntered
        exitPanel1.setBackground(Color.red);
    }//GEN-LAST:event_exitButton1MouseEntered

    private void exitButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitButton1MouseExited
        exitPanel1.setBackground(new Color(62, 114, 179));
    }//GEN-LAST:event_exitButton1MouseExited

    private void registerButtonPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerButtonPanelMouseClicked

        loginPanel.setBackground(new Color(62,114,179));
        logoPanel.setBackground(new Color(62,114,179));

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

    private void comboCitizenshipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboCitizenshipActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboCitizenshipActionPerformed

    private void nameFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nameFieldMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_nameFieldMouseClicked

    private void nameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameFieldActionPerformed

    private void lastNameFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lastNameFieldMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lastNameFieldMouseClicked

    private void lastNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastNameFieldActionPerformed

    private void secondLastNameFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_secondLastNameFieldMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_secondLastNameFieldMouseClicked

    private void secondLastNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_secondLastNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_secondLastNameFieldActionPerformed

    private void comboCountryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboCountryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboCountryActionPerformed

    private void identificationFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_identificationFieldMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_identificationFieldMouseClicked

    private void identificationFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_identificationFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_identificationFieldActionPerformed

    private void comboIdentificationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboIdentificationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboIdentificationActionPerformed

    private void phoneFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_phoneFieldMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneFieldMouseClicked

    private void phoneFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneFieldActionPerformed

    private void comboCountryItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboCountryItemStateChanged
        fillCity();
    }//GEN-LAST:event_comboCountryItemStateChanged

    private void comboCityItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboCityItemStateChanged
        fillDistrict();
    }//GEN-LAST:event_comboCityItemStateChanged

    private void comboCodeCountryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboCodeCountryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboCodeCountryActionPerformed

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

    private void fillComboIdentificationType() {
        try {
            ArrayList<String> listC = controllerIdentification.listInfoCombo();
            DefaultComboBoxModel listF = new DefaultComboBoxModel(listC.toArray());
            this.comboIdentification.setModel(listF);

        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    private void fillComboCitizen() {
        try {
            ArrayList<String> listC = controllerCountry.listInfoCombo();
            DefaultComboBoxModel listF = new DefaultComboBoxModel(listC.toArray());
            this.comboCitizenship.setModel(listF);

        } catch (Exception e) {
            System.out.println(e.toString());
        }

    }

    private void fillComboCodeCountry() {
        try {
            ArrayList<String> listC = controllerCountry.listCodeCombo();
            DefaultComboBoxModel listF = new DefaultComboBoxModel(listC.toArray());
            this.comboCodeCountry.setModel(listF);

        } catch (Exception e) {
            System.out.println(e.toString());
        }

    }

    private void fillCity() {
        try {
            this.comboCity.removeAllItems();
            int number = this.comboCountry.getSelectedIndex();
            ArrayList<String> listCity = new ArrayList<String>();
            listCity = controllerCity.listInfo(this.comboCountry.getItemAt(number));
            DefaultComboBoxModel modelList = new DefaultComboBoxModel(listCity.toArray());

            this.comboCity.setModel(modelList);

            System.out.println(listCity.size());
            //this.comboCity.setModel(new DefaultComboBoxModel(arr));

            this.fillDistrict();

        } catch (Exception e) {
            System.out.println("Error in fillcity  " + e.toString());
        }

    }

    private void fillCountry() {
        try {
            ArrayList<String> listC = controllerCountry.listInfoCombo();
            DefaultComboBoxModel listF = new DefaultComboBoxModel(listC.toArray());
            this.comboCountry.setModel(listF);
            this.fillCity();

        } catch (Exception e) {
            System.out.println(e.toString());
        }

    }

    private void fillDistrict() {
        try {
            ArrayList<String> listC = controllerDistrict.listInfo(this.comboCity.getSelectedItem().toString(), this.comboCountry.getSelectedItem().toString());
            DefaultComboBoxModel listF = new DefaultComboBoxModel(listC.toArray());
            this.comboDistrict.setModel(listF);

        } catch (Exception e) {

        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel PhoneNumber;
    private javax.swing.JLabel backButton;
    private javax.swing.JPanel backPanel;
    public javax.swing.JPanel background;
    private javax.swing.JComboBox<String> comboCitizenship;
    private javax.swing.JComboBox<String> comboCity;
    private javax.swing.JComboBox<String> comboCodeCountry;
    private javax.swing.JComboBox<String> comboCountry;
    private javax.swing.JComboBox<String> comboDistrict;
    private javax.swing.JComboBox<String> comboIdentification;
    public javax.swing.JPanel content;
    private javax.swing.JLabel countryLabel;
    private javax.swing.JLabel distritoLabel;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JLabel exitButton;
    private javax.swing.JLabel exitButton1;
    private javax.swing.JPanel exitPanel;
    private javax.swing.JPanel exitPanel1;
    public javax.swing.JPanel homePanel;
    private javax.swing.JTextField identificationField;
    private javax.swing.JLabel iniciarLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator17;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JTextField lastNameField;
    private javax.swing.JLabel loginButton;
    public javax.swing.JPanel loginPanel;
    public javax.swing.JPanel loginSection;
    private javax.swing.JPanel logoPanel;
    private javax.swing.JTextField nameField;
    private javax.swing.JLabel nombreLabel1;
    private javax.swing.JLabel nombreLabel2;
    private javax.swing.JLabel nombreLabel3;
    private javax.swing.JLabel nombreLabel4;
    private javax.swing.JLabel nombreLabel5;
    private javax.swing.JLabel nombreLabel6;
    private javax.swing.JLabel nombreLabel9;
    private javax.swing.JPanel panelLogin;
    private javax.swing.JLabel part1;
    private javax.swing.JLabel part2;
    private javax.swing.JLabel part3;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JLabel passwordLabel1;
    private javax.swing.JTextField passwordTextField;
    private javax.swing.JTextField phoneField;
    private javax.swing.JLabel provinciaLabel;
    private javax.swing.JLabel registerButton;
    private javax.swing.JPanel registerButtonPanel;
    private javax.swing.JPanel registerPanel;
    private javax.swing.JPanel registerSection;
    private javax.swing.JTextField secondLastNameField;
    private javax.swing.JLabel userLabel;
    private javax.swing.JPasswordField userPasswordField;
    private javax.swing.JTextField usernameField;
    private javax.swing.JTextField usernameTextField;
    private javax.swing.JLabel usuarioLabel1;
    // End of variables declaration//GEN-END:variables
}
