package com.sas.view;

import com.sas.controller.AtendenteController;
import com.sas.controller.EnfermeiraController;
import java.awt.CardLayout;
import java.awt.Dimension;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.awt.Toolkit;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class JanEnfermeira extends javax.swing.JFrame {

    private static JanEnfermeira unicoJanEnfermeira;
    private static String ID;
    private Boolean Muser=false;
    private static String idConsulta;
    private static String idProtuario;
    
    CardLayout cardLayout;
    
    public String getId(){
        return ID;
    }
    
    public static void setId(String ID1){
        ID = ID1;
    }
    
    public String getIdConsulta(){
        return idConsulta;
    }
    
    public static void setIdConsulta(String idConsulta1){
        idConsulta = idConsulta1;
    }
    
    public String getIdProtuario(){
        return idProtuario;
    }
    
    public static void setIdProtuario(String idProtuario1){
        idProtuario = idProtuario1;
    }

    public JanEnfermeira() {
        initComponents();
        cardLayout = (CardLayout) (panCards.getLayout());
        this.setExtendedState(MAXIMIZED_BOTH);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setSize(dim.width / 2, dim.height / 2);
        carregaTabelaTriagem();
    }

    public static JanEnfermeira getJanEnfermeira() {

        if (unicoJanEnfermeira == null) {
            unicoJanEnfermeira = new JanEnfermeira();
        }
        return unicoJanEnfermeira;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panTop = new javax.swing.JPanel();
        labLogo = new javax.swing.JLabel();
        labEstoque = new javax.swing.JLabel();
        labTriagem = new javax.swing.JLabel();
        panUser = new javax.swing.JPanel();
        labUserImage = new javax.swing.JLabel();
        labUser = new javax.swing.JLabel();
        labLogout = new javax.swing.JLabel();
        labLogout.setVisible(false);
        panCards = new javax.swing.JPanel();
        cardTriagem = new javax.swing.JPanel();
        btSalvar = new javax.swing.JButton();
        panInformacoes = new javax.swing.JPanel();
        tfTemperatura = new javax.swing.JTextField();
        labTemperatura = new javax.swing.JLabel();
        tfPressao = new javax.swing.JTextField();
        labPressao = new javax.swing.JLabel();
        labDescricao = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        taDescricao = new javax.swing.JTextArea();
        btNomePesquisa1 = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        tabPaciente2 = new javax.swing.JTable();
        btlRefreshPac = new javax.swing.JButton();
        btNomePesquisaPac = new javax.swing.JButton();
        tfNomePac = new javax.swing.JTextField();
        labSelPaciente = new javax.swing.JLabel();
        labNomePesquisaPac = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        cardEstoque = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabEstoque = new javax.swing.JTable();
        tfQuantidade = new javax.swing.JTextField();
        btAlterar1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btQtdDiminuir = new javax.swing.JButton();
        btQtdAumentar1 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Enfermagem");
        setPreferredSize(new java.awt.Dimension(1920, 1080));
        setSize(new java.awt.Dimension(1920, 1080));

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

        labEstoque.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        labEstoque.setText("ESTOQUE");
        labEstoque.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labEstoque.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labEstoqueMouseClicked(evt);
            }
        });

        labTriagem.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        labTriagem.setText("TRIAGEM");
        labTriagem.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(249, 100, 100)));
        labTriagem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labTriagem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labTriagemMouseClicked(evt);
            }
        });

        panUser.setBackground(new java.awt.Color(255, 255, 255));

        labUserImage.setForeground(new java.awt.Color(255, 0, 0));
        labUserImage.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("https://media.discordapp.net/attachments/445732137623224331/1042497769887240332/icone_enfermeira_SAS.png?width=40&height=40")
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
        labUser.setText("Enfermeira");
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
                .addComponent(labTriagem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labEstoque)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panTopLayout.setVerticalGroup(
            panTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panTopLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(panTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labTriagem)
                    .addComponent(labEstoque))
                .addContainerGap(78, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panTopLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(panUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panCards.setLayout(new java.awt.CardLayout());

        cardTriagem.setBackground(new java.awt.Color(231, 231, 231));

        btSalvar.setBackground(new java.awt.Color(249, 100, 100));
        btSalvar.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btSalvar.setForeground(new java.awt.Color(255, 255, 255));
        btSalvar.setText("SALVAR");
        btSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btSalvar.setMinimumSize(new java.awt.Dimension(73, 18));
        btSalvar.setPreferredSize(new java.awt.Dimension(73, 18));
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        panInformacoes.setBackground(new java.awt.Color(255, 255, 255));
        panInformacoes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(249, 100, 100)));
        panInformacoes.setPreferredSize(new java.awt.Dimension(2, 2));

        tfTemperatura.setBackground(new java.awt.Color(242, 242, 242));
        tfTemperatura.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(249, 100, 100)));

        labTemperatura.setText("TEMPERATURA ");

        tfPressao.setBackground(new java.awt.Color(242, 242, 242));
        tfPressao.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(249, 100, 100)));

        labPressao.setText("PRESSÃO ARTERIAL (SI/DI)");

        labDescricao.setText("DESCRIÇÃO");

        taDescricao.setBackground(new java.awt.Color(242, 242, 242));
        taDescricao.setColumns(20);
        taDescricao.setRows(5);
        taDescricao.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(249, 100, 100)));
        jScrollPane3.setViewportView(taDescricao);

        btNomePesquisa1.setBackground(new java.awt.Color(249, 100, 100));
        btNomePesquisa1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btNomePesquisa1.setForeground(new java.awt.Color(255, 255, 255));
        btNomePesquisa1.setText("LIMPAR");
        btNomePesquisa1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btNomePesquisa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNomePesquisa1ActionPerformed(evt);
            }
        });

        jScrollPane5.setBorder(null);
        jScrollPane5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        tabPaciente2.setBackground(new java.awt.Color(242, 242, 242));
        tabPaciente2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        tabPaciente2.setForeground(new java.awt.Color(51, 51, 51));
        tabPaciente2.setModel(new javax.swing.table.DefaultTableModel(
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
                "Código Triagem", "Paciente", "CPF"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabPaciente2.setGridColor(new java.awt.Color(204, 204, 204));
        tabPaciente2.setRowHeight(30);
        tabPaciente2.setRowMargin(7);
        tabPaciente2.setSelectionBackground(new java.awt.Color(196, 67, 67));
        tabPaciente2.setShowGrid(true);
        tabPaciente2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tabPaciente2MousePressed(evt);
            }
        });
        jScrollPane5.setViewportView(tabPaciente2);

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

        tfNomePac.setBackground(new java.awt.Color(242, 242, 242));
        tfNomePac.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(249, 100, 100)));
        tfNomePac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNomePacActionPerformed(evt);
            }
        });

        labSelPaciente.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        labSelPaciente.setText("SELECIONAR PACIENTE");

        labNomePesquisaPac.setText("NOME");

        javax.swing.GroupLayout panInformacoesLayout = new javax.swing.GroupLayout(panInformacoes);
        panInformacoes.setLayout(panInformacoesLayout);
        panInformacoesLayout.setHorizontalGroup(
            panInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panInformacoesLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(panInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panInformacoesLayout.createSequentialGroup()
                        .addGroup(panInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panInformacoesLayout.createSequentialGroup()
                                .addGroup(panInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(labDescricao, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(panInformacoesLayout.createSequentialGroup()
                                            .addComponent(labSelPaciente)
                                            .addGap(146, 146, 146)
                                            .addGroup(panInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(panInformacoesLayout.createSequentialGroup()
                                                    .addComponent(tfNomePac, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(btNomePesquisaPac, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addComponent(labNomePesquisaPac))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(btlRefreshPac)))
                                    .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 811, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 384, Short.MAX_VALUE)))
                        .addGap(30, 30, 30))
                    .addGroup(panInformacoesLayout.createSequentialGroup()
                        .addGroup(panInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panInformacoesLayout.createSequentialGroup()
                                .addGroup(panInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labTemperatura)
                                    .addComponent(tfTemperatura, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(panInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panInformacoesLayout.createSequentialGroup()
                                        .addComponent(tfPressao, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(27, 27, 27)
                                        .addComponent(btNomePesquisa1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(labPressao))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        panInformacoesLayout.setVerticalGroup(
            panInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panInformacoesLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(labNomePesquisaPac)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btNomePesquisaPac, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tfNomePac, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labSelPaciente))
                    .addComponent(btlRefreshPac, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panInformacoesLayout.createSequentialGroup()
                        .addComponent(labTemperatura)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfTemperatura, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                        .addComponent(labDescricao))
                    .addGroup(panInformacoesLayout.createSequentialGroup()
                        .addComponent(labPressao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btNomePesquisa1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tfPressao, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(289, 289, 289))
        );

        javax.swing.GroupLayout cardTriagemLayout = new javax.swing.GroupLayout(cardTriagem);
        cardTriagem.setLayout(cardTriagemLayout);
        cardTriagemLayout.setHorizontalGroup(
            cardTriagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardTriagemLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(panInformacoes, javax.swing.GroupLayout.PREFERRED_SIZE, 1257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(btSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, 608, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );
        cardTriagemLayout.setVerticalGroup(
            cardTriagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardTriagemLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(cardTriagemLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panInformacoes, javax.swing.GroupLayout.PREFERRED_SIZE, 879, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panCards.add(cardTriagem, "cardTriagem");

        cardEstoque.setBackground(new java.awt.Color(231, 231, 231));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(249, 100, 100), 1, true));

        jScrollPane4.setBorder(null);
        jScrollPane4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        tabEstoque.setBackground(new java.awt.Color(242, 242, 242));
        tabEstoque.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        tabEstoque.setForeground(new java.awt.Color(51, 51, 51));
        tabEstoque.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", null},
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
                "Nome do Item", "Quantidade"
            }
        ));
        tabEstoque.setGridColor(new java.awt.Color(204, 204, 204));
        tabEstoque.setIntercellSpacing(new java.awt.Dimension(0, 10));
        tabEstoque.setMinimumSize(new java.awt.Dimension(0, 0));
        tabEstoque.setRowHeight(30);
        tabEstoque.setSelectionBackground(new java.awt.Color(196, 67, 67));
        tabEstoque.setShowGrid(true);
        jScrollPane4.setViewportView(tabEstoque);

        tfQuantidade.setBackground(new java.awt.Color(242, 242, 242));
        tfQuantidade.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        tfQuantidade.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfQuantidade.setToolTipText("");
        tfQuantidade.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(249, 100, 100)));

        btAlterar1.setBackground(new java.awt.Color(249, 100, 100));
        btAlterar1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btAlterar1.setForeground(new java.awt.Color(255, 255, 255));
        btAlterar1.setText("SALVAR");
        btAlterar1.setActionCommand("<html><center>ALTERAR QUANTIDADE</center></html>");
        btAlterar1.setBorder(null);
        btAlterar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btAlterar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlterar1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ALTERAR QUANTIDADE");

        btQtdDiminuir.setBackground(new java.awt.Color(249, 100, 100));
        btQtdDiminuir.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btQtdDiminuir.setForeground(new java.awt.Color(255, 255, 255));
        btQtdDiminuir.setText("▼");
        btQtdDiminuir.setActionCommand("<html><center>ALTERAR QUANTIDADE</center></html>");
        btQtdDiminuir.setBorder(null);
        btQtdDiminuir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btQtdDiminuir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQtdDiminuirActionPerformed(evt);
            }
        });

        btQtdAumentar1.setBackground(new java.awt.Color(249, 100, 100));
        btQtdAumentar1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btQtdAumentar1.setForeground(new java.awt.Color(255, 255, 255));
        btQtdAumentar1.setText("▲");
        btQtdAumentar1.setActionCommand("<html><center>ALTERAR QUANTIDADE</center></html>");
        btQtdAumentar1.setBorder(null);
        btQtdAumentar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btQtdAumentar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQtdAumentar1ActionPerformed(evt);
            }
        });

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 1397, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 405, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tfQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btQtdAumentar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btQtdDiminuir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(btAlterar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tfQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btQtdAumentar1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btQtdDiminuir, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btAlterar1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 815, Short.MAX_VALUE)
                        .addGap(30, 30, 30))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jSeparator2)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout cardEstoqueLayout = new javax.swing.GroupLayout(cardEstoque);
        cardEstoque.setLayout(cardEstoqueLayout);
        cardEstoqueLayout.setHorizontalGroup(
            cardEstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardEstoqueLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        cardEstoqueLayout.setVerticalGroup(
            cardEstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardEstoqueLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(15, 15, 15))
        );

        panCards.add(cardEstoque, "cardEstoque");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panTop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panCards, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panTop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panCards, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void labTriagemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labTriagemMouseClicked
        cardLayout.show(panCards, "cardTriagem");
        labTriagem.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(249, 100, 100)));
        labEstoque.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(249, 100, 100)));
        labTriagem.setFont(new java.awt.Font("Verdana", 0, 18));
        labEstoque.setFont(new java.awt.Font("Verdana", 0, 14));
    }//GEN-LAST:event_labTriagemMouseClicked

    private void labEstoqueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labEstoqueMouseClicked
        cardLayout.show(panCards, "cardEstoque");
        labTriagem.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(249, 100, 100)));
        labEstoque.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(249, 100, 100)));
        labEstoque.setFont(new java.awt.Font("Verdana", 0, 18));
        labTriagem.setFont(new java.awt.Font("Verdana", 0, 14));
    }//GEN-LAST:event_labEstoqueMouseClicked

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        preencherTriagem();
    }//GEN-LAST:event_btSalvarActionPerformed

    private void btAlterar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btAlterar1ActionPerformed

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

    private void btNomePesquisa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNomePesquisa1ActionPerformed
        limparTriagem();
    }//GEN-LAST:event_btNomePesquisa1ActionPerformed

    private void tabPaciente2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabPaciente2MousePressed
        setIdProtuario(tabPaciente2.getValueAt(tabPaciente2.getSelectedRow(), 0).toString());
        setIdConsulta(pesquisarConsultaPorProntuario(getIdProtuario()));
    }//GEN-LAST:event_tabPaciente2MousePressed

    private void btlRefreshPacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btlRefreshPacActionPerformed
        carregaTabelaTriagem();
    }//GEN-LAST:event_btlRefreshPacActionPerformed

    private void btNomePesquisaPacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNomePesquisaPacActionPerformed
        pesquisaTabelaTriagem();
        tfNomePac.setText("");
        tfNomePac.requestFocus();
    }//GEN-LAST:event_btNomePesquisaPacActionPerformed

    private void tfNomePacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNomePacActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNomePacActionPerformed

    private void btQtdDiminuirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQtdDiminuirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btQtdDiminuirActionPerformed

    private void btQtdAumentar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQtdAumentar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btQtdAumentar1ActionPerformed
    
    public void sair(){
        this.dispose();
        labLogout.setVisible(false);
        JanLogin.getJanLogin().setVisible(true);
    }
    
    public void setNomePerfil(String nome) {
        labUser.setText(nome);
    }
    
    public void carregaTabelaTriagem() {
        DefaultTableModel modelo = (DefaultTableModel) tabPaciente2.getModel();
        modelo.setNumRows(0);
        
        EnfermeiraController.carregaTabelaTriagem(modelo);
        
        centralizarTabelaTriagem();
    }
    
    public void centralizarTabelaTriagem() {
        DefaultTableCellRenderer cellRender = new DefaultTableCellRenderer();
	cellRender.setHorizontalAlignment(SwingConstants.CENTER);

	for (int numCol = 0; numCol < tabPaciente2.getColumnCount(); numCol++) {
            tabPaciente2.getColumnModel().getColumn(numCol).setCellRenderer(cellRender);
	}
    }
    
    public void pesquisaTabelaTriagem() {
        DefaultTableModel modelo = (DefaultTableModel) tabPaciente2.getModel();
        modelo.setNumRows(0);
        
        EnfermeiraController.pesquisaTabelaTriagem(modelo, tfNomePac.getText());
        
        centralizarTabelaTriagem();
    }
    
    public void limparTriagem(){
        tfTemperatura.setText("");
        tfPressao.setText("");
        taDescricao.setText("");
        tabPaciente2.clearSelection();
        tfTemperatura.requestFocus();
    }
    
    public void preencherTriagem(){
        String feedback = "";
        String feedbackAlt = "";
        
        String temperatura = tfTemperatura.getText();
        String pressao = tfPressao.getText();
        String descricao = taDescricao.getText();

        String pro_id = getIdProtuario();
        String enf_id = getId();
        
        System.out.println("CONSULTA: " + getIdConsulta());
        
        feedback = EnfermeiraController.preencherTriagem(temperatura, pressao, descricao, pro_id, enf_id);
        feedbackAlt = AtendenteController.alterarStatusConsulta(getIdConsulta(), 3);
        
        if(feedback == null && feedbackAlt == null){
            System.out.println("TRIAGEM PREENCHIDA COM SUCESSO!");
            limparTriagem();
        }
        else
            System.out.println(feedback);
    }
    
    public String pesquisarConsultaPorProntuario(String pro_id) {
        return EnfermeiraController.pesquisarConsultaPorProntuario(pro_id);
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
            java.util.logging.Logger.getLogger(JanEnfermeira.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JanEnfermeira.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JanEnfermeira.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanEnfermeira.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JanEnfermeira().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAlterar1;
    private javax.swing.JButton btNomePesquisa1;
    private javax.swing.JButton btNomePesquisaPac;
    private javax.swing.JButton btQtdAumentar1;
    private javax.swing.JButton btQtdDiminuir;
    private javax.swing.JButton btSalvar;
    private javax.swing.JButton btlRefreshPac;
    private javax.swing.JPanel cardEstoque;
    private javax.swing.JPanel cardTriagem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel labDescricao;
    private javax.swing.JLabel labEstoque;
    private javax.swing.JLabel labLogo;
    private javax.swing.JLabel labLogout;
    private javax.swing.JLabel labNomePesquisaPac;
    private javax.swing.JLabel labPressao;
    private javax.swing.JLabel labSelPaciente;
    private javax.swing.JLabel labTemperatura;
    private javax.swing.JLabel labTriagem;
    private javax.swing.JLabel labUser;
    private javax.swing.JLabel labUserImage;
    private javax.swing.JPanel panCards;
    private javax.swing.JPanel panInformacoes;
    private javax.swing.JPanel panTop;
    private javax.swing.JPanel panUser;
    private javax.swing.JTextArea taDescricao;
    private javax.swing.JTable tabEstoque;
    private javax.swing.JTable tabPaciente2;
    private javax.swing.JTextField tfNomePac;
    private javax.swing.JTextField tfPressao;
    private javax.swing.JTextField tfQuantidade;
    private javax.swing.JTextField tfTemperatura;
    // End of variables declaration//GEN-END:variables
}
