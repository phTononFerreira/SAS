package com.sas.view;

import com.sas.controller.AtendenteController;
import com.sas.controller.PacienteController;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class JanAtendente extends javax.swing.JFrame {

    private static JanAtendente unicoJanAtendente;
    private static String ID;
    private static String consultaID;
    private Boolean Muser=false;
    private static String idPaciente;
    private static String idMedico;
    private static String idPacienteEdit;
    
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
    
    public String getIdPaciente() {
        return idPaciente;
    }

    public static void setIdPaciente(String idPaciente1) {
        idPaciente = idPaciente1;
    }
    
    public String getIdMedico() {
        return idMedico;
    }

    public static void setIdMedico(String idMedico1) {
        idMedico = idMedico1;
    }
    
    public String getIdPacienteEdit() {
        return idPacienteEdit;
    }

    public static void setIdPacienteEdit(String idPacienteEdit1) {
        idPacienteEdit = idPacienteEdit1;
    }

    public JanAtendente() {
        initComponents();
        
        //ICON
        ImageIcon img = new ImageIcon("img\\SAS_icon.png");
        this.setIconImage(img.getImage());
        
        //WINDOW SIZE
        cardLayout = (CardLayout) (panCardsAtendente.getLayout());
        this.setExtendedState(MAXIMIZED_BOTH);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setSize(dim.width, dim.height);
        
        //UPDATE TABLE
        carregaTabela();
        carregaTabelaPaciente();
        carregaTabelaMedico();
        carregaTabelaPacienteEdit();
        
        //SET ID NULL
        setIdPaciente(null);
        setIdMedico(null);
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

        dialogPopUpStatus = new javax.swing.JDialog();
        dialogPopUpStatus.setLocationRelativeTo(null);
        panCadInsBack = new javax.swing.JPanel();
        labPopUpStatus = new javax.swing.JLabel();
        btOK = new javax.swing.JButton();
        dialogOptionPane = new javax.swing.JDialog();
        dialogPopUpStatus.setLocationRelativeTo(null);
        panCadInsBack1 = new javax.swing.JPanel();
        btConfirmar = new javax.swing.JButton();
        labOptionPane = new javax.swing.JLabel();
        btCancelar1 = new javax.swing.JButton();
        panTop = new javax.swing.JPanel();
        labAgenConsulta = new javax.swing.JLabel();
        labLogo = new javax.swing.JLabel();
        labCadPaciente = new javax.swing.JLabel();
        labConsulta = new javax.swing.JLabel();
        labAltPaciente = new javax.swing.JLabel();
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
        jlStatusCon = new javax.swing.JLabel();
        btCancelar = new javax.swing.JButton();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        btEncaminhar = new javax.swing.JButton();
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
        cardAlterarPacientes = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabSelPaciente2 = new javax.swing.JTable();
        btNomePesquisaAltPac = new javax.swing.JButton();
        tfNomeAltPac = new javax.swing.JTextField();
        labNomePesquisaAltPac = new javax.swing.JLabel();
        btlRefreshAltPac = new javax.swing.JButton();
        tfAltDataNasc = new javax.swing.JTextField();
        tfAltTelefone = new javax.swing.JTextField();
        tfAltEndereco = new javax.swing.JTextField();
        labAltEndereco = new javax.swing.JLabel();
        tfAltCPF = new javax.swing.JTextField();
        labAltCPF = new javax.swing.JLabel();
        tfAltNome = new javax.swing.JTextField();
        labAltNome = new javax.swing.JLabel();
        lbAltTelefone = new javax.swing.JLabel();
        labAltDataNasc = new javax.swing.JLabel();
        btLimparAlt = new javax.swing.JButton();
        labSelAltPaciente = new javax.swing.JLabel();
        labStatusEdit = new javax.swing.JLabel();
        btAltSalvar = new javax.swing.JButton();

        dialogPopUpStatus.setTitle("SAS ALERT");
        dialogPopUpStatus.setLocation(new java.awt.Point(800, 500));
        dialogPopUpStatus.setMinimumSize(new java.awt.Dimension(443, 175));
        dialogPopUpStatus.setResizable(false);
        dialogPopUpStatus.addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
                dialogPopUpStatusWindowLostFocus(evt);
            }
        });

        panCadInsBack.setBackground(new java.awt.Color(255, 255, 255));
        panCadInsBack.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(239, 100, 100)));

        labPopUpStatus.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        labPopUpStatus.setForeground(new java.awt.Color(51, 51, 51));
        labPopUpStatus.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labPopUpStatus.setText("SAS ALERT");

        btOK.setBackground(new java.awt.Color(249, 100, 100));
        btOK.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btOK.setForeground(new java.awt.Color(255, 255, 255));
        btOK.setText("OK");
        btOK.setActionCommand("<html><center>ALTERAR QUANTIDADE</center></html>");
        btOK.setBorder(null);
        btOK.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btOKActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panCadInsBackLayout = new javax.swing.GroupLayout(panCadInsBack);
        panCadInsBack.setLayout(panCadInsBackLayout);
        panCadInsBackLayout.setHorizontalGroup(
            panCadInsBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panCadInsBackLayout.createSequentialGroup()
                .addGroup(panCadInsBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panCadInsBackLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btOK, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panCadInsBackLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(labPopUpStatus, javax.swing.GroupLayout.DEFAULT_SIZE, 399, Short.MAX_VALUE)))
                .addGap(15, 15, 15))
        );
        panCadInsBackLayout.setVerticalGroup(
            panCadInsBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panCadInsBackLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(labPopUpStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btOK, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout dialogPopUpStatusLayout = new javax.swing.GroupLayout(dialogPopUpStatus.getContentPane());
        dialogPopUpStatus.getContentPane().setLayout(dialogPopUpStatusLayout);
        dialogPopUpStatusLayout.setHorizontalGroup(
            dialogPopUpStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogPopUpStatusLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panCadInsBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        dialogPopUpStatusLayout.setVerticalGroup(
            dialogPopUpStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogPopUpStatusLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panCadInsBack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        dialogOptionPane.setTitle("SAS ALERT");
        dialogOptionPane.setLocation(new java.awt.Point(800, 500));
        dialogOptionPane.setMinimumSize(new java.awt.Dimension(443, 175));
        dialogOptionPane.setResizable(false);
        dialogOptionPane.addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
                dialogOptionPaneWindowLostFocus(evt);
            }
        });

        panCadInsBack1.setBackground(new java.awt.Color(255, 255, 255));
        panCadInsBack1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(239, 100, 100)));

        btConfirmar.setBackground(new java.awt.Color(249, 100, 100));
        btConfirmar.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btConfirmar.setForeground(new java.awt.Color(255, 255, 255));
        btConfirmar.setText("CONFIRMAR");
        btConfirmar.setActionCommand("<html><center>ALTERAR QUANTIDADE</center></html>");
        btConfirmar.setBorder(null);
        btConfirmar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConfirmarActionPerformed(evt);
            }
        });

        labOptionPane.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        labOptionPane.setForeground(new java.awt.Color(51, 51, 51));
        labOptionPane.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labOptionPane.setText("SAS OPTION PANE");

        btCancelar1.setBackground(new java.awt.Color(249, 100, 100));
        btCancelar1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btCancelar1.setForeground(new java.awt.Color(255, 255, 255));
        btCancelar1.setText("CANCELAR");
        btCancelar1.setActionCommand("<html><center>ALTERAR QUANTIDADE</center></html>");
        btCancelar1.setBorder(null);
        btCancelar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btCancelar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panCadInsBack1Layout = new javax.swing.GroupLayout(panCadInsBack1);
        panCadInsBack1.setLayout(panCadInsBack1Layout);
        panCadInsBack1Layout.setHorizontalGroup(
            panCadInsBack1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panCadInsBack1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(panCadInsBack1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labOptionPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panCadInsBack1Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(btConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btCancelar1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(12, 12, 12))
        );
        panCadInsBack1Layout.setVerticalGroup(
            panCadInsBack1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panCadInsBack1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(labOptionPane, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panCadInsBack1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btCancelar1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );

        javax.swing.GroupLayout dialogOptionPaneLayout = new javax.swing.GroupLayout(dialogOptionPane.getContentPane());
        dialogOptionPane.getContentPane().setLayout(dialogOptionPaneLayout);
        dialogOptionPaneLayout.setHorizontalGroup(
            dialogOptionPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogOptionPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panCadInsBack1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        dialogOptionPaneLayout.setVerticalGroup(
            dialogOptionPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogOptionPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panCadInsBack1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

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

        labAltPaciente.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        labAltPaciente.setText("Alterar Pacientes");
        labAltPaciente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labAltPaciente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labAltPacienteMouseClicked(evt);
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
                .addComponent(labAltPaciente)
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
                    .addComponent(labAgenConsulta)
                    .addComponent(labAltPaciente))
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
                "Código Consulta", "Paciente", "Horário da Consulta"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
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
            .addGroup(panInformacoesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panInformacoesLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jlStatusCon, javax.swing.GroupLayout.PREFERRED_SIZE, 655, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btRefresh1))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1196, Short.MAX_VALUE))
                .addGap(30, 30, 30))
        );
        panInformacoesLayout.setVerticalGroup(
            panInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panInformacoesLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(panInformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btRefresh1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlStatusCon))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 625, Short.MAX_VALUE)
                .addGap(215, 215, 215))
        );

        btCancelar.setBackground(new java.awt.Color(249, 100, 100));
        btCancelar.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btCancelar.setText("CANCELAR CONSULTA");
        btCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout cardConsultaLayout = new javax.swing.GroupLayout(cardConsulta);
        cardConsulta.setLayout(cardConsultaLayout);
        cardConsultaLayout.setHorizontalGroup(
            cardConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardConsultaLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(panInformacoes, javax.swing.GroupLayout.DEFAULT_SIZE, 1240, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(cardConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cardConsultaLayout.createSequentialGroup()
                        .addGap(325, 325, 325)
                        .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(336, Short.MAX_VALUE))
                    .addGroup(cardConsultaLayout.createSequentialGroup()
                        .addGroup(cardConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btEncaminhar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        cardConsultaLayout.setVerticalGroup(
            cardConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardConsultaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cardConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cardConsultaLayout.createSequentialGroup()
                        .addComponent(panInformacoes, javax.swing.GroupLayout.DEFAULT_SIZE, 909, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(cardConsultaLayout.createSequentialGroup()
                        .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 356, Short.MAX_VALUE)
                        .addComponent(btEncaminhar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(361, Short.MAX_VALUE))))
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
        tfNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfNomeKeyPressed(evt);
            }
        });

        tfCPF.setBackground(new java.awt.Color(242, 242, 242));
        tfCPF.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(249, 100, 100)));
        tfCPF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfCPFKeyPressed(evt);
            }
        });

        labCPF.setText("CPF*");
        labCPF.setToolTipText("");

        tfDataNasc.setBackground(new java.awt.Color(242, 242, 242));
        tfDataNasc.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(249, 100, 100)));
        tfDataNasc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfDataNascKeyPressed(evt);
            }
        });

        labDataNasc.setText("<html>DATA DE NASCIMENTO*<br />DD/MM/AAAA</html>");

        labEndereco.setText("ENDEREÇO");

        tfEndereco.setBackground(new java.awt.Color(242, 242, 242));
        tfEndereco.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(249, 100, 100)));
        tfEndereco.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfEnderecoKeyPressed(evt);
            }
        });

        tfTelefone.setBackground(new java.awt.Color(242, 242, 242));
        tfTelefone.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(249, 100, 100)));
        tfTelefone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfTelefoneKeyPressed(evt);
            }
        });

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
                                        .addGap(0, 6, Short.MAX_VALUE)))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 154, Short.MAX_VALUE)
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
                .addContainerGap(612, Short.MAX_VALUE))
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
                .addContainerGap(496, Short.MAX_VALUE)
                .addComponent(btAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(497, Short.MAX_VALUE))
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
                "Código Paciente", "Paciente"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
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
        tfNomePac.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfNomePacKeyPressed(evt);
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
                "Código Médico", "Médico"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
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
        tfNomeMed.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfNomeMedKeyPressed(evt);
            }
        });

        labNomePesquisaMed.setText("NOME");

        lanSelMed.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        lanSelMed.setText("SELECIONAR MÉDICO");

        tfAgenData.setBackground(new java.awt.Color(242, 242, 242));
        tfAgenData.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(249, 100, 100)));
        tfAgenData.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfAgenDataKeyPressed(evt);
            }
        });

        labAgenData.setText("<html>HORA DA CONSULTA<br>HH:MM:SS</html>");

        tfAgenHora.setBackground(new java.awt.Color(242, 242, 242));
        tfAgenHora.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(249, 100, 100)));
        tfAgenHora.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfAgenHoraKeyPressed(evt);
            }
        });

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
                            .addComponent(jSeparator2)
                            .addGroup(panAgendarLayout.createSequentialGroup()
                                .addGroup(panAgendarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lanSelPaciente)
                                    .addGroup(panAgendarLayout.createSequentialGroup()
                                        .addComponent(tfNomePac, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btNomePesquisaPac, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btlRefreshPac))
                                    .addComponent(labNomePesquisaPac)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 155, Short.MAX_VALUE)
                                .addGroup(panAgendarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lanSelMed)
                                    .addGroup(panAgendarLayout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addGroup(panAgendarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(labNomePesquisaMed)
                                            .addGroup(panAgendarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addGroup(panAgendarLayout.createSequentialGroup()
                                                    .addComponent(tfNomeMed, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(btNomePesquisa1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(btRefreshMed))
                                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(36, 36, 36)))
                        .addGap(40, 40, 40))
                    .addGroup(panAgendarLayout.createSequentialGroup()
                        .addGroup(panAgendarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfAgenData, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labAgenData1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(65, 65, 65)
                        .addGroup(panAgendarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfAgenHora, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                            .addComponent(labAgenData))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        panAgendarLayout.setVerticalGroup(
            panAgendarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panAgendarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panAgendarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panAgendarLayout.createSequentialGroup()
                        .addComponent(lanSelPaciente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labNomePesquisaPac)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panAgendarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(panAgendarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btNomePesquisaPac, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btlRefreshPac, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                            .addComponent(tfNomePac, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panAgendarLayout.createSequentialGroup()
                        .addComponent(lanSelMed)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labNomePesquisaMed)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panAgendarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(panAgendarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btNomePesquisa1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btRefreshMed, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                            .addComponent(tfNomeMed, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(41, 41, 41)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panAgendarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labAgenData1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labAgenData))
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
                .addComponent(btAgendar, javax.swing.GroupLayout.DEFAULT_SIZE, 682, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );
        cardAgendarConsultaLayout.setVerticalGroup(
            cardAgendarConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardAgendarConsultaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cardAgendarConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panAgendar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(cardAgendarConsultaLayout.createSequentialGroup()
                        .addGap(0, 486, Short.MAX_VALUE)
                        .addComponent(btAgendar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 484, Short.MAX_VALUE)))
                .addContainerGap())
        );

        panCardsAtendente.add(cardAgendarConsulta, "cardAgendarConsulta");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(239, 100, 100)));

        jScrollPane4.setBorder(null);
        jScrollPane4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        tabSelPaciente2.setBackground(new java.awt.Color(242, 242, 242));
        tabSelPaciente2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        tabSelPaciente2.setForeground(new java.awt.Color(51, 51, 51));
        tabSelPaciente2.setModel(new javax.swing.table.DefaultTableModel(
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
                "Código", "Paciente", "CPF"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabSelPaciente2.setGridColor(new java.awt.Color(204, 204, 204));
        tabSelPaciente2.setRowHeight(30);
        tabSelPaciente2.setRowMargin(7);
        tabSelPaciente2.setSelectionBackground(new java.awt.Color(196, 67, 67));
        tabSelPaciente2.setShowGrid(true);
        tabSelPaciente2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tabSelPaciente2MousePressed(evt);
            }
        });
        jScrollPane4.setViewportView(tabSelPaciente2);

        btNomePesquisaAltPac.setBackground(new java.awt.Color(249, 100, 100));
        btNomePesquisaAltPac.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btNomePesquisaAltPac.setForeground(new java.awt.Color(255, 255, 255));
        btNomePesquisaAltPac.setText("PESQUISAR");
        btNomePesquisaAltPac.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btNomePesquisaAltPac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNomePesquisaAltPacActionPerformed(evt);
            }
        });

        tfNomeAltPac.setBackground(new java.awt.Color(242, 242, 242));
        tfNomeAltPac.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(249, 100, 100)));
        tfNomeAltPac.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfNomeAltPacKeyPressed(evt);
            }
        });

        labNomePesquisaAltPac.setText("NOME");

        btlRefreshAltPac.setBackground(new java.awt.Color(249, 100, 100));
        btlRefreshAltPac.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        btlRefreshAltPac.setForeground(new java.awt.Color(255, 255, 255));
        btlRefreshAltPac.setText("🔄");
        btlRefreshAltPac.setToolTipText("Atualizar Tabela");
        btlRefreshAltPac.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btlRefreshAltPac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btlRefreshAltPacActionPerformed(evt);
            }
        });

        tfAltDataNasc.setBackground(new java.awt.Color(242, 242, 242));
        tfAltDataNasc.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(249, 100, 100)));
        tfAltDataNasc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfAltDataNascKeyPressed(evt);
            }
        });

        tfAltTelefone.setBackground(new java.awt.Color(242, 242, 242));
        tfAltTelefone.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(249, 100, 100)));
        tfAltTelefone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfAltTelefoneKeyPressed(evt);
            }
        });

        tfAltEndereco.setBackground(new java.awt.Color(242, 242, 242));
        tfAltEndereco.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(249, 100, 100)));
        tfAltEndereco.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfAltEnderecoKeyPressed(evt);
            }
        });

        labAltEndereco.setText("ENDEREÇO");

        tfAltCPF.setBackground(new java.awt.Color(242, 242, 242));
        tfAltCPF.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(249, 100, 100)));
        tfAltCPF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfAltCPFKeyPressed(evt);
            }
        });

        labAltCPF.setText("CPF*");
        labAltCPF.setToolTipText("");

        tfAltNome.setBackground(new java.awt.Color(242, 242, 242));
        tfAltNome.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(249, 100, 100)));
        tfAltNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfAltNomeKeyPressed(evt);
            }
        });

        labAltNome.setText("NOME*");

        lbAltTelefone.setText("TELEFONE");

        labAltDataNasc.setText("<html>DATA DE NASCIMENTO*<br />DD/MM/AAAA</html>");

        btLimparAlt.setBackground(new java.awt.Color(249, 100, 100));
        btLimparAlt.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btLimparAlt.setForeground(new java.awt.Color(255, 255, 255));
        btLimparAlt.setText("LIMPAR");
        btLimparAlt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btLimparAlt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparAltActionPerformed(evt);
            }
        });

        labSelAltPaciente.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        labSelAltPaciente.setText("SELECIONAR PACIENTE");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(labSelAltPaciente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(tfNomeAltPac, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btNomePesquisaAltPac, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(labNomePesquisaAltPac))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btlRefreshAltPac))
                    .addComponent(jScrollPane4)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(labAltNome)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labAltDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfAltDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbAltTelefone)
                                    .addComponent(tfAltTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(tfAltNome))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labAltCPF)
                            .addComponent(tfAltCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labAltEndereco)
                                    .addComponent(tfAltEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(btLimparAlt, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(32, 32, 32)
                .addComponent(labStatusEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(179, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(labNomePesquisaAltPac)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btNomePesquisaAltPac, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tfNomeAltPac, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labSelAltPaciente))
                    .addComponent(btlRefreshAltPac, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labStatusEdit, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(labAltNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfAltNome, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(labAltDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfAltDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbAltTelefone)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfAltTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(labAltEndereco)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfAltEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(labAltCPF)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfAltCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btLimparAlt, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(533, Short.MAX_VALUE))
        );

        btAltSalvar.setBackground(new java.awt.Color(249, 100, 100));
        btAltSalvar.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        btAltSalvar.setForeground(new java.awt.Color(255, 255, 255));
        btAltSalvar.setText("SALVAR");
        btAltSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btAltSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAltSalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout cardAlterarPacientesLayout = new javax.swing.GroupLayout(cardAlterarPacientes);
        cardAlterarPacientes.setLayout(cardAlterarPacientesLayout);
        cardAlterarPacientesLayout.setHorizontalGroup(
            cardAlterarPacientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardAlterarPacientesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btAltSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
                .addContainerGap())
        );
        cardAlterarPacientesLayout.setVerticalGroup(
            cardAlterarPacientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardAlterarPacientesLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(cardAlterarPacientesLayout.createSequentialGroup()
                .addGap(365, 365, 365)
                .addComponent(btAltSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panCardsAtendente.add(cardAlterarPacientes, "cardAlterarPaciente");

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
                .addComponent(panCardsAtendente, javax.swing.GroupLayout.DEFAULT_SIZE, 928, Short.MAX_VALUE))
        );

        setBounds(0, 0, 1936, 1119);
    }// </editor-fold>//GEN-END:initComponents

    private void labCadPacienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labCadPacienteMouseClicked
        cardLayout.show(panCardsAtendente, "cardCadastro");
        labConsulta.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(249, 100, 100)));
        labCadPaciente.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(249, 100, 100)));
        labAgenConsulta.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(249, 100, 100)));
        labAltPaciente.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(249, 100, 100)));
        labCadPaciente.setFont(new java.awt.Font("Verdana", 0, 18));
        labConsulta.setFont(new java.awt.Font("Verdana", 0, 14));
        labAgenConsulta.setFont(new java.awt.Font("Verdana", 0, 14));
        labAltPaciente.setFont(new java.awt.Font("Verdana", 0, 14));
    }//GEN-LAST:event_labCadPacienteMouseClicked

    private void labConsultaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labConsultaMouseClicked
        cardLayout.show(panCardsAtendente, "cardConsulta");
        labConsulta.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(249, 100, 100)));
        labCadPaciente.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(249, 100, 100)));
        labAgenConsulta.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(249, 100, 100)));
        labAltPaciente.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(249, 100, 100)));
        labConsulta.setFont(new java.awt.Font("Verdana", 0, 18));
        labCadPaciente.setFont(new java.awt.Font("Verdana", 0, 14));
        labAgenConsulta.setFont(new java.awt.Font("Verdana", 0, 14));
        labAltPaciente.setFont(new java.awt.Font("Verdana", 0, 14));
    }//GEN-LAST:event_labConsultaMouseClicked

    private void btAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarActionPerformed
        optionCadastrarPac();
    }//GEN-LAST:event_btAlterarActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        optionCancelarCons();
    }//GEN-LAST:event_btCancelarActionPerformed

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
        labAltPaciente.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(249, 100, 100)));
        labConsulta.setFont(new java.awt.Font("Verdana", 0, 14));
        labCadPaciente.setFont(new java.awt.Font("Verdana", 0, 14));
        labAgenConsulta.setFont(new java.awt.Font("Verdana", 0, 18));
        labAltPaciente.setFont(new java.awt.Font("Verdana", 0, 14));
    }//GEN-LAST:event_labAgenConsultaMouseClicked

    private void tabSelPaciente1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabSelPaciente1MousePressed
        setIdPaciente(tabSelPaciente1.getValueAt(tabSelPaciente1.getSelectedRow(), 0).toString());
    }//GEN-LAST:event_tabSelPaciente1MousePressed

    private void btlRefreshPacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btlRefreshPacActionPerformed
        carregaTabelaPaciente();
    }//GEN-LAST:event_btlRefreshPacActionPerformed

    private void btNomePesquisaPacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNomePesquisaPacActionPerformed
        pesquisaTabelaPaciente();
        tfNomePac.setText("");
        tfNomePac.requestFocus();
    }//GEN-LAST:event_btNomePesquisaPacActionPerformed

    private void tabSelMedicoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabSelMedicoMousePressed
        setIdMedico(tabSelMedico.getValueAt(tabSelMedico.getSelectedRow(), 0).toString());
    }//GEN-LAST:event_tabSelMedicoMousePressed

    private void btRefreshMedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRefreshMedActionPerformed
        carregaTabelaMedico();
    }//GEN-LAST:event_btRefreshMedActionPerformed

    private void btNomePesquisa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNomePesquisa1ActionPerformed
        pesquisaTabelaMedico();
        tfNomeMed.setText("");
        tfNomeMed.requestFocus();
    }//GEN-LAST:event_btNomePesquisa1ActionPerformed

    private void btAgendarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAgendarActionPerformed
        optionAgendarCons();    
    }//GEN-LAST:event_btAgendarActionPerformed

    private void btEncaminharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEncaminharActionPerformed
        optionEncaminharPac();
    }//GEN-LAST:event_btEncaminharActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated

    }//GEN-LAST:event_formWindowActivated

    private void labAltPacienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labAltPacienteMouseClicked
        cardLayout.show(panCardsAtendente, "cardAlterarPaciente");
        labConsulta.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(249, 100, 100)));
        labCadPaciente.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(249, 100, 100)));
        labAgenConsulta.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(249, 100, 100)));
        labAltPaciente.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(249, 100, 100)));
        labCadPaciente.setFont(new java.awt.Font("Verdana", 0, 14));
        labConsulta.setFont(new java.awt.Font("Verdana", 0, 14));
        labAgenConsulta.setFont(new java.awt.Font("Verdana", 0, 14));
        labAltPaciente.setFont(new java.awt.Font("Verdana", 0, 18));
    }//GEN-LAST:event_labAltPacienteMouseClicked

    private void tabSelPaciente2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabSelPaciente2MousePressed
        setIdPacienteEdit(tabSelPaciente2.getValueAt(tabSelPaciente2.getSelectedRow(), 0).toString());
        puxarDadosPacienteEdit(getIdPacienteEdit());
    }//GEN-LAST:event_tabSelPaciente2MousePressed

    private void btNomePesquisaAltPacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNomePesquisaAltPacActionPerformed
        pesquisaTabelaPacienteEdit();
        tfNomeAltPac.setText("");
        tfNomeAltPac.requestFocus();
    }//GEN-LAST:event_btNomePesquisaAltPacActionPerformed

    private void btlRefreshAltPacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btlRefreshAltPacActionPerformed
        carregaTabelaPacienteEdit();
    }//GEN-LAST:event_btlRefreshAltPacActionPerformed

    private void btLimparAltActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparAltActionPerformed
        limparEdit();
    }//GEN-LAST:event_btLimparAltActionPerformed

    private void btAltSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAltSalvarActionPerformed
        optionAlterarPac();
    }//GEN-LAST:event_btAltSalvarActionPerformed

    private void btOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btOKActionPerformed
        dialogPopUpStatus.setVisible(false);
    }//GEN-LAST:event_btOKActionPerformed

    private void dialogPopUpStatusWindowLostFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_dialogPopUpStatusWindowLostFocus
        dialogPopUpStatus.toFront();
    }//GEN-LAST:event_dialogPopUpStatusWindowLostFocus

    private void btConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConfirmarActionPerformed
        if(labOptionPane.getText().equals("Deseja alterar paciente?")){
            editarPaciente();
        }else if(labOptionPane.getText().equals("Deseja agendar a consulta?")){
            agendarConsulta();
        }else if(labOptionPane.getText().equals("Deseja cadastrar o paciente?")){
            cadastrarPaciente();
        }else if(labOptionPane.getText().equals("Deseja cancelar a consulta?")){
            cancelarConsulta();
        }else if(labOptionPane.getText().equals("Deseja encaminhar o paciente?")){
            encaminharTriagem();
        }
      
        dialogOptionPane.setVisible(false);
    }//GEN-LAST:event_btConfirmarActionPerformed

    private void btCancelar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelar1ActionPerformed
        dialogOptionPane.setVisible(false);
    }//GEN-LAST:event_btCancelar1ActionPerformed

    private void dialogOptionPaneWindowLostFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_dialogOptionPaneWindowLostFocus
        dialogOptionPane.toFront();
    }//GEN-LAST:event_dialogOptionPaneWindowLostFocus

    private void tfNomePacKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfNomePacKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            btNomePesquisaPac.doClick();
        }
    }//GEN-LAST:event_tfNomePacKeyPressed

    private void tfNomeMedKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfNomeMedKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            btNomePesquisa1.doClick();
        }
    }//GEN-LAST:event_tfNomeMedKeyPressed

    private void tfAgenDataKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfAgenDataKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            btAgendar.doClick();
        }
    }//GEN-LAST:event_tfAgenDataKeyPressed

    private void tfAgenHoraKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfAgenHoraKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            btAgendar.doClick();
        }
    }//GEN-LAST:event_tfAgenHoraKeyPressed

    private void tfNomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfNomeKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            btAlterar.doClick();
        }
    }//GEN-LAST:event_tfNomeKeyPressed

    private void tfCPFKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfCPFKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            btAlterar.doClick();
        }
    }//GEN-LAST:event_tfCPFKeyPressed

    private void tfDataNascKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfDataNascKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            btAlterar.doClick();
        }
    }//GEN-LAST:event_tfDataNascKeyPressed

    private void tfTelefoneKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfTelefoneKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            btAlterar.doClick();
        }
    }//GEN-LAST:event_tfTelefoneKeyPressed

    private void tfEnderecoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfEnderecoKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            btAlterar.doClick();
        }
    }//GEN-LAST:event_tfEnderecoKeyPressed

    private void tfNomeAltPacKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfNomeAltPacKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            btNomePesquisaAltPac.doClick();
        }
    }//GEN-LAST:event_tfNomeAltPacKeyPressed

    private void tfAltNomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfAltNomeKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            btAltSalvar.doClick();
        }
    }//GEN-LAST:event_tfAltNomeKeyPressed

    private void tfAltCPFKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfAltCPFKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            btAltSalvar.doClick();
        }
    }//GEN-LAST:event_tfAltCPFKeyPressed

    private void tfAltDataNascKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfAltDataNascKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            btAltSalvar.doClick();
        }
    }//GEN-LAST:event_tfAltDataNascKeyPressed

    private void tfAltTelefoneKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfAltTelefoneKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            btAltSalvar.doClick();
        }
    }//GEN-LAST:event_tfAltTelefoneKeyPressed

    private void tfAltEnderecoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfAltEnderecoKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            btAltSalvar.doClick();
        }
    }//GEN-LAST:event_tfAltEnderecoKeyPressed

    public void optionAlterarPac(){
        dialogOptionPane.setVisible(true);
        labOptionPane.setText("Deseja alterar paciente?");
    }
    public void optionAgendarCons(){
        dialogOptionPane.setVisible(true);
        labOptionPane.setText("Deseja agendar a consulta?");
    }
    public void optionCadastrarPac(){
        dialogOptionPane.setVisible(true);
        labOptionPane.setText("Deseja cadastrar o paciente?");
    }
    public void optionCancelarCons(){
        dialogOptionPane.setVisible(true);
        labOptionPane.setText("Deseja cancelar a consulta?");
    }
    public void optionEncaminharPac(){
        dialogOptionPane.setVisible(true);
        labOptionPane.setText("Deseja encaminhar o paciente?");
    }
  
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
        
        if (feedback == null) {
            dialogPopUpStatus.setVisible(true);
            labPopUpStatus.setForeground(new Color(93, 201, 120));
            labPopUpStatus.setText("✅ PACIENTE CADASTRADO COM SUCESSO!");
            limpar();
        } else {
            dialogPopUpStatus.setVisible(true);
            labPopUpStatus.setForeground(new Color(247, 99, 99));
            labPopUpStatus.setText("⚠ " + feedback);
        }
    }
    public void cancelarConsulta(){
        if(AtendenteController.cancelarConsulta(consultaID)){
            dialogPopUpStatus.setVisible(true);
            labPopUpStatus.setForeground(new Color(93, 201, 120));
            labPopUpStatus.setText("✅ CONSULTA CANCELADA COM SUCESSO!");
        }else{
            dialogPopUpStatus.setVisible(true);
            labPopUpStatus.setForeground(new Color(247, 99, 99));
            labPopUpStatus.setText("⚠ ERRO AO CANCELAR CONSULTA!");
        }
        carregaTabela();
        setConsultaID(null);
    }
    public void agendarConsulta(){
        String feedback = "";

        int status = 1;
        String pac_id = getIdPaciente();
        String med_id = getIdMedico();
        String ate_id = getId();
        String data = tfAgenData.getText();
        String hora = tfAgenHora.getText();
        String receita = "";

        feedback = AtendenteController.agendarConsulta(status, pac_id, med_id, ate_id, data, hora, receita);
        
        if (feedback == null) {
            limparAgenda();
            dialogPopUpStatus.setVisible(true);
            labPopUpStatus.setForeground(new Color(93, 201, 120));
            labPopUpStatus.setText("✅ CONSULTA AGENDADA COM SUCESSO!");
            setIdPaciente(null);
            setIdMedico(null);
        } else {
            dialogPopUpStatus.setVisible(true);
            labPopUpStatus.setForeground(new Color(247, 99, 99));
            labPopUpStatus.setText("⚠ " + feedback);
        }
    }
    
    public void limparAgenda(){
        tfAgenData.setText("");
        tfAgenHora.setText("");
        tabSelPaciente1.clearSelection();
        tabSelMedico.clearSelection();
        tfAgenData.requestFocus();
    }
    
    public void carregaTabela() {
        DefaultTableModel modelo = (DefaultTableModel) tabPaciente.getModel();
        modelo.setNumRows(0);
        
        AtendenteController.carregaTabela(modelo);
        
        centralizarTabelaConsulta();
    }
    
    public void centralizarTabelaConsulta() {
        DefaultTableCellRenderer cellRender = new DefaultTableCellRenderer();
	cellRender.setHorizontalAlignment(SwingConstants.CENTER);

	for (int numCol = 0; numCol < tabPaciente.getColumnCount(); numCol++) {
            tabPaciente.getColumnModel().getColumn(numCol).setCellRenderer(cellRender);
	}
    }
    
    public void carregaTabelaPaciente() {
        DefaultTableModel modelo = (DefaultTableModel) tabSelPaciente1.getModel();
        modelo.setNumRows(0);
        
        AtendenteController.carregaTabelaPaciente(modelo);
        
        centralizarTabelaPaciente();
    }
    
    public void pesquisaTabelaPaciente() {
        DefaultTableModel modelo = (DefaultTableModel) tabSelPaciente1.getModel();
        modelo.setNumRows(0);
        
        AtendenteController.pesquisaTabelaPaciente(modelo, tfNomePac.getText());
        
        centralizarTabelaPaciente();
    }
    
    public void centralizarTabelaPaciente() {
        DefaultTableCellRenderer cellRender = new DefaultTableCellRenderer();
	cellRender.setHorizontalAlignment(SwingConstants.CENTER);

	for (int numCol = 0; numCol < tabSelPaciente1.getColumnCount(); numCol++) {
            tabSelPaciente1.getColumnModel().getColumn(numCol).setCellRenderer(cellRender);
	}
    }
    
    public void carregaTabelaMedico() {
        DefaultTableModel modelo = (DefaultTableModel) tabSelMedico.getModel();
        modelo.setNumRows(0);
        
        AtendenteController.carregaTabelaMedico(modelo);
        
        centralizarTabelaMedico();
        
    }
    
    public void pesquisaTabelaMedico() {
        DefaultTableModel modelo = (DefaultTableModel) tabSelMedico.getModel();
        modelo.setNumRows(0);
        
        AtendenteController.pesquisaTabelaMedico(modelo, tfNomeMed.getText());
        
        centralizarTabelaMedico();
    }
    
    public void centralizarTabelaMedico() {
        DefaultTableCellRenderer cellRender = new DefaultTableCellRenderer();
	cellRender.setHorizontalAlignment(SwingConstants.CENTER);

	for (int numCol = 0; numCol < tabSelMedico.getColumnCount(); numCol++) {
            tabSelMedico.getColumnModel().getColumn(numCol).setCellRenderer(cellRender);
	}
    }
    
    public void carregaTabelaPacienteEdit() {
        DefaultTableModel modelo = (DefaultTableModel) tabSelPaciente2.getModel();
        modelo.setNumRows(0);
        
        AtendenteController.carregaTabelaPacienteEdit(modelo);
        
        centralizarTabelaPacienteEdit();
    }
    
    public void centralizarTabelaPacienteEdit() {
        DefaultTableCellRenderer cellRender = new DefaultTableCellRenderer();
	cellRender.setHorizontalAlignment(SwingConstants.CENTER);

	for (int numCol = 0; numCol < tabSelPaciente2.getColumnCount(); numCol++) {
            tabSelPaciente2.getColumnModel().getColumn(numCol).setCellRenderer(cellRender);
	}
    }
    
    public void pesquisaTabelaPacienteEdit() {
        DefaultTableModel modelo = (DefaultTableModel) tabSelPaciente2.getModel();
        modelo.setNumRows(0);
        
        AtendenteController.pesquisaTabelaPacienteEdit(modelo, tfNomeAltPac.getText());
        
        centralizarTabelaPaciente();
    }
    
    public void puxarDadosPacienteEdit(String pac_id) {
        tfAltNome.setText(PacienteController.pesquisarPacienteID(pac_id).getNome());
        tfAltCPF.setText(PacienteController.pesquisarPacienteID(pac_id).getCpf());
        String[] dataNasc = PacienteController.pesquisarPacienteID(pac_id).getData_nascimento().split("-");
        tfAltDataNasc.setText(dataNasc[2] + "/" + dataNasc[1] + "/" + dataNasc[0]);
        tfAltTelefone.setText(PacienteController.pesquisarPacienteID(pac_id).getTelefone());
        tfAltEndereco.setText(PacienteController.pesquisarPacienteID(pac_id).getEndereco());  
    }
    
    public void limparEdit(){
        tfAltNome.setText("");
        tfAltCPF.setText("");
        tfAltDataNasc.setText("");
        tfAltTelefone.setText("");
        tfAltEndereco.setText("");
        tfAltNome.requestFocus();
    }
    
    public void editarPaciente() {
        String feedback = "";
        
        String id = getIdPacienteEdit();
        
        String nome = tfAltNome.getText();        
        String data_nascimento = tfAltDataNasc.getText();
        String cpf = tfAltCPF.getText();
        String telefone = tfAltTelefone.getText();
        String endereco = tfAltEndereco.getText();

        feedback = AtendenteController.editarPaciente(id, nome, data_nascimento, cpf, telefone, endereco);

        if (feedback == null) {
            limparEdit();
            dialogPopUpStatus.setVisible(true);
            labPopUpStatus.setForeground(new Color(93, 201, 120));
            labPopUpStatus.setText("✅ PACIENTE ALTERADO COM SUCESSO!");
            limpar();
        } else {
            dialogPopUpStatus.setVisible(true);
            labPopUpStatus.setForeground(new Color(247, 99, 99));
            labPopUpStatus.setText("⚠ " + feedback);
        }

    }
    
    public void encaminharTriagem(){
        String feedback = "";
        String idConsulta = getConsultaID();
        
        feedback = AtendenteController.alterarStatusConsulta(idConsulta, 2);

        if (feedback == null) {
            carregaTabela();
            dialogPopUpStatus.setVisible(true);
            labPopUpStatus.setForeground(new Color(93, 201, 120));
            labPopUpStatus.setText("✅ CONSULTA ENCAMINHADA COM SUCESSO! ("+ getConsultaID() +")");
            setConsultaID(null);
        } else {
            dialogPopUpStatus.setVisible(true);
            labPopUpStatus.setForeground(new Color(247, 99, 99));
            labPopUpStatus.setText("⚠ " + feedback);
        }
        
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
    private javax.swing.JButton btAltSalvar;
    private javax.swing.JButton btAlterar;
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btCancelar1;
    private javax.swing.JButton btConfirmar;
    private javax.swing.JButton btEncaminhar;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btLimparAlt;
    private javax.swing.JButton btNomePesquisa1;
    private javax.swing.JButton btNomePesquisaAltPac;
    private javax.swing.JButton btNomePesquisaPac;
    private javax.swing.JButton btOK;
    private javax.swing.JButton btRefresh1;
    private javax.swing.JButton btRefreshMed;
    private javax.swing.JButton btlRefreshAltPac;
    private javax.swing.JButton btlRefreshPac;
    private javax.swing.JPanel cardAgendarConsulta;
    private javax.swing.JPanel cardAlterarPacientes;
    private javax.swing.JPanel cardCadastro;
    private javax.swing.JPanel cardConsulta;
    private javax.swing.JDialog dialogOptionPane;
    private javax.swing.JDialog dialogPopUpStatus;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel jlStatusCon;
    private javax.swing.JLabel labAgenConsulta;
    private javax.swing.JLabel labAgenData;
    private javax.swing.JLabel labAgenData1;
    private javax.swing.JLabel labAltCPF;
    private javax.swing.JLabel labAltDataNasc;
    private javax.swing.JLabel labAltEndereco;
    private javax.swing.JLabel labAltNome;
    private javax.swing.JLabel labAltPaciente;
    private javax.swing.JLabel labCPF;
    private javax.swing.JLabel labCadPaciente;
    private javax.swing.JLabel labConsulta;
    private javax.swing.JLabel labDataNasc;
    private javax.swing.JLabel labEndereco;
    private javax.swing.JLabel labLogo;
    private javax.swing.JLabel labLogout;
    private javax.swing.JLabel labNome;
    private javax.swing.JLabel labNomePesquisaAltPac;
    private javax.swing.JLabel labNomePesquisaMed;
    private javax.swing.JLabel labNomePesquisaPac;
    private javax.swing.JLabel labOptionPane;
    private javax.swing.JLabel labPopUpStatus;
    private javax.swing.JLabel labSelAltPaciente;
    private javax.swing.JLabel labStatusEdit;
    private javax.swing.JLabel labUser;
    private javax.swing.JLabel labUserImage;
    private javax.swing.JLabel lanSelMed;
    private javax.swing.JLabel lanSelPaciente;
    private javax.swing.JLabel lbAltTelefone;
    private javax.swing.JLabel lbTelefone;
    private javax.swing.JPanel panAgendar;
    private javax.swing.JPanel panCadInsBack;
    private javax.swing.JPanel panCadInsBack1;
    private javax.swing.JPanel panCardsAtendente;
    private javax.swing.JPanel panInformacoes;
    private javax.swing.JPanel panTabela;
    private javax.swing.JPanel panTop;
    private javax.swing.JPanel panUser;
    private javax.swing.JTable tabPaciente;
    private javax.swing.JTable tabSelMedico;
    private javax.swing.JTable tabSelPaciente1;
    private javax.swing.JTable tabSelPaciente2;
    private javax.swing.JTextField tfAgenData;
    private javax.swing.JTextField tfAgenHora;
    private javax.swing.JTextField tfAltCPF;
    private javax.swing.JTextField tfAltDataNasc;
    private javax.swing.JTextField tfAltEndereco;
    private javax.swing.JTextField tfAltNome;
    private javax.swing.JTextField tfAltTelefone;
    private javax.swing.JTextField tfCPF;
    private javax.swing.JTextField tfDataNasc;
    private javax.swing.JTextField tfEndereco;
    private javax.swing.JTextField tfNome;
    private javax.swing.JTextField tfNomeAltPac;
    private javax.swing.JTextField tfNomeMed;
    private javax.swing.JTextField tfNomePac;
    private javax.swing.JTextField tfTelefone;
    // End of variables declaration//GEN-END:variables
}
