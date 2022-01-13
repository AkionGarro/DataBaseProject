/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.View;

import com.View.adminPanels.ClockType;
import com.View.adminPanels.Condition;
import com.View.adminPanels.Address;
import com.View.adminPanels.Gender;
import com.View.adminPanels.Model;
import com.View.adminPanels.PaymentMethod;
import com.View.adminPanels.ShippingMethod;
import com.View.adminPanels.Status;
import com.View.adminPanels.UserType;
import com.View.adminPanels.identification;

import java.awt.BorderLayout;
import java.awt.Color;

/**
 *
 * @author garroakion
 */
public class homeAdmin extends javax.swing.JPanel {

    /**
     * Creates new form home
     */
    public homeAdmin() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menu = new javax.swing.JPanel();
        menuLabel = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        userCategoryPanel = new javax.swing.JPanel();
        option1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        genderPanel = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        identificationPanel = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        userTypePanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        clockCategoryPanel = new javax.swing.JPanel();
        option7 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        clockTypePanel = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        modelPanel = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        conditionPanel = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        buysellCategory = new javax.swing.JPanel();
        option2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        statusPanel = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        paymentPanel = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        shippingPanel = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        addressCategory = new javax.swing.JPanel();
        option3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        districtPanel = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        homeContent = new javax.swing.JPanel();
        menuBar = new javax.swing.JPanel();
        exitPanel2 = new javax.swing.JPanel();
        exitButton2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menu.setBackground(new java.awt.Color(0, 0, 102));
        menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menuLabel.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        menuLabel.setForeground(new java.awt.Color(255, 255, 255));
        menuLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        menuLabel.setText("New Items");
        menu.add(menuLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 40));

        jSeparator3.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));
        menu.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 270, 10));

        userCategoryPanel.setBackground(new java.awt.Color(0, 0, 102));
        userCategoryPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        option1.setBackground(new java.awt.Color(0, 0, 102));
        option1.setBorder(null);
        option1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                option1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                option1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                option1MouseExited(evt);
            }
        });
        option1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/user_32px.png"))); // NOI18N
        option1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel6.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("User Category");
        option1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 160, -1));

        userCategoryPanel.add(option1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 40));

        genderPanel.setBackground(new java.awt.Color(0, 0, 102));
        genderPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                genderPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                genderPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                genderPanelMouseExited(evt);
            }
        });
        genderPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Gender");
        genderPanel.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 140, -1));

        userCategoryPanel.add(genderPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 270, 20));

        identificationPanel.setBackground(new java.awt.Color(0, 0, 102));
        identificationPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                identificationPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                identificationPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                identificationPanelMouseExited(evt);
            }
        });
        identificationPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Identification");
        identificationPanel.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 160, -1));

        userCategoryPanel.add(identificationPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 270, 20));

        userTypePanel.setBackground(new java.awt.Color(0, 0, 102));
        userTypePanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userTypePanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                userTypePanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                userTypePanelMouseExited(evt);
            }
        });
        userTypePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("User Type");
        userTypePanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 160, -1));

        userCategoryPanel.add(userTypePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 270, 20));

        menu.add(userCategoryPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 270, 100));

        clockCategoryPanel.setBackground(new java.awt.Color(0, 0, 102));
        clockCategoryPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        option7.setBackground(new java.awt.Color(0, 0, 102));
        option7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                option7MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                option7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                option7MouseExited(evt);
            }
        });
        option7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/clock_32px.png"))); // NOI18N
        option7.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Clock Category");
        option7.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 190, 30));

        clockCategoryPanel.add(option7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 30));

        clockTypePanel.setBackground(new java.awt.Color(0, 0, 102));
        clockTypePanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clockTypePanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                clockTypePanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                clockTypePanelMouseExited(evt);
            }
        });
        clockTypePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Clock type");
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        clockTypePanel.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 110, -1));

        clockCategoryPanel.add(clockTypePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 270, 20));

        modelPanel.setBackground(new java.awt.Color(0, 0, 102));
        modelPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                modelPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                modelPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                modelPanelMouseExited(evt);
            }
        });
        modelPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Brand/Model");
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });
        modelPanel.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 110, -1));

        clockCategoryPanel.add(modelPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 270, 20));

        conditionPanel.setBackground(new java.awt.Color(0, 0, 102));
        conditionPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                conditionPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                conditionPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                conditionPanelMouseExited(evt);
            }
        });
        conditionPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Condition");
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });
        conditionPanel.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 90, -1));

        clockCategoryPanel.add(conditionPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 270, 20));

        menu.add(clockCategoryPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 270, 130));

        buysellCategory.setBackground(new java.awt.Color(0, 0, 102));
        buysellCategory.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        option2.setBackground(new java.awt.Color(0, 0, 102));
        option2.setBorder(null);
        option2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                option2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                option2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                option2MouseExited(evt);
            }
        });
        option2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Buy/Sale Category");
        option2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 180, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/buying_32px.png"))); // NOI18N
        option2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 40));

        buysellCategory.add(option2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, -1));

        statusPanel.setBackground(new java.awt.Color(0, 0, 102));
        statusPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                statusPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                statusPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                statusPanelMouseExited(evt);
            }
        });
        statusPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel20.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Status");
        statusPanel.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 160, -1));

        buysellCategory.add(statusPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 270, 20));

        paymentPanel.setBackground(new java.awt.Color(0, 0, 102));
        paymentPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                paymentPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                paymentPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                paymentPanelMouseExited(evt);
            }
        });
        paymentPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Payment Method");
        paymentPanel.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 160, -1));

        buysellCategory.add(paymentPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 270, 20));

        shippingPanel.setBackground(new java.awt.Color(0, 0, 102));
        shippingPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                shippingPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                shippingPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                shippingPanelMouseExited(evt);
            }
        });
        shippingPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Shipping Method");
        shippingPanel.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 160, -1));

        buysellCategory.add(shippingPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 270, 20));

        menu.add(buysellCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 270, 100));

        addressCategory.setBackground(new java.awt.Color(0, 0, 102));
        addressCategory.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        option3.setBackground(new java.awt.Color(0, 0, 102));
        option3.setBorder(null);
        option3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                option3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                option3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                option3MouseExited(evt);
            }
        });
        option3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Address Category");
        option3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 190, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/location_32px.png"))); // NOI18N
        option3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        addressCategory.add(option3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 40));

        districtPanel.setBackground(new java.awt.Color(0, 0, 102));
        districtPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                districtPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                districtPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                districtPanelMouseExited(evt);
            }
        });
        districtPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Address");
        districtPanel.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 120, -1));

        addressCategory.add(districtPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 270, 20));

        menu.add(addressCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 270, 130));

        add(menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 570));

        homeContent.setBackground(new java.awt.Color(255, 255, 255));
        homeContent.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout homeContentLayout = new javax.swing.GroupLayout(homeContent);
        homeContent.setLayout(homeContentLayout);
        homeContentLayout.setHorizontalGroup(
            homeContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 630, Short.MAX_VALUE)
        );
        homeContentLayout.setVerticalGroup(
            homeContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 530, Short.MAX_VALUE)
        );

        add(homeContent, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, 630, 530));

        menuBar.setBackground(new java.awt.Color(255, 255, 255));
        menuBar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        exitPanel2.setBackground(new java.awt.Color(255, 255, 255));

        exitButton2.setBackground(new java.awt.Color(0, 0, 0));
        exitButton2.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        exitButton2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exitButton2.setText("X");
        exitButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitButton2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitButton2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitButton2MouseExited(evt);
            }
        });

        javax.swing.GroupLayout exitPanel2Layout = new javax.swing.GroupLayout(exitPanel2);
        exitPanel2.setLayout(exitPanel2Layout);
        exitPanel2Layout.setHorizontalGroup(
            exitPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, exitPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(exitButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        exitPanel2Layout.setVerticalGroup(
            exitPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(exitPanel2Layout.createSequentialGroup()
                .addComponent(exitButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        menuBar.add(exitPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 0, 30, 40));

        add(menuBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 630, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void exitButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitButton2MouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitButton2MouseClicked

    private void exitButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitButton2MouseEntered
        exitPanel2.setBackground(Color.red);
    }//GEN-LAST:event_exitButton2MouseEntered

    private void exitButton2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitButton2MouseExited
        exitPanel2.setBackground(Color.white);
    }//GEN-LAST:event_exitButton2MouseExited

    private void option7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_option7MouseEntered

    }//GEN-LAST:event_option7MouseEntered

    private void option7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_option7MouseExited

    }//GEN-LAST:event_option7MouseExited

    private void option2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_option2MouseEntered

    }//GEN-LAST:event_option2MouseEntered

    private void option2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_option2MouseExited

    }//GEN-LAST:event_option2MouseExited

    private void option3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_option3MouseEntered

    }//GEN-LAST:event_option3MouseEntered

    private void option3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_option3MouseExited

    }//GEN-LAST:event_option3MouseExited

    private void option7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_option7MouseClicked

    }//GEN-LAST:event_option7MouseClicked

    private void option2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_option2MouseClicked

    }//GEN-LAST:event_option2MouseClicked

    private void option3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_option3MouseClicked

    }//GEN-LAST:event_option3MouseClicked

    private void option1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_option1MouseExited

    }//GEN-LAST:event_option1MouseExited

    private void option1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_option1MouseEntered

    }//GEN-LAST:event_option1MouseEntered

    private void option1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_option1MouseClicked

    }//GEN-LAST:event_option1MouseClicked

    private void genderPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_genderPanelMouseClicked
        Gender p1 = new Gender();
        p1.setSize(630, 530);
        p1.setLocation(0, 0);
        homeContent.removeAll();
        homeContent.add(p1, BorderLayout.CENTER);
        homeContent.revalidate();
        homeContent.repaint();
    }//GEN-LAST:event_genderPanelMouseClicked

    private void identificationPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_identificationPanelMouseClicked
        identification p1 = new identification();
        p1.setSize(630, 530);
        p1.setLocation(0, 0);
        homeContent.removeAll();
        homeContent.add(p1, BorderLayout.CENTER);
        homeContent.revalidate();
        homeContent.repaint();
    }//GEN-LAST:event_identificationPanelMouseClicked

    private void userTypePanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userTypePanelMouseClicked
        UserType p1 = new UserType();
        p1.setSize(630, 530);
        p1.setLocation(0, 0);
        homeContent.removeAll();
        homeContent.add(p1, BorderLayout.CENTER);
        homeContent.revalidate();
        homeContent.repaint();
    }//GEN-LAST:event_userTypePanelMouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel16MouseClicked

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel15MouseClicked

    private void clockTypePanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clockTypePanelMouseClicked
        ClockType p1 = new ClockType();
        p1.setSize(630, 530);
        p1.setLocation(0, 0);
        homeContent.removeAll();
        homeContent.add(p1, BorderLayout.CENTER);
        homeContent.revalidate();
        homeContent.repaint();
    }//GEN-LAST:event_clockTypePanelMouseClicked

    private void modelPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modelPanelMouseClicked
        Model p1 = new Model();
        p1.setSize(630, 530);
        p1.setLocation(0, 0);
        homeContent.removeAll();
        homeContent.add(p1, BorderLayout.CENTER);
        homeContent.revalidate();
        homeContent.repaint();
    }//GEN-LAST:event_modelPanelMouseClicked

    private void conditionPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_conditionPanelMouseClicked
        Condition p1 = new Condition();
        p1.setSize(630, 530);
        p1.setLocation(0, 0);
        homeContent.removeAll();
        homeContent.add(p1, BorderLayout.CENTER);
        homeContent.revalidate();
        homeContent.repaint();
    }//GEN-LAST:event_conditionPanelMouseClicked

    private void statusPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_statusPanelMouseClicked
        Status p1 = new Status();
        p1.setSize(630, 530);
        p1.setLocation(0, 0);
        homeContent.removeAll();
        homeContent.add(p1, BorderLayout.CENTER);
        homeContent.revalidate();
        homeContent.repaint();
    }//GEN-LAST:event_statusPanelMouseClicked

    private void paymentPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paymentPanelMouseClicked
        PaymentMethod p1 = new PaymentMethod();
        p1.setSize(630, 530);
        p1.setLocation(0, 0);
        homeContent.removeAll();
        homeContent.add(p1, BorderLayout.CENTER);
        homeContent.revalidate();
        homeContent.repaint();
    }//GEN-LAST:event_paymentPanelMouseClicked

    private void shippingPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_shippingPanelMouseClicked
        ShippingMethod p1 = new ShippingMethod();
        p1.setSize(630, 530);
        p1.setLocation(0, 0);
        homeContent.removeAll();
        homeContent.add(p1, BorderLayout.CENTER);
        homeContent.revalidate();
        homeContent.repaint();
    }//GEN-LAST:event_shippingPanelMouseClicked

    private void districtPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_districtPanelMouseClicked
        Address p1 = new Address();
        p1.setSize(630, 530);
        p1.setLocation(0, 0);
        homeContent.removeAll();
        homeContent.add(p1, BorderLayout.CENTER);
        homeContent.revalidate();
        homeContent.repaint();
    }//GEN-LAST:event_districtPanelMouseClicked

    private void genderPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_genderPanelMouseEntered
        genderPanel.setBackground(new Color(0, 0, 180));
    }//GEN-LAST:event_genderPanelMouseEntered

    private void genderPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_genderPanelMouseExited
        genderPanel.setBackground(new Color(0, 0, 102));
    }//GEN-LAST:event_genderPanelMouseExited

    private void identificationPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_identificationPanelMouseEntered
        identificationPanel.setBackground(new Color(0, 0, 180));
    }//GEN-LAST:event_identificationPanelMouseEntered

    private void identificationPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_identificationPanelMouseExited
        identificationPanel.setBackground(new Color(0, 0, 102));
    }//GEN-LAST:event_identificationPanelMouseExited

    private void userTypePanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userTypePanelMouseEntered
        userTypePanel.setBackground(new Color(0, 0, 180));
    }//GEN-LAST:event_userTypePanelMouseEntered

    private void userTypePanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userTypePanelMouseExited

        userTypePanel.setBackground(new Color(0, 0, 102));
    }//GEN-LAST:event_userTypePanelMouseExited

    private void statusPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_statusPanelMouseEntered
        statusPanel.setBackground(new Color(0, 0, 180));
    }//GEN-LAST:event_statusPanelMouseEntered

    private void statusPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_statusPanelMouseExited
        statusPanel.setBackground(new Color(0, 0, 102));
    }//GEN-LAST:event_statusPanelMouseExited

    private void paymentPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paymentPanelMouseEntered
        paymentPanel.setBackground(new Color(0, 0, 180));
    }//GEN-LAST:event_paymentPanelMouseEntered

    private void paymentPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paymentPanelMouseExited
        paymentPanel.setBackground(new Color(0, 0, 102));
    }//GEN-LAST:event_paymentPanelMouseExited

    private void shippingPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_shippingPanelMouseEntered
        shippingPanel.setBackground(new Color(0, 0, 180));
    }//GEN-LAST:event_shippingPanelMouseEntered

    private void shippingPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_shippingPanelMouseExited
        shippingPanel.setBackground(new Color(0, 0, 102));
    }//GEN-LAST:event_shippingPanelMouseExited

    private void districtPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_districtPanelMouseEntered
        districtPanel.setBackground(new Color(0, 0, 180));
    }//GEN-LAST:event_districtPanelMouseEntered

    private void districtPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_districtPanelMouseExited
        districtPanel.setBackground(new Color(0, 0, 102));
    }//GEN-LAST:event_districtPanelMouseExited

    private void clockTypePanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clockTypePanelMouseEntered
        clockTypePanel.setBackground(new Color(0, 0, 180));
    }//GEN-LAST:event_clockTypePanelMouseEntered

    private void clockTypePanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clockTypePanelMouseExited
        clockTypePanel.setBackground(new Color(0, 0, 102));
    }//GEN-LAST:event_clockTypePanelMouseExited

    private void modelPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modelPanelMouseEntered
        modelPanel.setBackground(new Color(0, 0, 180));
    }//GEN-LAST:event_modelPanelMouseEntered

    private void modelPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modelPanelMouseExited
        modelPanel.setBackground(new Color(0, 0, 102));
    }//GEN-LAST:event_modelPanelMouseExited

    private void conditionPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_conditionPanelMouseEntered
        conditionPanel.setBackground(new Color(0, 0, 180));
    }//GEN-LAST:event_conditionPanelMouseEntered

    private void conditionPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_conditionPanelMouseExited
        conditionPanel.setBackground(new Color(0, 0, 102));
    }//GEN-LAST:event_conditionPanelMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel addressCategory;
    private javax.swing.JPanel buysellCategory;
    private javax.swing.JPanel clockCategoryPanel;
    private javax.swing.JPanel clockTypePanel;
    private javax.swing.JPanel conditionPanel;
    private javax.swing.JPanel districtPanel;
    private javax.swing.JLabel exitButton2;
    private javax.swing.JPanel exitPanel2;
    private javax.swing.JPanel genderPanel;
    private javax.swing.JPanel homeContent;
    private javax.swing.JPanel identificationPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JPanel menu;
    private javax.swing.JPanel menuBar;
    private javax.swing.JLabel menuLabel;
    private javax.swing.JPanel modelPanel;
    private javax.swing.JPanel option1;
    private javax.swing.JPanel option2;
    private javax.swing.JPanel option3;
    private javax.swing.JPanel option7;
    private javax.swing.JPanel paymentPanel;
    private javax.swing.JPanel shippingPanel;
    private javax.swing.JPanel statusPanel;
    private javax.swing.JPanel userCategoryPanel;
    private javax.swing.JPanel userTypePanel;
    // End of variables declaration//GEN-END:variables
}
