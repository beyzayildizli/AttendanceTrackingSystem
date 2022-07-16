package yoklamatakipsistemi;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * @file yoklamaTakipSistemi
 * @description Bu proje, öğretmen ve öğrencilerin kayıt olup giriş yapabildiği;
 * öğretmenlerin yoklama bilgisi kaydede bildiği ve istediği öğrenciye ait
 * yoklama bilgisini görebildiği; öğrencilerin de kendilerine ait girilen
 * yoklama bilgisini gçrebildiği swing kullanılarak tasarlanmış bir yoklama sistemidir.
 * @assignment Final Proje
 * @date 14.05.2022
 * @author @beyza.yildizli@stu.fsm.edu.tr
 */
public class KayitOlOgrenci extends javax.swing.JFrame {

    String sifre;
    Baglanti baglanti = new Baglanti();
    Regex regex = new Regex();

    public KayitOlOgrenci() {
        initComponents();
    }

    public KayitOlOgrenci(String ad, String sifresi) {
        initComponents();
        karanlikTemaYap();
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        tcLabel.setText(ad);
        sifre = sifresi;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        temaButtonGroup = new javax.swing.ButtonGroup();
        popupMenu = new javax.swing.JPopupMenu();
        temizle = new javax.swing.JMenu();
        hepsiniTemizle = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        kisiselBilgiTemizle = new javax.swing.JMenuItem();
        aldigiDersleriTemizle = new javax.swing.JMenuItem();
        arkaPanel = new javax.swing.JPanel();
        aciklamaText = new javax.swing.JLabel();
        tcText = new javax.swing.JLabel();
        tcLabel = new javax.swing.JTextField();
        adSoyad = new javax.swing.JTextField();
        adSoyadText = new javax.swing.JLabel();
        yasText = new javax.swing.JLabel();
        yasSpinner = new javax.swing.JSpinner();
        cinsiyetText = new javax.swing.JLabel();
        aldigiDerslerText = new javax.swing.JLabel();
        matematikRBtn = new javax.swing.JRadioButton();
        fizikRBtn = new javax.swing.JRadioButton();
        biyolojiRBtn = new javax.swing.JRadioButton();
        kimyaRBtn = new javax.swing.JRadioButton();
        cografyaRBtn = new javax.swing.JRadioButton();
        felsefeRBtn = new javax.swing.JRadioButton();
        tarihRBtn = new javax.swing.JRadioButton();
        edebiyatRBtn = new javax.swing.JRadioButton();
        fransizcaRBtn = new javax.swing.JRadioButton();
        ingilizceRBtn = new javax.swing.JRadioButton();
        almancaRBtn = new javax.swing.JRadioButton();
        arapcaRBtn = new javax.swing.JRadioButton();
        checkBox = new javax.swing.JCheckBox();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        erkekRBtn = new javax.swing.JRadioButton();
        kadinRBtn = new javax.swing.JRadioButton();
        dinRBtn = new javax.swing.JRadioButton();
        muzikRBtn = new javax.swing.JRadioButton();
        resimRBtn = new javax.swing.JRadioButton();
        bedenRBtn = new javax.swing.JRadioButton();
        kayitOlButton = new yoklamatakipsistemi.MyButton();
        menuBar = new javax.swing.JMenuBar();
        geriMenu = new javax.swing.JMenu();
        temaMenu = new javax.swing.JMenu();
        karanlıkTema = new javax.swing.JRadioButtonMenuItem();
        aydinlikTema = new javax.swing.JRadioButtonMenuItem();

        temizle.setText("TEMİZLE");

        hepsiniTemizle.setText("Hepsini Temizle");
        hepsiniTemizle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hepsiniTemizleActionPerformed(evt);
            }
        });
        temizle.add(hepsiniTemizle);
        temizle.add(jSeparator1);

        kisiselBilgiTemizle.setText("Kişisel Bilgileri Temizle");
        kisiselBilgiTemizle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kisiselBilgiTemizleActionPerformed(evt);
            }
        });
        temizle.add(kisiselBilgiTemizle);

        aldigiDersleriTemizle.setText("Aldığı Dersleri Temizle");
        aldigiDersleriTemizle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aldigiDersleriTemizleActionPerformed(evt);
            }
        });
        temizle.add(aldigiDersleriTemizle);

        popupMenu.add(temizle);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(861, 555));
        setMinimumSize(new java.awt.Dimension(861, 555));
        setPreferredSize(new java.awt.Dimension(861, 555));
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        arkaPanel.setBackground(new java.awt.Color(51, 51, 51));
        arkaPanel.setComponentPopupMenu(popupMenu);
        arkaPanel.setMinimumSize(new java.awt.Dimension(850, 544));
        arkaPanel.setPreferredSize(new java.awt.Dimension(850, 544));

        aciklamaText.setBackground(new java.awt.Color(255, 255, 255));
        aciklamaText.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        aciklamaText.setForeground(new java.awt.Color(255, 255, 255));
        aciklamaText.setText("Kaydı Tamamlamak İçin Kişisel Bilgilerinizi Giriniz");

        tcText.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tcText.setForeground(new java.awt.Color(255, 255, 255));
        tcText.setText("TC Kimlik No:");

        tcLabel.setEnabled(false);

        adSoyadText.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        adSoyadText.setForeground(new java.awt.Color(255, 255, 255));
        adSoyadText.setText("Ad Soyad:");

        yasText.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        yasText.setForeground(new java.awt.Color(255, 255, 255));
        yasText.setText("Yaş:");

        cinsiyetText.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cinsiyetText.setForeground(new java.awt.Color(255, 255, 255));
        cinsiyetText.setText("Cinsiyet:");

        aldigiDerslerText.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        aldigiDerslerText.setForeground(new java.awt.Color(255, 255, 255));
        aldigiDerslerText.setText("Aldığı Dersler:");

        matematikRBtn.setForeground(new java.awt.Color(255, 255, 255));
        matematikRBtn.setText("Matematik");

        fizikRBtn.setForeground(new java.awt.Color(255, 255, 255));
        fizikRBtn.setText("Fizik");

        biyolojiRBtn.setForeground(new java.awt.Color(255, 255, 255));
        biyolojiRBtn.setText("Biyoloji");

        kimyaRBtn.setForeground(new java.awt.Color(255, 255, 255));
        kimyaRBtn.setText("Kimya");

        cografyaRBtn.setForeground(new java.awt.Color(255, 255, 255));
        cografyaRBtn.setText("Coğrafya");

        felsefeRBtn.setForeground(new java.awt.Color(255, 255, 255));
        felsefeRBtn.setText("Felsefe");

        tarihRBtn.setForeground(new java.awt.Color(255, 255, 255));
        tarihRBtn.setText("Tarih");

        edebiyatRBtn.setForeground(new java.awt.Color(255, 255, 255));
        edebiyatRBtn.setText("Edebiyat");

        fransizcaRBtn.setForeground(new java.awt.Color(255, 255, 255));
        fransizcaRBtn.setText("Fransızca");

        ingilizceRBtn.setForeground(new java.awt.Color(255, 255, 255));
        ingilizceRBtn.setText("İngilizce");

        almancaRBtn.setForeground(new java.awt.Color(255, 255, 255));
        almancaRBtn.setText("Almanca");

        arapcaRBtn.setForeground(new java.awt.Color(255, 255, 255));
        arapcaRBtn.setText("Arapça");

        checkBox.setForeground(new java.awt.Color(255, 255, 255));
        checkBox.setText("Girdiğim bilgilerin doğruluğunu onaylıyorum.");

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yoklamatakipsistemi/man.png"))); // NOI18N

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yoklamatakipsistemi/woman.png"))); // NOI18N

        erkekRBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        erkekRBtn.setForeground(new java.awt.Color(255, 255, 255));
        erkekRBtn.setText("Erkek");
        erkekRBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                erkekRBtnActionPerformed(evt);
            }
        });

        kadinRBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        kadinRBtn.setForeground(new java.awt.Color(255, 255, 255));
        kadinRBtn.setText("Kadın");
        kadinRBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kadinRBtnActionPerformed(evt);
            }
        });

        dinRBtn.setForeground(new java.awt.Color(255, 255, 255));
        dinRBtn.setText("Din Kültürü");

        muzikRBtn.setForeground(new java.awt.Color(255, 255, 255));
        muzikRBtn.setText("Müzik");

        resimRBtn.setForeground(new java.awt.Color(255, 255, 255));
        resimRBtn.setText("Görsel Sanatlar");

        bedenRBtn.setForeground(new java.awt.Color(255, 255, 255));
        bedenRBtn.setText("Beden Eğitimi ve Spor");

        kayitOlButton.setBackground(new java.awt.Color(204, 204, 204));
        kayitOlButton.setText("KAYIT OL");
        kayitOlButton.setBorderColor(new java.awt.Color(0, 0, 0));
        kayitOlButton.setColor(new java.awt.Color(204, 204, 204));
        kayitOlButton.setColorClick(new java.awt.Color(221, 214, 214));
        kayitOlButton.setColorOver(new java.awt.Color(204, 204, 204));
        kayitOlButton.setRadius(35);
        kayitOlButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kayitOlButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout arkaPanelLayout = new javax.swing.GroupLayout(arkaPanel);
        arkaPanel.setLayout(arkaPanelLayout);
        arkaPanelLayout.setHorizontalGroup(
            arkaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(arkaPanelLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(arkaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(arkaPanelLayout.createSequentialGroup()
                        .addComponent(aciklamaText, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(arkaPanelLayout.createSequentialGroup()
                        .addGroup(arkaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tcText, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tcLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(arkaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(adSoyad, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(yasText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cinsiyetText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(yasSpinner, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, arkaPanelLayout.createSequentialGroup()
                                    .addComponent(jLabel10)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(kadinRBtn))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, arkaPanelLayout.createSequentialGroup()
                                    .addGap(1, 1, 1)
                                    .addComponent(adSoyadText)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, arkaPanelLayout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(erkekRBtn)))
                        .addGap(130, 130, 130)
                        .addGroup(arkaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(aldigiDerslerText, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(arkaPanelLayout.createSequentialGroup()
                                .addGroup(arkaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(arkaPanelLayout.createSequentialGroup()
                                        .addGroup(arkaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(matematikRBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(fizikRBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(biyolojiRBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(arkaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tarihRBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(edebiyatRBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(felsefeRBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cografyaRBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(kimyaRBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(arkaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(almancaRBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(arapcaRBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ingilizceRBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fransizcaRBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(arkaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(muzikRBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dinRBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(resimRBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bedenRBtn)))
                            .addComponent(checkBox))
                        .addContainerGap(155, Short.MAX_VALUE))))
            .addGroup(arkaPanelLayout.createSequentialGroup()
                .addGap(344, 344, 344)
                .addComponent(kayitOlButton, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        arkaPanelLayout.setVerticalGroup(
            arkaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(arkaPanelLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(aciklamaText)
                .addGap(41, 41, 41)
                .addGroup(arkaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tcText)
                    .addComponent(aldigiDerslerText))
                .addGap(6, 6, 6)
                .addGroup(arkaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, arkaPanelLayout.createSequentialGroup()
                        .addGroup(arkaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(arkaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(arkaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(edebiyatRBtn)
                                    .addComponent(matematikRBtn)
                                    .addComponent(ingilizceRBtn))
                                .addGroup(arkaPanelLayout.createSequentialGroup()
                                    .addGap(45, 45, 45)
                                    .addGroup(arkaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(arkaPanelLayout.createSequentialGroup()
                                            .addComponent(fizikRBtn)
                                            .addGap(25, 25, 25)
                                            .addComponent(biyolojiRBtn))
                                        .addGroup(arkaPanelLayout.createSequentialGroup()
                                            .addGroup(arkaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(tarihRBtn)
                                                .addComponent(almancaRBtn))
                                            .addGap(25, 25, 25)
                                            .addGroup(arkaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(felsefeRBtn)
                                                .addComponent(fransizcaRBtn))
                                            .addGap(25, 25, 25)
                                            .addGroup(arkaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(cografyaRBtn)
                                                .addComponent(kimyaRBtn)))
                                        .addGroup(arkaPanelLayout.createSequentialGroup()
                                            .addGap(90, 90, 90)
                                            .addComponent(arapcaRBtn))))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, arkaPanelLayout.createSequentialGroup()
                                    .addGroup(arkaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(dinRBtn)
                                        .addGroup(arkaPanelLayout.createSequentialGroup()
                                            .addGap(45, 45, 45)
                                            .addComponent(muzikRBtn)
                                            .addGap(25, 25, 25)
                                            .addComponent(resimRBtn)))
                                    .addGap(45, 45, 45)))
                            .addGroup(arkaPanelLayout.createSequentialGroup()
                                .addGap(135, 135, 135)
                                .addComponent(bedenRBtn)))
                        .addGap(59, 59, 59)
                        .addComponent(checkBox)
                        .addGap(18, 18, 18)
                        .addComponent(kayitOlButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, arkaPanelLayout.createSequentialGroup()
                        .addComponent(tcLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(adSoyadText)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(adSoyad, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(yasText)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(yasSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cinsiyetText)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(arkaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10)
                            .addComponent(kadinRBtn))
                        .addGap(6, 6, 6)
                        .addGroup(arkaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(erkekRBtn)
                            .addComponent(jLabel11))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(arkaPanel);

        geriMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yoklamatakipsistemi/back-arrow.png"))); // NOI18N
        geriMenu.setText("Geri");
        geriMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                geriMenuMouseClicked(evt);
            }
        });
        menuBar.add(geriMenu);

        temaMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yoklamatakipsistemi/themes.png"))); // NOI18N
        temaMenu.setText("Tema");

        temaButtonGroup.add(karanlıkTema);
        karanlıkTema.setSelected(true);
        karanlıkTema.setText("Karanlık Tema");
        karanlıkTema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                karanlıkTemaActionPerformed(evt);
            }
        });
        temaMenu.add(karanlıkTema);

        temaButtonGroup.add(aydinlikTema);
        aydinlikTema.setText("Aydınlık Tema");
        aydinlikTema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aydinlikTemaActionPerformed(evt);
            }
        });
        temaMenu.add(aydinlikTema);

        menuBar.add(temaMenu);

        setJMenuBar(menuBar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void karanlıkTemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_karanlıkTemaActionPerformed
        karanlikTemaYap();
    }//GEN-LAST:event_karanlıkTemaActionPerformed

    private void aydinlikTemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aydinlikTemaActionPerformed
        aydinlikTemaYap();
    }//GEN-LAST:event_aydinlikTemaActionPerformed
    private void temaDegistir(Color panelRengi, Color yaziRengi) {
        arkaPanel.setBackground(panelRengi);
        tcText.setForeground(yaziRengi);
        aciklamaText.setForeground(yaziRengi);
        adSoyadText.setForeground(yaziRengi);
        yasText.setForeground(yaziRengi);
        cinsiyetText.setForeground(yaziRengi);
        kadinRBtn.setForeground(yaziRengi);
        erkekRBtn.setForeground(yaziRengi);
        aldigiDerslerText.setForeground(yaziRengi);
        matematikRBtn.setForeground(yaziRengi);
        fizikRBtn.setForeground(yaziRengi);
        biyolojiRBtn.setForeground(yaziRengi);
        kimyaRBtn.setForeground(yaziRengi);
        edebiyatRBtn.setForeground(yaziRengi);
        tarihRBtn.setForeground(yaziRengi);
        cografyaRBtn.setForeground(yaziRengi);
        felsefeRBtn.setForeground(yaziRengi);
        ingilizceRBtn.setForeground(yaziRengi);
        almancaRBtn.setForeground(yaziRengi);
        fransizcaRBtn.setForeground(yaziRengi);
        arapcaRBtn.setForeground(yaziRengi);
        dinRBtn.setForeground(yaziRengi);
        muzikRBtn.setForeground(yaziRengi);
        resimRBtn.setForeground(yaziRengi);
        bedenRBtn.setForeground(yaziRengi);
        checkBox.setForeground(yaziRengi);
    }

    private void karanlikTemaYap() {
        Color panelRengi = new Color(51, 51, 51);
        Color yaziRengi = Color.WHITE;
        temaDegistir(panelRengi, yaziRengi);
    }

    private void aydinlikTemaYap() {
        Color panelRengi = new Color(247, 243, 243);
        Color yaziRengi = Color.BLACK;
        temaDegistir(panelRengi, yaziRengi);
        aciklamaText.setForeground(new Color(126, 54, 0));
    }

    private void geriMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_geriMenuMouseClicked
        GirisYap girisYap = new GirisYap();
        girisYap.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_geriMenuMouseClicked

    private void kayitOlButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kayitOlButtonActionPerformed
        ArrayList derslerArrayList = new ArrayList();
        if (matematikRBtn.isSelected()) {
            derslerArrayList.add("matematik");
        }
        if (kimyaRBtn.isSelected()) {
            derslerArrayList.add("kimya");
        }
        if (fizikRBtn.isSelected()) {
            derslerArrayList.add("fizik");
        }
        if (biyolojiRBtn.isSelected()) {
            derslerArrayList.add("biyoloji");
        }
        if (edebiyatRBtn.isSelected()) {
            derslerArrayList.add("edebiyat");
        }
        if (tarihRBtn.isSelected()) {
            derslerArrayList.add("tarih");
        }
        if (felsefeRBtn.isSelected()) {
            derslerArrayList.add("felsefe");
        }
        if (cografyaRBtn.isSelected()) {
            derslerArrayList.add("cografya");
        }
        if (ingilizceRBtn.isSelected()) {
            derslerArrayList.add("ingilizce");
        }
        if (almancaRBtn.isSelected()) {
            derslerArrayList.add("almanca");
        }
        if (arapcaRBtn.isSelected()) {
            derslerArrayList.add("arapca");
        }
        if (fransizcaRBtn.isSelected()) {
            derslerArrayList.add("fransizca");
        }
        if (dinRBtn.isSelected()) {
            derslerArrayList.add("ingilizce");
        }
        if (resimRBtn.isSelected()) {
            derslerArrayList.add("almanca");
        }
        if (muzikRBtn.isSelected()) {
            derslerArrayList.add("arapca");
        }
        if (bedenRBtn.isSelected()) {
            derslerArrayList.add("fransizca");
        }

        if (adSoyad.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Tüm bilgileri doldurunuz!", "Message", JOptionPane.WARNING_MESSAGE);
        } else if (regex.isimSoyisimKontrol(adSoyad.getText()) == false) {
            JOptionPane.showMessageDialog(rootPane, "İsminizi ilk harfler büyük ve aralarda bir boşluk olacak şekilde yalnızca ingiilizce karakter kullanarak giriniz.", "Message", JOptionPane.WARNING_MESSAGE);
        } else if (kadinRBtn.isSelected() == false && erkekRBtn.isSelected() == false) {
            JOptionPane.showMessageDialog(rootPane, "Tüm bilgileri doldurunuz!", "Message", JOptionPane.WARNING_MESSAGE);
        } else if (derslerArrayList.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "En az bir ders seçmelisiniz!", "Message", JOptionPane.WARNING_MESSAGE);
        } else if (checkBox.isSelected() == false) {
            JOptionPane.showMessageDialog(rootPane, "Girdiğiniz bilgilerin dogruluğunu onaylayınız!", "Message", JOptionPane.WARNING_MESSAGE);
        } else {
            ogrenciEkle();
            GirisYap girisYap = new GirisYap();
            girisYap.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_kayitOlButtonActionPerformed

    private void kisiselBilgiTemizleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kisiselBilgiTemizleActionPerformed
        kisiselBilgiTemizle();
    }//GEN-LAST:event_kisiselBilgiTemizleActionPerformed

    private void aldigiDersleriTemizleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aldigiDersleriTemizleActionPerformed
        aldigiDersleriTemizle();
    }//GEN-LAST:event_aldigiDersleriTemizleActionPerformed

    private void hepsiniTemizleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hepsiniTemizleActionPerformed
        kisiselBilgiTemizle();
        aldigiDersleriTemizle();
        checkBox.setSelected(false);
    }//GEN-LAST:event_hepsiniTemizleActionPerformed

    private void kadinRBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kadinRBtnActionPerformed
       erkekRBtn.setSelected(false);
    }//GEN-LAST:event_kadinRBtnActionPerformed

    private void erkekRBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_erkekRBtnActionPerformed
        kadinRBtn.setSelected(false);
    }//GEN-LAST:event_erkekRBtnActionPerformed

    private void kisiselBilgiTemizle() {
        adSoyad.setText("");
        yasSpinner.setValue(0);
        kadinRBtn.setSelected(false); 
        erkekRBtn.setSelected(false); 
    }

    private void aldigiDersleriTemizle() {
        matematikRBtn.setSelected(false);
        kimyaRBtn.setSelected(false);
        biyolojiRBtn.setSelected(false);
        fizikRBtn.setSelected(false);

        edebiyatRBtn.setSelected(false);
        tarihRBtn.setSelected(false);
        felsefeRBtn.setSelected(false);
        cografyaRBtn.setSelected(false);

        ingilizceRBtn.setSelected(false);
        almancaRBtn.setSelected(false);
        fransizcaRBtn.setSelected(false);
        arapcaRBtn.setSelected(false);

        resimRBtn.setSelected(false);
        bedenRBtn.setSelected(false);
        dinRBtn.setSelected(false);
        muzikRBtn.setSelected(false);
    }

    private void ogrenciEkle() {
        int yas = (int) yasSpinner.getValue();
        String cinsiyet = "";
        if (kadinRBtn.isSelected()) {
            cinsiyet = "kadın";
        } else if (erkekRBtn.isSelected()) {
            cinsiyet = "erkek";
        }

        int matematik = 0;
        if (matematikRBtn.isSelected()) {
            matematik = 1;
        }

        int fizik = 0;
        if (fizikRBtn.isSelected()) {
            fizik = 1;
        }

        int kimya = 0;
        if (kimyaRBtn.isSelected()) {
            kimya = 1;
        }

        int biyoloji = 0;
        if (biyolojiRBtn.isSelected()) {
            biyoloji = 1;
        }

        int edebiyat = 0;
        if (edebiyatRBtn.isSelected()) {
            edebiyat = 1;
        }

        int felsefe = 0;
        if (felsefeRBtn.isSelected()) {
            felsefe = 1;
        }

        int cografya = 0;
        if (cografyaRBtn.isSelected()) {
            cografya = 1;
        }

        int tarih = 0;
        if (tarihRBtn.isSelected()) {
            tarih = 1;
        }

        int ingilizce = 0;
        if (ingilizceRBtn.isSelected()) {
            ingilizce = 1;
        }

        int fransizca = 0;
        if (fransizcaRBtn.isSelected()) {
            fransizca = 1;
        }

        int arapca = 0;
        if (arapcaRBtn.isSelected()) {
            arapca = 1;
        }

        int almanca = 0;
        if (almancaRBtn.isSelected()) {
            almanca = 1;
        }

        int din = 0;
        if (dinRBtn.isSelected()) {
            din = 1;
        }

        int resim = 0;
        if (resimRBtn.isSelected()) {
            resim = 1;
        }

        int muzik = 0;
        if (muzikRBtn.isSelected()) {
            muzik = 1;
        }

        int beden = 0;
        if (almancaRBtn.isSelected()) {
            beden = 1;
        }

        baglanti.ogrenciEkle(tcLabel.getText(), sifre, adSoyad.getText(), yas, cinsiyet,
                matematik, fizik, kimya, biyoloji, edebiyat, felsefe, cografya, tarih,
                ingilizce, fransizca, arapca, almanca, din, resim, muzik, beden);

    }

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aciklamaText;
    private javax.swing.JTextField adSoyad;
    private javax.swing.JLabel adSoyadText;
    private javax.swing.JLabel aldigiDerslerText;
    private javax.swing.JMenuItem aldigiDersleriTemizle;
    private javax.swing.JRadioButton almancaRBtn;
    private javax.swing.JRadioButton arapcaRBtn;
    private javax.swing.JPanel arkaPanel;
    private javax.swing.JRadioButtonMenuItem aydinlikTema;
    private javax.swing.JRadioButton bedenRBtn;
    private javax.swing.JRadioButton biyolojiRBtn;
    private javax.swing.JCheckBox checkBox;
    private javax.swing.JLabel cinsiyetText;
    private javax.swing.JRadioButton cografyaRBtn;
    private javax.swing.JRadioButton dinRBtn;
    private javax.swing.JRadioButton edebiyatRBtn;
    private javax.swing.JRadioButton erkekRBtn;
    private javax.swing.JRadioButton felsefeRBtn;
    private javax.swing.JRadioButton fizikRBtn;
    private javax.swing.JRadioButton fransizcaRBtn;
    private javax.swing.JMenu geriMenu;
    private javax.swing.JMenuItem hepsiniTemizle;
    private javax.swing.JRadioButton ingilizceRBtn;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JRadioButton kadinRBtn;
    private javax.swing.JRadioButtonMenuItem karanlıkTema;
    private yoklamatakipsistemi.MyButton kayitOlButton;
    private javax.swing.JRadioButton kimyaRBtn;
    private javax.swing.JMenuItem kisiselBilgiTemizle;
    private javax.swing.JRadioButton matematikRBtn;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JRadioButton muzikRBtn;
    private javax.swing.JPopupMenu popupMenu;
    private javax.swing.JRadioButton resimRBtn;
    private javax.swing.JRadioButton tarihRBtn;
    private javax.swing.JTextField tcLabel;
    private javax.swing.JLabel tcText;
    private javax.swing.ButtonGroup temaButtonGroup;
    private javax.swing.JMenu temaMenu;
    private javax.swing.JMenu temizle;
    private javax.swing.JSpinner yasSpinner;
    private javax.swing.JLabel yasText;
    // End of variables declaration//GEN-END:variables
}
