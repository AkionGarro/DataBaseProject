/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.View.adminPanels;

import com.Controllers.Controller_Condition;
import com.Controllers.Controller_Main;

/**
 *
 * @author garroakion
 */
public class Condition extends javax.swing.JPanel {

    private Controller_Main mainCont = Controller_Main.getContMain();
    private Controller_Condition controller;

    /**
     * Creates new form Condition
     */
    public Condition() {
        initComponents();
        controller = mainCont.getContCondition();
        fillTable();

    }



    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonAddC = new javax.swing.JButton();
        nameConditionField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        descriptionField = new javax.swing.JTextArea();
        buttonModifyC = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableInfo = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(730, 660));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonAddC.setBackground(new java.awt.Color(0, 0, 0));
        buttonAddC.setForeground(new java.awt.Color(255, 255, 255));
        buttonAddC.setText("Add");
        buttonAddC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddCActionPerformed(evt);
            }
        });
        add(buttonAddC, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, 70, -1));

        nameConditionField.setDocument(new limitText.JTextFieldLimit(20));
        add(nameConditionField, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 237, -1));

        descriptionField.setColumns(20);
        descriptionField.setRows(5);
        descriptionField.setDocument(new limitText.JTextFieldLimit(50));
        descriptionField.setLineWrap(true);
        jScrollPane1.setViewportView(descriptionField);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 237, 80));

        buttonModifyC.setBackground(new java.awt.Color(0, 0, 0));
        buttonModifyC.setForeground(new java.awt.Color(255, 255, 255));
        buttonModifyC.setText("Modify");
        buttonModifyC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonModifyCActionPerformed(evt);
            }
        });
        add(buttonModifyC, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, 70, 30));

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

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 730, 550));

        jLabel6.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Description:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, -1, 40));

        jLabel7.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Condition's Name:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void buttonAddCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddCActionPerformed
        try {
            if (!this.descriptionField.getText().isBlank() && !this.nameConditionField.getText().isBlank()) {
                mainCont.createWindowMessage(controller.create(this.nameConditionField.getText(),
                        this.descriptionField.getText()), "Create Condition");
                fillTable();

            } else {
                mainCont.createWindowMessage("Missing data", "Blank Fields");
            }
        } catch (Exception e) {

        }
    }//GEN-LAST:event_buttonAddCActionPerformed
    private void fillTable() {
        try {
            this.tableInfo.setModel(controller.listInfo());
            this.tableInfo.revalidate();
            this.tableInfo.repaint();
        } catch (Exception e) {

        }
    }
    private void buttonModifyCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonModifyCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonModifyCActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAddC;
    private javax.swing.JButton buttonModifyC;
    private javax.swing.JTextArea descriptionField;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField nameConditionField;
    private javax.swing.JTable tableInfo;
    // End of variables declaration//GEN-END:variables
}
