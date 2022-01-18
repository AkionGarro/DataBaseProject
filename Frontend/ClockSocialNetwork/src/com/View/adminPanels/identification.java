/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.View.adminPanels;

import com.Controllers.Controller_Identification;
import com.Controllers.Controller_Main;

/**
 *
 * @author garroakion
 */
public class identification extends javax.swing.JPanel {

    private Controller_Main mainCont = Controller_Main.getContMain();
    private Controller_Identification controller;

    /**
     * Creates new form identification
     */
    public identification() {

        initComponents();
        controller = mainCont.getContIdentification();
        fillTable();
    }

    private void fillTable() {
        try {
            this.tableInfo.setModel(controller.listInfoTable(""));
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

        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableInfo = new javax.swing.JTable(){
            private static final long serialVersionUID = 1L;

            public boolean isCellEditable(int row, int column) {
                return false;
            };};
            createButton = new javax.swing.JButton();
            modifyButton = new javax.swing.JButton();
            nameField = new javax.swing.JTextField();
            modifyButton1 = new javax.swing.JButton();

            setBackground(new java.awt.Color(255, 255, 255));
            setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

            jLabel3.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
            jLabel3.setText("Identification Name:");
            add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 50));

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

            add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 730, 420));

            createButton.setBackground(new java.awt.Color(0, 0, 0));
            createButton.setForeground(new java.awt.Color(255, 255, 255));
            createButton.setText("Create");
            createButton.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    createButtonActionPerformed(evt);
                }
            });
            add(createButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 10, 70, 30));

            modifyButton.setBackground(new java.awt.Color(0, 0, 0));
            modifyButton.setForeground(new java.awt.Color(255, 255, 255));
            modifyButton.setText("Change Name");
            modifyButton.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    modifyButtonActionPerformed(evt);
                }
            });
            add(modifyButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 120, 130, 30));

            nameField.setDocument(new limitText.JTextFieldLimit(20));
            nameField.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    nameFieldActionPerformed(evt);
                }
            });
            add(nameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 230, 30));

            modifyButton1.setBackground(new java.awt.Color(0, 0, 0));
            modifyButton1.setForeground(new java.awt.Color(255, 255, 255));
            modifyButton1.setText("Delete");
            modifyButton1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    modifyButton1ActionPerformed(evt);
                }
            });
            add(modifyButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 70, 30));
        }// </editor-fold>//GEN-END:initComponents

    private void createButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createButtonActionPerformed
        try {
            if (!this.nameField.getText().isBlank()) {
                mainCont.createWindowMessage(controller.create(this.nameField.getText()), "Create Identification");
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

    private void modifyButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifyButton1ActionPerformed
              try{
            if (tableInfo.getSelectedRow()!=-1){
                mainCont.createWindowMessage(this.controller.deleteT(this.tableInfo.getValueAt(tableInfo.getSelectedRow(), 0).toString()), "Deleting Identification");
                fillTable();

            }
            else {mainCont.createWindowMessage("Missing data", "Blank Fields");
            }
        }
        catch(Exception e){
            System.out.println(e.toString());
        } 
    }//GEN-LAST:event_modifyButton1ActionPerformed

    private void modifyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifyButtonActionPerformed
                    try{
            if (tableInfo.getSelectedRow()!=-1){
                mainCont.createWindowMessage(this.controller.updateT(this.tableInfo.getValueAt(tableInfo.getSelectedRow(), 0).toString(),this.nameField.getText()), "Updating Identification");
                fillTable();

            }
            else {mainCont.createWindowMessage("Missing data", "Blank Fields");
            }
        }
        catch(Exception e){
            System.out.println(e.toString());
        } 
    }//GEN-LAST:event_modifyButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton createButton;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton modifyButton;
    private javax.swing.JButton modifyButton1;
    private javax.swing.JTextField nameField;
    private javax.swing.JTable tableInfo;
    // End of variables declaration//GEN-END:variables
}
