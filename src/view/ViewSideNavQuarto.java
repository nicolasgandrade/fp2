package view;

public class ViewSideNavQuarto extends javax.swing.JFrame {

    public ViewSideNavQuarto() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bntUsuarios = new javax.swing.JButton();
        btnQuarto = new javax.swing.JButton();
        btnHospedes = new javax.swing.JButton();
        lblQuarto = new javax.swing.JLabel();
        txtQuarto = new javax.swing.JTextField();
        btnBusca = new javax.swing.JButton();
        lblFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bntUsuarios.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        bntUsuarios.setForeground(new java.awt.Color(0, 51, 153));
        bntUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Usuarios_icon.png"))); // NOI18N
        bntUsuarios.setText("Usuários");
        bntUsuarios.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bntUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntUsuariosActionPerformed(evt);
            }
        });
        getContentPane().add(bntUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 390, 210, 40));

        btnQuarto.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btnQuarto.setForeground(new java.awt.Color(0, 51, 153));
        btnQuarto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Quartos_icon.png"))); // NOI18N
        btnQuarto.setText("Quarto");
        btnQuarto.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnQuarto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuartoActionPerformed(evt);
            }
        });
        getContentPane().add(btnQuarto, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 210, 40));

        btnHospedes.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btnHospedes.setForeground(new java.awt.Color(0, 51, 153));
        btnHospedes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Hospedes_icon.png"))); // NOI18N
        btnHospedes.setText("Hóspedes");
        btnHospedes.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnHospedes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHospedesActionPerformed(evt);
            }
        });
        getContentPane().add(btnHospedes, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, 210, 40));

        lblQuarto.setFont(new java.awt.Font("Segoe UI", 0, 57)); // NOI18N
        lblQuarto.setText("Quarto");
        getContentPane().add(lblQuarto, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 170, 180, 100));

        txtQuarto.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtQuarto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtQuarto.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Digite o número do Quarto", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial", 1, 10))); // NOI18N
        getContentPane().add(txtQuarto, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 270, 370, 50));

        btnBusca.setBackground(new java.awt.Color(0, 51, 153));
        btnBusca.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnBusca.setForeground(new java.awt.Color(255, 255, 255));
        btnBusca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/lupa_icon.png"))); // NOI18N
        btnBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscaActionPerformed(evt);
            }
        });
        getContentPane().add(btnBusca, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 320, 40, 40));

        lblFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/menu_icon.png"))); // NOI18N
        getContentPane().add(lblFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnQuartoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuartoActionPerformed
        // Já esta na tela Quartos
    }//GEN-LAST:event_btnQuartoActionPerformed

    private void btnBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscaActionPerformed

    private void bntUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntUsuariosActionPerformed
        dispose();
        ViewSideNavUsuarios usuarios = new ViewSideNavUsuarios();
        usuarios.setVisible(true);
    }//GEN-LAST:event_bntUsuariosActionPerformed

    private void btnHospedesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHospedesActionPerformed
        dispose();
        ViewSideNavHospedes hospedes = new ViewSideNavHospedes();
        hospedes.setVisible(true);
    }//GEN-LAST:event_btnHospedesActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewSideNavQuarto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntUsuarios;
    private javax.swing.JButton btnBusca;
    private javax.swing.JButton btnHospedes;
    private javax.swing.JButton btnQuarto;
    private javax.swing.JLabel lblFundo;
    private javax.swing.JLabel lblQuarto;
    private javax.swing.JTextField txtQuarto;
    // End of variables declaration//GEN-END:variables
}
