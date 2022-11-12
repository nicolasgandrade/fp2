package view;

public class ViewSideNavHospedes extends javax.swing.JFrame {

    public ViewSideNavHospedes() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnUsuarios = new javax.swing.JButton();
        btnQuarto = new javax.swing.JButton();
        btnHospedes = new javax.swing.JButton();
        lblHospedes = new javax.swing.JLabel();
        txtHospedes = new javax.swing.JTextField();
        btnBusca = new javax.swing.JButton();
        lblFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        btnQuarto.setBackground(new java.awt.Color(255, 255, 255));
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

        lblHospedes.setFont(new java.awt.Font("Segoe UI", 0, 57)); // NOI18N
        lblHospedes.setForeground(new java.awt.Color(0, 0, 0));
        lblHospedes.setText("Hóspedes");
        getContentPane().add(lblHospedes, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 170, 250, 100));

        txtHospedes.setBackground(new java.awt.Color(255, 255, 255));
        txtHospedes.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtHospedes.setForeground(new java.awt.Color(0, 0, 0));
        txtHospedes.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtHospedes.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Digite o nome", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial", 1, 10), new java.awt.Color(0, 0, 0))); // NOI18N
        getContentPane().add(txtHospedes, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 270, 370, 50));

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
        dispose();
        ViewSideNavQuarto quarto = new ViewSideNavQuarto();
        quarto.setVisible(true);
    }//GEN-LAST:event_btnQuartoActionPerformed

    private void btnBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscaActionPerformed

    private void btnHospedesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHospedesActionPerformed
        // Já esta na tela Hospedes
    }//GEN-LAST:event_btnHospedesActionPerformed

    private void btnUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuariosActionPerformed
        dispose();
        ViewSideNavUsuarios usuarios = new ViewSideNavUsuarios();
        usuarios.setVisible(true);
    }//GEN-LAST:event_btnUsuariosActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewSideNavHospedes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBusca;
    private javax.swing.JButton btnHospedes;
    private javax.swing.JButton btnQuarto;
    private javax.swing.JButton btnUsuarios;
    private javax.swing.JLabel lblFundo;
    private javax.swing.JLabel lblHospedes;
    private javax.swing.JTextField txtHospedes;
    // End of variables declaration//GEN-END:variables
}
