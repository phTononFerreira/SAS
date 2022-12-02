package com.sas.view;

import com.itextpdf.text.BadElementException;
import com.itextpdf.text.BaseColor;
import com.sas.controller.ConsultaController;
import com.sas.controller.InsumoMedicoController;
import com.sas.controller.MedicoController;
import com.sas.controller.PacienteController;
import com.sas.controller.ProntuarioController;
import java.awt.Dimension;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.awt.Toolkit;
import java.awt.CardLayout;
import java.awt.print.PrinterException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Color;
import java.awt.Desktop;
import java.io.File;
import java.io.FileInputStream;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import javax.print.Doc;
import javax.print.DocFlavor;
import javax.print.DocPrintJob;
import javax.print.PrintException;
import javax.print.PrintService;
import javax.print.PrintServiceLookup;
import javax.print.ServiceUI;
import javax.print.SimpleDoc;
import javax.print.attribute.HashDocAttributeSet;
import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.PrintRequestAttributeSet;
import javax.swing.JOptionPane;

public class JanMedico extends javax.swing.JFrame {

    private static JanMedico unicoJanMedico;
    private static String ID;
    private Boolean Muser = false;
    private static String idConsulta;
    private static String idInsumo;

    CardLayout cardLayout;

    public String getId() {
        return ID;
    }

    public static void setId(String ID1) {
        ID = ID1;
    }

    public String getIdConsulta() {
        return idConsulta;
    }

    public static void setIdConsulta(String idConsulta1) {
        idConsulta = idConsulta1;
    }

    public String getIdInsumo() {
        return idInsumo;
    }

    public static void setIdInsumo(String idInsumo1) {
        idInsumo = idInsumo1;
    }

