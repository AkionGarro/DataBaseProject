/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.View;

import java.awt.BorderLayout;
import java.awt.Color;

/**
 *
 * @author garroakion
 */
public class home extends javax.swing.JPanel {

    /**
     * Creates new form home
     */
    public home() {
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
        option1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        option2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        option3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        option4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        option5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        option8 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        option6 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        option7 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        homeContent = new javax.swing.JPanel();
        menuBar = new javax.swing.JPanel();
        exitPanel2 = new javax.swing.JPanel();
        exitButton2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1000, 700));
        setPreferredSize(new java.awt.Dimension(1000, 700));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menu.setBackground(new java.awt.Color(62, 114, 179));
        menu.setMinimumSize(new java.awt.Dimension(270, 700));
        menu.setPreferredSize(new java.awt.Dimension(270, 700));
        menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menuLabel.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        menuLabel.setForeground(new java.awt.Color(255, 255, 255));
        menuLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        menuLabel.setText("Menu");
        menu.add(menuLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 30));

        option1.setBackground(new java.awt.Color(62, 114, 179));
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

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel2.setText("Principal");
        option1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 160, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/home_32px.png"))); // NOI18N
        option1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        menu.add(option1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 270, 40));

        option2.setBackground(new java.awt.Color(62, 114, 179));
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
        jLabel3.setText("Insertar Relojes");
        option2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 180, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/add_32px.png"))); // NOI18N
        option2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        menu.add(option2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 270, 40));

        option3.setBackground(new java.awt.Color(62, 114, 179));
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
        jLabel4.setText("Favoritos");
        option3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 190, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/star_32px.png"))); // NOI18N
        option3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        menu.add(option3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 270, 40));

        option4.setBackground(new java.awt.Color(62, 114, 179));
        option4.setBorder(null);
        option4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                option4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                option4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                option4MouseExited(evt);
            }
        });
        option4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel5.setText("Carrito de Compra");
        option4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 190, 30));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/shopping_cart_32px.png"))); // NOI18N
        option4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        menu.add(option4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 270, 40));

        option5.setBackground(new java.awt.Color(62, 114, 179));
        option5.setBorder(null);
        option5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                option5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                option5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                option5MouseExited(evt);
            }
        });
        option5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel6.setText("Chats");
        option5.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 190, 30));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/mail_32px.png"))); // NOI18N
        option5.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        menu.add(option5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 270, 40));

        option8.setBackground(new java.awt.Color(62, 114, 179));
        option8.setBorder(null);
        option8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                option8MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                option8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                option8MouseExited(evt);
            }
        });
        option8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/male_user_32px.png"))); // NOI18N
        option8.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel16.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel16.setText("Perfil");
        option8.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 2, 190, 30));

        menu.add(option8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 270, 40));

        option6.setBackground(new java.awt.Color(62, 114, 179));
        option6.setBorder(null);
        option6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                option6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                option6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                option6MouseExited(evt);
            }
        });
        option6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/combo_chart_32px.png"))); // NOI18N
        option6.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel13.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel13.setText("Estadísticas");
        option6.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 2, 190, 30));

        menu.add(option6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 270, 40));

        option7.setBackground(new java.awt.Color(62, 114, 179));
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

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/search_32px.png"))); // NOI18N
        option7.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel1.setText("Buscar Relojes");
        option7.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 190, 30));

        menu.add(option7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 270, 40));

        jSeparator3.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));
        menu.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 38, 270, -1));

        add(menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        homeContent.setBackground(new java.awt.Color(255, 255, 255));
        homeContent.setForeground(new java.awt.Color(255, 255, 255));
        homeContent.setMinimumSize(new java.awt.Dimension(730, 700));
        homeContent.setPreferredSize(new java.awt.Dimension(730, 700));

        javax.swing.GroupLayout homeContentLayout = new javax.swing.GroupLayout(homeContent);
        homeContent.setLayout(homeContentLayout);
        homeContentLayout.setHorizontalGroup(
            homeContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 730, Short.MAX_VALUE)
        );
        homeContentLayout.setVerticalGroup(
            homeContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );

        add(homeContent, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, -1, -1));

        menuBar.setBackground(new java.awt.Color(62, 114, 179));
        menuBar.setMinimumSize(new java.awt.Dimension(730, 40));
        menuBar.setPreferredSize(new java.awt.Dimension(730, 40));
        menuBar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        exitPanel2.setBackground(new java.awt.Color(62, 114, 179));

        exitButton2.setBackground(new java.awt.Color(62, 114, 179));
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

        menuBar.add(exitPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 0, 30, 40));

        add(menuBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, -1, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void exitButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitButton2MouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitButton2MouseClicked

    private void exitButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitButton2MouseEntered
        exitPanel2.setBackground(Color.red);
    }//GEN-LAST:event_exitButton2MouseEntered

    private void exitButton2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitButton2MouseExited
        exitPanel2.setBackground(new Color(62,114,179));
    }//GEN-LAST:event_exitButton2MouseExited

    private void option1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_option1MouseEntered
        option1.setBackground(new Color(0,0,200));
    }//GEN-LAST:event_option1MouseEntered

    private void option1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_option1MouseExited
        option1.setBackground(new Color(62,114,179));
    }//GEN-LAST:event_option1MouseExited

    private void option7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_option7MouseEntered
        option7.setBackground(new Color(0,0,200));
    }//GEN-LAST:event_option7MouseEntered

    private void option7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_option7MouseExited
        option7.setBackground(new Color(62,114,179));
    }//GEN-LAST:event_option7MouseExited

    private void option2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_option2MouseEntered
      option2.setBackground(new Color(0,0,200));
    }//GEN-LAST:event_option2MouseEntered

    private void option2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_option2MouseExited
        option2.setBackground(new Color(62,114,179));
    }//GEN-LAST:event_option2MouseExited

    private void option3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_option3MouseEntered
       option3.setBackground(new Color(0,0,200));
    }//GEN-LAST:event_option3MouseEntered

    private void option3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_option3MouseExited
       option3.setBackground(new Color(62,114,179));
    }//GEN-LAST:event_option3MouseExited

    private void option4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_option4MouseEntered
       option4.setBackground(new Color(0,0,200));
    }//GEN-LAST:event_option4MouseEntered

    private void option4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_option4MouseExited
      option4.setBackground(new Color(62,114,179));
    }//GEN-LAST:event_option4MouseExited

    private void option5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_option5MouseEntered
       option5.setBackground(new Color(0,0,200));
    }//GEN-LAST:event_option5MouseEntered

    private void option5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_option5MouseExited
        option5.setBackground(new Color(62,114,179));
    }//GEN-LAST:event_option5MouseExited

    private void option6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_option6MouseEntered
       option6.setBackground(new Color(0,0,200));
    }//GEN-LAST:event_option6MouseEntered

    private void option6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_option6MouseExited
       option6.setBackground(new Color(62,114,179));
    }//GEN-LAST:event_option6MouseExited

    private void option8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_option8MouseEntered
       option8.setBackground(new Color(0,0,200));
    }//GEN-LAST:event_option8MouseEntered

    private void option8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_option8MouseExited
        option8.setBackground(new Color(62,114,179));
    }//GEN-LAST:event_option8MouseExited

    private void option1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_option1MouseClicked
        principal p1 = new principal();
        p1.setSize(730, 700);
        p1.setLocation(0,0);
        homeContent.removeAll();
        homeContent.add(p1,BorderLayout.CENTER);
        homeContent.revalidate();
        homeContent.repaint();
    }//GEN-LAST:event_option1MouseClicked

    private void option7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_option7MouseClicked
        buscarRelojes p1 = new buscarRelojes();
      p1.setSize(730, 700);
        p1.setLocation(0,0);
        homeContent.removeAll();
        homeContent.add(p1,BorderLayout.CENTER);
        homeContent.revalidate();
        homeContent.repaint();
    }//GEN-LAST:event_option7MouseClicked

    private void option2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_option2MouseClicked
        insertarRelojes p1 = new insertarRelojes();
      p1.setSize(730, 700);
        p1.setLocation(0,0);
        homeContent.removeAll();
        homeContent.add(p1,BorderLayout.CENTER);
        homeContent.revalidate();
        homeContent.repaint();
    }//GEN-LAST:event_option2MouseClicked

    private void option3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_option3MouseClicked
        favoritos p1 = new favoritos();
      p1.setSize(730, 700);
        p1.setLocation(0,0);
        homeContent.removeAll();
        homeContent.add(p1,BorderLayout.CENTER);
        homeContent.revalidate();
        homeContent.repaint();
    }//GEN-LAST:event_option3MouseClicked

    private void option4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_option4MouseClicked
        carritoCompra p1 = new carritoCompra();
       p1.setSize(730, 700);
        p1.setLocation(0,0);
        homeContent.removeAll();
        homeContent.add(p1,BorderLayout.CENTER);
        homeContent.revalidate();
        homeContent.repaint();
    }//GEN-LAST:event_option4MouseClicked

    private void option5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_option5MouseClicked
        chats p1 = new chats();
       p1.setSize(730, 700);
        p1.setLocation(0,0);
        homeContent.removeAll();
        homeContent.add(p1,BorderLayout.CENTER);
        homeContent.revalidate();
        homeContent.repaint();
    }//GEN-LAST:event_option5MouseClicked

    private void option6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_option6MouseClicked
        estadisticas p1 = new estadisticas();
       p1.setSize(730, 700);
        p1.setLocation(0,0);
        homeContent.removeAll();
        homeContent.add(p1,BorderLayout.CENTER);
        homeContent.revalidate();
        homeContent.repaint();        
    }//GEN-LAST:event_option6MouseClicked

    private void option8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_option8MouseClicked
        cuenta p1 = new cuenta();
       p1.setSize(730, 700);
        p1.setLocation(0,0);
        homeContent.removeAll();
        homeContent.add(p1,BorderLayout.CENTER);
        homeContent.revalidate();
        homeContent.repaint();              // TODO add your handling code here:
    }//GEN-LAST:event_option8MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel exitButton2;
    private javax.swing.JPanel exitPanel2;
    private javax.swing.JPanel homeContent;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JPanel menu;
    private javax.swing.JPanel menuBar;
    private javax.swing.JLabel menuLabel;
    private javax.swing.JPanel option1;
    private javax.swing.JPanel option2;
    private javax.swing.JPanel option3;
    private javax.swing.JPanel option4;
    private javax.swing.JPanel option5;
    private javax.swing.JPanel option6;
    private javax.swing.JPanel option7;
    private javax.swing.JPanel option8;
    // End of variables declaration//GEN-END:variables
}
