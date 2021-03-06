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
            modifyButton1 = new javax.swing.JButton();

            setBackground(new java.awt.Color(255, 255, 255));
            setPreferredSize(new java.awt.Dimension(730, 660));
            setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

            deleteB.setBackground(new java.awt.Color(0, 0, 0));
            deleteB.setForeground(new java.awt.Color(255, 255, 255));
            deleteB.setText("Delete");
            deleteB.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    deleteBActionPerformed(evt);
                }
            });
            add(deleteB, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 10, 80, 30));

            modifyButton.setBackground(new java.awt.Color(0, 0, 0));
            modifyButton.setForeground(new java.awt.Color(255, 255, 255));
            modifyButton.setText("Change Type");
            modifyButton.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    modifyButtonActionPerformed(evt);
                }
            });
            add(modifyButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 10, 120, 30));

            nameField.setDocument(new limitText.JTextFieldLimit(20));
            nameField.setColumns(20);
            nameField.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    nameFieldActionPerformed(evt);
                }
            });
            add(nameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 192, -1));

            descriptionField.setColumns(20);
            descriptionField.setRows(5);
            descriptionField.setDocument(new limitText.JTextFieldLimit(100));
            jScrollPane1.setViewportView(descriptionField);

            add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 290, 70));

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

            add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 730, 490));

            jLabel7.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
            jLabel7.setText("Description:");
            add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, 30));

            jLabel8.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
            jLabel8.setText("Type's name:");
            add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 30));

            createButton1.setBackground(new java.awt.Color(0, 0, 0));
            createButton1.setForeground(new java.awt.Color(255, 255, 255));
            createButton1.setText("Create");
            createButton1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    createButton1ActionPerformed(evt);
                }
            });
            add(createButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 8, 80, 30));

            modifyButton1.setBackground(new java.awt.Color(0, 0, 0));
            modifyButton1.setForeground(new java.awt.Color(255, 255, 255));
            modifyButton1.setText("Change Description");
            modifyButton1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    modifyButton1ActionPerformed(evt);
                }
            });
            add(modifyButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 90, 140, 30));
        }// </editor-fold>//GEN-END:initComponents

    private void deleteBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBActionPerformed
        int column = 0;
        int row = this.tableInfo.getSelectedRow();
        if (row!=-1){
            String value = this.tableInfo.getModel().getValueAt(row, column).toString();
            mainCont.createWindowMessage(controller.deleteT(value), "Delete Clock Type");
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
               int column = 0;
        int row = this.tableInfo.getSelectedRow();
        if (row!=-1){
            String value = this.tableInfo.getModel().getValueAt(row, column).toString();
            mainCont.createWindowMessage(controller.updateT(value,this.nameField.getText()), "Update Clock Type");
            fillTable();
        }
    }//GEN-LAST:event_modifyButtonActionPerformed

    private void modifyButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifyButton1ActionPerformed
        int column = 0;
        int row = this.tableInfo.getSelectedRow();
        if (row!=-1){
            String value = this.tableInfo.getModel().getValueAt(row, column).toString();
            mainCont.createWindowMessage(controller.updateD(value,this.descriptionField.getText()), "Update Clock Type");
            fillTable();
        }
    }//GEN-LAST:event_modifyButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton createButton1;
    private javax.swing.JButton deleteB;
    private javax.swing.JTextArea descriptionField;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton modifyButton;
    private javax.swing.JButton modifyButton1;
    private javax.swing.JTextField nameField;
    private javax.swing.JTable tableInfo;
    // End of variables declaration//GEN-END:variables
}
