package com.sas.view;

import java.awt.CardLayout;

public class JanAtendente extends javax.swing.JFrame {

    private static JanAtendente unicoJanAtendente;
    private static String ID;
    private Boolean Muser=false;

    CardLayout cardLayout;
    
    public String getId(){
        return ID;
    }
    
    public static void setId(String ID1){
        ID = ID1;
    }

    public JanAtendente() {
        initComponents();
        cardLayout = (CardLayout) (panCardsAtendente.getLayout());
        this.setExtendedState(MAXIMIZED_BOTH);
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
        btCriar = new javax.swing.JButton();
        panInformacoes = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabPaciente = new javax.swing.JTable();
        btRefresh1 = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        btIniciarTriagem = new javax.swing.JButton();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
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

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Atendimento");
        setMinimumSize(new java.awt.Dimension(950, 600));

        panTop.setBackground(new java.awt.Color(255, 255, 255));
        panTop.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 5, 0, new java.awt.Color(249, 100, 100)));

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
                .addGap(140, 140, 140)
                .addComponent(labCadPaciente)
                .addGap(469, 469, 469)
                .addComponent(panUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panTopLayout.setVerticalGroup(
            panTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panTopLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(panTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labConsulta)
                    .addComponent(labCadPaciente))
                .addContainerGap(54, Short.MAX_VALUE))
            .addGroup(panTopLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(panUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panCardsAtendente.setLayout(new java.awt.CardLayout());

        cardConsulta.setBackground(new java.awt.Color(231, 231, 231));
        cardConsulta.setName(""); // NOI18N

        btCriar.setBackground(new java.awt.Color(249, 100, 100));
        btCriar.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btCriar.setForeground(new java.awt.Color(255, 255, 255));
        btCriar.setText("CRIAR");
        btCriar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btCriar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCriarActionPerformed(evt);
            }
        });

        panInformacoes.setBackground(new java.awt.Color(255, 255, 255));
        panInformacoes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(249, 100, 100)));
        panInformacoes.setPreferredSize(new java.awt.Dimension(2, 2));

        jScrollPane1.setBorder(null);
        jScrollPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        tabPaciente.setBackground(new java.awt.Color(242, 242, 242));
        tabPaciente.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        tabPaciente.setForeground(new java.awt.Color(51, 51, 51));
        tabPaciente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Paciente", "Horário da Consulta"
            }
        ));
        tabPaciente.setGridColor(new java.awt.Color(204, 204, 204));
        tabPaciente.setRowHeight(30);
        tabPaciente.setRowMargin(7);
        tabPaciente.setSelectionBackground(new java.awt.Color(196, 67, 67));
        tabPaciente.setShowGrid(true);
        jScrollPane1.setViewportView(tabPaciente);

        btRefresh1.setBackground(new java.awt.Color(249, 100, 100));
        btRefresh1.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        btRefresh1.setForeground(new java.awt.Color(255, 255, 255));
        btRefresh1.setText("🔄");
        btRefresh1.setToolTipText("Atualizar Tabela");
        btRefresh1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout panInformacoesLayout = new javax.swing.GroupLayout(panInformacoes);
        panInformacoes.setLayout(panInformacoesLayout);
        panInformacoesLayout.setHorizontalGroup(
            panInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panInformacoesLayout.createSequentialGroup()
                .addGroup(panInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panInformacoesLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btRefresh1))
                    .addGroup(panInformacoesLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1185, Short.MAX_VALUE)))
                .addGap(30, 30, 30))
        );
        panInformacoesLayout.setVerticalGroup(
            panInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panInformacoesLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(btRefresh1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 801, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btExcluir.setBackground(new java.awt.Color(249, 100, 100));
        btExcluir.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btExcluir.setForeground(new java.awt.Color(255, 255, 255));
        btExcluir.setText("EXCLUIR");
        btExcluir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        btIniciarTriagem.setBackground(new java.awt.Color(249, 100, 100));
        btIniciarTriagem.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btIniciarTriagem.setForeground(new java.awt.Color(255, 255, 255));
        btIniciarTriagem.setText("<html>INICIAR<br />TRIAGEM</html>");
        btIniciarTriagem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btIniciarTriagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btIniciarTriagemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout cardConsultaLayout = new javax.swing.GroupLayout(cardConsulta);
        cardConsulta.setLayout(cardConsultaLayout);
        cardConsultaLayout.setHorizontalGroup(
            cardConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardConsultaLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(panInformacoes, javax.swing.GroupLayout.DEFAULT_SIZE, 1247, Short.MAX_VALUE)
                .addGroup(cardConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cardConsultaLayout.createSequentialGroup()
                        .addGroup(cardConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(cardConsultaLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(btCriar, javax.swing.GroupLayout.DEFAULT_SIZE, 621, Short.MAX_VALUE))
                            .addGroup(cardConsultaLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(cardConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btIniciarTriagem)
                                    .addComponent(btExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(20, 20, 20))
                    .addGroup(cardConsultaLayout.createSequentialGroup()
                        .addGap(325, 325, 325)
                        .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        cardConsultaLayout.setVerticalGroup(
            cardConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardConsultaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cardConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cardConsultaLayout.createSequentialGroup()
                        .addComponent(panInformacoes, javax.swing.GroupLayout.DEFAULT_SIZE, 913, Short.MAX_VALUE)
                        .addGap(15, 15, 15))
                    .addGroup(cardConsultaLayout.createSequentialGroup()
                        .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 283, Short.MAX_VALUE)
                        .addComponent(btCriar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btIniciarTriagem, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(339, Short.MAX_VALUE))))
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

        labNome.setText("NOME");

        tfNome.setBackground(new java.awt.Color(242, 242, 242));
        tfNome.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(249, 100, 100)));

        tfCPF.setBackground(new java.awt.Color(242, 242, 242));
        tfCPF.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(249, 100, 100)));

        labCPF.setText("CPF");

        tfDataNasc.setBackground(new java.awt.Color(242, 242, 242));
        tfDataNasc.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(249, 100, 100)));

        labDataNasc.setText("DATA DE NASCIMENTO");

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
                                    .addGroup(panTabelaLayout.createSequentialGroup()
                                        .addComponent(labNome)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(tfNome)
                                    .addGroup(panTabelaLayout.createSequentialGroup()
                                        .addGroup(panTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(labDataNasc)
                                            .addComponent(jLabel1)
                                            .addGroup(panTabelaLayout.createSequentialGroup()
                                                .addComponent(tfDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addGroup(panTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(lbTelefone)
                                                    .addComponent(tfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGap(0, 9, Short.MAX_VALUE)))
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
                .addGroup(panTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panTabelaLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labEndereco)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panTabelaLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                        .addGroup(panTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panTabelaLayout.createSequentialGroup()
                                .addComponent(labCPF)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panTabelaLayout.createSequentialGroup()
                                .addComponent(labNome)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(panTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panTabelaLayout.createSequentialGroup()
                                .addComponent(labDataNasc)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panTabelaLayout.createSequentialGroup()
                                .addComponent(lbTelefone)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18)
                .addComponent(btLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(547, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout cardCadastroLayout = new javax.swing.GroupLayout(cardCadastro);
        cardCadastro.setLayout(cardCadastroLayout);
        cardCadastroLayout.setHorizontalGroup(
            cardCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardCadastroLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(panTabela, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20)
                .addComponent(btAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, 774, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );
        cardCadastroLayout.setVerticalGroup(
            cardCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardCadastroLayout.createSequentialGroup()
                .addContainerGap(425, Short.MAX_VALUE)
                .addComponent(btAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(426, Short.MAX_VALUE))
            .addGroup(cardCadastroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panTabela, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(15, 15, 15))
        );

        panCardsAtendente.add(cardCadastro, "cardCadastro");

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
                .addComponent(panCardsAtendente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void labCadPacienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labCadPacienteMouseClicked
        cardLayout.show(panCardsAtendente, "cardCadastro");
        labConsulta.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(249, 100, 100)));
        labCadPaciente.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(249, 100, 100)));
        labCadPaciente.setFont(new java.awt.Font("Verdana", 0, 18));
        labConsulta.setFont(new java.awt.Font("Verdana", 0, 14));
    }//GEN-LAST:event_labCadPacienteMouseClicked

    private void labConsultaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labConsultaMouseClicked
        cardLayout.show(panCardsAtendente, "cardConsulta");
        labConsulta.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(249, 100, 100)));
        labCadPaciente.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(249, 100, 100)));
        labConsulta.setFont(new java.awt.Font("Verdana", 0, 18));
        labCadPaciente.setFont(new java.awt.Font("Verdana", 0, 14));
    }//GEN-LAST:event_labConsultaMouseClicked

    private void btCriarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCriarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btCriarActionPerformed

    private void btAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btAlterarActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btExcluirActionPerformed

    private void btIniciarTriagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btIniciarTriagemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btIniciarTriagemActionPerformed

    private void labUserImageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labUserImageMouseClicked
        if(Muser){
            Muser=false;
            labLogout.setVisible(false);
        }
        else{
            Muser=true;
            labLogout.setVisible(true);
        }
    }//GEN-LAST:event_labUserImageMouseClicked

    private void labUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labUserMouseClicked
        if(Muser){
            Muser=false;
            labLogout.setVisible(false);
        }
        else{
            Muser=true;
            labLogout.setVisible(true);
        }
    }//GEN-LAST:event_labUserMouseClicked

    private void labLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labLogoutMouseClicked
        sair();
    }//GEN-LAST:event_labLogoutMouseClicked

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        limpar();
    }//GEN-LAST:event_btLimparActionPerformed

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
    private javax.swing.JButton btAlterar;
    private javax.swing.JButton btCriar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btIniciarTriagem;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btRefresh1;
    private javax.swing.JPanel cardCadastro;
    private javax.swing.JPanel cardConsulta;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labCPF;
    private javax.swing.JLabel labCadPaciente;
    private javax.swing.JLabel labConsulta;
    private javax.swing.JLabel labDataNasc;
    private javax.swing.JLabel labEndereco;
    private javax.swing.JLabel labLogo;
    private javax.swing.JLabel labLogout;
    private javax.swing.JLabel labNome;
    private javax.swing.JLabel labUser;
    private javax.swing.JLabel labUserImage;
    private javax.swing.JLabel lbTelefone;
    private javax.swing.JPanel panCardsAtendente;
    private javax.swing.JPanel panInformacoes;
    private javax.swing.JPanel panTabela;
    private javax.swing.JPanel panTop;
    private javax.swing.JPanel panUser;
    private javax.swing.JTable tabPaciente;
    private javax.swing.JTextField tfCPF;
    private javax.swing.JTextField tfDataNasc;
    private javax.swing.JTextField tfEndereco;
    private javax.swing.JTextField tfNome;
    private javax.swing.JTextField tfTelefone;
    // End of variables declaration//GEN-END:variables
}
