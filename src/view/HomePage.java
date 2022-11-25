package view;

import controller.QuartosController;
import controller.ReservaController;
import controller.UserController;


import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import java.sql.SQLException;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Quarto;
import model.Reserva;
import model.Hospede;
import model.Usuario;
import controller.ControllerHospede;

public class HomePage extends javax.swing.JFrame {
    CardLayout cardLayout;
    UserController userController;
    ReservaController reservaController;
    Optional<Usuario> usuarioSelecionado;
    CadReserva cadReserva;
    ArrayList<Reserva> reservasBuscadas;
    Reserva reservaSelecionada;
    ControllerHospede hospedesController;
    CadQuarto cadQuarto;
    Quarto  quartoSelecionado;
    QuartosController quartoController;
    Hospede hospedeSelecionado;

    public HomePage(UserController userController) {
        initComponents();
        this.userController = userController;
        this.reservaController = new ReservaController();
        cardLayout = (CardLayout)(pnlContent.getLayout());
        reservasBuscadas = new ArrayList<>();     
        this.hospedesController = new ControllerHospede();
        this.quartoController = new QuartosController();
        this.hospedeSelecionado = new Hospede();
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
        btnReservas = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        lblSidenavBg = new javax.swing.JLabel();
        pnlContent = new javax.swing.JPanel();
        pnlDefault = new javax.swing.JPanel();
        lblBemVindoDesc = new javax.swing.JLabel();
        lblBemVindo = new javax.swing.JLabel();
        lblFundoDefault = new javax.swing.JLabel();
        pnlQuartos = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TableQuartos = new javax.swing.JTable();
        lblTituloQuartos = new javax.swing.JLabel();
        lblDescQuartos = new javax.swing.JLabel();
        spnBuscaQuarto = new javax.swing.JSpinner();
        btnBuscarQuarto = new javax.swing.JButton();
        btnLimparQuarto = new javax.swing.JButton();
        btnCriarQuarto = new javax.swing.JButton();
        btnAtualizarQuarto = new javax.swing.JButton();
        btnDeletarQuarto = new javax.swing.JButton();
        lblFundoQuartos = new javax.swing.JLabel();
        pnlHospedes = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TableHospedes = new javax.swing.JTable();
        lblTituloHospedes = new javax.swing.JLabel();
        lblDescHospedes = new javax.swing.JLabel();
        btnAtualizarHospede = new javax.swing.JButton();
        btnCadastrarHospede = new javax.swing.JButton();
        btnBuscarHospede = new javax.swing.JButton();
        txtDocumentoHospede = new javax.swing.JTextField();
        btnDeletarHospede = new javax.swing.JButton();
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
        pnlReservas = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tableReservas = new javax.swing.JTable();
        lblTituloReservas = new javax.swing.JLabel();
        lblDescReservas = new javax.swing.JLabel();
        txtDocReserva = new javax.swing.JTextField();
        btnBuscarReservas = new javax.swing.JButton();
        btnLimparReserva = new javax.swing.JButton();
        btnCriarReserva = new javax.swing.JButton();
        btnAtualizaReserva = new javax.swing.JButton();
        btnDeletaReserva = new javax.swing.JButton();
        lblFundoReservas = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
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
        btnQuartos.setText("Quartos");
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

        btnReservas.setBackground(new java.awt.Color(255, 255, 255));
        btnReservas.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        btnReservas.setForeground(new java.awt.Color(0, 51, 153));
        btnReservas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Reservas_icon.jpeg"))); // NOI18N
        btnReservas.setText("Reservas");
        btnReservas.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnReservas.setBorderPainted(false);
        btnReservas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReservasActionPerformed(evt);
            }
        });
        pnlSideNav.add(btnReservas, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 420, 210, 60));

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

        TableQuartos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Número", "Andar", "Categoria", "Ocupado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TableQuartos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableQuartosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TableQuartos);

        pnlQuartos.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, 860, 420));

        lblTituloQuartos.setFont(new java.awt.Font("Liberation Sans", 1, 36)); // NOI18N
        lblTituloQuartos.setForeground(new java.awt.Color(51, 51, 51));
        lblTituloQuartos.setText("Quartos");
        pnlQuartos.add(lblTituloQuartos, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, -1, -1));

        lblDescQuartos.setFont(new java.awt.Font("Liberation Sans", 0, 16)); // NOI18N
        lblDescQuartos.setForeground(new java.awt.Color(102, 102, 102));
        lblDescQuartos.setText("Gerencie aqui todos os quartos existentes no estabelecimento.");
        pnlQuartos.add(lblDescQuartos, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, -1, -1));

        spnBuscaQuarto.setBorder(javax.swing.BorderFactory.createTitledBorder("Andar do Quarto"));
        pnlQuartos.add(spnBuscaQuarto, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 270, 70));

        btnBuscarQuarto.setText("BUSCAR");
        btnBuscarQuarto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarQuartoActionPerformed(evt);
            }
        });
        pnlQuartos.add(btnBuscarQuarto, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 190, 100, 40));

        btnLimparQuarto.setText("LIMPAR");
        btnLimparQuarto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparQuartoActionPerformed(evt);
            }
        });
        pnlQuartos.add(btnLimparQuarto, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 190, 100, 40));

        btnCriarQuarto.setText("CRIAR");
        btnCriarQuarto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCriarQuartoActionPerformed(evt);
            }
        });
        pnlQuartos.add(btnCriarQuarto, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 190, 100, 40));

        btnAtualizarQuarto.setText("ATUALIZAR");
        btnAtualizarQuarto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarQuartoActionPerformed(evt);
            }
        });
        pnlQuartos.add(btnAtualizarQuarto, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 190, 100, 40));

        btnDeletarQuarto.setText("DELETAR");
        btnDeletarQuarto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarQuartoActionPerformed(evt);
            }
        });
        pnlQuartos.add(btnDeletarQuarto, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 190, 100, 40));

        lblFundoQuartos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/menu_content.png"))); // NOI18N
        pnlQuartos.add(lblFundoQuartos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pnlContent.add(pnlQuartos, "pnlQuartos");

        pnlHospedes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TableHospedes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Telefone", "Email", "Documento"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TableHospedes.setToolTipText("");
        TableHospedes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableHospedesMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(TableHospedes);

        pnlHospedes.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, 860, 420));

        lblTituloHospedes.setFont(new java.awt.Font("Liberation Sans", 1, 36)); // NOI18N
        lblTituloHospedes.setForeground(new java.awt.Color(51, 51, 51));
        lblTituloHospedes.setText("Hóspedes");
        pnlHospedes.add(lblTituloHospedes, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, -1, -1));

        lblDescHospedes.setFont(new java.awt.Font("Liberation Sans", 0, 16)); // NOI18N
        lblDescHospedes.setForeground(new java.awt.Color(102, 102, 102));
        lblDescHospedes.setText("Controle os hóspedes cadastrados no seu sistema.");
        pnlHospedes.add(lblDescHospedes, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, -1, -1));

        btnAtualizarHospede.setText("ATUALIZAR");
        btnAtualizarHospede.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarHospedeActionPerformed(evt);
            }
        });
        pnlHospedes.add(btnAtualizarHospede, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 190, 120, 40));

        btnCadastrarHospede.setText("CADASTRAR");
        btnCadastrarHospede.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarHospedeActionPerformed(evt);
            }
        });
        pnlHospedes.add(btnCadastrarHospede, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 190, 120, 40));

        btnBuscarHospede.setText("BUSCAR");
        btnBuscarHospede.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarHospedeActionPerformed(evt);
            }
        });
        pnlHospedes.add(btnBuscarHospede, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 190, 100, 40));

        txtDocumentoHospede.setBorder(javax.swing.BorderFactory.createTitledBorder("Documento do hóspede"));
        pnlHospedes.add(txtDocumentoHospede, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 270, 70));

        btnDeletarHospede.setText("DELETAR");
        btnDeletarHospede.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarHospedeActionPerformed(evt);
            }
        });
        pnlHospedes.add(btnDeletarHospede, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 190, 110, 40));

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
        btnConfirmUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmUsuarioActionPerformed(evt);
            }
        });

        btnDeletarSelecionado.setText("DELETAR");
        btnDeletarSelecionado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarSelecionadoActionPerformed(evt);
            }
        });

        btnLimparSelecionado.setText("LIMPAR");
        btnLimparSelecionado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparSelecionadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlUsuarioLayout = new javax.swing.GroupLayout(pnlUsuario);
        pnlUsuario.setLayout(pnlUsuarioLayout);
        pnlUsuarioLayout.setHorizontalGroup(
            pnlUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUsuarioLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(pnlUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNovoUsuario)
                    .addComponent(lblNomeCompleto)
                    .addComponent(txtNomeCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUsername)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCargo)
                    .addGroup(pnlUsuarioLayout.createSequentialGroup()
                        .addComponent(radioAdmin)
                        .addGap(6, 6, 6)
                        .addComponent(radioFuncionario))
                    .addComponent(lblSenha)
                    .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConfirmUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlUsuarioLayout.createSequentialGroup()
                        .addComponent(btnDeletarSelecionado, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnLimparSelecionado, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        pnlUsuarioLayout.setVerticalGroup(
            pnlUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUsuarioLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(lblNovoUsuario)
                .addGap(18, 18, 18)
                .addComponent(lblNomeCompleto)
                .addGap(6, 6, 6)
                .addComponent(txtNomeCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(lblUsername)
                .addGap(6, 6, 6)
                .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(lblCargo)
                .addGap(6, 6, 6)
                .addGroup(pnlUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(radioAdmin)
                    .addComponent(radioFuncionario))
                .addGap(12, 12, 12)
                .addComponent(lblSenha)
                .addGap(6, 6, 6)
                .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnConfirmUsuario)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(pnlUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDeletarSelecionado)
                    .addComponent(btnLimparSelecionado)))
        );

        pnlUsuarios.add(pnlUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 250, 260, 420));

        lblFundoUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/menu_content.png"))); // NOI18N
        pnlUsuarios.add(lblFundoUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pnlContent.add(pnlUsuarios, "pnlUsuarios");

        pnlReservas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tableReservas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Quarto", "Hóspede", "Entrada", "Saída"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableReservas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableReservasMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tableReservas);

        pnlReservas.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, 860, 420));

        lblTituloReservas.setFont(new java.awt.Font("Helvetica Neue", 1, 36)); // NOI18N
        lblTituloReservas.setForeground(new java.awt.Color(51, 51, 51));
        lblTituloReservas.setText("Reservas");
        pnlReservas.add(lblTituloReservas, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, -1, -1));

        lblDescReservas.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        lblDescReservas.setForeground(new java.awt.Color(102, 102, 102));
        lblDescReservas.setText("Gerencie aqui as reservas.");
        pnlReservas.add(lblDescReservas, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, -1, -1));

        txtDocReserva.setBorder(javax.swing.BorderFactory.createTitledBorder("Documento do hóspede"));
        pnlReservas.add(txtDocReserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 270, 70));

        btnBuscarReservas.setText("LISTAR/BUSCAR");
        btnBuscarReservas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarReservasActionPerformed(evt);
            }
        });
        pnlReservas.add(btnBuscarReservas, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 190, -1, 40));

        btnLimparReserva.setText("LIMPAR");
        btnLimparReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparReservaActionPerformed(evt);
            }
        });
        pnlReservas.add(btnLimparReserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 190, 100, 40));

        btnCriarReserva.setText("CRIAR");
        btnCriarReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCriarReservaActionPerformed(evt);
            }
        });
        pnlReservas.add(btnCriarReserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 190, 100, 40));

        btnAtualizaReserva.setText("ATUALIZAR");
        btnAtualizaReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizaReservaActionPerformed(evt);
            }
        });
        pnlReservas.add(btnAtualizaReserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 190, 100, 40));

        btnDeletaReserva.setText("DELETAR");
        btnDeletaReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletaReservaActionPerformed(evt);
            }
        });
        pnlReservas.add(btnDeletaReserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 190, 100, 40));

        lblFundoReservas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/menu_content.png"))); // NOI18N
        pnlReservas.add(lblFundoReservas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pnlContent.add(pnlReservas, "pnlReservas");

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
        this.reservaController.closeConn();
        System.out.println("Conexão encerrada.");
        System.exit(0);
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnBuscarQuartoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarQuartoActionPerformed
        // TODO add your handling code here:
        int numero = (Integer)spnBuscaQuarto.getValue();
        QuartosController quarto = new QuartosController();
        
        try {
            DefaultTableModel table = (DefaultTableModel) TableQuartos.getModel();
            table.setNumRows(0);
            ArrayList<Quarto> lista = quarto.listarQuartos(numero);
            
            for (int num = 0; num <lista.size(); num++){
                if (lista.get(num).isOcupado() == true) {
                    table.addRow(new Object[]{
                        lista.get(num).getNúmero(),
                        lista.get(num).getAndar(),
                        lista.get(num).getCategoria(),
                        "Ocupado"
                    });
                } else{
                    table.addRow(new Object[]{
                        lista.get(num).getNúmero(),
                        lista.get(num).getAndar(),
                        lista.get(num).getCategoria(),
                        "Desocupado"
                    });
                }
            }
        } catch (SQLException erro)  {
            JOptionPane.showMessageDialog(null, erro);
        }
        quarto.closeConn();
    }//GEN-LAST:event_btnBuscarQuartoActionPerformed

    private void btnBuscarHospedeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarHospedeActionPerformed
          //Procurar os Hospedes
        
        String documento = txtDocumentoHospede.getText();
        try {
            DefaultTableModel table = (DefaultTableModel) TableHospedes.getModel();
            table.setNumRows(0);
            ArrayList<Hospede> lista = hospedesController.listarHospedes(documento);
            for (int num = 0; num <lista.size(); num++){
                table.addRow(new Object[]{
                    lista.get(num).getId(),
                    lista.get(num).getNome(),
                    lista.get(num).getTelefone(),
                    lista.get(num).getEmail(),
                    lista.get(num).getDocumento()
                });
            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, erro);
        }
        
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

    private void btnLimparSelecionadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparSelecionadoActionPerformed
        this.limparFormulario();
        this.usuarioSelecionado = null;
    }//GEN-LAST:event_btnLimparSelecionadoActionPerformed

    private void btnConfirmUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmUsuarioActionPerformed
        boolean isValid = this.isFormValid();
        if (this.usuarioSelecionado == null && isValid) {
            this.createUsuario();
        } else if (isValid) {
            this.editUsuario();
        }
    }//GEN-LAST:event_btnConfirmUsuarioActionPerformed

    private void btnDeletarSelecionadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarSelecionadoActionPerformed
        if (this.usuarioSelecionado == null) {
            JOptionPane.showMessageDialog(pnlContent, "Escolha o usuário existente para deletar.");
        } else {
            int id = this.usuarioSelecionado.get().getId();
            int res = this.userController.deleteUsuario(id);
            if (res == 1) {
                JOptionPane.showMessageDialog(pnlContent, "Usuário deletado com sucesso.");
                this.limparFormulario();
            } else {
                JOptionPane.showMessageDialog(pnlContent, "Houve um erro ao deletar o usuário.");
            }
        }
    }//GEN-LAST:event_btnDeletarSelecionadoActionPerformed

    private void btnReservasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReservasActionPerformed
        cardLayout.show(pnlContent, "pnlReservas");
    }//GEN-LAST:event_btnReservasActionPerformed

    private void btnCriarReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCriarReservaActionPerformed
        this.cadReserva = new CadReserva();
        cadReserva.setVisible(true);
    }//GEN-LAST:event_btnCriarReservaActionPerformed

    private void btnBuscarReservasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarReservasActionPerformed
        String documento = txtDocReserva.getText();
        
        if (documento.equals("")) {
            try {
                DefaultTableModel table = (DefaultTableModel) tableReservas.getModel();
                table.setRowCount(0);
                
                this.reservaController.listarReservas();
                
                for(Reserva reserva: this.reservaController.getReservas()){
                    table.addRow(new Object[]{
                        reserva.getId(),
                        reserva.getQuarto(),
                        reserva.getHospede(),
                        reserva.getEntrada(),
                        reserva.getSaida()
                    });
                }
                
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(pnlContent, "Houve um erro na listagem.", "Erro na Listagem", JOptionPane.ERROR_MESSAGE);
            } 
        } else {
            try {
                DefaultTableModel table = (DefaultTableModel) tableReservas.getModel();
                table.setRowCount(0);
                
                this.reservaController.buscaReserva(documento);
                
                for(Reserva reserva: this.reservaController.getReservas()){
                    table.addRow(new Object[]{
                        reserva.getId(),
                        reserva.getQuarto(),
                        reserva.getHospede(),
                        reserva.getEntrada(),
                        reserva.getSaida()
                    });
                }
                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(pnlContent, "Houve um erro na busca.", "Erro na Busca", JOptionPane.ERROR_MESSAGE);
            } 
        }
    }//GEN-LAST:event_btnBuscarReservasActionPerformed

    private void btnAtualizaReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizaReservaActionPerformed
        String documento = txtDocReserva.getText();
        
        Reserva reserva = this.reservaSelecionada;
        
        this.cadReserva = new CadReserva(reserva.getId(),reserva.getQuarto(), documento, reserva.getEntrada(), reserva.getSaida());
        cadReserva.setVisible(true);
    }//GEN-LAST:event_btnAtualizaReservaActionPerformed

    private void btnDeletaReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletaReservaActionPerformed
        int id = reservaSelecionada.getId();
        try {
            int status = reservaController.deleteReserva(id);
            
            if (status == 1) {
                JOptionPane.showMessageDialog(null, "Reserva apagada com sucesso!", "Sucesso.", JOptionPane.DEFAULT_OPTION);
            } else { 
                JOptionPane.showMessageDialog(null, "Houve um erro ao apagar a reserva.", "Erro ao apagar.", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Houve um erro ao apagar.", "Erro ao apagar.", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnDeletaReservaActionPerformed

    private void btnLimparReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparReservaActionPerformed
        limparReserva();
    }//GEN-LAST:event_btnLimparReservaActionPerformed

    private void tableReservasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableReservasMouseClicked
        DefaultTableModel table = (DefaultTableModel) tableReservas.getModel();
        
        this.reservaSelecionada = new Reserva();
        
        this.reservaSelecionada.setId(Integer.parseInt(table.getValueAt(tableReservas.getSelectedRow(), 0).toString()));
        this.reservaSelecionada.setQuarto(Integer.parseInt(tableReservas.getValueAt(tableReservas.getSelectedRow(), 1).toString()));
        this.reservaSelecionada.setHospede(tableReservas.getValueAt(tableReservas.getSelectedRow(), 2).toString());
        this.reservaSelecionada.setEntrada(tableReservas.getValueAt(tableReservas.getSelectedRow(), 3).toString());
        this.reservaSelecionada.setSaida(tableReservas.getValueAt(tableReservas.getSelectedRow(), 4).toString());
    }//GEN-LAST:event_tableReservasMouseClicked

    private void btnCadastrarHospedeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarHospedeActionPerformed
        CadHospede hospede = new CadHospede();
        hospede.setVisible(true);
    }//GEN-LAST:event_btnCadastrarHospedeActionPerformed

    private void TableHospedesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableHospedesMouseClicked
        DefaultTableModel table = (DefaultTableModel) TableHospedes.getModel();
        
        this.hospedeSelecionado = new Hospede();
        
        this.hospedeSelecionado.setId(
                Integer.parseInt(table.getValueAt(TableHospedes.getSelectedRow(), 0).toString()));
        this.hospedeSelecionado.setDocumento(
                table.getValueAt(TableHospedes.getSelectedRow(), 4).toString());
        this.hospedeSelecionado.setNome(
                table.getValueAt(TableHospedes.getSelectedRow(), 1).toString());
        this.hospedeSelecionado.setEmail(
                table.getValueAt(TableHospedes.getSelectedRow(), 3).toString());
        this.hospedeSelecionado.setTelefone(
                table.getValueAt(TableHospedes.getSelectedRow(), 2).toString());
    }//GEN-LAST:event_TableHospedesMouseClicked
    private void btnLimparQuartoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparQuartoActionPerformed
        // TODO add your handling code here:
        spnBuscaQuarto.setValue(0);
        DefaultTableModel table = (DefaultTableModel) TableQuartos.getModel();
        table.setRowCount(0);
    }//GEN-LAST:event_btnLimparQuartoActionPerformed

    private void btnCriarQuartoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCriarQuartoActionPerformed
        // TODO add your handling code here:
        this.cadQuarto = new CadQuarto();
        cadQuarto.setVisible(true);
    }//GEN-LAST:event_btnCriarQuartoActionPerformed

    private void btnAtualizarQuartoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarQuartoActionPerformed
        // TODO add your handling code here:  
        Quarto quarto = this.quartoSelecionado;
        
        this.cadQuarto = new CadQuarto(quarto.getNúmero(),quarto.getAndar(), quarto.isOcupado(), quarto.getCategoria());
        cadQuarto.setVisible(true);
    }//GEN-LAST:event_btnAtualizarQuartoActionPerformed

    private void btnDeletarQuartoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarQuartoActionPerformed
        // TODO add your handling code here:
        int numero = quartoSelecionado.getNúmero();
        try {
            int status = quartoController.deleteQuarto(numero);
            
            if (status == 1) {
                JOptionPane.showMessageDialog(null, "Quarto apagado com sucesso!", "Sucesso.", JOptionPane.DEFAULT_OPTION);
            } else { 
                JOptionPane.showMessageDialog(null, "Houve um erro ao apagar o quarto.", "Erro ao apagar.", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Houve um erro ao apagar.", "Erro ao apagar.", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnDeletarQuartoActionPerformed

    private void TableQuartosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableQuartosMouseClicked
        // TODO add your handling code here:
        DefaultTableModel table = (DefaultTableModel) TableQuartos.getModel();
        
        this.quartoSelecionado = new Quarto();
        
        this.quartoSelecionado.setNúmero(Integer.parseInt(table.getValueAt(TableQuartos.getSelectedRow(), 0).toString()));
        this.quartoSelecionado.setAndar(Integer.parseInt(TableQuartos.getValueAt(TableQuartos.getSelectedRow(), 1).toString()));
        this.quartoSelecionado.setCategoria(TableQuartos.getValueAt(TableQuartos.getSelectedRow(), 2).toString());
        if (TableQuartos.getValueAt(TableQuartos.getSelectedRow(), 3).toString().equals("Ocupado")){
            this.quartoSelecionado.setOcupado(true);
        } else {
            this.quartoSelecionado.setOcupado(false);
        }
    }//GEN-LAST:event_TableQuartosMouseClicked

    private void btnDeletarHospedeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarHospedeActionPerformed
        this.hospedesController.deleteHospede(this.hospedeSelecionado.getId());
        JOptionPane.showMessageDialog(pnlContent, "Hóspede deletado com sucesso");
    }//GEN-LAST:event_btnDeletarHospedeActionPerformed

    private void btnAtualizarHospedeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarHospedeActionPerformed
        CadHospede cadHospede = new CadHospede(
                this.hospedeSelecionado.getId(),
                this.hospedeSelecionado.getNome(),
                this.hospedeSelecionado.getTelefone(),
                this.hospedeSelecionado.getEmail(),
                this.hospedeSelecionado.getDocumento()
        );
        cadHospede.setVisible(true);
    }//GEN-LAST:event_btnAtualizarHospedeActionPerformed

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
    
    public void createUsuario() {
        Usuario usuario = this.montarUsuario();
        int status = this.userController.createUsuario(usuario);
        
        if (status == 1) {
            JOptionPane.showMessageDialog(pnlContent, "Usuário criado com sucesso.");
        } else {
            JOptionPane.showMessageDialog(pnlContent, "Houve um problema ao criar o usuário.");
        }
    }
    
    public void editUsuario() {
        Usuario usuario = this.montarUsuario();
        usuario.setId(this.usuarioSelecionado.get().getId());
        
        boolean status = this.userController.updateUsuario(usuario);
        
        if (status) {
            JOptionPane.showMessageDialog(pnlContent, "Usuário atualizado com sucesso.");
        } else {
            JOptionPane.showMessageDialog(pnlContent, "Erro ao editar usuário.");
        }
    }
    
    public boolean isFormValid() {
        boolean isEmpty = this.txtUsername.getText().equals("")
                || this.txtNomeCompleto.getText().equals("")
                || new String(this.txtSenha.getPassword()).equals("")
                || this.groupCargo.getSelection() == null;
        if (isEmpty) {
            JOptionPane.showMessageDialog(pnlContent, "Complete todos os campos.");
            return false; 
        } else {
            return true;
        }
    }
    
    public void limparFormulario() {
        this.txtUsername.setText("");
        this.txtNomeCompleto.setText("");
        this.txtSenha.setText("");
        this.radioAdmin.setSelected(false);
        this.radioFuncionario.setSelected(false);
    }
    
    public Usuario montarUsuario() {
        Usuario usuario = new Usuario(
                this.txtNomeCompleto.getText(),
                this.txtUsername.getText(), 
                new String(this.txtSenha.getPassword()), 
                this.radioAdmin.isSelected() ? "Gerente" : "Funcionário");
               
        return usuario;
    }
    
    public void limparReserva(){
        txtDocReserva.setText("");
        DefaultTableModel table = (DefaultTableModel) tableReservas.getModel();
        table.setRowCount(0);
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
    private javax.swing.JTable TableHospedes;
    private javax.swing.JTable TableQuartos;
    private javax.swing.JButton btnAtualizaReserva;
    private javax.swing.JButton btnAtualizarHospede;
    private javax.swing.JButton btnAtualizarQuarto;
    private javax.swing.JButton btnBuscarHospede;
    private javax.swing.JButton btnBuscarQuarto;
    private javax.swing.JButton btnBuscarReservas;
    private javax.swing.JButton btnBuscarUsuario;
    private javax.swing.JButton btnCadastrarHospede;
    private javax.swing.JButton btnConfirmUsuario;
    private javax.swing.JButton btnCriarQuarto;
    private javax.swing.JButton btnCriarReserva;
    private javax.swing.JButton btnDeletaReserva;
    private javax.swing.JButton btnDeletarHospede;
    private javax.swing.JButton btnDeletarQuarto;
    private javax.swing.JButton btnDeletarSelecionado;
    private javax.swing.JButton btnHospedes;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnLimparQuarto;
    private javax.swing.JButton btnLimparReserva;
    private javax.swing.JButton btnLimparSelecionado;
    private javax.swing.JButton btnQuartos;
    private javax.swing.JButton btnReservas;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnUsuarios;
    private javax.swing.ButtonGroup groupCargo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JLabel lblBemVindo;
    private javax.swing.JLabel lblBemVindoDesc;
    private javax.swing.JLabel lblCargo;
    private javax.swing.JLabel lblDescHospedes;
    private javax.swing.JLabel lblDescQuartos;
    private javax.swing.JLabel lblDescReservas;
    private javax.swing.JLabel lblDescUsuarios;
    private javax.swing.JLabel lblFundoDefault;
    private javax.swing.JLabel lblFundoHospedes;
    private javax.swing.JLabel lblFundoQuartos;
    private javax.swing.JLabel lblFundoReservas;
    private javax.swing.JLabel lblFundoUsuarios;
    private javax.swing.JLabel lblNomeCompleto;
    private javax.swing.JLabel lblNovoUsuario;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblSidenavBg;
    private javax.swing.JLabel lblTituloHospedes;
    private javax.swing.JLabel lblTituloQuartos;
    private javax.swing.JLabel lblTituloReservas;
    private javax.swing.JLabel lblTituloUsuarios;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JPanel pnlContent;
    private javax.swing.JPanel pnlDefault;
    private javax.swing.JPanel pnlHospedes;
    private javax.swing.JPanel pnlQuartos;
    private javax.swing.JPanel pnlReservas;
    private javax.swing.JPanel pnlSideNav;
    private javax.swing.JPanel pnlUsuario;
    private javax.swing.JPanel pnlUsuarios;
    private javax.swing.JRadioButton radioAdmin;
    private javax.swing.JRadioButton radioFuncionario;
    private javax.swing.JSpinner spnBuscaQuarto;
    private javax.swing.JTable tableReservas;
    private javax.swing.JTable tableUsuarios;
    private javax.swing.JTextField txtDocReserva;
    private javax.swing.JTextField txtDocumentoHospede;
    private javax.swing.JTextField txtNomeCompleto;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JTextField txtUsername;
    private javax.swing.JTextField txtUsernameBusca;
    // End of variables declaration//GEN-END:variables
}
