/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.View.adminPanels;

import com.Controllers.Controller_Main;
import com.Controllers.Controller_UserType;

/**
 *
 * @author garroakion
 */
public class UserType extends javax.swing.JPanel {

    private Controller_Main mainCont = Controller_Main.getContMain();
    private Controller_UserType controller;

    /**
     * Creates new form UserType
     */
    public UserType() {
        initComponents();
        controller = mainCont.getContUserType();
        fillTable();
    }
        private void fillTable(){
        try{
        this.tableInfo.setModel(controller.listInfo());
        this.tableInfo.revalidate();
        this.tableInfo.repaint();
        
        }catch(Exception e){
        System.out.println("fallo llenar");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleBrand = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableInfo = new javax.swing.JTable(){
            private static final long serialVersionUID = 1L;

            public boolean isCellEditable(int row, int column) {
                return false;
            };};
            createButton = new javax.swing.JButton();
            modifyButton = new javax.swing.JButton();
            nameField = new javax.swing.JTextField();
            jScrollPane1 = new javax.swing.JScrollPane();
            descriptionField = new javax.swing.JTextArea();
            jLabel4 = new javax.swing.JLabel();
            jLabel5 = new javax.swing.JLabel();

            setBackground(new java.awt.Color(255, 255, 255));
            setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

            titleBrand.setBackground(new java.awt.Color(0, 0, 102));
            titleBrand.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

            jLabel1.setBackground(new java.awt.Color(0, 0, 102));
            jLabel1.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
            jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel1.setText("New User Type");
            jLabel1.setToolTipText("");
            titleBrand.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 50));

            add(titleBrand, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 50));

            tableInfo.setBackground(new java.awt.Color(255, 255, 255));
            tableInfo.setBorder(null);
            tableInfo.setForeground(new java.awt.Color(0, 0, 0));
            tableInfo.setModel(new javax.swing.table.DefaultTableModel(

                new Object [][] {
                    {null, null, null, null},
                    {null, null, null, null},
                    {null, null, null, null},
                    {null, null, null, null}
                },
                new String [] {
                    "Title 1", "Title 2", "Title 3", "Title 4"
                }

            )

        );
        tableInfo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tableInfo.setName(""); // NOI18N
        jScrollPane2.setViewportView(tableInfo);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 630, 320));

        createButton.setBackground(new java.awt.Color(0, 0, 0));
        createButton.setForeground(new java.awt.Color(255, 255, 255));
        createButton.setText("Create");
        createButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createButtonActionPerformed(evt);
            }
        });
        add(createButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 100, -1, -1));

        modifyButton.setBackground(new java.awt.Color(0, 0, 0));
        modifyButton.setForeground(new java.awt.Color(255, 255, 255));
        modifyButton.setText("Modify");
        add(modifyButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 100, -1, -1));

        nameField.setDocument(new limitText.JTextFieldLimit(20));
        nameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameFieldActionPerformed(evt);
            }
        });
        add(nameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 240, -1));

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        descriptionField.setColumns(50);
        descriptionField.setRows(2);
        descriptionField.setDocument(new limitText.JTextFieldLimit(20));
        jScrollPane1.setViewportView(descriptionField);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, 240, 60));

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Description:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, 50));

        jLabel5.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Name of the user type:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void createButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createButtonActionPerformed
        try {
            if (!this.nameField.getText().isBlank() && !this.descriptionField.getText().isBlank()) {
                mainCont.createWindowMessage(controller.create(this.nameField.getText(), this.descriptionField.getText()), "Creating User Type");
                fillTable();

            } else {
                mainCont.createWindowMessage("Missing data", "Blank Fields");
            }
        } catch (Exception e) {

        }        // TODO add your handling code here:
    }//GEN-LAST:event_createButtonActionPerformed

    private void nameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton createButton;
    private javax.swing.JTextArea descriptionField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton modifyButton;
    private javax.swing.JTextField nameField;
    private javax.swing.JTable tableInfo;
    private javax.swing.JPanel titleBrand;
    // End of variables declaration//GEN-END:variables
}
