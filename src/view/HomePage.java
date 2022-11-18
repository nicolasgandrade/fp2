package view;

import controller.ControllerListarUsuarios;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Usuario;
import utils.MySQL;

public class HomePage extends javax.swing.JFrame {
    CardLayout cardLayout;

    public HomePage() {
        initComponents();
        cardLayout = (CardLayout)(pnlContent.getLayout());
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        pnlSideNav = new javax.swing.JPanel();
        btnUsuarios = new javax.swing.JButton();
        btnQuartos = new javax.swing.JButton();
        btnHospedes = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        lblSidenavBg = new javax.swing.JLabel();
        pnlContent = new javax.swing.JPanel();
        pnlDefault = new javax.swing.JPanel();
        lblBemVindoDesc = new javax.swing.JLabel();
        lblBemVindo = new javax.swing.JLabel();
        lblFundoDefault = new javax.swing.JLabel();
        pnlQuartos = new javax.swing.JPanel();
        lblTituloQuartos = new javax.swing.JLabel();
        lblDescQuartos = new javax.swing.JLabel();
        spnBuscaQuarto = new javax.swing.JSpinner();
        btnBuscarQuarto = new javax.swing.JButton();
        lblFundoQuartos = new javax.swing.JLabel();
        pnlHospedes = new javax.swing.JPanel();
        lblTituloHospedes = new javax.swing.JLabel();
        lblDescHospedes = new javax.swing.JLabel();
        btnBuscarHospede = new javax.swing.JButton();
        txtDocumentoHospede = new javax.swing.JTextField();
        lblFundoHospedes = new javax.swing.JLabel();
        pnlUsuarios = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableUsuarios = new javax.swing.JTable();
        lblTituloUsuarios = new javax.swing.JLabel();
        lblDescUsuarios = new javax.swing.JLabel();
        btnBuscarUsuario = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        txtUsernameBusca = new javax.swing.JTextField();
        lblFundoUsuarios = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        pnlSideNav.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnUsuarios.setBackground(new java.awt.Color(255, 255, 255));
        btnUsuarios.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        btnUsuarios.setForeground(new java.awt.Color(0, 51, 153));
        btnUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Usuarios_icon.png"))); // NOI18N
        btnUsuarios.setText("Usuários");
        btnUsuarios.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnUsuarios.setBorderPainted(false);
        btnUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuariosActionPerformed(evt);
            }
        });
        pnlSideNav.add(btnUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, 210, 60));

        btnQuartos.setBackground(new java.awt.Color(255, 255, 255));
        btnQuartos.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        btnQuartos.setForeground(new java.awt.Color(0, 51, 153));
        btnQuartos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Quartos_icon.png"))); // NOI18N
        btnQuartos.setText("Quarto");
        btnQuartos.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnQuartos.setBorderPainted(false);
        btnQuartos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuartosActionPerformed(evt);
            }
        });
        pnlSideNav.add(btnQuartos, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 210, 60));

        btnHospedes.setBackground(new java.awt.Color(255, 255, 255));
        btnHospedes.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        btnHospedes.setForeground(new java.awt.Color(0, 51, 153));
        btnHospedes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Hospedes_icon.png"))); // NOI18N
        btnHospedes.setText("Hóspedes");
        btnHospedes.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnHospedes.setBorderPainted(false);
        btnHospedes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHospedesActionPerformed(evt);
            }
        });
        pnlSideNav.add(btnHospedes, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 210, 60));

        btnSair.setBackground(new java.awt.Color(255, 255, 255));
        btnSair.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btnSair.setForeground(new java.awt.Color(0, 51, 153));
        btnSair.setText("Sair");
        btnSair.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSair.setBorderPainted(false);
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        pnlSideNav.add(btnSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 640, 210, 60));

        lblSidenavBg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/menu_icon.png"))); // NOI18N
        pnlSideNav.add(lblSidenavBg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, -1));

        jSplitPane1.setLeftComponent(pnlSideNav);

        pnlContent.setLayout(new java.awt.CardLayout());

        pnlDefault.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblBemVindoDesc.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        lblBemVindoDesc.setForeground(new java.awt.Color(51, 51, 51));
        lblBemVindoDesc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBemVindoDesc.setText("Selecione a opção desejada ao lado para iniciar a navegação.");
        pnlDefault.add(lblBemVindoDesc, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 880, 20));

        lblBemVindo.setFont(new java.awt.Font("Liberation Sans", 1, 36)); // NOI18N
        lblBemVindo.setForeground(new java.awt.Color(51, 51, 51));
        lblBemVindo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBemVindo.setText("Bem-vindo!");
        pnlDefault.add(lblBemVindo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 880, 70));

        lblFundoDefault.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/menu_content.png"))); // NOI18N
        pnlDefault.add(lblFundoDefault, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pnlContent.add(pnlDefault, "pnlDefault");

        pnlQuartos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTituloQuartos.setFont(new java.awt.Font("Liberation Sans", 1, 36)); // NOI18N
        lblTituloQuartos.setForeground(new java.awt.Color(51, 51, 51));
        lblTituloQuartos.setText("Quartos");
        pnlQuartos.add(lblTituloQuartos, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, -1, -1));

        lblDescQuartos.setFont(new java.awt.Font("Liberation Sans", 0, 16)); // NOI18N
        lblDescQuartos.setForeground(new java.awt.Color(102, 102, 102));
        lblDescQuartos.setText("Gerencie aqui todos os quartos existentes no estabelecimento.");
        pnlQuartos.add(lblDescQuartos, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, -1, -1));

        spnBuscaQuarto.setBorder(javax.swing.BorderFactory.createTitledBorder("Número do Quarto"));
        pnlQuartos.add(spnBuscaQuarto, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 270, 70));

        btnBuscarQuarto.setText("BUSCAR");
        btnBuscarQuarto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarQuartoActionPerformed(evt);
            }
        });
        pnlQuartos.add(btnBuscarQuarto, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 190, 100, 40));

        lblFundoQuartos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/menu_content.png"))); // NOI18N
        pnlQuartos.add(lblFundoQuartos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pnlContent.add(pnlQuartos, "pnlQuartos");

        pnlHospedes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTituloHospedes.setFont(new java.awt.Font("Liberation Sans", 1, 36)); // NOI18N
        lblTituloHospedes.setForeground(new java.awt.Color(51, 51, 51));
        lblTituloHospedes.setText("Hóspedes");
        pnlHospedes.add(lblTituloHospedes, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, -1, -1));

        lblDescHospedes.setFont(new java.awt.Font("Liberation Sans", 0, 16)); // NOI18N
        lblDescHospedes.setForeground(new java.awt.Color(102, 102, 102));
        lblDescHospedes.setText("Controle os hóspedes cadastrados no seu sistema.");
        pnlHospedes.add(lblDescHospedes, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, -1, -1));

        btnBuscarHospede.setText("BUSCAR");
        btnBuscarHospede.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarHospedeActionPerformed(evt);
            }
        });
        pnlHospedes.add(btnBuscarHospede, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 190, 100, 40));

        txtDocumentoHospede.setBorder(javax.swing.BorderFactory.createTitledBorder("Documento do hóspede"));
        pnlHospedes.add(txtDocumentoHospede, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 270, 70));

        lblFundoHospedes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/menu_content.png"))); // NOI18N
        pnlHospedes.add(lblFundoHospedes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pnlContent.add(pnlHospedes, "pnlHospedes");

        pnlUsuarios.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TableUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Cargo"
            }
        ));
        jScrollPane1.setViewportView(TableUsuarios);

        pnlUsuarios.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, -1, -1));

        lblTituloUsuarios.setFont(new java.awt.Font("Liberation Sans", 1, 36)); // NOI18N
        lblTituloUsuarios.setForeground(new java.awt.Color(51, 51, 51));
        lblTituloUsuarios.setText("Usuários");
        pnlUsuarios.add(lblTituloUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, -1, -1));

        lblDescUsuarios.setFont(new java.awt.Font("Liberation Sans", 0, 16)); // NOI18N
        lblDescUsuarios.setForeground(new java.awt.Color(102, 102, 102));
        lblDescUsuarios.setText("Gerencie os usuários que podem utilizar o sistema.");
        pnlUsuarios.add(lblDescUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, -1, -1));

        btnBuscarUsuario.setText("BUSCAR");
        btnBuscarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarUsuarioActionPerformed(evt);
            }
        });
        pnlUsuarios.add(btnBuscarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 190, 100, 40));

        btnLimpar.setText("LIMPAR");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });
        pnlUsuarios.add(btnLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 190, 100, 40));

        txtUsernameBusca.setBorder(javax.swing.BorderFactory.createTitledBorder("Nome de usuário"));
        pnlUsuarios.add(txtUsernameBusca, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 270, 70));

        lblFundoUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/menu_content.png"))); // NOI18N
        pnlUsuarios.add(lblFundoUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pnlContent.add(pnlUsuarios, "pnlUsuarios");

        jSplitPane1.setRightComponent(pnlContent);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuariosActionPerformed
        cardLayout.show(pnlContent, "pnlUsuarios");
    }//GEN-LAST:event_btnUsuariosActionPerformed

    private void btnQuartosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuartosActionPerformed
        cardLayout.show(pnlContent, "pnlQuartos");
    }//GEN-LAST:event_btnQuartosActionPerformed

    private void btnHospedesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHospedesActionPerformed
        cardLayout.show(pnlContent, "pnlHospedes");
    }//GEN-LAST:event_btnHospedesActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnBuscarQuartoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarQuartoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarQuartoActionPerformed

    private void btnBuscarHospedeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarHospedeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarHospedeActionPerformed

    private void btnBuscarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarUsuarioActionPerformed
        //Procurar os Usuarios
        String nome = txtUsernameBusca.getText();
        ControllerListarUsuarios usuario = new ControllerListarUsuarios();
        try {
            DefaultTableModel table = (DefaultTableModel) TableUsuarios.getModel();
            table.setNumRows(0);
            ArrayList<Usuario> lista = usuario.ListarUsuarios(nome);
            for (int num = 0; num <lista.size(); num++){
                table.addRow(new Object[]{
                    lista.get(num).getId(),
                    lista.get(num).getNomeUsuario(),
                    lista.get(num).getCargo()
                });
            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, erro);
        }
        usuario.closeConn();
    }//GEN-LAST:event_btnBuscarUsuarioActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        txtUsernameBusca.setText("");
        DefaultTableModel table = (DefaultTableModel) TableUsuarios.getModel();
        table.setNumRows(0);
    }//GEN-LAST:event_btnLimparActionPerformed
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
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TableUsuarios;
    private javax.swing.JButton btnBuscarHospede;
    private javax.swing.JButton btnBuscarQuarto;
    private javax.swing.JButton btnBuscarUsuario;
    private javax.swing.JButton btnHospedes;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnQuartos;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnUsuarios;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JLabel lblBemVindo;
    private javax.swing.JLabel lblBemVindoDesc;
    private javax.swing.JLabel lblDescHospedes;
    private javax.swing.JLabel lblDescQuartos;
    private javax.swing.JLabel lblDescUsuarios;
    private javax.swing.JLabel lblFundoDefault;
    private javax.swing.JLabel lblFundoHospedes;
    private javax.swing.JLabel lblFundoQuartos;
    private javax.swing.JLabel lblFundoUsuarios;
    private javax.swing.JLabel lblSidenavBg;
    private javax.swing.JLabel lblTituloHospedes;
    private javax.swing.JLabel lblTituloQuartos;
    private javax.swing.JLabel lblTituloUsuarios;
    private javax.swing.JPanel pnlContent;
    private javax.swing.JPanel pnlDefault;
    private javax.swing.JPanel pnlHospedes;
    private javax.swing.JPanel pnlQuartos;
    private javax.swing.JPanel pnlSideNav;
    private javax.swing.JPanel pnlUsuarios;
    private javax.swing.JSpinner spnBuscaQuarto;
    private javax.swing.JTextField txtDocumentoHospede;
    private javax.swing.JTextField txtUsernameBusca;
    // End of variables declaration//GEN-END:variables
}