    public JanMedico() {
        initComponents();
        cardLayout = (CardLayout) (panCards.getLayout());
        this.setExtendedState(MAXIMIZED_BOTH);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setSize(dim.width, dim.height);
        carregaTabelaConsulta();
        carregaTabelaInsumo();
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

        dialogPopUpStatus = new javax.swing.JDialog();
        dialogPopUpStatus.setLocationRelativeTo(null);
        panCadInsBack1 = new javax.swing.JPanel();
        labPopUpStatus = new javax.swing.JLabel();
        btOK = new javax.swing.JButton();
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
        jScrollPane4 = new javax.swing.JScrollPane();
        tabEstoque = new javax.swing.JTable();
        jSeparator3 = new javax.swing.JSeparator();
        btReceitar = new javax.swing.JButton();
        tfMedPesquisa = new javax.swing.JTextField();
        btMedPesquisa = new javax.swing.JButton();
        btMedRefresh = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jScrollPane3 = new javax.swing.JScrollPane();
        taReceitar = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        btFinalizar = new javax.swing.JButton();
        btGerarEnc = new javax.swing.JButton();
        btVoltar = new javax.swing.JButton();

        dialogPopUpStatus.setTitle("SAS ALERT");
        dialogPopUpStatus.setLocation(new java.awt.Point(800, 500));
        dialogPopUpStatus.setMinimumSize(new java.awt.Dimension(443, 175));
        dialogPopUpStatus.setPreferredSize(new java.awt.Dimension(443, 170));
        dialogPopUpStatus.setResizable(false);
        dialogPopUpStatus.addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
                dialogPopUpStatusWindowLostFocus(evt);
            }
        });

        panCadInsBack1.setBackground(new java.awt.Color(255, 255, 255));
        panCadInsBack1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(239, 100, 100)));

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

        javax.swing.GroupLayout panCadInsBack1Layout = new javax.swing.GroupLayout(panCadInsBack1);
        panCadInsBack1.setLayout(panCadInsBack1Layout);
        panCadInsBack1Layout.setHorizontalGroup(
            panCadInsBack1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panCadInsBack1Layout.createSequentialGroup()
                .addGroup(panCadInsBack1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panCadInsBack1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btOK, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panCadInsBack1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(labPopUpStatus, javax.swing.GroupLayout.DEFAULT_SIZE, 399, Short.MAX_VALUE)))
                .addGap(15, 15, 15))
        );
        panCadInsBack1Layout.setVerticalGroup(
            panCadInsBack1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panCadInsBack1Layout.createSequentialGroup()
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
                .addComponent(panCadInsBack1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        dialogPopUpStatusLayout.setVerticalGroup(
            dialogPopUpStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogPopUpStatusLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panCadInsBack1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Médica");
        setBackground(new java.awt.Color(0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

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
                "Código Consulta", "Paciente", "CPF"
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
        btNomePesquisaPac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNomePesquisaPacActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(labSelPaciente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 536, Short.MAX_VALUE)
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
        btIniciarCons.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btIniciarConsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout cardConsultaLayout = new javax.swing.GroupLayout(cardConsulta);
        cardConsulta.setLayout(cardConsultaLayout);
        cardConsultaLayout.setHorizontalGroup(
            cardConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardConsultaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btIniciarCons, javax.swing.GroupLayout.DEFAULT_SIZE, 570, Short.MAX_VALUE)
                .addContainerGap())
        );
        cardConsultaLayout.setVerticalGroup(
            cardConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardConsultaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cardConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(cardConsultaLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btIniciarCons, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
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

        jScrollPane4.setBorder(null);
        jScrollPane4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        tabEstoque.setBackground(new java.awt.Color(242, 242, 242));
        tabEstoque.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        tabEstoque.setForeground(new java.awt.Color(51, 51, 51));
        tabEstoque.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, "", null},
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
                "Código Insumo", "Nome", "Quantidade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabEstoque.setGridColor(new java.awt.Color(204, 204, 204));
        tabEstoque.setIntercellSpacing(new java.awt.Dimension(0, 10));
        tabEstoque.setMinimumSize(new java.awt.Dimension(0, 0));
        tabEstoque.setRowHeight(30);
        tabEstoque.setSelectionBackground(new java.awt.Color(196, 67, 67));
        tabEstoque.setShowGrid(true);
        tabEstoque.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tabEstoqueMousePressed(evt);
            }
        });
        jScrollPane4.setViewportView(tabEstoque);

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));

        btReceitar.setBackground(new java.awt.Color(249, 100, 100));
        btReceitar.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btReceitar.setForeground(new java.awt.Color(255, 255, 255));
        btReceitar.setText("RECEITAR");
        btReceitar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btReceitar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btReceitarMouseClicked(evt);
            }
        });
        btReceitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btReceitarActionPerformed(evt);
            }
        });

        tfMedPesquisa.setBackground(new java.awt.Color(242, 242, 242));
        tfMedPesquisa.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(249, 100, 100)));
        tfMedPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfMedPesquisaActionPerformed(evt);
            }
        });

        btMedPesquisa.setBackground(new java.awt.Color(249, 100, 100));
        btMedPesquisa.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btMedPesquisa.setForeground(new java.awt.Color(255, 255, 255));
        btMedPesquisa.setText("PESQUISAR");
        btMedPesquisa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btMedPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMedPesquisaActionPerformed(evt);
            }
        });

        btMedRefresh.setBackground(new java.awt.Color(249, 100, 100));
        btMedRefresh.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        btMedRefresh.setForeground(new java.awt.Color(255, 255, 255));
        btMedRefresh.setText("🔄");
        btMedRefresh.setToolTipText("Atualizar Tabela");
        btMedRefresh.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btMedRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMedRefreshActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("RECEITAR MEDICAMENTO");

        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);

        taReceitar.setBackground(new java.awt.Color(242, 242, 242));
        taReceitar.setColumns(20);
        taReceitar.setLineWrap(true);
        taReceitar.setRows(5);
        taReceitar.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(249, 100, 100)));
        jScrollPane3.setViewportView(taReceitar);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("NOME");

        javax.swing.GroupLayout labPacIdadeLayout = new javax.swing.GroupLayout(labPacIdade);
        labPacIdade.setLayout(labPacIdadeLayout);
        labPacIdadeLayout.setHorizontalGroup(
            labPacIdadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(labPacIdadeLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(labPacIdadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, labPacIdadeLayout.createSequentialGroup()
                        .addGroup(labPacIdadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator2))
                        .addGap(30, 30, 30))
                    .addGroup(labPacIdadeLayout.createSequentialGroup()
                        .addComponent(jSeparator3)
                        .addGap(72, 72, 72))
                    .addGroup(labPacIdadeLayout.createSequentialGroup()
                        .addGroup(labPacIdadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbProntuario)
                            .addGroup(labPacIdadeLayout.createSequentialGroup()
                                .addComponent(labInfoObs)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labPacObs, javax.swing.GroupLayout.PREFERRED_SIZE, 1035, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 176, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, labPacIdadeLayout.createSequentialGroup()
                        .addGroup(labPacIdadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, labPacIdadeLayout.createSequentialGroup()
                                .addGroup(labPacIdadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(labPacIdadeLayout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18)
                                        .addComponent(tfMedPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btMedPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btMedRefresh))
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 638, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(21, 21, 21)
                                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(labPacIdadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(labPacIdadeLayout.createSequentialGroup()
                                        .addGap(265, 265, 265)
                                        .addComponent(btReceitar, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(labPacIdadeLayout.createSequentialGroup()
                                        .addGap(32, 32, 32)
                                        .addComponent(jScrollPane3))))
                            .addGroup(labPacIdadeLayout.createSequentialGroup()
                                .addComponent(labInfoTemperatura)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labPacTemperatura, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(labInfoPressao)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labPacPressão, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(45, 45, 45))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, labPacIdadeLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                        .addGap(40, 40, 40)
                        .addGroup(labPacIdadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labPInfoNome)
                            .addComponent(labPacNome)
                            .addComponent(labInfoData)
                            .addComponent(labPacData)))
                    .addGroup(labPacIdadeLayout.createSequentialGroup()
                        .addContainerGap(230, Short.MAX_VALUE)
                        .addGroup(labPacIdadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labInfoHora)
                            .addComponent(labPacHora)
                            .addComponent(labInfoIdade)
                            .addComponent(labPacNome1))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(labPacIdadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labInfoTemperatura)
                    .addComponent(labPacTemperatura)
                    .addComponent(labInfoPressao)
                    .addComponent(labPacPressão))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                .addGroup(labPacIdadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labInfoObs)
                    .addComponent(labPacObs, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(25, 25, 25)
                .addGroup(labPacIdadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(labPacIdadeLayout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btReceitar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(labPacIdadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(labPacIdadeLayout.createSequentialGroup()
                            .addGroup(labPacIdadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btMedPesquisa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(labPacIdadeLayout.createSequentialGroup()
                                    .addGap(0, 0, Short.MAX_VALUE)
                                    .addGroup(labPacIdadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(btMedRefresh, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tfMedPesquisa, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jSeparator4)))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        btFinalizar.setBackground(new java.awt.Color(249, 100, 100));
        btFinalizar.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btFinalizar.setForeground(new java.awt.Color(255, 255, 255));
        btFinalizar.setText("FINALIZAR CONSULTA");
        btFinalizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btFinalizar.setMinimumSize(new java.awt.Dimension(73, 18));
        btFinalizar.setPreferredSize(new java.awt.Dimension(73, 18));

        btGerarEnc.setBackground(new java.awt.Color(249, 100, 100));
        btGerarEnc.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btGerarEnc.setForeground(new java.awt.Color(255, 255, 255));
        btGerarEnc.setText("GERAR ENCAMINHAMENTO");
        btGerarEnc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btGerarEnc.setMinimumSize(new java.awt.Dimension(73, 18));
        btGerarEnc.setPreferredSize(new java.awt.Dimension(73, 18));

        btVoltar.setBackground(new java.awt.Color(249, 100, 100));
        btVoltar.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        btVoltar.setForeground(new java.awt.Color(255, 255, 255));
        btVoltar.setText("VOLTAR");
        btVoltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btVoltar.setMinimumSize(new java.awt.Dimension(73, 18));
        btVoltar.setPreferredSize(new java.awt.Dimension(73, 18));
        btVoltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btVoltarMouseClicked(evt);
            }
        });
        btVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarActionPerformed(evt);
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
                    .addComponent(btFinalizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btGerarEnc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 514, Short.MAX_VALUE)
                    .addComponent(btVoltar, javax.swing.GroupLayout.DEFAULT_SIZE, 514, Short.MAX_VALUE))
                .addContainerGap())
        );
        cardPacInfoLayout.setVerticalGroup(
            cardPacInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cardPacInfoLayout.createSequentialGroup()
                .addGroup(cardPacInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(cardPacInfoLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btFinalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btGerarEnc, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(labPacIdade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        panCards.add(cardPacInfo, "cardPacInfo");

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
    }// </editor-fold>//GEN-END:initComponents

    private void labUserImageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labUserImageMouseClicked
        if (Muser) {
            Muser = false;
            labLogout.setVisible(false);
        } else {
            Muser = true;
            labLogout.setVisible(true);
        }
    }//GEN-LAST:event_labUserImageMouseClicked

    private void labUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labUserMouseClicked
        if (Muser) {
            Muser = false;
            labLogout.setVisible(false);
        } else {
            Muser = true;
            labLogout.setVisible(true);
        }
    }//GEN-LAST:event_labUserMouseClicked

    private void labLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labLogoutMouseClicked
        sair();
    }//GEN-LAST:event_labLogoutMouseClicked

    private void btIniciarConsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btIniciarConsMouseClicked
        if (getIdConsulta() != null) {
            cardLayout.show(panCards, "cardPacInfo");
            puxarDadosProntuario(getIdConsulta(), ConsultaController.pesquisarConsultaID(getIdConsulta()).getPro_id(), ConsultaController.pesquisarConsultaID(getIdConsulta()).getPac_id());
        } else {
            System.out.println("Selecione uma consulta primeiro!");
        }

    }//GEN-LAST:event_btIniciarConsMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        cardLayout.show(panCards, "cardConsulta");
    }//GEN-LAST:event_jLabel1MouseClicked

    private void btVoltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btVoltarMouseClicked
        cardLayout.show(panCards, "cardConsulta");
        limparConsultaSelecionada();
        taReceitar.setText("");
        setIdInsumo(null);
    }//GEN-LAST:event_btVoltarMouseClicked

    private void btIniciarConsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btIniciarConsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btIniciarConsActionPerformed

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btVoltarActionPerformed

    private void btlRefreshPacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btlRefreshPacActionPerformed
        carregaTabelaConsulta();
    }//GEN-LAST:event_btlRefreshPacActionPerformed

    private void btNomePesquisaPacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNomePesquisaPacActionPerformed
        pesquisaTabelaConsulta();
    }//GEN-LAST:event_btNomePesquisaPacActionPerformed

    private void tabPaciente2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabPaciente2MousePressed
        setIdConsulta(tabPaciente2.getValueAt(tabPaciente2.getSelectedRow(), 0).toString());
    }//GEN-LAST:event_tabPaciente2MousePressed

    private void tabEstoqueMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabEstoqueMousePressed
        setIdInsumo(tabEstoque.getValueAt(tabEstoque.getSelectedRow(), 0).toString());
        preencherReceita();
    }//GEN-LAST:event_tabEstoqueMousePressed

    private void btReceitarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btReceitarMouseClicked

    }//GEN-LAST:event_btReceitarMouseClicked

    private void btReceitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btReceitarActionPerformed
        receitarConsulta();
    }//GEN-LAST:event_btReceitarActionPerformed

    private void tfMedPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfMedPesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfMedPesquisaActionPerformed

    private void btMedPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMedPesquisaActionPerformed
        pesquisaTabelaInsumo();
    }//GEN-LAST:event_btMedPesquisaActionPerformed

    private void btMedRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMedRefreshActionPerformed
        carregaTabelaInsumo();
    }//GEN-LAST:event_btMedRefreshActionPerformed

    private void btOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btOKActionPerformed
        dialogPopUpStatus.setVisible(false);
    }//GEN-LAST:event_btOKActionPerformed

    private void dialogPopUpStatusWindowLostFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_dialogPopUpStatusWindowLostFocus
        dialogPopUpStatus.toFront();
    }//GEN-LAST:event_dialogPopUpStatusWindowLostFocus

    public void sair() {
        this.dispose();
        labLogout.setVisible(false);
        JanLogin.getJanLogin().setVisible(true);
    }

    public void setNomePerfil(String nome) {
        labUser.setText(nome);
    }

    public void carregaTabelaConsulta() {
        DefaultTableModel modelo = (DefaultTableModel) tabPaciente2.getModel();
        modelo.setNumRows(0);

        MedicoController.carregaTabelaConsulta(modelo);

        centralizarTabelaConsulta();
    }

    public void centralizarTabelaConsulta() {
        DefaultTableCellRenderer cellRender = new DefaultTableCellRenderer();
        cellRender.setHorizontalAlignment(SwingConstants.CENTER);

        for (int numCol = 0; numCol < tabPaciente2.getColumnCount(); numCol++) {
            tabPaciente2.getColumnModel().getColumn(numCol).setCellRenderer(cellRender);
        }
    }

    public void pesquisaTabelaConsulta() {
        DefaultTableModel modelo = (DefaultTableModel) tabPaciente2.getModel();
        modelo.setNumRows(0);

        MedicoController.pesquisaTabelaConsulta(modelo, tfNomePac.getText());

        tfNomePac.setText("");
        tfNomePac.requestFocus();

        centralizarTabelaConsulta();
    }

    public void puxarDadosProntuario(String con_id, String pro_id, String pac_id) {
        labPacNome.setText(PacienteController.pesquisarPacienteID(pac_id).getNome());
        String[] dataNasc = PacienteController.pesquisarPacienteID(pac_id).getData_nascimento().split("-");
        int idade = 2022 - Integer.parseInt(dataNasc[0]);
        labPacNome1.setText(idade + " anos");

        String[] dataFragmentada = ConsultaController.pesquisarConsultaID(con_id).getData().split(" ");
        String[] data = dataFragmentada[0].split("-");
        String dataFormatada = data[2] + "/" + data[1] + "/" + data[0];

        labPacData.setText(dataFormatada);
        labPacHora.setText(dataFragmentada[1]);

        labPacTemperatura.setText(Float.toString(ProntuarioController.pesquisarProntuarioID(pro_id).getTemperatura()));
        labPacPressão.setText(ProntuarioController.pesquisarProntuarioID(pro_id).getPressao());
        labPacObs.setText(ProntuarioController.pesquisarProntuarioID(pro_id).getDescricao());
    }

    public void limparConsultaSelecionada() {
        setIdConsulta(null);
        tabPaciente2.clearSelection();
    }

    public void carregaTabelaInsumo() {
        DefaultTableModel modelo = (DefaultTableModel) tabEstoque.getModel();
        modelo.setNumRows(0);

        MedicoController.carregaTabelaInsumo(modelo);

        centralizarTabelaInsumo();
    }

    public void centralizarTabelaInsumo() {
        DefaultTableCellRenderer cellRender = new DefaultTableCellRenderer();
        cellRender.setHorizontalAlignment(SwingConstants.CENTER);

        for (int numCol = 0; numCol < tabEstoque.getColumnCount(); numCol++) {
            tabEstoque.getColumnModel().getColumn(numCol).setCellRenderer(cellRender);
        }
    }

    public void pesquisaTabelaInsumo() {
        DefaultTableModel modelo = (DefaultTableModel) tabEstoque.getModel();
        modelo.setNumRows(0);

        MedicoController.pesquisaTabelaInsumo(modelo, tfMedPesquisa.getText());

        tfMedPesquisa.setText("");
        tfMedPesquisa.requestFocus();

        centralizarTabelaInsumo();
    }

    public void preencherReceita() {
        String receita = taReceitar.getText();
        
        if(receita.equals(""))
            taReceitar.setText(receita + InsumoMedicoController.pesquisarInsumoID(getIdInsumo()).getNome() + ": ");
        else
            taReceitar.setText(receita + "\n" + InsumoMedicoController.pesquisarInsumoID(getIdInsumo()).getNome() + ": ");
    }

    public void receitarConsulta() {
        String feedback = "";

        String con_id = getIdConsulta();
        String receita = taReceitar.getText();
        String medico = MedicoController.pesquisarMedicoID(getId()).getNome();
        String paciente = labPacNome.getText();

        feedback = MedicoController.receitarConsulta(receita, con_id);

        if (!taReceitar.getText().equals("")) {
            if (feedback == null) {
                imprimirPdf("RECEITUÁRIO", receita, paciente, medico);
                dialogPopUpStatus.setVisible(true);
                labPopUpStatus.setForeground(new Color(93, 201, 120));
                labPopUpStatus.setText("✅ Paciente receitado com sucesso!");
            } else {
                dialogPopUpStatus.setVisible(true);
                labPopUpStatus.setForeground(new Color(247, 99, 99));
                labPopUpStatus.setText("⚠ " + feedback);
            }
        } else {
            dialogPopUpStatus.setVisible(true);
            labPopUpStatus.setForeground(new Color(247, 99, 99));
            labPopUpStatus.setText("⚠ A receita está vazia!");
        }

    }

    public void imprimirPdf(String tipo, String conteudo, String paciente, String medico) {
        Document documento = new Document();
        try {
            OutputStream outputStream = new FileOutputStream("documento.pdf");
            PdfWriter.getInstance(documento, outputStream);
            documento.open();//abre o arquivo
            Image image = Image.getInstance("img\\logoSAS.png");
            image.setAlignment(Element.ALIGN_CENTER);
            documento.add(image);
            Font font = new Font(Font.FontFamily.HELVETICA, 30, Font.BOLD);
            Font font2 = new Font(Font.FontFamily.HELVETICA, 15, Font.NORMAL);
            Font font3 = new Font(Font.FontFamily.HELVETICA, 8, Font.ITALIC);
            Font font4 = new Font(Font.FontFamily.HELVETICA, 15, Font.NORMAL, BaseColor.DARK_GRAY);
            Paragraph cabecalho = new Paragraph(tipo, font);
            cabecalho.setAlignment(Element.ALIGN_CENTER);
            documento.add(cabecalho);
            Paragraph paragrafo = new Paragraph("\nPaciente: " + paciente, font2);
            paragrafo.setAlignment(Element.ALIGN_CENTER);
            documento.add(paragrafo);
            Paragraph paragrafo2 = new Paragraph("\n\n\n" + conteudo, font4);
            paragrafo2.setAlignment(Element.ALIGN_CENTER);
            documento.add(paragrafo2);
            Paragraph paragrafo3 = new Paragraph("\n\n\nMédico: Dr(a). " + medico + "\n\n", font2);
            paragrafo3.setAlignment(Element.ALIGN_CENTER);
            documento.add(paragrafo3);
            Paragraph ass = new Paragraph("______________________________");
            ass.setAlignment(Element.ALIGN_CENTER);
            documento.add(ass);
            Paragraph ass2 = new Paragraph("assinatura", font3);
            ass2.setAlignment(Element.ALIGN_CENTER);
            documento.add(ass2);
            documento.close();
            printDoc();
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex);
        } catch (DocumentException ex) {
            JOptionPane.showMessageDialog(null, ex);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
    public void printDoc(){
        PrintService [] printService = PrintServiceLookup.lookupPrintServices(DocFlavor.INPUT_STREAM.AUTOSENSE, null);
        PrintService impressoraPadrao = PrintServiceLookup.lookupDefaultPrintService();
        DocFlavor docFlavor = DocFlavor.INPUT_STREAM.AUTOSENSE;
        HashDocAttributeSet hashDocAttributeSet = new HashDocAttributeSet(); 
        try {
            FileInputStream fileInputStream = new FileInputStream("documento.pdf");
            Doc doc = new SimpleDoc(fileInputStream, docFlavor, hashDocAttributeSet);
            PrintRequestAttributeSet printRequestAttributeSet = new HashPrintRequestAttributeSet();
            PrintService printServico = ServiceUI.printDialog(null, 300, 200, printService, impressoraPadrao, docFlavor, printRequestAttributeSet);
            if(printServico != null){
                DocPrintJob docPrintJob = printServico.createPrintJob();
                try {
                    //mandar imprimir
                    docPrintJob.print(doc, printRequestAttributeSet);
                } catch (PrintException ex) {
                    dialogPopUpStatus.setVisible(true);
                    labPopUpStatus.setForeground(new Color(247, 99, 99));
                    labPopUpStatus.setText("⚠ " + ex);
                }           
            }else{
                dialogPopUpStatus.setVisible(true);
                labPopUpStatus.setForeground(new Color(247, 99, 99));
                labPopUpStatus.setText("⚠ ERRO DE IMPRESSÃO!");
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(JanMedico.class.getName()).log(Level.SEVERE, null, ex);
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
    private javax.swing.JButton btFinalizar;
    private javax.swing.JButton btGerarEnc;
    private javax.swing.JButton btIniciarCons;
    private javax.swing.JButton btMedPesquisa;
    private javax.swing.JButton btMedRefresh;
    private javax.swing.JButton btNomePesquisaPac;
    private javax.swing.JButton btOK;
    private javax.swing.JButton btReceitar;
    private javax.swing.JButton btVoltar;
    private javax.swing.JButton btlRefreshPac;
    private javax.swing.JPanel cardConsulta;
    private javax.swing.JPanel cardPacInfo;
    private javax.swing.JDialog dialogPopUpStatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
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
    private javax.swing.JLabel labPopUpStatus;
    private javax.swing.JLabel labSelPaciente;
    private javax.swing.JLabel labUser;
    private javax.swing.JLabel labUserImage;
    private javax.swing.JLabel lbProntuario;
    private javax.swing.JPanel panCadInsBack1;
    private javax.swing.JPanel panCards;
    private javax.swing.JPanel panTop;
    private javax.swing.JPanel panUser;
    private javax.swing.JTextArea taReceitar;
    private javax.swing.JTable tabEstoque;
    private javax.swing.JTable tabPaciente2;
    private javax.swing.JTextField tfMedPesquisa;
    private javax.swing.JTextField tfNomePac;
    // End of variables declaration//GEN-END:variables
}
