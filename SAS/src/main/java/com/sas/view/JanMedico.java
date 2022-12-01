package com.sas.view;

import java.awt.Dimension;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.awt.Toolkit;
import java.awt.CardLayout;

public class JanMedico extends javax.swing.JFrame {

    private static JanMedico unicoJanMedico;
    private static String ID;
    private Boolean Muser=false;
    
    CardLayout cardLayout;
    
    public String getId(){
        return ID;
    }
    
    public static void setId(String ID1){
        ID = ID1;
    }
    
    public JanMedico() {
        initComponents();
        cardLayout = (CardLayout) (panCards.getLayout());
        this.setExtendedState(MAXIMIZED_BOTH);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setSize(dim.width, dim.height);
    }

    public static JanMedico getJanMedico() {

        if (unicoJanMedico == null) {
            unicoJanMedico = new JanMedico();
        }
        return unicoJanMedico;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panTop = new javax.swing.JPanel();
        labLogo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        panUser = new javax.swing.JPanel();
        labUserImage = new javax.swing.JLabel();
        labUser = new javax.swing.JLabel();
        labLogout = new javax.swing.JLabel();
        labLogout.setVisible(false);
        panCards = new javax.swing.JPanel();
        cardConsulta = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tabPaciente2 = new javax.swing.JTable();
        labSelPaciente = new javax.swing.JLabel();
        tfNomePac = new javax.swing.JTextField();
        labNomePesquisaPac = new javax.swing.JLabel();
        btNomePesquisaPac = new javax.swing.JButton();
        btlRefreshPac = new javax.swing.JButton();
        btIniciarCons = new javax.swing.JButton();
        cardPacInfo = new javax.swing.JPanel();
        labPacIdade = new javax.swing.JPanel();
        lbProntuario = new javax.swing.JLabel();
        labPInfoNome = new javax.swing.JLabel();
        labPacNome = new javax.swing.JLabel();
        labPacData = new javax.swing.JLabel();
        labInfoData = new javax.swing.JLabel();
        labInfoHora = new javax.swing.JLabel();
        labPacHora = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        labInfoIdade = new javax.swing.JLabel();
        labPacNome1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        labInfoTemperatura = new javax.swing.JLabel();
        labPacTemperatura = new javax.swing.JLabel();
        labInfoPressao = new javax.swing.JLabel();
        labPacPressão = new javax.swing.JLabel();
        labInfoObs = new javax.swing.JLabel();
        labPacObs = new javax.swing.JLabel();
        btSalvar = new javax.swing.JButton();
        btSalvar1 = new javax.swing.JButton();
        btSalvar2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Médica");
        setBackground(new java.awt.Color(0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(new java.awt.Dimension(1920, 1080));

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

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel1.setText("Consultas");
        jLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(249, 100, 100)));
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        panUser.setBackground(new java.awt.Color(255, 255, 255));

        labUserImage.setForeground(new java.awt.Color(255, 0, 0));
        labUserImage.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("https://media.discordapp.net/attachments/445732137623224331/1042497770533179432/icone_medico_SAS.png?width=40&height=40")
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
        labUser.setText("Médico");
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
                .addGap(18, 18, 18)
                .addComponent(labLogo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panTopLayout.setVerticalGroup(
            panTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panTopLayout.createSequentialGroup()
                .addGroup(panTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panTopLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(labLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(panTopLayout.createSequentialGroup()
                        .addGap(0, 45, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(29, 29, 29)))
                .addGap(20, 20, 20))
            .addGroup(panTopLayout.createSequentialGroup()
                .addComponent(panUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        panCards.setBackground(new java.awt.Color(231, 231, 231));
        panCards.setLayout(new java.awt.CardLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(239, 100, 100)));

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
        jScrollPane5.setViewportView(tabPaciente2);

        labSelPaciente.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        labSelPaciente.setText("SELECIONAR PACIENTE");

        tfNomePac.setBackground(new java.awt.Color(242, 242, 242));
        tfNomePac.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(249, 100, 100)));

        labNomePesquisaPac.setText("NOME");

        btNomePesquisaPac.setBackground(new java.awt.Color(249, 100, 100));
        btNomePesquisaPac.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btNomePesquisaPac.setForeground(new java.awt.Color(255, 255, 255));
        btNomePesquisaPac.setText("PESQUISAR");
        btNomePesquisaPac.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btlRefreshPac.setBackground(new java.awt.Color(249, 100, 100));
        btlRefreshPac.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        btlRefreshPac.setForeground(new java.awt.Color(255, 255, 255));
        btlRefreshPac.setText("🔄");
        btlRefreshPac.setToolTipText("Atualizar Tabela");
        btlRefreshPac.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(labSelPaciente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 523, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labNomePesquisaPac)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(tfNomePac, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btNomePesquisaPac)
                                .addGap(18, 18, 18)
                                .addComponent(btlRefreshPac)))))
                .addGap(30, 30, 30))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labNomePesquisaPac)
                    .addComponent(labSelPaciente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btNomePesquisaPac, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btlRefreshPac, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(tfNomePac, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 797, Short.MAX_VALUE)
                .addContainerGap())
        );

        btIniciarCons.setBackground(new java.awt.Color(249, 100, 100));
        btIniciarCons.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btIniciarCons.setForeground(new java.awt.Color(255, 255, 255));
        btIniciarCons.setText("INICIAR CONSULTA");
        btIniciarCons.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btIniciarCons.setMinimumSize(new java.awt.Dimension(73, 18));
        btIniciarCons.setPreferredSize(new java.awt.Dimension(73, 18));
        btIniciarCons.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btIniciarConsMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout cardConsultaLayout = new javax.swing.GroupLayout(cardConsulta);
        cardConsulta.setLayout(cardConsultaLayout);
        cardConsultaLayout.setHorizontalGroup(
            cardConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardConsultaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btIniciarCons, javax.swing.GroupLayout.DEFAULT_SIZE, 556, Short.MAX_VALUE)
                .addContainerGap())
        );
        cardConsultaLayout.setVerticalGroup(
            cardConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardConsultaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(cardConsultaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btIniciarCons, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panCards.add(cardConsulta, "cardConsulta");

        labPacIdade.setBackground(new java.awt.Color(255, 255, 255));
        labPacIdade.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(239, 100, 100)));

        lbProntuario.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        lbProntuario.setText("PRONTUÁRIO");

        labPInfoNome.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        labPInfoNome.setText("NOME:");

        labPacNome.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        labPacNome.setText("Inserir nome aqui");

        labPacData.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        labPacData.setText("Inserir data aqui");

        labInfoData.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        labInfoData.setText("DATA DA CONSULTA:");

        labInfoHora.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        labInfoHora.setText("HORA DA CONSULTA:");

        labPacHora.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        labPacHora.setText("Inserir hora aqui");

        labInfoIdade.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        labInfoIdade.setText("IDADE:");

        labPacNome1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        labPacNome1.setText("calcular idade e por aqui");

        labInfoTemperatura.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        labInfoTemperatura.setText("TEMPERATURA:");

        labPacTemperatura.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        labPacTemperatura.setText("Inserir temperatura aqui");

        labInfoPressao.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        labInfoPressao.setText("PRESSÃO:");

        labPacPressão.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        labPacPressão.setText("Inserir pressão aqui");

        labInfoObs.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        labInfoObs.setText("OBSERVAÇÕES:");

        labPacObs.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        labPacObs.setText("Inserir observações aqui");
        labPacObs.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout labPacIdadeLayout = new javax.swing.GroupLayout(labPacIdade);
        labPacIdade.setLayout(labPacIdadeLayout);
        labPacIdadeLayout.setHorizontalGroup(
            labPacIdadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(labPacIdadeLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(labPacIdadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(labPacIdadeLayout.createSequentialGroup()
                        .addComponent(labInfoTemperatura)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labPacTemperatura, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labInfoPressao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labPacPressão, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45))
                    .addGroup(labPacIdadeLayout.createSequentialGroup()
                        .addGroup(labPacIdadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(labPacIdadeLayout.createSequentialGroup()
                                .addComponent(labInfoIdade)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labPacNome1, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(labPacIdadeLayout.createSequentialGroup()
                                .addComponent(labPInfoNome)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labPacNome, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 452, Short.MAX_VALUE)
                        .addGroup(labPacIdadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(labPacIdadeLayout.createSequentialGroup()
                                .addComponent(labInfoData)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labPacData, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(labPacIdadeLayout.createSequentialGroup()
                                .addComponent(labInfoHora)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labPacHora, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(64, 64, 64))
                    .addGroup(labPacIdadeLayout.createSequentialGroup()
                        .addGroup(labPacIdadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(labPacIdadeLayout.createSequentialGroup()
                                .addComponent(labInfoObs)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labPacObs, javax.swing.GroupLayout.PREFERRED_SIZE, 1035, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lbProntuario))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, labPacIdadeLayout.createSequentialGroup()
                        .addGroup(labPacIdadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator2))
                        .addGap(30, 30, 30))))
        );
        labPacIdadeLayout.setVerticalGroup(
            labPacIdadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(labPacIdadeLayout.createSequentialGroup()
                .addGroup(labPacIdadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(labPacIdadeLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(lbProntuario)
                        .addGap(35, 35, 35)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addGroup(labPacIdadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labPInfoNome)
                            .addComponent(labPacNome)))
                    .addGroup(labPacIdadeLayout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addGroup(labPacIdadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labInfoData)
                            .addComponent(labPacData))
                        .addGap(112, 112, 112)
                        .addGroup(labPacIdadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labInfoHora)
                            .addComponent(labPacHora)
                            .addComponent(labInfoIdade)
                            .addComponent(labPacNome1))))
                .addGap(49, 49, 49)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(labPacIdadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labInfoTemperatura)
                    .addComponent(labPacTemperatura)
                    .addComponent(labInfoPressao)
                    .addComponent(labPacPressão))
                .addGap(91, 91, 91)
                .addGroup(labPacIdadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labInfoObs)
                    .addComponent(labPacObs, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        btSalvar.setBackground(new java.awt.Color(249, 100, 100));
        btSalvar.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btSalvar.setForeground(new java.awt.Color(255, 255, 255));
        btSalvar.setText("RECEITAR MEDICAMENTO");
        btSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btSalvar.setMinimumSize(new java.awt.Dimension(73, 18));
        btSalvar.setPreferredSize(new java.awt.Dimension(73, 18));

        btSalvar1.setBackground(new java.awt.Color(249, 100, 100));
        btSalvar1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btSalvar1.setForeground(new java.awt.Color(255, 255, 255));
        btSalvar1.setText("GERAR ENCAMINHAMENTO");
        btSalvar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btSalvar1.setMinimumSize(new java.awt.Dimension(73, 18));
        btSalvar1.setPreferredSize(new java.awt.Dimension(73, 18));

        btSalvar2.setBackground(new java.awt.Color(249, 100, 100));
        btSalvar2.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        btSalvar2.setForeground(new java.awt.Color(255, 255, 255));
        btSalvar2.setText("VOLTAR");
        btSalvar2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btSalvar2.setMinimumSize(new java.awt.Dimension(73, 18));
        btSalvar2.setPreferredSize(new java.awt.Dimension(73, 18));
        btSalvar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btSalvar2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout cardPacInfoLayout = new javax.swing.GroupLayout(cardPacInfo);
        cardPacInfo.setLayout(cardPacInfoLayout);
        cardPacInfoLayout.setHorizontalGroup(
            cardPacInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardPacInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labPacIdade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(cardPacInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btSalvar1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 536, Short.MAX_VALUE)
                    .addComponent(btSalvar2, javax.swing.GroupLayout.DEFAULT_SIZE, 536, Short.MAX_VALUE))
                .addContainerGap())
        );
        cardPacInfoLayout.setVerticalGroup(
            cardPacInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cardPacInfoLayout.createSequentialGroup()
                .addGroup(cardPacInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(cardPacInfoLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btSalvar1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btSalvar2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(labPacIdade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        panCards.add(cardPacInfo, "cardPacInfo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panTop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panCards, javax.swing.GroupLayout.DEFAULT_SIZE, 1920, Short.MAX_VALUE)
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

    private void btIniciarConsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btIniciarConsMouseClicked
        cardLayout.show(panCards, "cardPacInfo");
    }//GEN-LAST:event_btIniciarConsMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        cardLayout.show(panCards, "cardConsulta");
    }//GEN-LAST:event_jLabel1MouseClicked

    private void btSalvar2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btSalvar2MouseClicked
        cardLayout.show(panCards, "cardConsulta");
    }//GEN-LAST:event_btSalvar2MouseClicked
    
    public void sair(){
        this.dispose();
        labLogout.setVisible(false);
        JanLogin.getJanLogin().setVisible(true);
    }
    
    public void setNomePerfil(String nome) {
        labUser.setText(nome);
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
            java.util.logging.Logger.getLogger(JanMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JanMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JanMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JanMedico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btIniciarCons;
    private javax.swing.JButton btNomePesquisaPac;
    private javax.swing.JButton btSalvar;
    private javax.swing.JButton btSalvar1;
    private javax.swing.JButton btSalvar2;
    private javax.swing.JButton btlRefreshPac;
    private javax.swing.JPanel cardConsulta;
    private javax.swing.JPanel cardPacInfo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel labInfoData;
    private javax.swing.JLabel labInfoHora;
    private javax.swing.JLabel labInfoIdade;
    private javax.swing.JLabel labInfoObs;
    private javax.swing.JLabel labInfoPressao;
    private javax.swing.JLabel labInfoTemperatura;
    private javax.swing.JLabel labLogo;
    private javax.swing.JLabel labLogout;
    private javax.swing.JLabel labNomePesquisaPac;
    private javax.swing.JLabel labPInfoNome;
    private javax.swing.JLabel labPacData;
    private javax.swing.JLabel labPacHora;
    private javax.swing.JPanel labPacIdade;
    private javax.swing.JLabel labPacNome;
    private javax.swing.JLabel labPacNome1;
    private javax.swing.JLabel labPacObs;
    private javax.swing.JLabel labPacPressão;
    private javax.swing.JLabel labPacTemperatura;
    private javax.swing.JLabel labSelPaciente;
    private javax.swing.JLabel labUser;
    private javax.swing.JLabel labUserImage;
    private javax.swing.JLabel lbProntuario;
    private javax.swing.JPanel panCards;
    private javax.swing.JPanel panTop;
    private javax.swing.JPanel panUser;
    private javax.swing.JTable tabPaciente2;
    private javax.swing.JTextField tfNomePac;
    // End of variables declaration//GEN-END:variables
}
