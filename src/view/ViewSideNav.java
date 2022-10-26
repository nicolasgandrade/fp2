package view;

public class ViewSideNav extends javax.swing.JFrame {

    public ViewSideNav() {
        initComponents();
        
        jpHospedes.setVisible(false);
        jpQuarto.setVisible(false);
        jpUsuários.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpInicial = new javax.swing.JPanel();
        lblWelcome = new javax.swing.JLabel();
        jpUsuários = new javax.swing.JPanel();
        lblUser = new javax.swing.JLabel();
        btnExitUser = new javax.swing.JButton();
        txtUser = new javax.swing.JTextField();
        lblLupa3 = new javax.swing.JLabel();
        jpHospedes = new javax.swing.JPanel();
        lblHost = new javax.swing.JLabel();
        btnExitHost = new javax.swing.JButton();
        txtHost = new javax.swing.JTextField();
        lblLupa2 = new javax.swing.JLabel();
        jpQuarto = new javax.swing.JPanel();
        lblRoom = new javax.swing.JLabel();
        btnExitRoom = new javax.swing.JButton();
        txtRoom = new javax.swing.JTextField();
        lblLupa1 = new javax.swing.JLabel();
        jpMenu = new javax.swing.JPanel();
        btnRoom = new javax.swing.JButton();
        btnHost = new javax.swing.JButton();
        btnUser = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1300, 700));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpInicial.setPreferredSize(new java.awt.Dimension(990, 700));

        lblWelcome.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lblWelcome.setText("Bem-vindo!");

        javax.swing.GroupLayout jpInicialLayout = new javax.swing.GroupLayout(jpInicial);
        jpInicial.setLayout(jpInicialLayout);
        jpInicialLayout.setHorizontalGroup(
            jpInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpInicialLayout.createSequentialGroup()
                .addGap(326, 326, 326)
                .addComponent(lblWelcome)
                .addContainerGap(481, Short.MAX_VALUE))
        );
        jpInicialLayout.setVerticalGroup(
            jpInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpInicialLayout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(lblWelcome)
                .addContainerGap(568, Short.MAX_VALUE))
        );

        getContentPane().add(jpInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(306, 0, 990, 700));

        jpUsuários.setPreferredSize(new java.awt.Dimension(990, 700));

        lblUser.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lblUser.setText("Usuários");

        btnExitUser.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnExitUser.setText("<");
        btnExitUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitUserActionPerformed(evt);
            }
        });

        lblLupa3.setText("\"Lupa\"");

        javax.swing.GroupLayout jpUsuáriosLayout = new javax.swing.GroupLayout(jpUsuários);
        jpUsuários.setLayout(jpUsuáriosLayout);
        jpUsuáriosLayout.setHorizontalGroup(
            jpUsuáriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpUsuáriosLayout.createSequentialGroup()
                .addComponent(btnExitUser)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jpUsuáriosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpUsuáriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblUser)
                    .addGroup(jpUsuáriosLayout.createSequentialGroup()
                        .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblLupa3)))
                .addContainerGap(242, Short.MAX_VALUE))
        );
        jpUsuáriosLayout.setVerticalGroup(
            jpUsuáriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpUsuáriosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnExitUser)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblUser)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpUsuáriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLupa3))
                .addContainerGap(563, Short.MAX_VALUE))
        );

        getContentPane().add(jpUsuários, new org.netbeans.lib.awtextra.AbsoluteConstraints(306, 0, 990, 700));

        jpHospedes.setPreferredSize(new java.awt.Dimension(990, 700));

        lblHost.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lblHost.setText("Hospedes");

        btnExitHost.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnExitHost.setText("<");
        btnExitHost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitHostActionPerformed(evt);
            }
        });

        lblLupa2.setText("\"Lupa\"");

        javax.swing.GroupLayout jpHospedesLayout = new javax.swing.GroupLayout(jpHospedes);
        jpHospedes.setLayout(jpHospedesLayout);
        jpHospedesLayout.setHorizontalGroup(
            jpHospedesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpHospedesLayout.createSequentialGroup()
                .addComponent(btnExitHost)
                .addGap(0, 959, Short.MAX_VALUE))
            .addGroup(jpHospedesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpHospedesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblHost)
                    .addGroup(jpHospedesLayout.createSequentialGroup()
                        .addComponent(txtHost, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblLupa2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpHospedesLayout.setVerticalGroup(
            jpHospedesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpHospedesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnExitHost)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblHost)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpHospedesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHost, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLupa2))
                .addContainerGap(563, Short.MAX_VALUE))
        );

        getContentPane().add(jpHospedes, new org.netbeans.lib.awtextra.AbsoluteConstraints(306, 0, 990, 700));

        jpQuarto.setPreferredSize(new java.awt.Dimension(990, 700));

        lblRoom.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lblRoom.setText("Quartos");

        btnExitRoom.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnExitRoom.setText("<");
        btnExitRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitRoomActionPerformed(evt);
            }
        });

        lblLupa1.setText("\"Lupa\"");

        javax.swing.GroupLayout jpQuartoLayout = new javax.swing.GroupLayout(jpQuarto);
        jpQuarto.setLayout(jpQuartoLayout);
        jpQuartoLayout.setHorizontalGroup(
            jpQuartoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpQuartoLayout.createSequentialGroup()
                .addComponent(btnExitRoom)
                .addGap(0, 959, Short.MAX_VALUE))
            .addGroup(jpQuartoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpQuartoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblRoom)
                    .addGroup(jpQuartoLayout.createSequentialGroup()
                        .addComponent(txtRoom, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblLupa1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpQuartoLayout.setVerticalGroup(
            jpQuartoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpQuartoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnExitRoom)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblRoom)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpQuartoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRoom, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLupa1))
                .addContainerGap(563, Short.MAX_VALUE))
        );

        getContentPane().add(jpQuarto, new org.netbeans.lib.awtextra.AbsoluteConstraints(306, 0, 990, 700));

        jpMenu.setBackground(new java.awt.Color(226, 224, 214));
        jpMenu.setPreferredSize(new java.awt.Dimension(300, 700));

        btnRoom.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnRoom.setText("Quarto");
        btnRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRoomActionPerformed(evt);
            }
        });

        btnHost.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnHost.setText("Hospedes");
        btnHost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHostActionPerformed(evt);
            }
        });

        btnUser.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnUser.setText("Usuários");
        btnUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUserActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpMenuLayout = new javax.swing.GroupLayout(jpMenu);
        jpMenu.setLayout(jpMenuLayout);
        jpMenuLayout.setHorizontalGroup(
            jpMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRoom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnHost, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                    .addComponent(btnUser, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE))
                .addContainerGap())
        );
        jpMenuLayout.setVerticalGroup(
            jpMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpMenuLayout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addComponent(btnRoom, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnHost, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUser, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(392, Short.MAX_VALUE))
        );

        getContentPane().add(jpMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRoomActionPerformed
        // TODO add your handling code here:
        jpInicial.setVisible(false);
        jpQuarto.setVisible(true);
    }//GEN-LAST:event_btnRoomActionPerformed

    private void btnExitRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitRoomActionPerformed
        // TODO add your handling code here:
        jpInicial.setVisible(true);
        jpQuarto.setVisible(false);
    }//GEN-LAST:event_btnExitRoomActionPerformed

    private void btnExitHostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitHostActionPerformed
        // TODO add your handling code here:
        jpInicial.setVisible(true);
        jpHospedes.setVisible(false);
    }//GEN-LAST:event_btnExitHostActionPerformed

    private void btnHostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHostActionPerformed
        // TODO add your handling code here:
        jpInicial.setVisible(false);
        jpHospedes.setVisible(true);
    }//GEN-LAST:event_btnHostActionPerformed

    private void btnUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUserActionPerformed
        // TODO add your handling code here:
        jpInicial.setVisible(false);
        jpUsuários.setVisible(true);
    }//GEN-LAST:event_btnUserActionPerformed

    private void btnExitUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitUserActionPerformed
        // TODO add your handling code here:
        jpInicial.setVisible(true);
        jpUsuários.setVisible(false);
    }//GEN-LAST:event_btnExitUserActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ViewSideNav.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewSideNav.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewSideNav.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewSideNav.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewSideNav().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExitHost;
    private javax.swing.JButton btnExitRoom;
    private javax.swing.JButton btnExitUser;
    private javax.swing.JButton btnHost;
    private javax.swing.JButton btnRoom;
    private javax.swing.JButton btnUser;
    private javax.swing.JPanel jpHospedes;
    private javax.swing.JPanel jpInicial;
    private javax.swing.JPanel jpMenu;
    private javax.swing.JPanel jpQuarto;
    private javax.swing.JPanel jpUsuários;
    private javax.swing.JLabel lblHost;
    private javax.swing.JLabel lblLupa1;
    private javax.swing.JLabel lblLupa2;
    private javax.swing.JLabel lblLupa3;
    private javax.swing.JLabel lblRoom;
    private javax.swing.JLabel lblUser;
    private javax.swing.JLabel lblWelcome;
    private javax.swing.JTextField txtHost;
    private javax.swing.JTextField txtRoom;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
