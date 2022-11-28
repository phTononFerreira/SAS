package com.sas.view;

import com.sas.controller.AtendenteController;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.table.DefaultTableModel;

public class JanAtendente extends javax.swing.JFrame {

    private static JanAtendente unicoJanAtendente;
    private static String ID;
    private static String consultaID;
    private Boolean Muser=false;
    
    

    CardLayout cardLayout;
    
    public String getId(){
        return ID;
    }
    
    public static void setId(String ID1){
        ID = ID1;
    }
    
    public String getConsultaID(){
        return consultaID;
    }
    
    public static void setConsultaID(String consultaID1){
        consultaID = consultaID1;
    }

    public JanAtendente() {
        initComponents();
        cardLayout = (CardLayout) (panCardsAtendente.getLayout());
        this.setExtendedState(MAXIMIZED_BOTH);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setSize(dim.width / 2, dim.height / 2);
        carregaTabela();
    }

    public static JanAtendente getJanAtendente() {
        if (unicoJanAtendente == null) {
            unicoJanAtendente = new JanAtendente();
        }
        return unicoJanAtendente;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panTop = new javax.swing.JPanel();
        labAgenConsulta = new javax.swing.JLabel();
        labLogo = new javax.swing.JLabel();
        labCadPaciente = new javax.swing.JLabel();
        labConsulta = new javax.swing.JLabel();
        panUser = new javax.swing.JPanel();
        labUserImage = new javax.swing.JLabel();
        labUser = new javax.swing.JLabel();
        labLogout = new javax.swing.JLabel();
        labLogout.setVisible(false);
        panCardsAtendente = new javax.swing.JPanel();
        cardConsulta = new javax.swing.JPanel();
        panInformacoes = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabPaciente = new javax.swing.JTable();
        btRefresh1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btEncaminhar = new javax.swing.JButton();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        btEncaminhar1 = new javax.swing.JButton();
        cardCadastro = new javax.swing.JPanel();
        btAlterar = new javax.swing.JButton();
        panTabela = new javax.swing.JPanel();
        labNome = new javax.swing.JLabel();
        tfNome = new javax.swing.JTextField();
        tfCPF = new javax.swing.JTextField();
        labCPF = new javax.swing.JLabel();
        tfDataNasc = new javax.swing.JTextField();
        labDataNasc = new javax.swing.JLabel();
        labEndereco = new javax.swing.JLabel();
        tfEndereco = new javax.swing.JTextField();
        tfTelefone = new javax.swing.JTextField();
        lbTelefone = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btLimpar = new javax.swing.JButton();
        cardAgendarConsulta = new javax.swing.JPanel();
        panAgendar = new javax.swing.JPanel();
        lanSelPaciente = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabSelPaciente1 = new javax.swing.JTable();
        btlRefreshPac = new javax.swing.JButton();
        tfNomePac = new javax.swing.JTextField();
        btNomePesquisaPac = new javax.swing.JButton();
        labNomePesquisaPac = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabSelMedico = new javax.swing.JTable();
        btRefreshMed = new javax.swing.JButton();
        btNomePesquisa1 = new javax.swing.JButton();
        tfNomeMed = new javax.swing.JTextField();
        labNomePesquisaMed = new javax.swing.JLabel();
        lanSelMed = new javax.swing.JLabel();
        tfAgenData = new javax.swing.JTextField();
        labAgenData = new javax.swing.JLabel();
        tfAgenHora = new javax.swing.JTextField();
        labAgenData1 = new javax.swing.JLabel();
        btAgendar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Atendimento");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        panTop.setBackground(new java.awt.Color(255, 255, 255));
        panTop.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 5, 0, new java.awt.Color(249, 100, 100)));

        labAgenConsulta.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        labAgenConsulta.setText("Agendar Consulta");
        labAgenConsulta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labAgenConsulta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labAgenConsultaMouseClicked(evt);
            }
        });

        labLogo.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("https://www.dropbox.com/s/lz6r501j7qgsv2u/logoSAS_2_15.png?dl=1")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());

        labCadPaciente.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        labCadPaciente.setText("Cadastrar Pacientes");
        labCadPaciente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labCadPaciente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labCadPacienteMouseClicked(evt);
            }
        });

        labConsulta.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        labConsulta.setText("Consultas");
        labConsulta.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(249, 100, 100)));
        labConsulta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labConsulta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labConsultaMouseClicked(evt);
            }
        });

        panUser.setBackground(new java.awt.Color(255, 255, 255));

        labUserImage.setForeground(new java.awt.Color(255, 0, 0));
        labUserImage.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("https://media.discordapp.net/attachments/445732137623224331/1042497769484591114/icone_atendente_SAS.png?width=40&height=40")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
        labUserImage.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labUserImage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labUserImageMouseClicked(evt);
            }
        });

        labUser.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        labUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labUser.setText("Atendente");
        labUser.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labUserMouseClicked(evt);
            }
        });

        labLogout.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labLogout.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labLogout.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("https://media.discordapp.net/attachments/445732137623224331/1042833350861267045/log-out.png?width=15&height=15")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
        labLogout.setText("SAIR");
        labLogout.setToolTipText("");
        labLogout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labLogoutMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panUserLayout = new javax.swing.GroupLayout(panUser);
        panUser.setLayout(panUserLayout);
        panUserLayout.setHorizontalGroup(
            panUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panUserLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labUserImage)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labLogout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labUser, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE))
                .addGap(30, 30, 30))
        );
        panUserLayout.setVerticalGroup(
            panUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panUserLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labUser, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labUserImage))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labLogout)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panTopLayout = new javax.swing.GroupLayout(panTop);
        panTop.setLayout(panTopLayout);
        panTopLayout.setHorizontalGroup(
            panTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panTopLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(labLogo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labConsulta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labAgenConsulta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labCadPaciente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panTopLayout.setVerticalGroup(
            panTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panTopLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(panTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labConsulta)
                    .addComponent(labCadPaciente)
                    .addComponent(labAgenConsulta))
                .addContainerGap(54, Short.MAX_VALUE))
            .addGroup(panTopLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(panUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panCardsAtendente.setPreferredSize(new java.awt.Dimension(1920, 1080));
        panCardsAtendente.setLayout(new java.awt.CardLayout());

        cardConsulta.setBackground(new java.awt.Color(231, 231, 231));
        cardConsulta.setName(""); // NOI18N

        panInformacoes.setBackground(new java.awt.Color(255, 255, 255));
        panInformacoes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(249, 100, 100)));
        panInformacoes.setPreferredSize(new java.awt.Dimension(1239, 838));

        jScrollPane1.setBorder(null);
        jScrollPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        tabPaciente.setBackground(new java.awt.Color(242, 242, 242));
        tabPaciente.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        tabPaciente.setForeground(new java.awt.Color(51, 51, 51));
        tabPaciente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Código", "Paciente", "Horário da Consulta"
            }
        ));
        tabPaciente.setGridColor(new java.awt.Color(204, 204, 204));
        tabPaciente.setMinimumSize(new java.awt.Dimension(0, 0));
        tabPaciente.setRowHeight(30);
        tabPaciente.setRowMargin(7);
        tabPaciente.setSelectionBackground(new java.awt.Color(196, 67, 67));
        tabPaciente.setShowGrid(true);
        tabPaciente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tabPacienteMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tabPaciente);

        btRefresh1.setBackground(new java.awt.Color(249, 100, 100));
        btRefresh1.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        btRefresh1.setForeground(new java.awt.Color(255, 255, 255));
        btRefresh1.setText("🔄");
        btRefresh1.setToolTipText("Atualizar Tabela");
        btRefresh1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btRefresh1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRefresh1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("CONSULTAS");

        javax.swing.GroupLayout panInformacoesLayout = new javax.swing.GroupLayout(panInformacoes);
        panInformacoes.setLayout(panInformacoesLayout);
        panInformacoesLayout.setHorizontalGroup(
            panInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panInformacoesLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btRefresh1)
                .addGap(30, 30, 30))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panInformacoesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1213, Short.MAX_VALUE)
                .addContainerGap())
        );
        panInformacoesLayout.setVerticalGroup(
            panInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panInformacoesLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(panInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btRefresh1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1)
                .addGap(29, 29, 29))
        );

        btEncaminhar.setBackground(new java.awt.Color(249, 100, 100));
        btEncaminhar.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btEncaminhar.setForeground(new java.awt.Color(255, 255, 255));
        btEncaminhar.setText("ENCAMINHAR PARA TRIAGEM");
        btEncaminhar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btEncaminhar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEncaminharActionPerformed(evt);
            }
        });

        btEncaminhar1.setBackground(new java.awt.Color(249, 100, 100));
        btEncaminhar1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btEncaminhar1.setForeground(new java.awt.Color(255, 255, 255));
        btEncaminhar1.setText("CANCELAR CONSULTA");
        btEncaminhar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btEncaminhar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEncaminhar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout cardConsultaLayout = new javax.swing.GroupLayout(cardConsulta);
        cardConsulta.setLayout(cardConsultaLayout);
        cardConsultaLayout.setHorizontalGroup(
            cardConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardConsultaLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(panInformacoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(cardConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cardConsultaLayout.createSequentialGroup()
                        .addGap(325, 325, 325)
                        .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(334, Short.MAX_VALUE))
                    .addGroup(cardConsultaLayout.createSequentialGroup()
                        .addGroup(cardConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btEncaminhar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btEncaminhar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        cardConsultaLayout.setVerticalGroup(
            cardConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardConsultaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cardConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cardConsultaLayout.createSequentialGroup()
                        .addComponent(panInformacoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(80, 80, 80))
                    .addGroup(cardConsultaLayout.createSequentialGroup()
                        .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 324, Short.MAX_VALUE)
                        .addComponent(btEncaminhar1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btEncaminhar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(396, Short.MAX_VALUE))))
        );

        panCardsAtendente.add(cardConsulta, "cardConsulta");

        cardCadastro.setBackground(new java.awt.Color(231, 231, 231));

        btAlterar.setBackground(new java.awt.Color(249, 100, 100));
        btAlterar.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btAlterar.setForeground(new java.awt.Color(255, 255, 255));
        btAlterar.setText("CADASTRAR");
        btAlterar.setBorder(null);
        btAlterar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlterarActionPerformed(evt);
            }
        });

        panTabela.setBackground(new java.awt.Color(255, 255, 255));
        panTabela.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(249, 100, 100), 1, true));

        labNome.setText("NOME*");

        tfNome.setBackground(new java.awt.Color(242, 242, 242));
        tfNome.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(249, 100, 100)));

        tfCPF.setBackground(new java.awt.Color(242, 242, 242));
        tfCPF.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(249, 100, 100)));

        labCPF.setText("CPF*");
        labCPF.setToolTipText("");

        tfDataNasc.setBackground(new java.awt.Color(242, 242, 242));
        tfDataNasc.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(249, 100, 100)));

        labDataNasc.setText("<html>DATA DE NASCIMENTO*<br />DD/MM/AAAA</html>");

        labEndereco.setText("ENDEREÇO");

        tfEndereco.setBackground(new java.awt.Color(242, 242, 242));
        tfEndereco.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(249, 100, 100)));

        tfTelefone.setBackground(new java.awt.Color(242, 242, 242));
        tfTelefone.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(249, 100, 100)));

        lbTelefone.setText("TELEFONE");

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel1.setText("CADASTRO DE PACIENTES");

        btLimpar.setBackground(new java.awt.Color(249, 100, 100));
        btLimpar.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btLimpar.setForeground(new java.awt.Color(255, 255, 255));
        btLimpar.setText("LIMPAR");
        btLimpar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panTabelaLayout = new javax.swing.GroupLayout(panTabela);
        panTabela.setLayout(panTabelaLayout);
        panTabelaLayout.setHorizontalGroup(
            panTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panTabelaLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(panTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panTabelaLayout.createSequentialGroup()
                        .addComponent(jSeparator1)
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panTabelaLayout.createSequentialGroup()
                        .addGroup(panTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panTabelaLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panTabelaLayout.createSequentialGroup()
                                .addGroup(panTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfNome)
                                    .addGroup(panTabelaLayout.createSequentialGroup()
                                        .addGroup(panTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(labNome)
                                            .addComponent(jLabel1)
                                            .addGroup(panTabelaLayout.createSequentialGroup()
                                                .addGroup(panTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(labDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(tfDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(panTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(lbTelefone)
                                                    .addComponent(tfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGap(0, 4, Short.MAX_VALUE)))
                                .addGap(18, 18, 18)
                                .addGroup(panTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labCPF)
                                    .addComponent(tfCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labEndereco)
                                    .addComponent(tfEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(292, 292, 292))))
        );
        panTabelaLayout.setVerticalGroup(
            panTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panTabelaLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addGroup(panTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panTabelaLayout.createSequentialGroup()
                        .addComponent(labCPF)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panTabelaLayout.createSequentialGroup()
                        .addComponent(labNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(41, 41, 41)
                .addGroup(panTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panTabelaLayout.createSequentialGroup()
                        .addComponent(labEndereco)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panTabelaLayout.createSequentialGroup()
                        .addComponent(labDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panTabelaLayout.createSequentialGroup()
                        .addComponent(lbTelefone)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(btLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(531, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout cardCadastroLayout = new javax.swing.GroupLayout(cardCadastro);
        cardCadastro.setLayout(cardCadastroLayout);
        cardCadastroLayout.setHorizontalGroup(
            cardCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardCadastroLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(panTabela, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20)
                .addComponent(btAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, 771, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );
        cardCadastroLayout.setVerticalGroup(
            cardCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardCadastroLayout.createSequentialGroup()
                .addContainerGap(421, Short.MAX_VALUE)
                .addComponent(btAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(420, Short.MAX_VALUE))
            .addGroup(cardCadastroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panTabela, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(15, 15, 15))
        );

        panCardsAtendente.add(cardCadastro, "cardCadastro");

        cardAgendarConsulta.setPreferredSize(new java.awt.Dimension(1920, 1080));

        panAgendar.setBackground(new java.awt.Color(255, 255, 255));
        panAgendar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(249, 100, 100)));
        panAgendar.setMinimumSize(new java.awt.Dimension(0, 0));

        lanSelPaciente.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        lanSelPaciente.setText("SELECIONAR PACIENTE");

        jScrollPane2.setBorder(null);
        jScrollPane2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        tabSelPaciente1.setBackground(new java.awt.Color(242, 242, 242));
        tabSelPaciente1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        tabSelPaciente1.setForeground(new java.awt.Color(51, 51, 51));
        tabSelPaciente1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Paciente"
            }
        ));
        tabSelPaciente1.setGridColor(new java.awt.Color(204, 204, 204));
        tabSelPaciente1.setRowHeight(30);
        tabSelPaciente1.setRowMargin(7);
        tabSelPaciente1.setSelectionBackground(new java.awt.Color(196, 67, 67));
        tabSelPaciente1.setShowGrid(true);
        tabSelPaciente1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tabSelPaciente1MousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(tabSelPaciente1);

        btlRefreshPac.setBackground(new java.awt.Color(249, 100, 100));
        btlRefreshPac.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        btlRefreshPac.setForeground(new java.awt.Color(255, 255, 255));
        btlRefreshPac.setText("🔄");
        btlRefreshPac.setToolTipText("Atualizar Tabela");
        btlRefreshPac.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btlRefreshPac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btlRefreshPacActionPerformed(evt);
            }
        });

        tfNomePac.setBackground(new java.awt.Color(242, 242, 242));
        tfNomePac.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(249, 100, 100)));

        btNomePesquisaPac.setBackground(new java.awt.Color(249, 100, 100));
        btNomePesquisaPac.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btNomePesquisaPac.setForeground(new java.awt.Color(255, 255, 255));
        btNomePesquisaPac.setText("PESQUISAR");
        btNomePesquisaPac.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btNomePesquisaPac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNomePesquisaPacActionPerformed(evt);
            }
        });

        labNomePesquisaPac.setText("NOME");

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(51, 51, 51));

        jScrollPane3.setBorder(null);
        jScrollPane3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        tabSelMedico.setBackground(new java.awt.Color(242, 242, 242));
        tabSelMedico.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        tabSelMedico.setForeground(new java.awt.Color(51, 51, 51));
        tabSelMedico.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Médico"
            }
        ));
        tabSelMedico.setGridColor(new java.awt.Color(204, 204, 204));
        tabSelMedico.setRowHeight(30);
        tabSelMedico.setRowMargin(7);
        tabSelMedico.setSelectionBackground(new java.awt.Color(196, 67, 67));
        tabSelMedico.setShowGrid(true);
        tabSelMedico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tabSelMedicoMousePressed(evt);
            }
        });
        jScrollPane3.setViewportView(tabSelMedico);

        btRefreshMed.setBackground(new java.awt.Color(249, 100, 100));
        btRefreshMed.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        btRefreshMed.setForeground(new java.awt.Color(255, 255, 255));
        btRefreshMed.setText("🔄");
        btRefreshMed.setToolTipText("Atualizar Tabela");
        btRefreshMed.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btRefreshMed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRefreshMedActionPerformed(evt);
            }
        });

        btNomePesquisa1.setBackground(new java.awt.Color(249, 100, 100));
        btNomePesquisa1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btNomePesquisa1.setForeground(new java.awt.Color(255, 255, 255));
        btNomePesquisa1.setText("PESQUISAR");
        btNomePesquisa1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btNomePesquisa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNomePesquisa1ActionPerformed(evt);
            }
        });

        tfNomeMed.setBackground(new java.awt.Color(242, 242, 242));
        tfNomeMed.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(249, 100, 100)));

        labNomePesquisaMed.setText("NOME");

        lanSelMed.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        lanSelMed.setText("SELECIONAR MÉDICO");

        tfAgenData.setBackground(new java.awt.Color(242, 242, 242));
        tfAgenData.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(249, 100, 100)));

        labAgenData.setText("HORA DA CONSULTA");

        tfAgenHora.setBackground(new java.awt.Color(242, 242, 242));
        tfAgenHora.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(249, 100, 100)));

        labAgenData1.setText("<html>DATA DA CONSULTA<br />DD/MM/AAAA</html>");

        javax.swing.GroupLayout panAgendarLayout = new javax.swing.GroupLayout(panAgendar);
        panAgendar.setLayout(panAgendarLayout);
        panAgendarLayout.setHorizontalGroup(
            panAgendarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panAgendarLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(panAgendarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panAgendarLayout.createSequentialGroup()
                        .addGroup(panAgendarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panAgendarLayout.createSequentialGroup()
                                .addGroup(panAgendarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panAgendarLayout.createSequentialGroup()
                                        .addComponent(lanSelPaciente)
                                        .addGap(509, 509, 509))
                                    .addGroup(panAgendarLayout.createSequentialGroup()
                                        .addGroup(panAgendarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(panAgendarLayout.createSequentialGroup()
                                                .addGroup(panAgendarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(labNomePesquisaPac)
                                                    .addGroup(panAgendarLayout.createSequentialGroup()
                                                        .addComponent(tfNomePac, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(btNomePesquisaPac, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(18, 18, 18)
                                                .addComponent(btlRefreshPac))
                                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                        .addGap(272, 272, 272)))
                                .addGroup(panAgendarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panAgendarLayout.createSequentialGroup()
                                        .addGroup(panAgendarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(labNomePesquisaMed)
                                            .addGroup(panAgendarLayout.createSequentialGroup()
                                                .addComponent(tfNomeMed, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btNomePesquisa1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(18, 18, 18)
                                        .addComponent(btRefreshMed))
                                    .addGroup(panAgendarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panAgendarLayout.createSequentialGroup()
                                            .addComponent(lanSelMed)
                                            .addGap(237, 237, 237))
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                            .addComponent(jSeparator2))
                        .addGap(40, 40, 40))
                    .addGroup(panAgendarLayout.createSequentialGroup()
                        .addGroup(panAgendarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfAgenData, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labAgenData1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(65, 65, 65)
                        .addGroup(panAgendarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfAgenHora, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labAgenData))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        panAgendarLayout.setVerticalGroup(
            panAgendarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panAgendarLayout.createSequentialGroup()
                .addContainerGap(162, Short.MAX_VALUE)
                .addGroup(panAgendarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panAgendarLayout.createSequentialGroup()
                        .addComponent(lanSelPaciente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labNomePesquisaPac)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panAgendarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btlRefreshPac, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(btNomePesquisaPac, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tfNomePac, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panAgendarLayout.createSequentialGroup()
                        .addComponent(lanSelMed)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labNomePesquisaMed)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panAgendarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btRefreshMed, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(btNomePesquisa1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tfNomeMed, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(41, 41, 41)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panAgendarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labAgenData1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labAgenData, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panAgendarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfAgenData, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfAgenHora, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(512, 512, 512))
        );

        btAgendar.setBackground(new java.awt.Color(249, 100, 100));
        btAgendar.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        btAgendar.setForeground(new java.awt.Color(255, 255, 255));
        btAgendar.setText("AGENDAR");
        btAgendar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btAgendar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAgendarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout cardAgendarConsultaLayout = new javax.swing.GroupLayout(cardAgendarConsulta);
        cardAgendarConsulta.setLayout(cardAgendarConsultaLayout);
        cardAgendarConsultaLayout.setHorizontalGroup(
            cardAgendarConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardAgendarConsultaLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(panAgendar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btAgendar, javax.swing.GroupLayout.DEFAULT_SIZE, 614, Short.MAX_VALUE)
                .addContainerGap())
        );
        cardAgendarConsultaLayout.setVerticalGroup(
            cardAgendarConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardAgendarConsultaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panAgendar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(cardAgendarConsultaLayout.createSequentialGroup()
                .addGap(415, 415, 415)
                .addComponent(btAgendar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panCardsAtendente.add(cardAgendarConsulta, "cardAgendarConsulta");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panTop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panCardsAtendente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panTop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panCardsAtendente, javax.swing.GroupLayout.DEFAULT_SIZE, 931, Short.MAX_VALUE))
        );

        setBounds(0, 0, 1936, 1119);
    }// </editor-fold>//GEN-END:initComponents

    private void labCadPacienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labCadPacienteMouseClicked
        cardLayout.show(panCardsAtendente, "cardCadastro");
        labConsulta.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(249, 100, 100)));
        labCadPaciente.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(249, 100, 100)));
        labAgenConsulta.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(249, 100, 100)));
        labCadPaciente.setFont(new java.awt.Font("Verdana", 0, 18));
        labConsulta.setFont(new java.awt.Font("Verdana", 0, 14));
        labAgenConsulta.setFont(new java.awt.Font("Verdana", 0, 14));
    }//GEN-LAST:event_labCadPacienteMouseClicked

    private void labConsultaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labConsultaMouseClicked
        cardLayout.show(panCardsAtendente, "cardConsulta");
        labConsulta.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(249, 100, 100)));
        labCadPaciente.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(249, 100, 100)));
        labAgenConsulta.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(249, 100, 100)));
        labConsulta.setFont(new java.awt.Font("Verdana", 0, 18));
        labCadPaciente.setFont(new java.awt.Font("Verdana", 0, 14));
        labAgenConsulta.setFont(new java.awt.Font("Verdana", 0, 14));
    }//GEN-LAST:event_labConsultaMouseClicked

    private void btAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarActionPerformed
        cadastrarPaciente();
    }//GEN-LAST:event_btAlterarActionPerformed

    private void btEncaminharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEncaminharActionPerformed
        AtendenteController.cancelarConsulta(consultaID);
        carregaTabela();
    }//GEN-LAST:event_btEncaminharActionPerformed

    private void labUserImageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labUserImageMouseClicked
        logoutButton();
    }//GEN-LAST:event_labUserImageMouseClicked

    private void labUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labUserMouseClicked
        logoutButton();
    }//GEN-LAST:event_labUserMouseClicked

    private void labLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labLogoutMouseClicked
        sair();
    }//GEN-LAST:event_labLogoutMouseClicked

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        limpar();
    }//GEN-LAST:event_btLimparActionPerformed

    private void tabPacienteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabPacienteMousePressed
        setConsultaID(tabPaciente.getValueAt(tabPaciente.getSelectedRow(), 0).toString());          
    }//GEN-LAST:event_tabPacienteMousePressed

    private void btRefresh1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRefresh1ActionPerformed
        carregaTabela();
    }//GEN-LAST:event_btRefresh1ActionPerformed

    private void labAgenConsultaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labAgenConsultaMouseClicked
        cardLayout.show(panCardsAtendente, "cardAgendarConsulta");
        labConsulta.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(249, 100, 100)));
        labCadPaciente.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(249, 100, 100)));
        labAgenConsulta.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(249, 100, 100)));
        labConsulta.setFont(new java.awt.Font("Verdana", 0, 14));
        labCadPaciente.setFont(new java.awt.Font("Verdana", 0, 14));
        labAgenConsulta.setFont(new java.awt.Font("Verdana", 0, 18));
    }//GEN-LAST:event_labAgenConsultaMouseClicked

    private void tabSelPaciente1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabSelPaciente1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tabSelPaciente1MousePressed

    private void btlRefreshPacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btlRefreshPacActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btlRefreshPacActionPerformed

    private void btNomePesquisaPacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNomePesquisaPacActionPerformed
        /*pesquisaTabelaNome(rbAdministrador.isSelected(),rbAtendente.isSelected(),rbEnfermeira.isSelected(),rbMedico.isSelected());
        tfNomePac.setText("");
        tfNomePac.requestFocus();*/
    }//GEN-LAST:event_btNomePesquisaPacActionPerformed

    private void tabSelMedicoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabSelMedicoMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tabSelMedicoMousePressed

    private void btRefreshMedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRefreshMedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btRefreshMedActionPerformed

    private void btNomePesquisa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNomePesquisa1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btNomePesquisa1ActionPerformed

    private void btAgendarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAgendarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btAgendarActionPerformed

    private void btEncaminhar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEncaminhar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btEncaminhar1ActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated

    }//GEN-LAST:event_formWindowActivated

    
    public void logoutButton(){
        if(Muser){
            Muser=false;
            labLogout.setVisible(false);
        }
        else{
            Muser=true;
            labLogout.setVisible(true);
        }
    }
    
    
    
    
    
    public void setNomePerfil(String nome) {
        labUser.setText(nome);
    }

    public void sair(){
        this.dispose();
        limpar();
        labLogout.setVisible(false);
        JanLogin.getJanLogin().setVisible(true);
    }
    
    public void limpar(){
        tfNome.setText("");
        tfCPF.setText("");
        tfDataNasc.setText("");
        tfTelefone.setText("");
        tfEndereco.setText("");
        tfNome.requestFocus();
    }
    
    public void cadastrarPaciente(){
        String feedback = "";

        String nome = tfNome.getText();
        String[] data_nascimento = tfDataNasc.getText().split("/");
        String cpf = tfCPF.getText();
        String telefone = tfTelefone.getText();
        String endereco = tfEndereco.getText();

        feedback = AtendenteController.cadastrarPaciente(nome, data_nascimento, cpf, telefone, endereco);
        
        if(feedback == null){
            System.out.println("Deu certo cadastrar");
            limpar();
        }
        else
            System.out.println(feedback);
    }
    
    public void carregaTabela() {
        DefaultTableModel modelo = (DefaultTableModel) tabPaciente.getModel();
        modelo.setNumRows(0);
        
        AtendenteController.carregaTabela(modelo);
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
            java.util.logging.Logger.getLogger(JanAtendente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JanAtendente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JanAtendente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanAtendente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JanAtendente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAgendar;
    private javax.swing.JButton btAlterar;
    private javax.swing.JButton btEncaminhar;
    private javax.swing.JButton btEncaminhar1;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btNomePesquisa1;
    private javax.swing.JButton btNomePesquisaPac;
    private javax.swing.JButton btRefresh1;
    private javax.swing.JButton btRefreshMed;
    private javax.swing.JButton btlRefreshPac;
    private javax.swing.JPanel cardAgendarConsulta;
    private javax.swing.JPanel cardCadastro;
    private javax.swing.JPanel cardConsulta;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel labAgenConsulta;
    private javax.swing.JLabel labAgenData;
    private javax.swing.JLabel labAgenData1;
    private javax.swing.JLabel labCPF;
    private javax.swing.JLabel labCadPaciente;
    private javax.swing.JLabel labConsulta;
    private javax.swing.JLabel labDataNasc;
    private javax.swing.JLabel labEndereco;
    private javax.swing.JLabel labLogo;
    private javax.swing.JLabel labLogout;
    private javax.swing.JLabel labNome;
    private javax.swing.JLabel labNomePesquisaMed;
    private javax.swing.JLabel labNomePesquisaPac;
    private javax.swing.JLabel labUser;
    private javax.swing.JLabel labUserImage;
    private javax.swing.JLabel lanSelMed;
    private javax.swing.JLabel lanSelPaciente;
    private javax.swing.JLabel lbTelefone;
    private javax.swing.JPanel panAgendar;
    private javax.swing.JPanel panCardsAtendente;
    private javax.swing.JPanel panInformacoes;
    private javax.swing.JPanel panTabela;
    private javax.swing.JPanel panTop;
    private javax.swing.JPanel panUser;
    private javax.swing.JTable tabPaciente;
    private javax.swing.JTable tabSelMedico;
    private javax.swing.JTable tabSelPaciente1;
    private javax.swing.JTextField tfAgenData;
    private javax.swing.JTextField tfAgenHora;
    private javax.swing.JTextField tfCPF;
    private javax.swing.JTextField tfDataNasc;
    private javax.swing.JTextField tfEndereco;
    private javax.swing.JTextField tfNome;
    private javax.swing.JTextField tfNomeMed;
    private javax.swing.JTextField tfNomePac;
    private javax.swing.JTextField tfTelefone;
    // End of variables declaration//GEN-END:variables
}
