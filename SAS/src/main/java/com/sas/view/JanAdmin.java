package com.sas.view;

import com.sas.controller.AdministradorController;
import java.awt.CardLayout;

public class JanAdmin extends javax.swing.JFrame {

    private static JanAdmin unicoJanAdmin;
    private String ID;
    private Boolean Muser=false;

    CardLayout cardLayout;
    
    public String getId(){
        return ID;
    }
    
    public void setId(String ID){
        this.ID = ID;
    }
        
    public JanAdmin() {
        initComponents();
        cardLayout = (CardLayout) (panCards.getLayout());
        this.setExtendedState(MAXIMIZED_BOTH);
    }

    public static JanAdmin getJanAdmin() {
        if (unicoJanAdmin == null) {
            unicoJanAdmin = new JanAdmin();
        }
        return unicoJanAdmin;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgFiltro = new javax.swing.ButtonGroup();
        bgEquipe = new javax.swing.ButtonGroup();
        dialogAlteracao = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        tfEnderecoAlt = new javax.swing.JTextField();
        tfCpfAlt = new javax.swing.JTextField();
        labEnderecoAlt = new javax.swing.JLabel();
        labCpfAlt = new javax.swing.JLabel();
        tfNomeAlt = new javax.swing.JTextField();
        labNomeAlt = new javax.swing.JLabel();
        tfSalarioAlt = new javax.swing.JTextField();
        tfNascAlt = new javax.swing.JTextField();
        labSalarioAlt = new javax.swing.JLabel();
        labNascAlt = new javax.swing.JLabel();
        labEspecialidadeAlt = new javax.swing.JLabel();
        tfEspecialidadeAlt = new javax.swing.JTextField();
        labCrMAlt = new javax.swing.JLabel();
        tfCrMAlt = new javax.swing.JTextField();
        tfTelefoneAlt = new javax.swing.JTextField();
        labTelefoneAlt = new javax.swing.JLabel();
        btNomePesquisaAlt = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        btCancelarAlt = new javax.swing.JButton();
        btSalvarAlt = new javax.swing.JButton();
        labAlt = new javax.swing.JLabel();
        panTop = new javax.swing.JPanel();
        labLogo = new javax.swing.JLabel();
        labFuncionario = new javax.swing.JLabel();
        labCadFuncionario = new javax.swing.JLabel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        panUser = new javax.swing.JPanel();
        labUserImage = new javax.swing.JLabel();
        labUser = new javax.swing.JLabel();
        labLogout = new javax.swing.JLabel();
        labLogout.setVisible(false);
        panCards = new javax.swing.JPanel();
        cardCadFuncionario = new javax.swing.JPanel();
        panInfo = new javax.swing.JPanel();
        tfNome = new javax.swing.JTextField();
        labNome = new javax.swing.JLabel();
        tfNasc = new javax.swing.JTextField();
        labNasc = new javax.swing.JLabel();
        tfCpf = new javax.swing.JTextField();
        labCpf = new javax.swing.JLabel();
        tfTelefone = new javax.swing.JTextField();
        labTelefone = new javax.swing.JLabel();
        tfEndereco = new javax.swing.JTextField();
        labEndereco = new javax.swing.JLabel();
        tfCrM = new javax.swing.JTextField();
        labCrM = new javax.swing.JLabel();
        rbAtendimento = new javax.swing.JRadioButton();
        rbEnfermagem = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        rbMedica = new javax.swing.JRadioButton();
        jSeparator1 = new javax.swing.JSeparator();
        tfSalario = new javax.swing.JTextField();
        labSalario = new javax.swing.JLabel();
        tfEspecialidade = new javax.swing.JTextField();
        labEspecialidade = new javax.swing.JLabel();
        rbAdministracao = new javax.swing.JRadioButton();
        btLimpar = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        btCadastrar = new javax.swing.JButton();
        cardFuncionarios = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabFuncionario = new javax.swing.JTable();
        lbFiltrarEquipe = new javax.swing.JLabel();
        rbEnfermeira = new javax.swing.JRadioButton();
        rbAtendente = new javax.swing.JRadioButton();
        rbMedico = new javax.swing.JRadioButton();
        btNomePesquisa = new javax.swing.JButton();
        labNomePesquisa = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        rbAdministrador = new javax.swing.JRadioButton();
        tfNome1 = new javax.swing.JTextField();
        btRefresh = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        tfEnderecoAlt.setBackground(new java.awt.Color(242, 242, 242));
        tfEnderecoAlt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(249, 100, 100)));

        tfCpfAlt.setBackground(new java.awt.Color(242, 242, 242));
        tfCpfAlt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(249, 100, 100)));

        labEnderecoAlt.setText("ENDEREÇO");

        labCpfAlt.setText("CPF");

        tfNomeAlt.setBackground(new java.awt.Color(242, 242, 242));
        tfNomeAlt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(249, 100, 100)));

        labNomeAlt.setText("NOME");

        tfSalarioAlt.setBackground(new java.awt.Color(242, 242, 242));
        tfSalarioAlt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(249, 100, 100)));

        tfNascAlt.setBackground(new java.awt.Color(242, 242, 242));
        tfNascAlt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(249, 100, 100)));
        tfNascAlt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNascAltActionPerformed(evt);
            }
        });

        labSalarioAlt.setText("SALÁRIO");

        labNascAlt.setText("<html>DATA DE NASCIMENTO<br />DD/MM/AAAA</html>");

        labEspecialidadeAlt.setText("ESPECIALIDADE");

        tfEspecialidadeAlt.setBackground(new java.awt.Color(242, 242, 242));
        tfEspecialidadeAlt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(249, 100, 100)));

        labCrMAlt.setText("CRM");

        tfCrMAlt.setBackground(new java.awt.Color(242, 242, 242));
        tfCrMAlt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(249, 100, 100)));

        tfTelefoneAlt.setBackground(new java.awt.Color(242, 242, 242));
        tfTelefoneAlt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(249, 100, 100)));

        labTelefoneAlt.setText("TELEFONE");

        btNomePesquisaAlt.setBackground(new java.awt.Color(249, 100, 100));
        btNomePesquisaAlt.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btNomePesquisaAlt.setForeground(new java.awt.Color(255, 255, 255));
        btNomePesquisaAlt.setText("LIMPAR");
        btNomePesquisaAlt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNomePesquisaAltActionPerformed(evt);
            }
        });

        btCancelarAlt.setBackground(new java.awt.Color(249, 100, 100));
        btCancelarAlt.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        btCancelarAlt.setForeground(new java.awt.Color(255, 255, 255));
        btCancelarAlt.setText("CANCELAR");
        btCancelarAlt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarAltActionPerformed(evt);
            }
        });

        btSalvarAlt.setBackground(new java.awt.Color(249, 100, 100));
        btSalvarAlt.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        btSalvarAlt.setForeground(new java.awt.Color(255, 255, 255));
        btSalvarAlt.setText("SALVAR");
        btSalvarAlt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarAltActionPerformed(evt);
            }
        });

        labAlt.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        labAlt.setText("Alteração de dados");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(382, 382, 382)
                        .addComponent(tfTelefoneAlt))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(602, 602, 602)
                        .addComponent(btNomePesquisaAlt, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 692, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btCancelarAlt, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btSalvarAlt, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(labAlt)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(tfCpfAlt, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labNomeAlt, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labCpfAlt, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labEnderecoAlt, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfEnderecoAlt, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfNomeAlt, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(labTelefoneAlt)
                                .addGap(316, 316, 316))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labNascAlt)
                                    .addComponent(tfNascAlt, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labSalarioAlt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tfSalarioAlt, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(labCrMAlt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(labEspecialidadeAlt, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfEspecialidadeAlt)
                                    .addComponent(tfCrMAlt, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(labAlt)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(labNascAlt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tfNascAlt, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(labNomeAlt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfNomeAlt, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(labEspecialidadeAlt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfEspecialidadeAlt, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(labCpfAlt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfCpfAlt, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(labSalarioAlt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfSalarioAlt, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(labCrMAlt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfCrMAlt, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(labEnderecoAlt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfEnderecoAlt, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(labTelefoneAlt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfTelefoneAlt, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(btNomePesquisaAlt, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCancelarAlt, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btSalvarAlt, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout dialogAlteracaoLayout = new javax.swing.GroupLayout(dialogAlteracao.getContentPane());
        dialogAlteracao.getContentPane().setLayout(dialogAlteracaoLayout);
        dialogAlteracaoLayout.setHorizontalGroup(
            dialogAlteracaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dialogAlteracaoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        dialogAlteracaoLayout.setVerticalGroup(
            dialogAlteracaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogAlteracaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panTop.setBackground(new java.awt.Color(255, 255, 255));
        panTop.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 5, 0, new java.awt.Color(249, 100, 100)));
        panTop.setPreferredSize(new java.awt.Dimension(504, 145));

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

        labFuncionario.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        labFuncionario.setText("FUNCIONÁRIOS");
        labFuncionario.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(249, 100, 100)));
        labFuncionario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labFuncionario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labFuncionarioMouseClicked(evt);
            }
        });

        labCadFuncionario.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        labCadFuncionario.setText("CADASTRAR FUNCIONÁRIO");
        labCadFuncionario.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(249, 100, 100)));
        labCadFuncionario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labCadFuncionario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labCadFuncionarioMouseClicked(evt);
            }
        });

        panUser.setBackground(new java.awt.Color(255, 255, 255));

        labUserImage.setForeground(new java.awt.Color(255, 0, 0));
        labUserImage.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("https://media.discordapp.net/attachments/445732137623224331/1042497768830279770/icone_adm2_SAS.png?width=40&height=40")
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
        labUser.setText("Administrador");
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
                .addGroup(panUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labLogout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labUser, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        panUserLayout.setVerticalGroup(
            panUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panUserLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(panUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labUserImage, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                    .addComponent(labUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labLogout)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout panTopLayout = new javax.swing.GroupLayout(panTop);
        panTop.setLayout(panTopLayout);
        panTopLayout.setHorizontalGroup(
            panTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panTopLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(labLogo)
                .addGroup(panTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panTopLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(filler2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panTopLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labFuncionario)
                        .addGap(370, 370, 370)
                        .addComponent(labCadFuncionario)
                        .addGap(391, 391, 391)))
                .addComponent(panUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panTopLayout.setVerticalGroup(
            panTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panTopLayout.createSequentialGroup()
                .addGroup(panTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panTopLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(panTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(panTopLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(labFuncionario)
                                    .addComponent(labCadFuncionario))
                                .addGap(12, 12, 12)
                                .addComponent(filler2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addComponent(panUser, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        panCards.setBackground(new java.awt.Color(231, 231, 231));
        panCards.setLayout(new java.awt.CardLayout());

        cardCadFuncionario.setBackground(new java.awt.Color(231, 231, 231));
        cardCadFuncionario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        panInfo.setBackground(new java.awt.Color(255, 255, 255));
        panInfo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(249, 100, 100), 1, true));

        tfNome.setBackground(new java.awt.Color(242, 242, 242));
        tfNome.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(249, 100, 100)));
        tfNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNomeActionPerformed(evt);
            }
        });

        labNome.setText("NOME");

        tfNasc.setBackground(new java.awt.Color(242, 242, 242));
        tfNasc.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(249, 100, 100)));
        tfNasc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNascActionPerformed(evt);
            }
        });

        labNasc.setText("<html>DATA DE NASCIMENTO<br />DD/MM/AAAA</html>");

        tfCpf.setBackground(new java.awt.Color(242, 242, 242));
        tfCpf.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(249, 100, 100)));
        tfCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCpfActionPerformed(evt);
            }
        });

        labCpf.setText("CPF");

        tfTelefone.setBackground(new java.awt.Color(242, 242, 242));
        tfTelefone.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(249, 100, 100)));
        tfTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfTelefoneActionPerformed(evt);
            }
        });

        labTelefone.setText("TELEFONE");

        tfEndereco.setBackground(new java.awt.Color(242, 242, 242));
        tfEndereco.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(249, 100, 100)));
        tfEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfEnderecoActionPerformed(evt);
            }
        });

        labEndereco.setText("ENDEREÇO");

        tfCrM.setBackground(new java.awt.Color(242, 242, 242));
        tfCrM.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(249, 100, 100)));
        tfCrM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCrMActionPerformed(evt);
            }
        });

        labCrM.setText("CRM");

        bgEquipe.add(rbAtendimento);
        rbAtendimento.setText("ATENDIMENTO");
        rbAtendimento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rbAtendimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbAtendimentoActionPerformed(evt);
            }
        });

        bgEquipe.add(rbEnfermagem);
        rbEnfermagem.setText("ENFERMAGEM");
        rbEnfermagem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rbEnfermagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbEnfermagemActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel5.setText("Selecionar Equipe");

        bgEquipe.add(rbMedica);
        rbMedica.setText("MÉDICA");
        rbMedica.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rbMedica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbMedicaActionPerformed(evt);
            }
        });

        tfSalario.setBackground(new java.awt.Color(242, 242, 242));
        tfSalario.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(249, 100, 100)));
        tfSalario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfSalarioActionPerformed(evt);
            }
        });

        labSalario.setText("SALÁRIO");

        tfEspecialidade.setBackground(new java.awt.Color(242, 242, 242));
        tfEspecialidade.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(249, 100, 100)));
        tfEspecialidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfEspecialidadeActionPerformed(evt);
            }
        });

        labEspecialidade.setText("ESPECIALIDADE");

        bgEquipe.add(rbAdministracao);
        rbAdministracao.setText("ADMINISTRAÇÃO");
        rbAdministracao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rbAdministracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbAdministracaoActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout panInfoLayout = new javax.swing.GroupLayout(panInfo);
        panInfo.setLayout(panInfoLayout);
        panInfoLayout.setHorizontalGroup(
            panInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panInfoLayout.createSequentialGroup()
                .addGroup(panInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panInfoLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(panInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(panInfoLayout.createSequentialGroup()
                                .addComponent(rbAdministracao)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rbAtendimento)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rbEnfermagem)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rbMedica)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panInfoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panInfoLayout.createSequentialGroup()
                .addGroup(panInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panInfoLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panInfoLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(panInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfEndereco)
                            .addComponent(tfCpf)
                            .addComponent(labNome)
                            .addComponent(tfNome, javax.swing.GroupLayout.DEFAULT_SIZE, 567, Short.MAX_VALUE)
                            .addComponent(labCpf)
                            .addComponent(labEndereco))
                        .addGap(18, 18, 18)
                        .addGroup(panInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labTelefone)
                            .addComponent(tfTelefone)
                            .addGroup(panInfoLayout.createSequentialGroup()
                                .addGroup(panInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labNasc)
                                    .addComponent(tfNasc)
                                    .addComponent(labSalario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tfSalario))
                                .addGap(18, 18, 18)
                                .addGroup(panInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labEspecialidade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tfEspecialidade, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
                                    .addComponent(labCrM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tfCrM))))))
                .addGap(167, 167, 167))
            .addGroup(panInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator2)
                .addContainerGap())
        );
        panInfoLayout.setVerticalGroup(
            panInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panInfoLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(panInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbEnfermagem)
                    .addComponent(rbMedica)
                    .addComponent(rbAtendimento)
                    .addComponent(rbAdministracao))
                .addGap(27, 27, 27)
                .addGroup(panInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panInfoLayout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(panInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panInfoLayout.createSequentialGroup()
                                .addComponent(labNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panInfoLayout.createSequentialGroup()
                                .addComponent(labNome)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panInfoLayout.createSequentialGroup()
                        .addComponent(labEspecialidade)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfEspecialidade, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panInfoLayout.createSequentialGroup()
                        .addComponent(labCpf)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panInfoLayout.createSequentialGroup()
                        .addComponent(labSalario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panInfoLayout.createSequentialGroup()
                        .addComponent(labCrM)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfCrM, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(panInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tfEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panInfoLayout.createSequentialGroup()
                        .addComponent(labEndereco)
                        .addGap(39, 39, 39))
                    .addGroup(panInfoLayout.createSequentialGroup()
                        .addComponent(labTelefone)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27)
                .addComponent(btLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btCadastrar.setBackground(new java.awt.Color(249, 100, 100));
        btCadastrar.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        btCadastrar.setForeground(new java.awt.Color(255, 255, 255));
        btCadastrar.setText("CADASTRAR");
        btCadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout cardCadFuncionarioLayout = new javax.swing.GroupLayout(cardCadFuncionario);
        cardCadFuncionario.setLayout(cardCadFuncionarioLayout);
        cardCadFuncionarioLayout.setHorizontalGroup(
            cardCadFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardCadFuncionarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(22, 22, 22)
                .addComponent(btCadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, 760, Short.MAX_VALUE)
                .addGap(22, 22, 22))
        );
        cardCadFuncionarioLayout.setVerticalGroup(
            cardCadFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardCadFuncionarioLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(panInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(16, 16, 16))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cardCadFuncionarioLayout.createSequentialGroup()
                .addContainerGap(420, Short.MAX_VALUE)
                .addComponent(btCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(421, Short.MAX_VALUE))
        );

        panCards.add(cardCadFuncionario, "cardCadFuncionario");

        cardFuncionarios.setBackground(new java.awt.Color(231, 231, 231));
        cardFuncionarios.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jScrollPane4.setBorder(null);
        jScrollPane4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        tabFuncionario.setBackground(new java.awt.Color(242, 242, 242));
        tabFuncionario.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        tabFuncionario.setForeground(new java.awt.Color(51, 51, 51));
        tabFuncionario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nome", "Cargo", "Salário", "Telefone", "CPF"
            }
        ));
        tabFuncionario.setGridColor(new java.awt.Color(204, 204, 204));
        tabFuncionario.setIntercellSpacing(new java.awt.Dimension(0, 5));
        tabFuncionario.setRowHeight(20);
        tabFuncionario.setSelectionBackground(new java.awt.Color(196, 67, 67));
        tabFuncionario.setShowGrid(true);
        jScrollPane4.setViewportView(tabFuncionario);

        lbFiltrarEquipe.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        lbFiltrarEquipe.setText("Filtrar Equipe");

        rbEnfermeira.setText("ENFERMAGEM");
        rbEnfermeira.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rbEnfermeira.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbEnfermeiraActionPerformed(evt);
            }
        });

        rbAtendente.setText("ATENDIMENTO");
        rbAtendente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbAtendenteActionPerformed(evt);
            }
        });

        rbMedico.setText("MÉDICA");
        rbMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbMedicoActionPerformed(evt);
            }
        });

        btNomePesquisa.setBackground(new java.awt.Color(249, 100, 100));
        btNomePesquisa.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btNomePesquisa.setForeground(new java.awt.Color(255, 255, 255));
        btNomePesquisa.setText("PESQUISAR");
        btNomePesquisa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btNomePesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNomePesquisaActionPerformed(evt);
            }
        });

        labNomePesquisa.setText("NOME");

        jButton2.setBackground(new java.awt.Color(249, 100, 100));
        jButton2.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("ALTERAR");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        rbAdministrador.setText("ADMINISTRAÇÃO");
        rbAdministrador.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rbAdministrador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbAdministradorActionPerformed(evt);
            }
        });

        tfNome1.setBackground(new java.awt.Color(242, 242, 242));
        tfNome1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(249, 100, 100)));

        btRefresh.setBackground(new java.awt.Color(249, 100, 100));
        btRefresh.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        btRefresh.setForeground(new java.awt.Color(255, 255, 255));
        btRefresh.setText("🔄");
        btRefresh.setToolTipText("Atualizar Tabela");
        btRefresh.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRefreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout cardFuncionariosLayout = new javax.swing.GroupLayout(cardFuncionarios);
        cardFuncionarios.setLayout(cardFuncionariosLayout);
        cardFuncionariosLayout.setHorizontalGroup(
            cardFuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardFuncionariosLayout.createSequentialGroup()
                .addGroup(cardFuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(cardFuncionariosLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(cardFuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(cardFuncionariosLayout.createSequentialGroup()
                                .addComponent(rbAtendente)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rbMedico)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rbAdministrador)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rbEnfermeira))
                            .addComponent(lbFiltrarEquipe))
                        .addGap(385, 385, 385)
                        .addGroup(cardFuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfNome1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labNomePesquisa))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btNomePesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, cardFuncionariosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane4)))
                .addGap(22, 22, 22)
                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 707, Short.MAX_VALUE)
                .addGap(22, 22, 22))
        );
        cardFuncionariosLayout.setVerticalGroup(
            cardFuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cardFuncionariosLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(cardFuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(cardFuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cardFuncionariosLayout.createSequentialGroup()
                            .addGap(0, 23, Short.MAX_VALUE)
                            .addGroup(cardFuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btNomePesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tfNome1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(cardFuncionariosLayout.createSequentialGroup()
                            .addGroup(cardFuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lbFiltrarEquipe)
                                .addComponent(labNomePesquisa))
                            .addGap(16, 16, 16)
                            .addGroup(cardFuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(rbAtendente)
                                .addComponent(rbMedico)
                                .addComponent(rbAdministrador)
                                .addComponent(rbEnfermeira)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(cardFuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 813, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cardFuncionariosLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        panCards.add(cardFuncionarios, "cardFuncionarios");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panTop, javax.swing.GroupLayout.DEFAULT_SIZE, 2010, Short.MAX_VALUE)
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

    private void rbEnfermeiraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbEnfermeiraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbEnfermeiraActionPerformed

    private void rbAtendenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbAtendenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbAtendenteActionPerformed

    private void rbMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbMedicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbMedicoActionPerformed

    private void btNomePesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNomePesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btNomePesquisaActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void rbAtendimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbAtendimentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbAtendimentoActionPerformed

    private void rbEnfermagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbEnfermagemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbEnfermagemActionPerformed

    private void rbMedicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbMedicaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbMedicaActionPerformed

    private void rbAdministradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbAdministradorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbAdministradorActionPerformed

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed
        cadastrarFunc();
    }//GEN-LAST:event_btCadastrarActionPerformed

    private void rbAdministracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbAdministracaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbAdministracaoActionPerformed

    private void btRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRefreshActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btRefreshActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        limpar();
    }//GEN-LAST:event_btLimparActionPerformed

    private void btNomePesquisaAltActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNomePesquisaAltActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btNomePesquisaAltActionPerformed

    private void btCancelarAltActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarAltActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btCancelarAltActionPerformed

    private void btSalvarAltActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarAltActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btSalvarAltActionPerformed

    private void tfNascAltActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNascAltActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNascAltActionPerformed

    private void labLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labLogoutMouseClicked
        sair();
    }//GEN-LAST:event_labLogoutMouseClicked

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

    private void labCadFuncionarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labCadFuncionarioMouseClicked
        cardLayout.show(panCards, "cardCadFuncionario");
        labFuncionario.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(249, 100, 100)));
        labCadFuncionario.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(249, 100, 100)));
        labCadFuncionario.setFont(new java.awt.Font("Verdana", 0, 18));
        labFuncionario.setFont(new java.awt.Font("Verdana", 0, 14));
    }//GEN-LAST:event_labCadFuncionarioMouseClicked

    private void labFuncionarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labFuncionarioMouseClicked
        cardLayout.show(panCards, "cardFuncionarios");
        labCadFuncionario.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(249, 100, 100)));
        labFuncionario.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(249, 100, 100)));
        labFuncionario.setFont(new java.awt.Font("Verdana", 0, 18));
        labCadFuncionario.setFont(new java.awt.Font("Verdana", 0, 14));
    }//GEN-LAST:event_labFuncionarioMouseClicked

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

    private void tfNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNomeActionPerformed

    private void tfCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCpfActionPerformed

    private void tfEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfEnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfEnderecoActionPerformed

    private void tfNascActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNascActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNascActionPerformed

    private void tfEspecialidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfEspecialidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfEspecialidadeActionPerformed

    private void tfSalarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfSalarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfSalarioActionPerformed

    private void tfCrMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCrMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCrMActionPerformed

    private void tfTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfTelefoneActionPerformed

    public void cadastrarFunc(){
        String feedback = "";
        
        String tipo = 
        String id_adm = 
        String senha = 
        String nome = 
        String[] data_nascimento = 
        String cpf = 
        String telefone = 
        String endereco = 
        String salario = 
        String cr = 
        String crm = 
        String especialidade = 
        
        feedback = AdministradorController.cadastrarFuncionario(ID, ID, ID, ID, data_nascimento, ID, ID, ID, ID, ID, ID, ID);
    }
    
    public void limpar() {
        tfNome.setText("");
        tfCpf.setText("");
        tfNasc.setText("");
        tfEndereco.setText("");
        tfEspecialidade.setText("");
        tfSalario.setText("");
        tfCrM.setText("");
        tfTelefone.setText("");
        tfNome.requestFocus();
    }
    
    public void sair(){
        dispose();
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
            java.util.logging.Logger.getLogger(JanAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JanAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JanAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JanAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgEquipe;
    private javax.swing.ButtonGroup bgFiltro;
    private javax.swing.JButton btCadastrar;
    private javax.swing.JButton btCancelarAlt;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btNomePesquisa;
    private javax.swing.JButton btNomePesquisaAlt;
    private javax.swing.JButton btRefresh;
    private javax.swing.JButton btSalvarAlt;
    private javax.swing.JPanel cardCadFuncionario;
    private javax.swing.JPanel cardFuncionarios;
    private javax.swing.JDialog dialogAlteracao;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel labAlt;
    private javax.swing.JLabel labCadFuncionario;
    private javax.swing.JLabel labCpf;
    private javax.swing.JLabel labCpfAlt;
    private javax.swing.JLabel labCrM;
    private javax.swing.JLabel labCrMAlt;
    private javax.swing.JLabel labEndereco;
    private javax.swing.JLabel labEnderecoAlt;
    private javax.swing.JLabel labEspecialidade;
    private javax.swing.JLabel labEspecialidadeAlt;
    private javax.swing.JLabel labFuncionario;
    private javax.swing.JLabel labLogo;
    private javax.swing.JLabel labLogout;
    private javax.swing.JLabel labNasc;
    private javax.swing.JLabel labNascAlt;
    private javax.swing.JLabel labNome;
    private javax.swing.JLabel labNomeAlt;
    private javax.swing.JLabel labNomePesquisa;
    private javax.swing.JLabel labSalario;
    private javax.swing.JLabel labSalarioAlt;
    private javax.swing.JLabel labTelefone;
    private javax.swing.JLabel labTelefoneAlt;
    private javax.swing.JLabel labUser;
    private javax.swing.JLabel labUserImage;
    private javax.swing.JLabel lbFiltrarEquipe;
    private javax.swing.JPanel panCards;
    private javax.swing.JPanel panInfo;
    private javax.swing.JPanel panTop;
    private javax.swing.JPanel panUser;
    private javax.swing.JRadioButton rbAdministracao;
    private javax.swing.JRadioButton rbAdministrador;
    private javax.swing.JRadioButton rbAtendente;
    private javax.swing.JRadioButton rbAtendimento;
    private javax.swing.JRadioButton rbEnfermagem;
    private javax.swing.JRadioButton rbEnfermeira;
    private javax.swing.JRadioButton rbMedica;
    private javax.swing.JRadioButton rbMedico;
    private javax.swing.JTable tabFuncionario;
    private javax.swing.JTextField tfCpf;
    private javax.swing.JTextField tfCpfAlt;
    private javax.swing.JTextField tfCrM;
    private javax.swing.JTextField tfCrMAlt;
    private javax.swing.JTextField tfEndereco;
    private javax.swing.JTextField tfEnderecoAlt;
    private javax.swing.JTextField tfEspecialidade;
    private javax.swing.JTextField tfEspecialidadeAlt;
    private javax.swing.JTextField tfNasc;
    private javax.swing.JTextField tfNascAlt;
    private javax.swing.JTextField tfNome;
    private javax.swing.JTextField tfNome1;
    private javax.swing.JTextField tfNomeAlt;
    private javax.swing.JTextField tfSalario;
    private javax.swing.JTextField tfSalarioAlt;
    private javax.swing.JTextField tfTelefone;
    private javax.swing.JTextField tfTelefoneAlt;
    // End of variables declaration//GEN-END:variables
}
