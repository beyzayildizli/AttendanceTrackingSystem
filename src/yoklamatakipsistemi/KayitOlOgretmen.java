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
 * yoklama bilgisini gçrebildiği swing kullanılarak tasarlanmış bir yoklama
 * sistemidir.
 * @assignment Final Proje
 * @date 14.05.2022
 * @author @beyza.yildizli@stu.fsm.edu.tr
 */
public class KayitOlOgretmen extends javax.swing.JFrame {

    String sifre;
    Baglanti baglanti = new Baglanti();
    Regex regex = new Regex();

    public KayitOlOgretmen() {
        initComponents();
    }

    public KayitOlOgretmen(String ad, String sifresi) {
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
        adSoyadText = new javax.swing.JLabel();
        telefonText = new javax.swing.JLabel();
        telefon = new javax.swing.JTextField();
        tcLabel = new javax.swing.JTextField();
        tcText = new javax.swing.JLabel();
        adSoyad = new javax.swing.JTextField();
        yasText = new javax.swing.JLabel();
        yasSpinner = new javax.swing.JSpinner();
        verdigiDerslerText = new javax.swing.JLabel();
        cinsiyetText = new javax.swing.JLabel();
        matematikRBtn = new javax.swing.JRadioButton();
        fizikRBtn = new javax.swing.JRadioButton();
        biyolojiRBtn = new javax.swing.JRadioButton();
        edebiyatRBtn = new javax.swing.JRadioButton();
        tarihRBtn = new javax.swing.JRadioButton();
        felsefeRBtn = new javax.swing.JRadioButton();
        checkBox = new javax.swing.JCheckBox();
        kimyaRBtn = new javax.swing.JRadioButton();
        cografyaRBtn = new javax.swing.JRadioButton();
        ingilizceRBtn = new javax.swing.JRadioButton();
        fransizcaRBtn = new javax.swing.JRadioButton();
        almancaRBtn = new javax.swing.JRadioButton();
        arapcaRBtn = new javax.swing.JRadioButton();
        kadinRBtn = new javax.swing.JRadioButton();
        erkekRBtn = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
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
        arkaPanel.setPreferredSize(new java.awt.Dimension(850, 544));

        aciklamaText.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        aciklamaText.setForeground(new java.awt.Color(255, 255, 255));
        aciklamaText.setText("Kaydı Tamamlamak İçin Kişisel Bilgilerinizi Giriniz");

        adSoyadText.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        adSoyadText.setForeground(new java.awt.Color(255, 255, 255));
        adSoyadText.setText("Ad Soyad:");

        telefonText.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        telefonText.setForeground(new java.awt.Color(255, 255, 255));
        telefonText.setText("Telefon Numarası:");

        tcLabel.setEnabled(false);

        tcText.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tcText.setForeground(new java.awt.Color(255, 255, 255));
        tcText.setText("TC Kimlik No:");

        yasText.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        yasText.setForeground(new java.awt.Color(255, 255, 255));
        yasText.setText("Yaş:");

        verdigiDerslerText.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        verdigiDerslerText.setForeground(new java.awt.Color(255, 255, 255));
        verdigiDerslerText.setText("Verdiği Dersler:");

        cinsiyetText.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cinsiyetText.setForeground(new java.awt.Color(255, 255, 255));
        cinsiyetText.setText("Cinsiyet:");

        matematikRBtn.setForeground(new java.awt.Color(255, 255, 255));
        matematikRBtn.setText("Matematik");

        fizikRBtn.setForeground(new java.awt.Color(255, 255, 255));
        fizikRBtn.setText("Fizik");

        biyolojiRBtn.setForeground(new java.awt.Color(255, 255, 255));
        biyolojiRBtn.setText("Biyoloji");

        edebiyatRBtn.setForeground(new java.awt.Color(255, 255, 255));
        edebiyatRBtn.setText("Edebiyat");

        tarihRBtn.setForeground(new java.awt.Color(255, 255, 255));
        tarihRBtn.setText("Tarih");

        felsefeRBtn.setForeground(new java.awt.Color(255, 255, 255));
        felsefeRBtn.setText("Felsefe");

        checkBox.setForeground(new java.awt.Color(255, 255, 255));
        checkBox.setText("Girdiğim bilgilerin doğruluğunu onaylıyorum.");

        kimyaRBtn.setForeground(new java.awt.Color(255, 255, 255));
        kimyaRBtn.setText("Kimya");

        cografyaRBtn.setForeground(new java.awt.Color(255, 255, 255));
        cografyaRBtn.setText("Coğrafya");

        ingilizceRBtn.setForeground(new java.awt.Color(255, 255, 255));
        ingilizceRBtn.setText("İngilizce");

        fransizcaRBtn.setForeground(new java.awt.Color(255, 255, 255));
        fransizcaRBtn.setText("Fransızca");

        almancaRBtn.setForeground(new java.awt.Color(255, 255, 255));
        almancaRBtn.setText("Almanca");

        arapcaRBtn.setForeground(new java.awt.Color(255, 255, 255));
        arapcaRBtn.setText("Arapça");

        kadinRBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        kadinRBtn.setForeground(new java.awt.Color(255, 255, 255));
        kadinRBtn.setText("Kadın");
        kadinRBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kadinRBtnActionPerformed(evt);
            }
        });

        erkekRBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        erkekRBtn.setForeground(new java.awt.Color(255, 255, 255));
        erkekRBtn.setText("Erkek");
        erkekRBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                erkekRBtnActionPerformed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yoklamatakipsistemi/woman.png"))); // NOI18N

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yoklamatakipsistemi/man.png"))); // NOI18N

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
                    .addComponent(yasSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yasText, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aciklamaText, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(arkaPanelLayout.createSequentialGroup()
                        .addGroup(arkaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(telefonText)
                            .addComponent(adSoyadText)
                            .addGroup(arkaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(telefon, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(adSoyad, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tcLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(tcText)
                            .addComponent(cinsiyetText, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(arkaPanelLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(kadinRBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, arkaPanelLayout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(erkekRBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(arkaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(arkaPanelLayout.createSequentialGroup()
                                .addGap(106, 106, 106)
                                .addGroup(arkaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(checkBox, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(verdigiDerslerText, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(arkaPanelLayout.createSequentialGroup()
                                        .addGroup(arkaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(arkaPanelLayout.createSequentialGroup()
                                                .addComponent(matematikRBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(edebiyatRBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(ingilizceRBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(arkaPanelLayout.createSequentialGroup()
                                                .addComponent(fizikRBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(tarihRBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(almancaRBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(arkaPanelLayout.createSequentialGroup()
                                                .addGroup(arkaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, arkaPanelLayout.createSequentialGroup()
                                                        .addComponent(kimyaRBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(cografyaRBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, arkaPanelLayout.createSequentialGroup()
                                                        .addComponent(biyolojiRBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(felsefeRBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(arkaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(arapcaRBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(fransizcaRBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGap(12, 12, 12)
                                        .addGroup(arkaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(muzikRBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(dinRBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(resimRBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(bedenRBtn)))))
                            .addGroup(arkaPanelLayout.createSequentialGroup()
                                .addGap(163, 163, 163)
                                .addComponent(kayitOlButton, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(99, Short.MAX_VALUE))
        );
        arkaPanelLayout.setVerticalGroup(
            arkaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(arkaPanelLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(aciklamaText)
                .addGap(41, 41, 41)
                .addGroup(arkaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(arkaPanelLayout.createSequentialGroup()
                        .addComponent(tcText)
                        .addGap(6, 6, 6)
                        .addComponent(tcLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(adSoyadText)
                        .addGap(6, 6, 6)
                        .addComponent(adSoyad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(telefonText)
                        .addGap(6, 6, 6)
                        .addComponent(telefon, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(yasText)
                        .addGap(6, 6, 6)
                        .addComponent(yasSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(arkaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(arkaPanelLayout.createSequentialGroup()
                                .addComponent(cinsiyetText)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(arkaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(kadinRBtn))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(arkaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel9)
                                    .addGroup(arkaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(erkekRBtn)
                                        .addComponent(kayitOlButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(arkaPanelLayout.createSequentialGroup()
                                .addComponent(checkBox)
                                .addGap(55, 55, 55))))
                    .addGroup(arkaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(arkaPanelLayout.createSequentialGroup()
                            .addGroup(arkaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(dinRBtn)
                                .addGroup(arkaPanelLayout.createSequentialGroup()
                                    .addGap(45, 45, 45)
                                    .addComponent(muzikRBtn)
                                    .addGap(25, 25, 25)
                                    .addComponent(resimRBtn)))
                            .addGap(45, 45, 45))
                        .addComponent(bedenRBtn)
                        .addGroup(arkaPanelLayout.createSequentialGroup()
                            .addComponent(verdigiDerslerText)
                            .addGap(23, 23, 23)
                            .addGroup(arkaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(matematikRBtn)
                                .addComponent(edebiyatRBtn)
                                .addComponent(ingilizceRBtn))
                            .addGap(25, 25, 25)
                            .addGroup(arkaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(fizikRBtn)
                                .addComponent(tarihRBtn)
                                .addComponent(almancaRBtn))
                            .addGap(25, 25, 25)
                            .addGroup(arkaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(biyolojiRBtn)
                                .addComponent(felsefeRBtn)
                                .addComponent(fransizcaRBtn))
                            .addGap(25, 25, 25)
                            .addGroup(arkaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(kimyaRBtn)
                                .addComponent(cografyaRBtn)
                                .addComponent(arapcaRBtn)))))
                .addContainerGap(124, Short.MAX_VALUE))
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
        telefonText.setForeground(yaziRengi);
        yasText.setForeground(yaziRengi);
        cinsiyetText.setForeground(yaziRengi);
        kadinRBtn.setForeground(yaziRengi);
        erkekRBtn.setForeground(yaziRengi);
        verdigiDerslerText.setForeground(yaziRengi);
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
        } else if (telefon.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Tüm bilgileri doldurunuz!", "Message", JOptionPane.WARNING_MESSAGE);
        } else if (regex.telefonKontrol(telefon.getText()) == false) {
            JOptionPane.showMessageDialog(rootPane, "Telefonunuzu örnekteki gibi giriniz. Örnek: 90 555 6445476 veya 90 555 644 54 76", "Message", JOptionPane.WARNING_MESSAGE);
        } else if (kadinRBtn.isSelected() == false && erkekRBtn.isSelected() == false) {
            JOptionPane.showMessageDialog(rootPane, "Tüm bilgileri doldurunuz!", "Message", JOptionPane.WARNING_MESSAGE);
        } else if (derslerArrayList.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "En az bir ders seçmelisiniz!", "Message", JOptionPane.WARNING_MESSAGE);
        } else if (checkBox.isSelected() == false) {
            JOptionPane.showMessageDialog(rootPane, "Girdiğiniz bilgilerin dogruluğunu onaylayınız!", "Message", JOptionPane.WARNING_MESSAGE);
        } else {
            ogretmenEkle();
            GirisYap girisYap = new GirisYap();
            girisYap.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_kayitOlButtonActionPerformed

    private void hepsiniTemizleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hepsiniTemizleActionPerformed
        kisiselBilgiTemizle();
        aldigiDersleriTemizle();
        checkBox.setSelected(false);
    }//GEN-LAST:event_hepsiniTemizleActionPerformed

    private void kisiselBilgiTemizleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kisiselBilgiTemizleActionPerformed
        kisiselBilgiTemizle();
    }//GEN-LAST:event_kisiselBilgiTemizleActionPerformed

    private void aldigiDersleriTemizleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aldigiDersleriTemizleActionPerformed
        aldigiDersleriTemizle();
    }//GEN-LAST:event_aldigiDersleriTemizleActionPerformed

    private void kadinRBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kadinRBtnActionPerformed
        erkekRBtn.setSelected(false);
    }//GEN-LAST:event_kadinRBtnActionPerformed

    private void erkekRBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_erkekRBtnActionPerformed
        kadinRBtn.setSelected(false);
    }//GEN-LAST:event_erkekRBtnActionPerformed

    private void geriMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_geriMenuMouseClicked
        GirisYap girisYap = new GirisYap();
        girisYap.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_geriMenuMouseClicked
    private void kisiselBilgiTemizle() {
        adSoyad.setText("");
        telefon.setText("");
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

    private void ogretmenEkle() {
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

        baglanti.ogretmenEkle(tcLabel.getText(), sifre, adSoyad.getText(), telefon.getText(), yas, cinsiyet,
                matematik, fizik, kimya, biyoloji, edebiyat, felsefe, cografya, tarih,
                ingilizce, fransizca, arapca, almanca, din, resim, muzik, beden);

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aciklamaText;
    private javax.swing.JTextField adSoyad;
    private javax.swing.JLabel adSoyadText;
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
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
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
    private javax.swing.JTextField telefon;
    private javax.swing.JLabel telefonText;
    private javax.swing.ButtonGroup temaButtonGroup;
    private javax.swing.JMenu temaMenu;
    private javax.swing.JMenu temizle;
    private javax.swing.JLabel verdigiDerslerText;
    private javax.swing.JSpinner yasSpinner;
    private javax.swing.JLabel yasText;
    // End of variables declaration//GEN-END:variables
}
