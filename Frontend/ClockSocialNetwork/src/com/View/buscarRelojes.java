/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.View;

import com.Controllers.Controller_Brand;
import com.Controllers.Controller_BuySale;
import com.Controllers.Controller_BuyStatus;
import com.Controllers.Controller_Condition;
import com.Controllers.Controller_History_appuserxbuysale;
import com.Controllers.Controller_Main;
import com.Controllers.Controller_ModelP;
import com.Controllers.Controller_PaymentMethod;
import com.Controllers.Controller_ShippingMethod;
import com.Controllers.Controller_TypeClock;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author garroakion
 */
public class buscarRelojes extends javax.swing.JPanel {

    private Controller_Main mainCont = Controller_Main.getContMain();
    private Controller_Brand controllerB;
    private Controller_ModelP controllerModelP;
    private Controller_TypeClock controllerType;
    private Controller_Condition controllerCondition;
    private Controller_BuySale controllerBuySale;
    private Controller_History_appuserxbuysale controllerBuyClock;
    private Controller_ShippingMethod controllerShippingMethod;
    private Controller_PaymentMethod controllerPaymentMethod;
    /**
     * Creates new form buscarRelojes
     */
    public buscarRelojes() {
        initComponents();
        controllerB = mainCont.getContBrand();
        controllerModelP = mainCont.getContModelP();
        controllerType = mainCont.getContTypeClock();
        controllerCondition = mainCont.getContCondition();
        controllerBuySale=mainCont.getContBuySale();
        controllerBuyClock=mainCont.getContBuyClock();
        controllerShippingMethod=mainCont.getContShippingMethod();
        controllerPaymentMethod=mainCont.getContPaymentMethod();
        fillBrand();
        fillModel();
        fillType();
        fillCondition();
        fillTable();
        fillShippingMethod();
        fillPaymentMethod();
    }

    
     private void fillBrand() {
        try {
            ArrayList<String> listC = controllerB.listInfoCombo();
            DefaultComboBoxModel listF = new DefaultComboBoxModel(listC.toArray());
            this.comboBrand.setModel(listF);

        } catch (Exception e) {
            System.out.println(e.toString());
        }

    }
    

    private void fillModel() {
        try {
            ArrayList<String> listC = controllerModelP.listInfoCombo(comboBrand.getSelectedItem().toString());
            DefaultComboBoxModel listF = new DefaultComboBoxModel(listC.toArray());
            this.comboModel.setModel(listF);

        } catch (Exception e) {
            System.out.println(e.toString());
        }

    }

    private void fillType() {
        try {
            ArrayList<String> listC = controllerType.listInfoCombo();
            DefaultComboBoxModel listF = new DefaultComboBoxModel(listC.toArray());
            this.comboType.setModel(listF);

        } catch (Exception e) {
            System.out.println(e.toString());
        }

    }

    private void fillCondition() {
        try {
            ArrayList<String> listC = controllerCondition.listInfoCombo();
            DefaultComboBoxModel listF = new DefaultComboBoxModel(listC.toArray());
            this.comboCond.setModel(listF);

        } catch (Exception e) {
            System.out.println(e.toString());
        }

    }
        private void fillTable(){
        try{
       this.tableInfo.setModel(controllerBuySale.listClocksForSale());
        this.tableInfo.revalidate();
        this.tableInfo.repaint();
        }catch(Exception e){
        }
    }
        private void fillShippingMethod(){
             
        try {
            ArrayList<String> listC = this.controllerShippingMethod.listInfoCombo();
            DefaultComboBoxModel listF = new DefaultComboBoxModel(listC.toArray());
            this.comboShipping.setModel(listF);

        } catch (Exception e) {
            System.out.println(e.toString());
        }

            }
       private void fillPaymentMethod(){
             
        try {
            ArrayList<String> listC = this.controllerPaymentMethod.listInfoCombo();
            DefaultComboBoxModel listF = new DefaultComboBoxModel(listC.toArray());
            this.comboPayment.setModel(listF);

        } catch (Exception e) {
            System.out.println(e.toString());
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableInfo = new javax.swing.JTable(){
            private static final long serialVersionUID = 1L;

            public boolean isCellEditable(int row, int column) {
                return false;
            };};
            jCheckBox2 = new javax.swing.JCheckBox();
            comboBrand = new javax.swing.JComboBox<>();
            jLabel4 = new javax.swing.JLabel();
            jLabel5 = new javax.swing.JLabel();
            comboCond = new javax.swing.JComboBox<>();
            jLabel6 = new javax.swing.JLabel();
            jLabel7 = new javax.swing.JLabel();
            comboType = new javax.swing.JComboBox<>();
            jLabel8 = new javax.swing.JLabel();
            comboModel = new javax.swing.JComboBox<>();
            jButton1 = new javax.swing.JButton();
            jRadioButton1 = new javax.swing.JRadioButton();
            jRadioButton2 = new javax.swing.JRadioButton();
            buyButton = new javax.swing.JButton();
            comboShipping = new javax.swing.JComboBox<>();
            comboPayment = new javax.swing.JComboBox<>();

            setBackground(new java.awt.Color(255, 255, 255));
            setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

            jLabel3.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
            jLabel3.setText("Filter: brand:");
            add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, 150, 50));

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

