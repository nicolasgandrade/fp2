package view;

public class ViewSideNav extends javax.swing.JFrame {

    public ViewSideNav() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblWelcome = new javax.swing.JLabel();
        btnUsuarios = new javax.swing.JButton();
        btnQuartos = new javax.swing.JButton();
        btnHospedes = new javax.swing.JButton();
        lblFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblWelcome.setFont(new java.awt.Font("Segoe UI", 0, 57)); // NOI18N
        lblWelcome.setForeground(new java.awt.Color(0, 0, 0));
        lblWelcome.setText("Bem-vindo!");
        getContentPane().add(lblWelcome, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 170, 300, 100));

        btnUsuarios.setBackground(new java.awt.Color(255, 255, 255));
        btnUsuarios.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btnUsuarios.setForeground(new java.awt.Color(0, 51, 153));
        btnUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Usuarios_icon.png"))); // NOI18N
        btnUsuarios.setText("Usuários");
        btnUsuarios.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuariosActionPerformed(evt);
            }
        });
        getContentPane().add(btnUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 390, 210, 40));

        btnQuartos.setBackground(new java.awt.Color(255, 255, 255));
        btnQuartos.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btnQuartos.setForeground(new java.awt.Color(0, 51, 153));
        btnQuartos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Quartos_icon.png"))); // NOI18N
        btnQuartos.setText("Quarto");
        btnQuartos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnQuartos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuartosActionPerformed(evt);
            }
        });
        getContentPane().add(btnQuartos, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 210, 40));

        btnHospedes.setBackground(new java.awt.Color(255, 255, 255));
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

        lblFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/menu_icon.png"))); // NOI18N
        getContentPane().add(lblFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnQuartosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuartosActionPerformed
        dispose();
        ViewSideNavQuarto quarto = new ViewSideNavQuarto();
        quarto.setVisible(true);
    }//GEN-LAST:event_btnQuartosActionPerformed

    private void btnHospedesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHospedesActionPerformed
        dispose();
        ViewSideNavHospedes hospedes = new ViewSideNavHospedes();
        hospedes.setVisible(true);
    }//GEN-LAST:event_btnHospedesActionPerformed

    private void btnUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuariosActionPerformed
        dispose();
        ViewSideNavUsuarios usuarios = new ViewSideNavUsuarios();
        usuarios.setVisible(true);
    }//GEN-LAST:event_btnUsuariosActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewSideNav().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHospedes;
    private javax.swing.JButton btnQuartos;
    private javax.swing.JButton btnUsuarios;
    private javax.swing.JLabel lblFundo;
    private javax.swing.JLabel lblWelcome;
    // End of variables declaration//GEN-END:variables
}
