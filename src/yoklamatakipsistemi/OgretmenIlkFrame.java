package yoklamatakipsistemi;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * @file yoklamaTakipSistemi
 * @description Bu proje, öğretmen ve öğrencilerin kayıt olup giriş yapabildiği;
 * öğretmenlerin yoklama bilgisi kaydede bildiği ve istediği öğrenciye ait
 * yoklama bilgisini görebildiği; öğrencilerin de kendilerine ait girilen
 * yoklama bilgisini görebildiği swing kullanılarak tasarlanmış bir yoklama
 * sistemidir.
 * @assignment Final Proje
 * @date 14.05.2022
 * @author @beyza.yildizli@stu.fsm.edu.tr
 */
public class OgretmenIlkFrame extends javax.swing.JFrame {

    Baglanti baglanti = new Baglanti();
    Regex regex = new Regex();

    ArrayList yoklamaSorgula = new ArrayList();
    ArrayList seciliDersiAlanOgrenciler = new ArrayList();
    ArrayList seciliDersiAlanlarForDialog = new ArrayList();
    ArrayList gelmeyenOgrenciNoArrayList = new ArrayList();
    ArrayList gelenOgrenciNoArrayList = new ArrayList();

    DefaultListModel list = new DefaultListModel();
    DefaultListModel listYoklamaSorgula = new DefaultListModel();

    String tcNo;

    public OgretmenIlkFrame() {
        initComponents();
    }

    public OgretmenIlkFrame(String tc) {
        initComponents();
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        tcNo = tc;
        dersleriCmbyeEkle();
        liste.setModel(list);
        listeYoklamaSorgula.setModel(listYoklamaSorgula);
        karanlikTemaYap();
    }