            add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 730, 390));

            jCheckBox2.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
            jCheckBox2.setText("Si");
            jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jCheckBox2ActionPerformed(evt);
                }
            });
            add(jCheckBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, -1, -1));

            comboBrand.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
            comboBrand.addItemListener(new java.awt.event.ItemListener() {
                public void itemStateChanged(java.awt.event.ItemEvent evt) {
                    comboBrandItemStateChanged(evt);
                }
            });
            add(comboBrand, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 50, 110, 50));

            jLabel4.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
            jLabel4.setText("Filter: condition");
            add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 120, 180, 50));

            jLabel5.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
            jLabel5.setText("Filter: type");
            add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 150, 50));

            comboCond.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
            add(comboCond, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 160, 110, 50));

            jLabel6.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
            jLabel6.setText("Filter: price");
            add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 50));

            jLabel7.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
            jLabel7.setText("Filter: vintage");
            add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 150, 50));

            comboType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
            add(comboType, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, 110, 50));

            jLabel8.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
            jLabel8.setText("Filter: model");
            add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 150, 50));

            comboModel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
            add(comboModel, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 110, 50));

            jButton1.setText("Search");
            add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 10, 90, 80));

            buttonGroup1.add(jRadioButton1);
            jRadioButton1.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
            jRadioButton1.setText("Above $600");
            add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, -1, -1));

            buttonGroup1.add(jRadioButton2);
            jRadioButton2.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
            jRadioButton2.setText("Under $600");
            add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, -1, -1));

            buyButton.setText("BUY");
            buyButton.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    buyButtonActionPerformed(evt);
                }
            });
            add(buyButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 90, 80));

            comboShipping.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
            add(comboShipping, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 240, 110, 50));

            comboPayment.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
            add(comboPayment, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 240, 110, 50));
        }// </editor-fold>//GEN-END:initComponents

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void comboBrandItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboBrandItemStateChanged
       fillModel();
    }//GEN-LAST:event_comboBrandItemStateChanged

    private void buyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buyButtonActionPerformed
                try {
            if (this.tableInfo.getSelectedRow()!=-1) {
                mainCont.createWindowMessage(controllerBuyClock.buyClock(mainCont.getUsername(),Integer.parseInt(tableInfo.getValueAt(tableInfo.getSelectedRow(),0).toString()),
                        this.comboPayment.getSelectedItem().toString(), this.comboShipping.getSelectedItem().toString()), "Clock Acquired");
                fillTable();

            } else {
                mainCont.createWindowMessage("Missing data", "Blank Fields");
            }
        } catch (Exception e) {

        }
    }//GEN-LAST:event_buyButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton buyButton;
    private javax.swing.JComboBox<String> comboBrand;
    private javax.swing.JComboBox<String> comboCond;
    private javax.swing.JComboBox<String> comboModel;
    private javax.swing.JComboBox<String> comboPayment;
    private javax.swing.JComboBox<String> comboShipping;
    private javax.swing.JComboBox<String> comboType;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tableInfo;
    // End of variables declaration//GEN-END:variables
}
