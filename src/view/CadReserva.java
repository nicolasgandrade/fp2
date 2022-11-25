package view;

import model.Reserva;
import controller.ReservaController;
import javax.swing.JOptionPane;

public class CadReserva extends javax.swing.JFrame {

    Reserva reserva;
    Reserva modalReserva;
    ReservaController reservaController;
    int id;
    
    public CadReserva() {
        initComponents();
        this.reservaController = new ReservaController();
    }
    
    public CadReserva(int id, int numQuarto, String docHospede, String entrada, String saida) {
        initComponents();
        this.id = id;
        txtNumeroQuarto.setText(String.valueOf(numQuarto));
        txtHospede.setText(docHospede);
        String entradaData = entrada.substring(8, 10) + "/" + entrada.substring(5, 7) + "/" + entrada.substring(0, 4);
        txtEntrada.setText(entradaData);
        String saidaData = saida.substring(8, 10) + "/" + saida.substring(5, 7) + "/" + saida.substring(0, 4);
        txtSaida.setText(saidaData);
        
        this.reservaController = new ReservaController();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblNumeroQuarto = new javax.swing.JLabel();
        lblHospede = new javax.swing.JLabel();
        lblEntrada = new javax.swing.JLabel();
        lblSaida = new javax.swing.JLabel();
        txtNumeroQuarto = new javax.swing.JTextField();
        txtHospede = new javax.swing.JTextField();
        txtEntrada = new javax.swing.JFormattedTextField();
        txtSaida = new javax.swing.JFormattedTextField();
        btnCadastro = new javax.swing.JButton();
        btnAtualizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Nova Reserva"));

        lblNumeroQuarto.setText("Numero Quarto");

        lblHospede.setText("Documento do Hóspede");

        lblEntrada.setText("Entrada");

        lblSaida.setText("Saida");

        try {
            txtEntrada.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txtSaida.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        btnCadastro.setText("RESERVAR");
        btnCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastroActionPerformed(evt);
            }
        });

        btnAtualizar.setText("ATUALIZAR");
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAtualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblHospede, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblEntrada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblSaida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(lblNumeroQuarto))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtHospede, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                            .addComponent(txtEntrada, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtSaida)
                            .addComponent(txtNumeroQuarto, javax.swing.GroupLayout.Alignment.TRAILING)))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumeroQuarto)
                    .addComponent(txtNumeroQuarto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHospede)
                    .addComponent(txtHospede, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEntrada)
                    .addComponent(txtEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSaida)
                    .addComponent(txtSaida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(btnAtualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastroActionPerformed
        reserva = new Reserva();
        reserva.setQuarto(Integer.parseInt(txtNumeroQuarto.getText()));
        reserva.setHospede(txtHospede.getText());
        String entrada = txtEntrada.getText();
        String entradaFormatada = entrada.substring(6) + "-" + entrada.substring(3, 5) + "-" + entrada.substring(0, 2) + " 15:00:00";
        reserva.setEntrada(entradaFormatada);
        String saida = txtSaida.getText();
        String saidaFormatada = saida.substring(6) + "-" + saida.substring(3, 5) + "-" + saida.substring(0, 2) + " 11:00:00";
        reserva.setSaida(saidaFormatada);
            
        try {
            int status = this.reservaController.addReserva(reserva.getHospede(), reserva);
                
            if (status == 1) {
                JOptionPane.showMessageDialog(null, "Reserva cadastrada com sucesso.", "Sucesso.", JOptionPane.DEFAULT_OPTION);
            } else {
                JOptionPane.showMessageDialog(null, "Houve algum problema no cadastro da reserva.", "Erro no cadastro." , JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Houve um erro no cadastro da reserva.", "Erro no cadastro.", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnCadastroActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        
        reserva = new Reserva();
        reserva.setId(this.id);
        reserva.setQuarto(Integer.parseInt(txtNumeroQuarto.getText()));
        reserva.setHospede(txtHospede.getText());
        String entrada = txtEntrada.getText();
        String entradaFormatada = entrada.substring(6) + "-" + entrada.substring(3, 5) + "-" + entrada.substring(0, 2) + " 15:00:00";
        reserva.setEntrada(entradaFormatada);
        String saida = txtSaida.getText();
        String saidaFormatada = saida.substring(6) + "-" + saida.substring(3, 5) + "-" + saida.substring(0, 2) + " 11:00:00";
        reserva.setSaida(saidaFormatada);
            
        try {
            boolean status = this.reservaController.updateReserva(reserva.getHospede(), reserva);
                
            if (status) {
                JOptionPane.showMessageDialog(null, "Atualização realizada com sucesso.", "Sucesso.", JOptionPane.DEFAULT_OPTION);
            } else {
                JOptionPane.showMessageDialog(null, "Houve um erro na hora de atualizar.", "Erro na atualização .", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Houve um erro na atualização.", "Erro na atualização.", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAtualizarActionPerformed

    public Reserva acao(){
        
        modalReserva = new Reserva();
        modalReserva.setId(this.id);
        modalReserva.setQuarto(Integer.parseInt(txtNumeroQuarto.getText()));
        modalReserva.setHospede(txtHospede.getText());
        String entrada = txtEntrada.getText();
        String entradaFormatada = entrada.substring(6) + "-" + entrada.substring(3, 5) + "-" + entrada.substring(0, 2) + " 15:00:00";
        modalReserva.setEntrada(entradaFormatada);
        String saida = txtSaida.getText();
        String saidaFormatada = saida.substring(6) + "-" + saida.substring(3, 5) + "-" + saida.substring(0, 2) + " 11:00:00";
        modalReserva.setSaida(saidaFormatada);
        
        
        return modalReserva;
    }
    
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
            java.util.logging.Logger.getLogger(CadReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadReserva().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnCadastro;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblEntrada;
    private javax.swing.JLabel lblHospede;
    private javax.swing.JLabel lblNumeroQuarto;
    private javax.swing.JLabel lblSaida;
    private javax.swing.JFormattedTextField txtEntrada;
    private javax.swing.JTextField txtHospede;
    private javax.swing.JTextField txtNumeroQuarto;
    private javax.swing.JFormattedTextField txtSaida;
    // End of variables declaration//GEN-END:variables
}
