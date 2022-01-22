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
import com.Controllers.Controller_Shcart_appuserxclock;
import com.Controllers.Controller_ShippingMethod;
import com.Controllers.Controller_TypeClock;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.table.TableModel;

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
    private Controller_Shcart_appuserxclock controllerShCart;
    private CheckFields checkField;

    /**
     * Creates new form buscarRelojes
     */
    public buscarRelojes() {
        initComponents();
        controllerB = mainCont.getContBrand();
        controllerModelP = mainCont.getContModelP();
        controllerType = mainCont.getContTypeClock();
        controllerCondition = mainCont.getContCondition();
        controllerBuySale = mainCont.getContBuySale();
        controllerBuyClock = mainCont.getContBuyClock();
        controllerShippingMethod = mainCont.getContShippingMethod();
        controllerPaymentMethod = mainCont.getContPaymentMethod();
        controllerShCart = mainCont.getContShCart();
        checkField= new CheckFields();
        fillBrand();
        fillModel();
        fillType();
        fillCondition();
        fillTable();

    }

    private void fillBrand() {
        try {
            ArrayList<String> listC = controllerB.listInfoCombo();
            DefaultComboBoxModel listF = new DefaultComboBoxModel(listC.toArray());
            String def="";
            listF.addElement(def);
            fillModel();
            this.comboBrand.setModel(listF);
            this.comboBrand.setSelectedIndex(this.comboBrand.getItemCount()-1);
            
            
        } catch (Exception e) {
            System.out.println(e.toString());
        }

    }

    private void fillModel() {
        try {
            ArrayList<String> listC = controllerModelP.listInfoCombo(comboBrand.getSelectedItem().toString());
            DefaultComboBoxModel listF = new DefaultComboBoxModel(listC.toArray());
            String def="";
            listF.addElement(def);
            this.comboModel.setModel(listF);
            this.comboModel.setSelectedIndex(this.comboModel.getItemCount()-1);

        } catch (Exception e) {
            System.out.println(e.toString());
        }

    }

    private void fillType() {
        try {
            ArrayList<String> listC = controllerType.listInfoCombo();
            DefaultComboBoxModel listF = new DefaultComboBoxModel(listC.toArray());
            String def="";
            listF.addElement(def);
            this.comboType.setModel(listF);
            this.comboType.setSelectedIndex(this.comboType.getItemCount()-1);

        } catch (Exception e) {
            System.out.println(e.toString());
        }

    }

    private void fillCondition() {
        try {
            ArrayList<String> listC = controllerCondition.listInfoCombo();
            DefaultComboBoxModel listF = new DefaultComboBoxModel(listC.toArray());
            String def="";
            listF.addElement(def);
            this.comboCond.setModel(listF);
            this.comboCond.setSelectedIndex(this.comboCond.getItemCount()-1);

        } catch (Exception e) {
            System.out.println(e.toString());
        }

    }

    private void fillTable() {
        try {
            this.tableInfo.setModel(controllerBuySale.listClocksForSale());
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableInfo = new javax.swing.JTable(){
            private static final long serialVersionUID = 1L;

            public boolean isCellEditable(int row, int column) {
                return false;
            };};
            comboBrand = new javax.swing.JComboBox<>();
            jLabel4 = new javax.swing.JLabel();
            jLabel5 = new javax.swing.JLabel();
            comboCond = new javax.swing.JComboBox<>();
            jLabel6 = new javax.swing.JLabel();
            comboType = new javax.swing.JComboBox<>();
            jLabel8 = new javax.swing.JLabel();
            comboModel = new javax.swing.JComboBox<>();
            jButton1 = new javax.swing.JButton();
            shCartButton = new javax.swing.JButton();
            priceField = new javax.swing.JTextField();

            setBackground(new java.awt.Color(255, 255, 255));
            setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

            jLabel3.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
            jLabel3.setText("Brand:");
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
            tableInfo.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    tableInfoMouseClicked(evt);
                }
            });
            jScrollPane2.setViewportView(tableInfo);

            add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 730, 390));

            comboBrand.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
            comboBrand.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
            comboBrand.addItemListener(new java.awt.event.ItemListener() {
                public void itemStateChanged(java.awt.event.ItemEvent evt) {
                    comboBrandItemStateChanged(evt);
                }
            });
            add(comboBrand, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 50, 110, 50));

            jLabel4.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
            jLabel4.setText("Condition");
            add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 120, 180, 50));

            jLabel5.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
            jLabel5.setText("Type");
            add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 150, 50));

            comboCond.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
            comboCond.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
            add(comboCond, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 160, 110, 50));

            jLabel6.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
            jLabel6.setText("Price Under");
            add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 150, 50));

            comboType.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
            comboType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
            comboType.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    comboTypeActionPerformed(evt);
                }
            });
            add(comboType, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, 110, 50));

            jLabel8.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
            jLabel8.setText("Model");
            add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 150, 50));

            comboModel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
            comboModel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));
            add(comboModel, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 110, 50));

            jButton1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
            jButton1.setText("Search");
            jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jButton1MouseClicked(evt);
                }
            });
            jButton1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton1ActionPerformed(evt);
                }
            });
            add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 10, 90, 80));

            shCartButton.setText("Add to Shopping Cart");
            shCartButton.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    shCartButtonActionPerformed(evt);
                }
            });
            add(shCartButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 160, 40));

            priceField.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
            add(priceField, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 110, 40));
        }// </editor-fold>//GEN-END:initComponents

    private void comboBrandItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboBrandItemStateChanged
        fillModel();
    }//GEN-LAST:event_comboBrandItemStateChanged

    private void shCartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shCartButtonActionPerformed
        try {
            if (this.tableInfo.getSelectedRow() != -1) {
                mainCont.createWindowMessage(this.controllerShCart.create(mainCont.getUsername(), tableInfo.getValueAt(tableInfo.getSelectedRow(), 0).toString()), "Clock Added to Shopping Cart");

            } else {
                mainCont.createWindowMessage("Missing data", "Blank Fields");
            }
        } catch (Exception e) {

        }
    }//GEN-LAST:event_shCartButtonActionPerformed
    private void fillTableFilters() {
        try {
            int priceTop=999999;
            if (checkField.onlyCheckNumbers(this.priceField.getText())){
                 priceTop=Integer.parseInt(priceField.getText());
            }
            this.tableInfo.setModel(controllerBuySale.
                    listClocksWithFilters(comboCond.getSelectedItem().toString(),
                            comboType.getSelectedItem().toString(),
                            comboBrand.getSelectedItem().toString(),
                            comboModel.getSelectedItem().toString(),priceTop));
            this.tableInfo.revalidate();
            this.tableInfo.repaint();
        } catch (Exception e) {
        }
    }
    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        fillTableFilters();
    }//GEN-LAST:event_jButton1MouseClicked

    private void tableInfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableInfoMouseClicked
       if (evt.getClickCount() == 2 && tableInfo.getSelectedRow() != -1) { 
           ProductInformation pi = new ProductInformation();
      
        pi.setVisible(true);
        pi.pack();

        int selectedRow = tableInfo.getSelectedRow();
        TableModel tm = tableInfo.getModel();

        String idbuysale = tm.getValueAt(selectedRow, 0).toString();
        String datepost = tm.getValueAt(selectedRow, 1).toString();
        String username = tm.getValueAt(selectedRow, 2).toString();
        String nametype = tm.getValueAt(selectedRow, 3).toString();
        String namebrand = tm.getValueAt(selectedRow, 4).toString();
        String namemodel = tm.getValueAt(selectedRow, 5).toString();
        String namecondition = tm.getValueAt(selectedRow, 6).toString();
        String manufacturedate = tm.getValueAt(selectedRow, 7).toString();
        String descriptionclock = tm.getValueAt(selectedRow, 8).toString();
        String price = tm.getValueAt(selectedRow, 9).toString();

        // ImageIcon img = (ImageIcon) tm.getValueAt(selectedRow, 5);
        pi.productInfoId.setText(idbuysale);
        pi.productInfoPosted.setText(datepost);
        pi.productInfoBy.setText(username);
        pi.productInfoType.setText(nametype);
        pi.productInfoBrandClock.setText(namebrand);
        pi.productInfoModel.setText(namemodel);
        pi.productInfoCondition.setText(namecondition);
        pi.productInfoManufactureDate.setText(manufacturedate);
        pi.productInfoDescription.setText(descriptionclock);
        pi.productInfoPrice.setText(price);
        // pi.productPhoto.setIcon(img);
         }
    }//GEN-LAST:event_tableInfoMouseClicked

    private void comboTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboTypeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> comboBrand;
    private javax.swing.JComboBox<String> comboCond;
    private javax.swing.JComboBox<String> comboModel;
    private javax.swing.JComboBox<String> comboType;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField priceField;
    private javax.swing.JButton shCartButton;
    private javax.swing.JTable tableInfo;
    // End of variables declaration//GEN-END:variables
}
