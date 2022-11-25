package view;

import controller.QuartosController;
import javax.swing.JOptionPane;
import model.Quarto;

public class CadQuarto extends javax.swing.JFrame {
    QuartosController quartoController;

    public CadQuarto() {
        initComponents();
        this.quartoController = new QuartosController();
    }

    public CadQuarto(int numero, int andar, Boolean ocupação, String categoria) {
        initComponents();
        txtAndar.setText(String.valueOf(andar));
        if (cboOcupado.getSelectedItem().toString().equals("Ocupado")){
            cboOcupado.setSelectedItem(ocupação);
        } else if (cboOcupado.getSelectedItem().toString().equals("Desocupado")){
            cboOcupado.setSelectedItem(ocupação);
        }        
        
        this.quartoController = new QuartosController();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpQuartos = new javax.swing.JPanel();
        lblAndar = new javax.swing.JLabel();
        txtAndar = new javax.swing.JTextField();
        cboOcupado = new javax.swing.JComboBox<>();
        lblOcupação = new javax.swing.JLabel();
        btnCadastro = new javax.swing.JButton();
        lblCategoria = new javax.swing.JLabel();
        cboCategoria = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpQuartos.setBorder(javax.swing.BorderFactory.createTitledBorder("Quartos"));

        lblAndar.setText("Andar do Quarto");

        cboOcupado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ocupado", "Desocupado" }));

        lblOcupação.setText("Ocupação do Quarto");

        btnCadastro.setText("NOVO QUARTO");
        btnCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastroActionPerformed(evt);
            }
        });

        lblCategoria.setText("Categoria do Quarto");

        cboCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Solteiro", "Duplo solteiro", "Casal", "Dormitório", " " }));

        javax.swing.GroupLayout jpQuartosLayout = new javax.swing.GroupLayout(jpQuartos);
        jpQuartos.setLayout(jpQuartosLayout);
        jpQuartosLayout.setHorizontalGroup(
            jpQuartosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpQuartosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpQuartosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpQuartosLayout.createSequentialGroup()
                        .addGroup(jpQuartosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpQuartosLayout.createSequentialGroup()
                                .addComponent(lblOcupação)
                                .addGap(0, 30, Short.MAX_VALUE))
                            .addComponent(lblCategoria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpQuartosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cboOcupado, 0, 96, Short.MAX_VALUE)
                            .addComponent(cboCategoria, 0, 1, Short.MAX_VALUE)))
                    .addGroup(jpQuartosLayout.createSequentialGroup()
                        .addComponent(lblAndar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(txtAndar, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jpQuartosLayout.setVerticalGroup(
            jpQuartosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpQuartosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpQuartosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAndar)
                    .addComponent(txtAndar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpQuartosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboOcupado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblOcupação))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jpQuartosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCategoria)
                    .addComponent(cboCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpQuartos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpQuartos, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastroActionPerformed
        // TODO add your handling code here:
        Quarto novoQuarto = new Quarto();
        novoQuarto.setAndar(Integer.parseInt(txtAndar.getText()));
        if (cboOcupado.getSelectedItem().toString().equals("Ocupado")){
            novoQuarto.setOcupado(true);
        } else {
            novoQuarto.setOcupado(false);
        }
        if (cboCategoria.getSelectedItem().toString().equals("Solteiro")){
            novoQuarto.setCategoria("Solteiro");
        } else if (cboCategoria.getSelectedItem().toString().equals("Duplo solteiro")) {
            novoQuarto.setCategoria("Duplo solteiro");
        } else if (cboCategoria.getSelectedItem().toString().equals("Casal")) {
            novoQuarto.setCategoria("Casal");
        } else if (cboCategoria.getSelectedItem().toString().equals("Dormitório")) {
            novoQuarto.setCategoria("Dormitório");
        }
        
        try {
            int status = this.quartoController.inserirQuarto(novoQuarto);
                
            if (status == 1) {
                JOptionPane.showMessageDialog(null, "Quarto cadastrado com sucesso.", "Sucesso.", JOptionPane.DEFAULT_OPTION);
            } else {
                JOptionPane.showMessageDialog(null, "Houve algum problema no cadastro do quarto.", "Erro no cadastro." , JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
        //    JOptionPane.showMessageDialog(rootPane, "Houve um erro no cadastro do quarto.", "Erro no cadastro.", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
        
        //  this.controller.closeConn();
    }//GEN-LAST:event_btnCadastroActionPerformed

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
            java.util.logging.Logger.getLogger(CadQuarto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadQuarto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadQuarto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadQuarto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadQuarto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastro;
    private javax.swing.JComboBox<String> cboCategoria;
    private javax.swing.JComboBox<String> cboOcupado;
    private javax.swing.JPanel jpQuartos;
    private javax.swing.JLabel lblAndar;
    private javax.swing.JLabel lblCategoria;
    private javax.swing.JLabel lblOcupação;
    private javax.swing.JTextField txtAndar;
    // End of variables declaration//GEN-END:variables
}
