package view;

import controller.UserController;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import java.sql.SQLException;
import java.util.Optional;
import javax.swing.JOptionPane;
import model.Usuario;

public class HomePage extends javax.swing.JFrame {
    CardLayout cardLayout;
    UserController userController;
    Optional<Usuario> usuarioSelecionado;

    public HomePage(UserController userController) {
        initComponents();
        this.userController = userController;
        cardLayout = (CardLayout)(pnlContent.getLayout());
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        groupCargo = new javax.swing.ButtonGroup();
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
        tableUsuarios = new javax.swing.JTable();
        lblTituloUsuarios = new javax.swing.JLabel();
        lblDescUsuarios = new javax.swing.JLabel();
        btnBuscarUsuario = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        txtUsernameBusca = new javax.swing.JTextField();
        pnlUsuario = new javax.swing.JPanel();
        lblNovoUsuario = new javax.swing.JLabel();
        lblNomeCompleto = new javax.swing.JLabel();
        txtNomeCompleto = new javax.swing.JTextField();
        lblUsername = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        lblCargo = new javax.swing.JLabel();
        radioAdmin = new javax.swing.JRadioButton();
        radioFuncionario = new javax.swing.JRadioButton();
        lblSenha = new javax.swing.JLabel();
        txtSenha = new javax.swing.JPasswordField();
        btnConfirmUsuario = new javax.swing.JButton();
        btnDeletarSelecionado = new javax.swing.JButton();
        btnLimparSelecionado = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
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

        tableUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Nome de Usuário", "Cargo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableUsuariosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableUsuarios);