    private void dersleriCmbyeEkle() {
        ArrayList derslerArrayList = new ArrayList();
        baglanti.ogretmeninVerdigiDersler(tcNo, derslerArrayList);
        for (int i = 0; i < derslerArrayList.size(); i++) {
            cmbDersler.addItem("" + derslerArrayList.get(i));
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        temaButton = new javax.swing.ButtonGroup();
        temaPopupButton = new javax.swing.ButtonGroup();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        popupMenu = new javax.swing.JPopupMenu();
        tema = new javax.swing.JMenu();
        aydinlikTemaPopup = new javax.swing.JRadioButtonMenuItem();
        karanlikTemaPopup = new javax.swing.JRadioButtonMenuItem();
        Hesap = new javax.swing.JMenu();
        sifreDegistirPopup = new javax.swing.JMenuItem();
        hesaptanCıkPopup = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        hesabiSilPopup = new javax.swing.JMenuItem();
        ogrenciListDialog = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        dersiAlanlarBaslik = new javax.swing.JLabel();
        ogrenciNoları = new javax.swing.JLabel();
        enAltPanel = new javax.swing.JPanel();
        solPanel = new javax.swing.JPanel();
        butonYoklamaGir = new javax.swing.JPanel();
        seciliPanelIsareti1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        butonYoklamaSorgula = new javax.swing.JPanel();
        seciliPanelIsareti2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        sagPanel = new javax.swing.JPanel();
        panelYoklamaGir = new javax.swing.JPanel();
        numaraGirText = new javax.swing.JLabel();
        metinKutusu = new javax.swing.JTextField();
        gelmeyenOgrencileriListeEkle = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        liste = new javax.swing.JList<>();
        dersSecText = new javax.swing.JLabel();
        cmbDersler = new javax.swing.JComboBox<>();
        tarihGirText = new javax.swing.JLabel();
        tarihTextField = new javax.swing.JTextField();
        saatGirText = new javax.swing.JLabel();
        baslangicSaatTextField = new javax.swing.JTextField();
        checkBox = new javax.swing.JCheckBox();
        saatGirText2 = new javax.swing.JLabel();
        bitisSaatTextField = new javax.swing.JTextField();
        yoklamaBilgisiKaydetButton = new yoklamatakipsistemi.MyButton();
        temizleButton = new yoklamatakipsistemi.MyButton();
        dersiAlanlarCheckB = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        panelYoklamaSorgula = new javax.swing.JPanel();
        yoklamaSorgulaAciklamaText = new javax.swing.JLabel();
        aramaKutusu = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        listeYoklamaSorgula = new javax.swing.JList<>();
        jLabel3 = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        geriMenu = new javax.swing.JMenu();
        temaMenu = new javax.swing.JMenu();
        karanlikTema = new javax.swing.JRadioButtonMenuItem();
        aydinlikTema = new javax.swing.JRadioButtonMenuItem();
        hesapMenu = new javax.swing.JMenu();
        sifreDegistir = new javax.swing.JMenuItem();
        hesaptanCıkMenu = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        hesabiSil = new javax.swing.JMenuItem();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        tema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yoklamatakipsistemi/themes.png"))); // NOI18N
        tema.setText("TEMA");

        temaPopupButton.add(aydinlikTemaPopup);
        aydinlikTemaPopup.setText("Aydınlık Tema");
        aydinlikTemaPopup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aydinlikTemaPopupActionPerformed(evt);
            }
        });
        tema.add(aydinlikTemaPopup);

        temaPopupButton.add(karanlikTemaPopup);
        karanlikTemaPopup.setSelected(true);
        karanlikTemaPopup.setText("Karanlık Tema");
        karanlikTemaPopup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                karanlikTemaPopupActionPerformed(evt);
            }
        });
        tema.add(karanlikTemaPopup);

        popupMenu.add(tema);

        Hesap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yoklamatakipsistemi/user menu.png"))); // NOI18N
        Hesap.setText("Hesap");

        sifreDegistirPopup.setText("Şifre Değiştir");
        sifreDegistirPopup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sifreDegistirPopupActionPerformed(evt);
            }
        });
        Hesap.add(sifreDegistirPopup);

        hesaptanCıkPopup.setText("Hesaptan Çıkış Yap");
        hesaptanCıkPopup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hesaptanCıkPopupActionPerformed(evt);
            }
        });
        Hesap.add(hesaptanCıkPopup);
        Hesap.add(jSeparator2);

        hesabiSilPopup.setText("Hesabı Sil");
        hesabiSilPopup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hesabiSilPopupActionPerformed(evt);
            }
        });
        Hesap.add(hesabiSilPopup);

        popupMenu.add(Hesap);

        ogrenciListDialog.getContentPane().setLayout(new javax.swing.BoxLayout(ogrenciListDialog.getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        dersiAlanlarBaslik.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        dersiAlanlarBaslik.setForeground(new java.awt.Color(255, 255, 255));
        dersiAlanlarBaslik.setText("Dersini Alanlar:");

        ogrenciNoları.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ogrenciNoları.setForeground(new java.awt.Color(255, 255, 255));
        ogrenciNoları.setText("jLabel3");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ogrenciNoları, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dersiAlanlarBaslik, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(dersiAlanlarBaslik)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ogrenciNoları, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(193, Short.MAX_VALUE))
        );

        ogrenciListDialog.getContentPane().add(jPanel1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(861, 555));
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        enAltPanel.setBackground(new java.awt.Color(255, 255, 255));
        enAltPanel.setLayout(new javax.swing.BoxLayout(enAltPanel, javax.swing.BoxLayout.LINE_AXIS));

        solPanel.setBackground(new java.awt.Color(0, 102, 102));
        solPanel.setMaximumSize(new java.awt.Dimension(220, 32767));
        solPanel.setMinimumSize(new java.awt.Dimension(220, 555));
        solPanel.setPreferredSize(new java.awt.Dimension(220, 555));

        butonYoklamaGir.setBackground(new java.awt.Color(23, 131, 131));
        butonYoklamaGir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                butonYoklamaGirMouseClicked(evt);
            }
        });
        butonYoklamaGir.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        seciliPanelIsareti1.setBackground(new java.awt.Color(0, 51, 51));
        seciliPanelIsareti1.setText(" ");
        seciliPanelIsareti1.setOpaque(true);
        butonYoklamaGir.add(seciliPanelIsareti1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 20, 50));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Yoklama Gir");
        butonYoklamaGir.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 110, 30));

        butonYoklamaSorgula.setBackground(new java.awt.Color(0, 102, 102));
        butonYoklamaSorgula.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                butonYoklamaSorgulaMouseClicked(evt);
            }
        });
        butonYoklamaSorgula.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        seciliPanelIsareti2.setBackground(new java.awt.Color(0, 102, 102));
        seciliPanelIsareti2.setText(" ");
        seciliPanelIsareti2.setOpaque(true);
        butonYoklamaSorgula.add(seciliPanelIsareti2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 20, 50));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Yoklama Sorgula");
        butonYoklamaSorgula.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 160, 30));

        javax.swing.GroupLayout solPanelLayout = new javax.swing.GroupLayout(solPanel);
        solPanel.setLayout(solPanelLayout);
        solPanelLayout.setHorizontalGroup(
            solPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, solPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(butonYoklamaGir, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, solPanelLayout.createSequentialGroup()
                .addComponent(butonYoklamaSorgula, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        solPanelLayout.setVerticalGroup(
            solPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(solPanelLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(butonYoklamaGir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(butonYoklamaSorgula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(407, Short.MAX_VALUE))
        );

        enAltPanel.add(solPanel);

        sagPanel.setBackground(new java.awt.Color(51, 51, 51));
        sagPanel.setPreferredSize(new java.awt.Dimension(641, 555));
        sagPanel.setLayout(new java.awt.CardLayout());

        panelYoklamaGir.setBackground(new java.awt.Color(51, 51, 51));
        panelYoklamaGir.setComponentPopupMenu(popupMenu);

        numaraGirText.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        numaraGirText.setForeground(new java.awt.Color(255, 255, 255));
        numaraGirText.setText("Gelmeyen Öğrenci Numaralarını Gir");

        gelmeyenOgrencileriListeEkle.setText("ekle");
        gelmeyenOgrencileriListeEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gelmeyenOgrencileriListeEkleActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(liste);

        dersSecText.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        dersSecText.setForeground(new java.awt.Color(255, 255, 255));
        dersSecText.setText("Dersi seç:");

        cmbDersler.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbDerslerİtemStateChanged(evt);
            }
        });

        tarihGirText.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tarihGirText.setForeground(new java.awt.Color(255, 255, 255));
        tarihGirText.setText("Tarih Gir:");

        saatGirText.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        saatGirText.setForeground(new java.awt.Color(255, 255, 255));
        saatGirText.setText("Başlangıç Saatini Gir:");

        checkBox.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        checkBox.setForeground(new java.awt.Color(255, 255, 255));
        checkBox.setText("Yoklama bilgilerini onaylıyorum.");

        saatGirText2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        saatGirText2.setForeground(new java.awt.Color(255, 255, 255));
        saatGirText2.setText("Bitiş Saatini Gir:");

        yoklamaBilgisiKaydetButton.setBackground(new java.awt.Color(23, 131, 131));
        yoklamaBilgisiKaydetButton.setText("KAYDET");
        yoklamaBilgisiKaydetButton.setColor(new java.awt.Color(23, 131, 131));
        yoklamaBilgisiKaydetButton.setRadius(30);
        yoklamaBilgisiKaydetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yoklamaBilgisiKaydetButtonActionPerformed(evt);
            }
        });

        temizleButton.setBackground(new java.awt.Color(23, 131, 131));
        temizleButton.setText("TEMİZLE");
        temizleButton.setColor(new java.awt.Color(23, 131, 131));
        temizleButton.setRadius(30);
        temizleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                temizleButtonActionPerformed(evt);
            }
        });

        dersiAlanlarCheckB.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        dersiAlanlarCheckB.setForeground(new java.awt.Color(255, 255, 255));
        dersiAlanlarCheckB.setText("Dersi alan öğrencileri göster");
        dersiAlanlarCheckB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dersiAlanlarCheckBActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yoklamatakipsistemi/information-button.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelYoklamaGirLayout = new javax.swing.GroupLayout(panelYoklamaGir);
        panelYoklamaGir.setLayout(panelYoklamaGirLayout);
        panelYoklamaGirLayout.setHorizontalGroup(
            panelYoklamaGirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelYoklamaGirLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(panelYoklamaGirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(temizleButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(numaraGirText, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelYoklamaGirLayout.createSequentialGroup()
                        .addComponent(metinKutusu)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(gelmeyenOgrencileriListeEkle, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGroup(panelYoklamaGirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelYoklamaGirLayout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addGroup(panelYoklamaGirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelYoklamaGirLayout.createSequentialGroup()
                                .addGroup(panelYoklamaGirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tarihTextField)
                                    .addComponent(cmbDersler, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(dersSecText, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tarihGirText, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(baslangicSaatTextField)
                                    .addComponent(bitisSaatTextField)
                                    .addComponent(saatGirText, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(saatGirText2, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dersiAlanlarCheckB, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(checkBox, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelYoklamaGirLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(yoklamaBilgisiKaydetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(127, 127, 127))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelYoklamaGirLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );
        panelYoklamaGirLayout.setVerticalGroup(
            panelYoklamaGirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelYoklamaGirLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(panelYoklamaGirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelYoklamaGirLayout.createSequentialGroup()
                        .addComponent(numaraGirText)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelYoklamaGirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(metinKutusu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(gelmeyenOgrencileriListeEkle))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(temizleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 117, Short.MAX_VALUE))
                    .addGroup(panelYoklamaGirLayout.createSequentialGroup()
                        .addComponent(dersSecText)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbDersler, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(dersiAlanlarCheckB)
                        .addGap(18, 18, 18)
                        .addComponent(tarihGirText)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tarihTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(saatGirText)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(baslangicSaatTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(saatGirText2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bitisSaatTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(checkBox)
                        .addGap(18, 18, 18)
                        .addComponent(yoklamaBilgisiKaydetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addContainerGap())))
        );

        sagPanel.add(panelYoklamaGir, "card3");

        panelYoklamaSorgula.setBackground(new java.awt.Color(51, 51, 51));
        panelYoklamaSorgula.setComponentPopupMenu(popupMenu);

        yoklamaSorgulaAciklamaText.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        yoklamaSorgulaAciklamaText.setForeground(new java.awt.Color(255, 255, 255));
        yoklamaSorgulaAciklamaText.setText("Yoklama durumunu sorgulamak istediğiniz öğrencinin adını giriniz.");

        aramaKutusu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                aramaKutusuKeyReleased(evt);
            }
        });

        listeYoklamaSorgula.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listeYoklamaSorgula.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listeYoklamaSorgulaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(listeYoklamaSorgula);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yoklamatakipsistemi/information-button.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelYoklamaSorgulaLayout = new javax.swing.GroupLayout(panelYoklamaSorgula);
        panelYoklamaSorgula.setLayout(panelYoklamaSorgulaLayout);
        panelYoklamaSorgulaLayout.setHorizontalGroup(
            panelYoklamaSorgulaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelYoklamaSorgulaLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(panelYoklamaSorgulaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(yoklamaSorgulaAciklamaText, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelYoklamaSorgulaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(aramaKutusu, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap(148, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelYoklamaSorgulaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap())
        );
        panelYoklamaSorgulaLayout.setVerticalGroup(
            panelYoklamaSorgulaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelYoklamaSorgulaLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(yoklamaSorgulaAciklamaText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(aramaKutusu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 186, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap())
        );

        sagPanel.add(panelYoklamaSorgula, "card2");

        enAltPanel.add(sagPanel);

        getContentPane().add(enAltPanel);

        geriMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yoklamatakipsistemi/back-arrow.png"))); // NOI18N
        geriMenu.setText("Geri");
        temaButton.add(geriMenu);
        geriMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                geriMenuMouseClicked(evt);
            }
        });
        menuBar.add(geriMenu);

        temaMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yoklamatakipsistemi/themes.png"))); // NOI18N
        temaMenu.setText("Tema");
        temaButton.add(temaMenu);

        temaButton.add(karanlikTema);
        karanlikTema.setSelected(true);
        karanlikTema.setText("Karanlık Tema");
        karanlikTema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                karanlikTemaActionPerformed(evt);
            }
        });
        temaMenu.add(karanlikTema);

        temaButton.add(aydinlikTema);
        aydinlikTema.setText("Aydınlık Tema");
        aydinlikTema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aydinlikTemaActionPerformed(evt);
            }
        });
        temaMenu.add(aydinlikTema);

        menuBar.add(temaMenu);

        hesapMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yoklamatakipsistemi/user menu.png"))); // NOI18N
        hesapMenu.setText("Hesap");
        temaButton.add(hesapMenu);

        sifreDegistir.setText("Şifre Değiştir");
        sifreDegistir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sifreDegistirActionPerformed(evt);
            }
        });
        hesapMenu.add(sifreDegistir);

        hesaptanCıkMenu.setText("Hesaptan Çıkış Yap");
        hesaptanCıkMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hesaptanCıkMenuActionPerformed(evt);
            }
        });
        hesapMenu.add(hesaptanCıkMenu);
        hesapMenu.add(jSeparator1);

        hesabiSil.setText("Hesabı Sil");
        hesabiSil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hesabiSilActionPerformed(evt);
            }
        });
        hesapMenu.add(hesabiSil);

        menuBar.add(hesapMenu);

        setJMenuBar(menuBar);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void butonYoklamaGirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butonYoklamaGirMouseClicked
        sagPanel.removeAll();
        sagPanel.add(panelYoklamaGir);
        sagPanel.repaint();
        sagPanel.revalidate();

        butonYoklamaGir.setBackground(new Color(23, 131, 131));
        seciliPanelIsareti1.setBackground(new Color(0, 51, 51));

        butonYoklamaSorgula.setBackground(new Color(0, 102, 102));
        seciliPanelIsareti2.setBackground(new Color(0, 102, 102));
    }//GEN-LAST:event_butonYoklamaGirMouseClicked

    private void butonYoklamaSorgulaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butonYoklamaSorgulaMouseClicked
        sagPanel.removeAll();
        sagPanel.add(panelYoklamaSorgula);
        sagPanel.repaint();
        sagPanel.revalidate();

        butonYoklamaSorgula.setBackground(new Color(23, 131, 131));
        seciliPanelIsareti2.setBackground(new Color(0, 51, 51));

        butonYoklamaGir.setBackground(new Color(0, 102, 102));
        seciliPanelIsareti1.setBackground(new Color(0, 102, 102));
    }//GEN-LAST:event_butonYoklamaSorgulaMouseClicked

    private void gelmeyenOgrencileriListeEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gelmeyenOgrencileriListeEkleActionPerformed
        if (regex.sayiKontrol(metinKutusu.getText())) {
            int ogrenciNo = Integer.parseInt(metinKutusu.getText());
            String ders = cmbDersler.getItemAt(cmbDersler.getSelectedIndex());
            if (baglanti.ogrenciSeciliDersiAliyorMu(ders, ogrenciNo)) {
                gelmeyenOgrenciNoArrayList.add(metinKutusu.getText());
                metinKutusu.setText("");
                list.addElement(gelmeyenOgrenciNoArrayList.get(gelmeyenOgrenciNoArrayList.size() - 1));
            } else {
                JOptionPane.showMessageDialog(rootPane, "Seçili dersi alan öğrenciler arasında giridğiniz numaraya sahip biri yok!", "Uyarı!", JOptionPane.WARNING_MESSAGE);
                metinKutusu.setText("");
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Öğrenci numarası sadece sayı olabilir. Lütfen numaraları rakamla ve teker teker giriniz.", "Uyarı!", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_gelmeyenOgrencileriListeEkleActionPerformed

    private void yoklamaGir() {
        String seciliDers = cmbDersler.getItemAt(cmbDersler.getSelectedIndex());
        baglanti.seciliDersiAlanOgrenciler(seciliDers, seciliDersiAlanOgrenciler);
        gelenOgrenciArrayListineNoEkle();
        for (int i = 0; i < gelmeyenOgrenciNoArrayList.size(); i++) {
            int ogrenciNo = Integer.parseInt(gelmeyenOgrenciNoArrayList.get(i).toString());
            baglanti.yoklamaKaydet(ogrenciNo, seciliDers, tarihTextField.getText(), baslangicSaatTextField.getText(), bitisSaatTextField.getText(), tcNo, 0);
        }

        for (int i = 0; i < gelenOgrenciNoArrayList.size(); i++) {
            int ogrenciNo = Integer.parseInt(gelenOgrenciNoArrayList.get(i).toString());
            baglanti.yoklamaKaydet(ogrenciNo, seciliDers, tarihTextField.getText(), baslangicSaatTextField.getText(), bitisSaatTextField.getText(), tcNo, 1);
        }

        //öncekileri temizle
        list.removeAllElements();
        seciliDersiAlanOgrenciler.clear();
        gelenOgrenciNoArrayList.clear();
        gelmeyenOgrenciNoArrayList.clear();
        tarihTextField.setText("");
        baslangicSaatTextField.setText("");
        bitisSaatTextField.setText("");
        checkBox.setSelected(false);

        JOptionPane.showMessageDialog(rootPane, "Yoklama Bilgisi Sisteme Kaydedildi.", "Message", JOptionPane.INFORMATION_MESSAGE);
    }

    private void gelenOgrenciArrayListineNoEkle() {
        gelenOgrenciNoArrayList.clear();
        boolean gelmeyenlerdeMi;
        for (int a = 0; a < seciliDersiAlanOgrenciler.size(); a++) {
            gelmeyenlerdeMi = false;
            for (int b = 0; b < gelmeyenOgrenciNoArrayList.size(); b++) {
                if (Integer.parseInt(seciliDersiAlanOgrenciler.get(a).toString()) == Integer.parseInt(gelmeyenOgrenciNoArrayList.get(b).toString())) {
                    gelmeyenlerdeMi = true;
                }
            }
            if (gelmeyenlerdeMi == false) {
                gelenOgrenciNoArrayList.add(seciliDersiAlanOgrenciler.get(a));
            }
        }
    }

    private void cmbDerslerİtemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbDerslerİtemStateChanged
        ArrayList hataliNumaralar = new ArrayList();
        ArrayList hatasizlar = new ArrayList();
        String hatalilar = "";
        boolean hataVar = false;
        for (int i = 0; i < gelmeyenOgrenciNoArrayList.size(); i++) {
            int ogrenciNo = Integer.parseInt(gelmeyenOgrenciNoArrayList.get(i).toString());
            String seciliDers = cmbDersler.getItemAt(cmbDersler.getSelectedIndex());
            if (baglanti.ogrenciSeciliDersiAliyorMu(seciliDers, ogrenciNo) == false) {
                hataliNumaralar.add(ogrenciNo);
                hatalilar += ogrenciNo + " ";
                hataVar = true;
            } else {
                hatasizlar.add(ogrenciNo);
            }
        }

        if (hataVar) {
            JOptionPane.showMessageDialog(rootPane, hatalilar + " nolu öğrenciler yeni seçtiğiniz dersi almıyor. Bu sebeple onları listeden çıkardık", "Message", JOptionPane.INFORMATION_MESSAGE);
            //seçilileri sil
            list.removeAllElements();
            gelmeyenOgrenciNoArrayList.clear();
            gelmeyenOgrenciNoArrayList = hatasizlar;
            for (int i = 0; i < gelmeyenOgrenciNoArrayList.size(); i++) {
                list.addElement(gelmeyenOgrenciNoArrayList.get(i));
            }
        }
    }//GEN-LAST:event_cmbDerslerİtemStateChanged

    private void aramaKutusuKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_aramaKutusuKeyReleased
        if (aramaKutusu.getText().compareTo("") == 0) {
            listYoklamaSorgula.removeAllElements();
        } else {
            listYoklamaSorgula.removeAllElements();
            String baslangicMetni = aramaKutusu.getText();
            baglanti.ismiXIleBaşlayanOgrenciler(baslangicMetni, yoklamaSorgula);
            for (int i = 0; i < yoklamaSorgula.size(); i++) {
                listYoklamaSorgula.addElement(yoklamaSorgula.get(i));
            }
        }
    }//GEN-LAST:event_aramaKutusuKeyReleased

    private void listeYoklamaSorgulaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listeYoklamaSorgulaMouseClicked
        JOptionPane.showConfirmDialog(rootPane, "Seçilen öğrencinin yoklama bilgilerinin olduğu sayfa açılacak. Onaylıyor musun?", "Warning!", JOptionPane.YES_NO_OPTION);
        if (JOptionPane.YES_NO_OPTION == JOptionPane.YES_OPTION) {
            String ogrenciAdiNumarasi = yoklamaSorgula.get(listeYoklamaSorgula.getSelectedIndex()).toString();
            String no = "";
            for (int i = 0; i < ogrenciAdiNumarasi.length(); i++) {

                if (Character.isDigit(ogrenciAdiNumarasi.charAt(i))) {
                    no += ogrenciAdiNumarasi.charAt(i);
                }
            }
            String ogrenciTc = baglanti.ogrenciNodanTcBulma(Integer.parseInt(no));
            boolean karanlik;
            if (karanlikTema.isSelected()) {
                karanlik = true;
            } else {
                karanlik = false;
            }
            OgretmenFrame2 ogretmenFrame2 = new OgretmenFrame2(tcNo, ogrenciTc, karanlik);
            ogretmenFrame2.setVisible(true);
            this.dispose();
        } else {
            remove(JOptionPane.YES_NO_OPTION);
        }
    }//GEN-LAST:event_listeYoklamaSorgulaMouseClicked

    private void yoklamaBilgisiKaydetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yoklamaBilgisiKaydetButtonActionPerformed
        if (tarihTextField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Lütfen tarih bilgisini giriniz!", "Message", JOptionPane.WARNING_MESSAGE);
        } else if (regex.tarihKontrol(tarihTextField.getText()) == false) {
            JOptionPane.showMessageDialog(rootPane, "Geçerli bir tarih giriniz! Örnek: 10.7.2019 yada 06.12.2022", "Message", JOptionPane.WARNING_MESSAGE);
        } else if (baslangicSaatTextField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Lütfen başlangıç saati bilgisini giriniz!", "Message", JOptionPane.WARNING_MESSAGE);
        } else if (regex.saatKontrol(baslangicSaatTextField.getText()) == false) {
            JOptionPane.showMessageDialog(rootPane, "Geçerli bir saat giriniz! Örnek: 10:50", "Message", JOptionPane.WARNING_MESSAGE);
        } else if (bitisSaatTextField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Lütfen bitiş saati bilgisini giriniz!", "Message", JOptionPane.WARNING_MESSAGE);
        } else if (regex.saatKontrol(bitisSaatTextField.getText()) == false) {
            JOptionPane.showMessageDialog(rootPane, "Geçerli bir saat giriniz! Örnek: 10:50", "Message", JOptionPane.WARNING_MESSAGE);
        } else if (checkBox.isSelected() == false) {
            JOptionPane.showMessageDialog(rootPane, "Girdiğiniz bilgilerin dogruluğunu onaylayınız!", "Message", JOptionPane.WARNING_MESSAGE);
        } else {
            if (gelmeyenOgrenciNoArrayList.isEmpty()) {
                int n = JOptionPane.showConfirmDialog(rootPane, "Gelmeyen öğrenci numarası girmediniz. Tüm öğrencilerin geldiğine emin misiz?", "UYARI!", JOptionPane.YES_NO_OPTION);
                if (true) {
                    yoklamaGir();
                } else {
                    System.exit(1);
                }
            } else {
                yoklamaGir();
            }
        }
    }//GEN-LAST:event_yoklamaBilgisiKaydetButtonActionPerformed

    private void temizleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_temizleButtonActionPerformed
        list.removeAllElements();
        seciliDersiAlanOgrenciler.clear();
        gelmeyenOgrenciNoArrayList.clear();
        gelenOgrenciNoArrayList.clear();
    }//GEN-LAST:event_temizleButtonActionPerformed

    private void hesabiSilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hesabiSilActionPerformed
        baglanti.ogretmenSil(tcNo);
        GirisYap girisYap = new GirisYap();
        girisYap.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_hesabiSilActionPerformed

    private void sifreDegistirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sifreDegistirActionPerformed
        yeniSifreAl yeniSifreAl = new yeniSifreAl(tcNo);
        yeniSifreAl.setVisible(true);
    }//GEN-LAST:event_sifreDegistirActionPerformed

    private void hesaptanCıkMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hesaptanCıkMenuActionPerformed
        GirisYap girisYap = new GirisYap();
        girisYap.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_hesaptanCıkMenuActionPerformed

    private void geriMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_geriMenuMouseClicked
        GirisYap girisYap = new GirisYap();
        girisYap.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_geriMenuMouseClicked

    private void sifreDegistirPopupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sifreDegistirPopupActionPerformed
        yeniSifreAl yeniSifreAl = new yeniSifreAl(tcNo);
        yeniSifreAl.setVisible(true);
    }//GEN-LAST:event_sifreDegistirPopupActionPerformed

    private void hesaptanCıkPopupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hesaptanCıkPopupActionPerformed
        GirisYap girisYap = new GirisYap();
        girisYap.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_hesaptanCıkPopupActionPerformed

    private void hesabiSilPopupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hesabiSilPopupActionPerformed
        baglanti.ogretmenSil(tcNo);
        GirisYap girisYap = new GirisYap();
        girisYap.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_hesabiSilPopupActionPerformed

    private void karanlikTemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_karanlikTemaActionPerformed
        karanlikTemaYap();
        karanlikTemaPopup.setSelected(true);
        aydinlikTemaPopup.setSelected(false);
    }//GEN-LAST:event_karanlikTemaActionPerformed

    private void aydinlikTemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aydinlikTemaActionPerformed
        aydinlikTemaYap();
        aydinlikTemaPopup.setSelected(true);
        karanlikTemaPopup.setSelected(false);
    }//GEN-LAST:event_aydinlikTemaActionPerformed

    private void aydinlikTemaPopupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aydinlikTemaPopupActionPerformed
        aydinlikTemaYap();
        aydinlikTema.setSelected(true);
        karanlikTema.setSelected(false);
    }//GEN-LAST:event_aydinlikTemaPopupActionPerformed

    private void karanlikTemaPopupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_karanlikTemaPopupActionPerformed
        karanlikTemaYap();
        karanlikTema.setSelected(true);
        aydinlikTema.setSelected(false);
    }//GEN-LAST:event_karanlikTemaPopupActionPerformed

    private void dersiAlanlarCheckBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dersiAlanlarCheckBActionPerformed
        if (dersiAlanlarCheckB.isSelected()) {
            String seciliDers = cmbDersler.getItemAt(cmbDersler.getSelectedIndex());
            dersiAlanlarBaslik.setText(seciliDers + " dersini alan öğrenciler:");
            baglanti.seciliDersiAlanOgrenciler(seciliDers, seciliDersiAlanlarForDialog);
            String numaralar = "";
            for (int i = 0; i < seciliDersiAlanlarForDialog.size(); i++) {
                numaralar += seciliDersiAlanlarForDialog.get(i) + ", ";
            }
            ogrenciNoları.setText(numaralar);
            ogrenciListDialog.setSize(300, 200);
            ogrenciListDialog.setLocationRelativeTo(null);
            ogrenciListDialog.setVisible(true);
            seciliDersiAlanlarForDialog.clear();
            dersiAlanlarCheckB.setSelected(false);
        }
    }//GEN-LAST:event_dersiAlanlarCheckBActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        JOptionPane.showMessageDialog(rootPane, "Bu sayfada gelmeyen öğrenci numaralarını ve"
                + "bilgileri yazarak yoklama oluşturabilirsiniz. Öğrenci numaralarını teker teker"
                + "girip sonrasında ekle butonuna basmayı unutmayın.", "Bilgilendirme", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        JOptionPane.showMessageDialog(rootPane, "Bu sayfada adını girdiğiniz öğrencinin üzerine tıklayarak yoklama bilgisini görebilirsiniz", "Bilgilendirme", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void aydinlikTemaYap() {
        Color anaPanelRengi = new Color(204, 204, 204);
        Color yaziRengi = Color.BLACK;
        renkDegis(anaPanelRengi, yaziRengi);
    }

    private void karanlikTemaYap() {
        Color anaPanelRengi = new Color(51, 51, 51);
        Color yaziRengi = Color.WHITE;
        renkDegis(anaPanelRengi, yaziRengi);
    }

    private void renkDegis(Color anaPanelRengi, Color yaziRengi) {
        panelYoklamaGir.setBackground(anaPanelRengi);
        panelYoklamaSorgula.setBackground(anaPanelRengi);
        yoklamaSorgulaAciklamaText.setForeground(yaziRengi);
        numaraGirText.setForeground(yaziRengi);
        dersSecText.setForeground(yaziRengi);
        tarihGirText.setForeground(yaziRengi);
        saatGirText.setForeground(yaziRengi);
        saatGirText2.setForeground(yaziRengi);
        checkBox.setForeground(yaziRengi);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Hesap;
    private javax.swing.JTextField aramaKutusu;
    private javax.swing.JRadioButtonMenuItem aydinlikTema;
    private javax.swing.JRadioButtonMenuItem aydinlikTemaPopup;
    private javax.swing.JTextField baslangicSaatTextField;
    private javax.swing.JTextField bitisSaatTextField;
    private javax.swing.JPanel butonYoklamaGir;
    private javax.swing.JPanel butonYoklamaSorgula;
    private javax.swing.JCheckBox checkBox;
    private javax.swing.JComboBox<String> cmbDersler;
    private javax.swing.JLabel dersSecText;
    private javax.swing.JLabel dersiAlanlarBaslik;
    private javax.swing.JCheckBox dersiAlanlarCheckB;
    private javax.swing.JPanel enAltPanel;
    private javax.swing.JButton gelmeyenOgrencileriListeEkle;
    private javax.swing.JMenu geriMenu;
    private javax.swing.JMenuItem hesabiSil;
    private javax.swing.JMenuItem hesabiSilPopup;
    private javax.swing.JMenu hesapMenu;
    private javax.swing.JMenuItem hesaptanCıkMenu;
    private javax.swing.JMenuItem hesaptanCıkPopup;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JRadioButtonMenuItem karanlikTema;
    private javax.swing.JRadioButtonMenuItem karanlikTemaPopup;
    private javax.swing.JList<String> liste;
    private javax.swing.JList<String> listeYoklamaSorgula;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JTextField metinKutusu;
    private javax.swing.JLabel numaraGirText;
    private javax.swing.JDialog ogrenciListDialog;
    private javax.swing.JLabel ogrenciNoları;
    private javax.swing.JPanel panelYoklamaGir;
    private javax.swing.JPanel panelYoklamaSorgula;
    private javax.swing.JPopupMenu popupMenu;
    private javax.swing.JLabel saatGirText;
    private javax.swing.JLabel saatGirText2;
    private javax.swing.JPanel sagPanel;
    private javax.swing.JLabel seciliPanelIsareti1;
    private javax.swing.JLabel seciliPanelIsareti2;
    private javax.swing.JMenuItem sifreDegistir;
    private javax.swing.JMenuItem sifreDegistirPopup;
    private javax.swing.JPanel solPanel;
    private javax.swing.JLabel tarihGirText;
    private javax.swing.JTextField tarihTextField;
    private javax.swing.JMenu tema;
    private javax.swing.ButtonGroup temaButton;
    private javax.swing.JMenu temaMenu;
    private javax.swing.ButtonGroup temaPopupButton;
    private yoklamatakipsistemi.MyButton temizleButton;
    private yoklamatakipsistemi.MyButton yoklamaBilgisiKaydetButton;
    private javax.swing.JLabel yoklamaSorgulaAciklamaText;
    // End of variables declaration//GEN-END:variables
}
