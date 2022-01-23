/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.View;

import com.Controllers.Controller_BuySale;
import com.Controllers.Controller_History_appuserxbuysale;
import com.Controllers.Controller_Main;
import javax.swing.table.TableModel;

/**
 *
 * @author garroakion
 */
public class cuenta extends javax.swing.JPanel {

    private Controller_Main mainCont = Controller_Main.getContMain();
    private Controller_BuySale controllerBuySale;

    /**
     * Creates new form cuenta
     */
    public cuenta() {
        initComponents();

        controllerBuySale = mainCont.getContBuySale();
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

        jScrollPane2 = new javax.swing.JScrollPane();
        tableInfo = new javax.swing.JTable(){
            private static final long serialVersionUID = 1L;

            public boolean isCellEditable(int row, int column) {
                return false;
            };};
            jPanel1 = new javax.swing.JPanel();
            jLabel5 = new javax.swing.JLabel();

            setBackground(new java.awt.Color(255, 255, 255));
            setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

            add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 730, 650));

            jPanel1.setBackground(new java.awt.Color(255, 255, 255));
            jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

            jLabel5.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
            jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel5.setText("My Clocks");
            jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 50));

            add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 220));
        }// </editor-fold>//GEN-END:initComponents

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
        pi.productInfoBrand6.setText("Bought");
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
        }
        

    }//GEN-LAST:event_tableInfoMouseClicked

    private void fillTable() {
        try {
            this.tableInfo.setModel(controllerBuySale.listBoughtClocks(mainCont.getUsername()));
            this.tableInfo.revalidate();
            this.tableInfo.repaint();
        } catch (Exception e) {
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tableInfo;
    // End of variables declaration//GEN-END:variables
}
