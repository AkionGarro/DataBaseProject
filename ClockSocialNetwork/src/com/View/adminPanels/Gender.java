/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.View.adminPanels;

import com.Controllers.Controller_Gender;
import com.Controllers.Controller_Main;

/**
 *
 * @author garroakion
 */
public class Gender extends javax.swing.JPanel {

    private Controller_Main mainCont = Controller_Main.getContMain();
    private Controller_Gender controller;


    public Gender() {
        initComponents();
        controller = mainCont.getContGender();
        fillTable();
    }
    
        private void fillTable(){
        try{
        this.tableInfo.setModel(controller.listInfo());
        this.tableInfo.revalidate();
        this.tableInfo.repaint();
        }catch(Exception e){
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
        titleBrand1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableInfo = new javax.swing.JTable();
        createButton = new javax.swing.JButton();
        modifyButton = new javax.swing.JButton();
        nameField = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titleBrand.setBackground(new java.awt.Color(0, 0, 102));
        titleBrand.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 102));
        jLabel1.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("New Gender");
        jLabel1.setToolTipText("");
        titleBrand.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 50));

        add(titleBrand, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 50));

        titleBrand1.setBackground(new java.awt.Color(0, 0, 102));
        titleBrand1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(0, 0, 102));
        jLabel2.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("New Brand");
        jLabel2.setToolTipText("");
        titleBrand1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 50));

        add(titleBrand1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 50));

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Gender:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 50, 120, 50));

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
        ));
        jScrollPane2.setViewportView(tableInfo);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 630, 430));

        createButton.setBackground(new java.awt.Color(0, 0, 0));
        createButton.setForeground(new java.awt.Color(255, 255, 255));
        createButton.setText("Create");
        createButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createButtonActionPerformed(evt);
            }
        });
        add(createButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 60, 70, 30));

        modifyButton.setBackground(new java.awt.Color(0, 0, 0));
        modifyButton.setForeground(new java.awt.Color(255, 255, 255));
        modifyButton.setText("Modify");
        add(modifyButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 60, 70, 30));

        nameField.setDocument(new limitText.JTextFieldLimit(20));
        nameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameFieldActionPerformed(evt);
            }
        });
        add(nameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 300, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void createButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createButtonActionPerformed
        try {
            if (!this.nameField.getText().isBlank()) {
                mainCont.createWindowMessage(controller.create(this.nameField.getText()), "Create Brand");
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton modifyButton;
    private javax.swing.JTextField nameField;
    private javax.swing.JTable tableInfo;
    private javax.swing.JPanel titleBrand;
    private javax.swing.JPanel titleBrand1;
    // End of variables declaration//GEN-END:variables
}
