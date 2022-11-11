package view;

public class ViewSideNaveQuarto extends javax.swing.JFrame {

    public ViewSideNaveQuarto() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bntUsuarios = new javax.swing.JButton();
        btnQuarto = new javax.swing.JButton();
        btnHospedes = new javax.swing.JButton();
        lblQuarto = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        lblFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bntUsuarios.setBackground(new java.awt.Color(255, 255, 255));
        bntUsuarios.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        bntUsuarios.setForeground(new java.awt.Color(0, 51, 204));
        bntUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Usuarios_icon.png"))); // NOI18N
        bntUsuarios.setText("Usuários");
        bntUsuarios.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(bntUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 390, 210, 40));

        btnQuarto.setBackground(new java.awt.Color(255, 255, 255));
        btnQuarto.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btnQuarto.setForeground(new java.awt.Color(0, 51, 204));
        btnQuarto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Quartos_icon.png"))); // NOI18N
        btnQuarto.setText("Quarto");
        btnQuarto.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnQuarto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuartoActionPerformed(evt);
            }
        });
        getContentPane().add(btnQuarto, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 210, 40));

        btnHospedes.setBackground(new java.awt.Color(255, 255, 255));
        btnHospedes.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btnHospedes.setForeground(new java.awt.Color(0, 51, 255));
        btnHospedes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Hospedes_icon.png"))); // NOI18N
        btnHospedes.setText("Hóspedes");
        btnHospedes.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(btnHospedes, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, 210, 40));

        lblQuarto.setFont(new java.awt.Font("Segoe UI", 0, 57)); // NOI18N
        lblQuarto.setForeground(new java.awt.Color(0, 0, 0));
        lblQuarto.setText("Quarto");
        getContentPane().add(lblQuarto, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 170, 180, 100));

        jTextField1.setBackground(new java.awt.Color(255, 255, 255));
        jTextField1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(0, 0, 0));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Digite o número do Quarto", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial", 1, 10), new java.awt.Color(0, 0, 0))); // NOI18N
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 270, 370, 50));

        jButton1.setBackground(new java.awt.Color(0, 51, 153));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/lupa_icon.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 320, 40, 40));

        lblFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/menu_icon.png"))); // NOI18N
        getContentPane().add(lblFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnQuartoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuartoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnQuartoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(ViewSideNaveQuarto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewSideNaveQuarto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewSideNaveQuarto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewSideNaveQuarto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewSideNaveQuarto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntUsuarios;
    private javax.swing.JButton btnHospedes;
    private javax.swing.JButton btnQuarto;
    private javax.swing.JButton jButton1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblFundo;
    private javax.swing.JLabel lblQuarto;
    // End of variables declaration//GEN-END:variables
}
