/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.View.adminPanels;

import com.Controllers.Controller_Main;
import com.Controllers.Controller_TypeClock;

/**
 *
 * @author garroakion
 */
public class ClockType extends javax.swing.JPanel {
  private  Controller_Main mainCont= Controller_Main.getContMain();
  private  Controller_TypeClock controller;

    /**
     * Creates new form ClockType
     */
    public ClockType() {
        initComponents();
        controller = mainCont.getContTypeClock();
        fillTable();
    }

    private void fillTable() {
        try {
            this.tableInfo.setModel(controller.listInfo());
            this.tableInfo.revalidate();
            this.tableInfo.repaint();
        } catch (Exception e) {

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
        deleteB = new javax.swing.JButton();
        modifyButton = new javax.swing.JButton();
        nameField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        descriptionField = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableInfo = new javax.swing.JTable() {   private static final long serialVersionUID = 1L;

            public boolean isCellEditable(int row, int column) {
                return false;
            };};
            jLabel7 = new javax.swing.JLabel();
            jLabel8 = new javax.swing.JLabel();
            createButton1 = new javax.swing.JButton();

            setBackground(new java.awt.Color(255, 255, 255));
            setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

            titleBrand.setBackground(new java.awt.Color(0, 0, 102));
            titleBrand.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

            jLabel1.setBackground(new java.awt.Color(0, 0, 102));
            jLabel1.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
            jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel1.setText("New Clock Type");
            jLabel1.setToolTipText("");
            titleBrand.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 50));

            add(titleBrand, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 50));

            deleteB.setBackground(new java.awt.Color(0, 0, 0));
            deleteB.setForeground(new java.awt.Color(255, 255, 255));
            deleteB.setText("Delete");
            deleteB.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    deleteBActionPerformed(evt);
                }
            });
            add(deleteB, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 130, -1, -1));

            modifyButton.setBackground(new java.awt.Color(0, 0, 0));
            modifyButton.setForeground(new java.awt.Color(255, 255, 255));
            modifyButton.setText("Modify");
            modifyButton.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    modifyButtonActionPerformed(evt);
                }
            });
            add(modifyButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 60, -1, -1));

            nameField.setDocument(new limitText.JTextFieldLimit(20));
            nameField.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    nameFieldActionPerformed(evt);
                }
            });
            add(nameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 192, -1));

            descriptionField.setColumns(20);
            descriptionField.setRows(5);
            nameField.setDocument(new limitText.JTextFieldLimit(200));
            jScrollPane1.setViewportView(descriptionField);

            add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 192, 120));

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

            add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 630, 290));

            jLabel7.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
            jLabel7.setText("Description:");
            add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, 30));

            jLabel8.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
            jLabel8.setText("Type's name:");
            add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, 30));

            createButton1.setBackground(new java.awt.Color(0, 0, 0));
            createButton1.setForeground(new java.awt.Color(255, 255, 255));
            createButton1.setText("Create");
            createButton1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    createButton1ActionPerformed(evt);
                }
            });
            add(createButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 60, -1, -1));
        }// </editor-fold>//GEN-END:initComponents

    private void deleteBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBActionPerformed
        int column = 0;
        int row = this.tableInfo.getSelectedRow();
        if (row!=-1){
            String value = this.tableInfo.getModel().getValueAt(row, column).toString();
            mainCont.createWindowMessage(controller.deleteT(value), "Delete");
            fillTable();
        }
    // TODO add your handling code here:
    }//GEN-LAST:event_deleteBActionPerformed

    private void nameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameFieldActionPerformed

    private void createButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createButton1ActionPerformed
       try{
           if (!this.descriptionField.getText().isBlank() && !this.nameField.getText().isBlank()){
            mainCont.createWindowMessage(controller.create(this.nameField.getText(),
                    this.descriptionField.getText()), "Create Condition");
            fillTable();
   
        }
        else {mainCont.createWindowMessage("Missing data", "Blank Fields");
        }  
       }
       catch(Exception e){
       
       }          // TODO add your handling code here:
    }//GEN-LAST:event_createButton1ActionPerformed

    private void modifyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifyButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modifyButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton createButton1;
    private javax.swing.JButton deleteB;
    private javax.swing.JTextArea descriptionField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton modifyButton;
    private javax.swing.JTextField nameField;
    private javax.swing.JTable tableInfo;
    private javax.swing.JPanel titleBrand;
    // End of variables declaration//GEN-END:variables
}