        pnlUsuarios.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, 580, 420));

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

        pnlUsuario.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));

        lblNovoUsuario.setBackground(new java.awt.Color(51, 51, 51));
        lblNovoUsuario.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblNovoUsuario.setForeground(new java.awt.Color(51, 51, 51));
        lblNovoUsuario.setText("Usuário");

        lblNomeCompleto.setText("Nome Completo");

        lblUsername.setText("Nome de usuário");

        lblCargo.setText("Cargo");

        groupCargo.add(radioAdmin);
        radioAdmin.setText("Gerente");

        groupCargo.add(radioFuncionario);
        radioFuncionario.setText("Funcionário");

        lblSenha.setText("Senha");

        btnConfirmUsuario.setText("CRIAR / EDITAR");

        btnDeletarSelecionado.setText("DELETAR");

        btnLimparSelecionado.setText("LIMPAR");

        javax.swing.GroupLayout pnlUsuarioLayout = new javax.swing.GroupLayout(pnlUsuario);
        pnlUsuario.setLayout(pnlUsuarioLayout);
        pnlUsuarioLayout.setHorizontalGroup(
            pnlUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNomeCompleto)
                    .addComponent(txtUsername)
                    .addComponent(txtSenha)
                    .addComponent(btnConfirmUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlUsuarioLayout.createSequentialGroup()
                        .addComponent(btnDeletarSelecionado, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addComponent(btnLimparSelecionado, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlUsuarioLayout.createSequentialGroup()
                        .addGroup(pnlUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNovoUsuario)
                            .addComponent(lblNomeCompleto)
                            .addComponent(lblUsername)
                            .addComponent(lblCargo)
                            .addGroup(pnlUsuarioLayout.createSequentialGroup()
                                .addComponent(radioAdmin)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(radioFuncionario))
                            .addComponent(lblSenha))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jSeparator1))
                .addContainerGap())
        );
        pnlUsuarioLayout.setVerticalGroup(
            pnlUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNovoUsuario)
                .addGap(18, 18, 18)
                .addComponent(lblNomeCompleto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNomeCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblUsername)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblCargo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioAdmin)
                    .addComponent(radioFuncionario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblSenha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnConfirmUsuario)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(pnlUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDeletarSelecionado)
                    .addComponent(btnLimparSelecionado))
                .addContainerGap())
        );

        pnlUsuarios.add(pnlUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 250, 260, 420));

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
        this.userController.closeConn();
        System.out.println("Conexão encerrada.");
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
        
        try {
            DefaultTableModel table = (DefaultTableModel) tableUsuarios.getModel();
            table.setRowCount(0);
            this.userController.setUsuarios(new ArrayList<>());
            this.userController.listarUsuarios(nome);
            
            for (Usuario usuario: this.userController.getUsuarios()) {
                table.addRow(new Object[] {
                    usuario.getId(),
                    usuario.getNome(),
                    usuario.getNomeUsuario(),
                    usuario.getCargo()
                });
            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, erro);
        }
    }//GEN-LAST:event_btnBuscarUsuarioActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        txtUsernameBusca.setText("");
        DefaultTableModel table = (DefaultTableModel) tableUsuarios.getModel();
        table.setRowCount(0);
        this.userController.setUsuarios(new ArrayList<>());
    }//GEN-LAST:event_btnLimparActionPerformed

    private void tableUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableUsuariosMouseClicked
        DefaultTableModel table = (DefaultTableModel) tableUsuarios.getModel();
        
        int id = Integer.parseInt(table.getValueAt(tableUsuarios.getSelectedRow(), 0).toString());
        
        ArrayList<Usuario> listaUsuarios = this.userController.getUsuarios();
        this.usuarioSelecionado = listaUsuarios.stream()
                .filter(usuario -> usuario.getId() == id)
                .findFirst();
        
        this.txtNomeCompleto.setText(this.usuarioSelecionado.get().getNome());
        this.txtUsername.setText(this.usuarioSelecionado.get().getNomeUsuario());
        this.txtSenha.setText(this.usuarioSelecionado.get().getSenha());
        String cargo = this.usuarioSelecionado.get().getCargo();
        this.groupCargo.setSelected(
                cargo.equals("Gerente") 
                        ? this.radioAdmin.getModel() 
                        : this.radioFuncionario.getModel(), 
                true);
        
        toggleCamposSensiveis(false, false);
        Usuario usuarioLogado = this.userController.getCurrentUser();
        if (usuarioLogado.getCargo().equals("Gerente")) {
            toggleCamposSensiveis(true, true);           
        } else if (usuarioLogado.getId() == this.usuarioSelecionado.get().getId()) {
            toggleCamposSensiveis(true, false); 
        }
    }//GEN-LAST:event_tableUsuariosMouseClicked

    public void toggleCamposSensiveis(boolean isEnabled, boolean isAdmin) {
        this.txtUsername.setEnabled(isEnabled);
        this.txtNomeCompleto.setEnabled(isEnabled);
        this.txtSenha.setEnabled(isEnabled);
        this.radioAdmin.setEnabled(isAdmin);
        this.radioFuncionario.setEnabled(isAdmin);
        this.btnDeletarSelecionado.setEnabled(
                isAdmin &&
                this.userController.getCurrentUser().getId() != this.usuarioSelecionado.get().getId());
        this.btnLimparSelecionado.setEnabled(isEnabled);
        this.btnConfirmUsuario.setEnabled(isAdmin || isEnabled);
    }
    
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new HomePage().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarHospede;
    private javax.swing.JButton btnBuscarQuarto;
    private javax.swing.JButton btnBuscarUsuario;
    private javax.swing.JButton btnConfirmUsuario;
    private javax.swing.JButton btnDeletarSelecionado;
    private javax.swing.JButton btnHospedes;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnLimparSelecionado;
    private javax.swing.JButton btnQuartos;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnUsuarios;
    private javax.swing.ButtonGroup groupCargo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JLabel lblBemVindo;
    private javax.swing.JLabel lblBemVindoDesc;
    private javax.swing.JLabel lblCargo;
    private javax.swing.JLabel lblDescHospedes;
    private javax.swing.JLabel lblDescQuartos;
    private javax.swing.JLabel lblDescUsuarios;
    private javax.swing.JLabel lblFundoDefault;
    private javax.swing.JLabel lblFundoHospedes;
    private javax.swing.JLabel lblFundoQuartos;
    private javax.swing.JLabel lblFundoUsuarios;
    private javax.swing.JLabel lblNomeCompleto;
    private javax.swing.JLabel lblNovoUsuario;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblSidenavBg;
    private javax.swing.JLabel lblTituloHospedes;
    private javax.swing.JLabel lblTituloQuartos;
    private javax.swing.JLabel lblTituloUsuarios;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JPanel pnlContent;
    private javax.swing.JPanel pnlDefault;
    private javax.swing.JPanel pnlHospedes;
    private javax.swing.JPanel pnlQuartos;
    private javax.swing.JPanel pnlSideNav;
    private javax.swing.JPanel pnlUsuario;
    private javax.swing.JPanel pnlUsuarios;
    private javax.swing.JRadioButton radioAdmin;
    private javax.swing.JRadioButton radioFuncionario;
    private javax.swing.JSpinner spnBuscaQuarto;
    private javax.swing.JTable tableUsuarios;
    private javax.swing.JTextField txtDocumentoHospede;
    private javax.swing.JTextField txtNomeCompleto;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JTextField txtUsername;
    private javax.swing.JTextField txtUsernameBusca;
    // End of variables declaration//GEN-END:variables
}
