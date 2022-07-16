package yoklamatakipsistemi;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

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

public class OgrenciIlkFrame extends javax.swing.JFrame {

    Baglanti baglanti = new Baglanti();
    DefaultTableModel tabloModel;
    DefaultListModel list = new DefaultListModel();
    ArrayList seciliDersinDevamsizliklari = new ArrayList();
    boolean yazilarGizli = true;

    //Kişisel Bilgiler:
    String[] kisiselBilgileriArray = new String[4];
    String tcNo;
    String ogrenciAdi;
    int ogrenciNosu;
    int ogrenciYasi;
    String ogrenciCinsiyeti;

    public OgrenciIlkFrame() {
        initComponents();
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    public OgrenciIlkFrame(String tc) {
        initComponents();
        liste.setModel(list);
        tabloModel = (DefaultTableModel) tablo.getModel();
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        //Kişisel Bilgileri Tanımlama:
        tcNo = tc;
        kisiselBilgileriArray = baglanti.ogrenciBilgileriArray(tcNo);
        ogrenciNosu = Integer.parseInt(kisiselBilgileriArray[1]);

        dersleriCmbyeEkle();
        yoklamayiTabloyaEkle();
        karanlikTemaYap();
        genelDurumuyazdir();
        seciliDersinDevamsizliklariniYazdir();
        kisiselBilgiyiGizliYazdir();
        bilgileriGosterCheckMenu.setSelected(false);
    }

    private void dersleriCmbyeEkle() {
        ArrayList derslerArrayList = new ArrayList();
        baglanti.ogrencininAldigiDersler(tcNo, derslerArrayList);
        for (int i = 0; i < derslerArrayList.size(); i++) {
            dersSecCB.addItem("" + derslerArrayList.get(i));
        }
    }

    private void yoklamayiTabloyaEkle() {
        String[][] tabloVerileri = baglanti.tabloVerileriMultiArray(ogrenciNosu);
        for (String[] row : tabloVerileri) {
            tabloModel.addRow(row);
        }
    }

    private void kisiselBilgiYazdir() {
        adSoyad.setText(kisiselBilgileriArray[0]);
        okulNo.setText(kisiselBilgileriArray[1]);
        tc.setText(tcNo);
        yas.setText(kisiselBilgileriArray[2]);
        cinsiyet.setText(kisiselBilgileriArray[3]);
    }

    private void kisiselBilgiyiGizliYazdir() {
        adSoyad.setText(yazilariGizliYap(kisiselBilgileriArray[0]));
        okulNo.setText(yazilariGizliYap(kisiselBilgileriArray[1]));
        tc.setText(yazilariGizliYap(tcNo));
        yas.setText(yazilariGizliYap(kisiselBilgileriArray[2]));
        cinsiyet.setText(yazilariGizliYap(kisiselBilgileriArray[3]));
    }

    private String yazilariGizliYap(String yazi) {
        int karakterSayisi = yazi.length();
        String gizliYazi = "";
        for (int i = 0; i < karakterSayisi; i++) {
            gizliYazi += "*";
        }
        return gizliYazi;
    }

    private void genelDurumuyazdir() {
        int girdigiDersSayisi = baglanti.girdigiDersSayisi(ogrenciNosu);
        int girmedigiDersSayisi = baglanti.girmedigiDersSayisi(ogrenciNosu);

        girdigiDerslerSayisi.setText(String.valueOf(girdigiDersSayisi));
        girmedigiDerslerSayisi.setText(String.valueOf(girmedigiDersSayisi));
        if (girdigiDersSayisi == 0 && girmedigiDersSayisi == 0) {
            devamsizlikOrani.setText("");
        } else {
            int devamsizlikYüzdesi = (100 * girmedigiDersSayisi) / (girdigiDersSayisi + girmedigiDersSayisi);
            devamsizlikOrani.setText("%" + devamsizlikYüzdesi);
        }
    }

    private void seciliDersinDevamsizliklariniYazdir() {
        list.removeAllElements();
        String ders = dersSecCB.getItemAt(dersSecCB.getSelectedIndex());
        baglanti.seciliDerseGelmedigiGünler(ogrenciNosu, ders, seciliDersinDevamsizliklari);
        if (seciliDersinDevamsizliklari.isEmpty()) {
            list.addElement("Bu derse ait devamsızlık bulunmamaktadır.");
        }
        for (int i = 0; i < seciliDersinDevamsizliklari.size(); i++) {
            list.addElement(seciliDersinDevamsizliklari.get(i));
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        temaButtonGroup = new javax.swing.ButtonGroup();
        popupTemaButtonGroup = new javax.swing.ButtonGroup();
        popupMenu = new javax.swing.JPopupMenu();
        tema = new javax.swing.JMenu();
        aydinlikTemaPopup = new javax.swing.JRadioButtonMenuItem();
        karanlikTemaPopup = new javax.swing.JRadioButtonMenuItem();
        renkliTemaPopup = new javax.swing.JRadioButtonMenuItem();
        Hesap = new javax.swing.JMenu();
        sifreDegistirPopup = new javax.swing.JMenuItem();
        hesaptanCıkPopup = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        hesabiSilPopup = new javax.swing.JMenuItem();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        panelGenelDurum = new javax.swing.JPanel();
        girdigiDerslerText = new javax.swing.JLabel();
        girdigiDerslerSayisi = new javax.swing.JLabel();
        girmedigiDerslerText = new javax.swing.JLabel();
        girmedigiDerslerSayisi = new javax.swing.JLabel();
        devamsizlikOraniText = new javax.swing.JLabel();
        devamsizlikOrani = new javax.swing.JLabel();
        panelKisiselBilgiler = new javax.swing.JPanel();
        kisiselBilgilerText = new javax.swing.JLabel();
        adSoyadText = new javax.swing.JLabel();
        adSoyad = new javax.swing.JLabel();
        okulNoText = new javax.swing.JLabel();
        okulNo = new javax.swing.JLabel();
        tcText = new javax.swing.JLabel();
        tc = new javax.swing.JLabel();
        yasText = new javax.swing.JLabel();
        yas = new javax.swing.JLabel();
        cinsiyetText = new javax.swing.JLabel();
        cinsiyet = new javax.swing.JLabel();
        informationIcon1 = new javax.swing.JLabel();
        bilgileriGosterGizleButton = new yoklamatakipsistemi.MyButton();
        panelDevamsızlıkları = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        liste = new javax.swing.JList<>();
        dersSecCB = new javax.swing.JComboBox<>();
        gelmedigiGunlerText = new javax.swing.JLabel();
        informationIcon3 = new javax.swing.JLabel();
        panelYoklamaListesi = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablo = new javax.swing.JTable();
        informationIcon2 = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        geriMenu = new javax.swing.JMenu();
        temaMenu = new javax.swing.JMenu();
        karanlikTema = new javax.swing.JRadioButtonMenuItem();
        aydinlikTema = new javax.swing.JRadioButtonMenuItem();
        renkliTema = new javax.swing.JRadioButtonMenuItem();
        hesapMenu = new javax.swing.JMenu();
        sifreDegistir = new javax.swing.JMenuItem();
        hesaptanCıkMenu = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        hesapSil = new javax.swing.JMenuItem();
        menu = new javax.swing.JMenu();
        bilgileriGosterCheckMenu = new javax.swing.JCheckBoxMenuItem();

        tema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yoklamatakipsistemi/themes.png"))); // NOI18N
        tema.setText("TEMA");

        popupTemaButtonGroup.add(aydinlikTemaPopup);
        aydinlikTemaPopup.setText("Aydınlık Tema");
        aydinlikTemaPopup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aydinlikTemaPopupActionPerformed(evt);
            }
        });
        tema.add(aydinlikTemaPopup);

        popupTemaButtonGroup.add(karanlikTemaPopup);
        karanlikTemaPopup.setSelected(true);
        karanlikTemaPopup.setText("Karanlık Tema");
        karanlikTemaPopup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                karanlikTemaPopupActionPerformed(evt);
            }
        });
        tema.add(karanlikTemaPopup);

        popupTemaButtonGroup.add(renkliTemaPopup);
        renkliTemaPopup.setText("Renkli Tema");
        renkliTemaPopup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                renkliTemaPopupActionPerformed(evt);
            }
        });
        tema.add(renkliTemaPopup);

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
        Hesap.add(jSeparator3);

        hesabiSilPopup.setText("Hesabı Sil");
        hesabiSilPopup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hesabiSilPopupActionPerformed(evt);
            }
        });
        Hesap.add(hesabiSilPopup);

        popupMenu.add(Hesap);

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(861, 555));
        setMinimumSize(new java.awt.Dimension(861, 555));
        setPreferredSize(new java.awt.Dimension(861, 555));
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTabbedPane1.setMinimumSize(new java.awt.Dimension(850, 544));
        jTabbedPane1.setOpaque(true);
        jTabbedPane1.setPreferredSize(new java.awt.Dimension(850, 544));

        panelGenelDurum.setBackground(new java.awt.Color(51, 51, 51));
        panelGenelDurum.setComponentPopupMenu(popupMenu);

        girdigiDerslerText.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        girdigiDerslerText.setForeground(new java.awt.Color(255, 255, 255));
        girdigiDerslerText.setText("Girdiği toplam ders sayısı:");

        girdigiDerslerSayisi.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        girdigiDerslerSayisi.setForeground(new java.awt.Color(255, 255, 255));
        girdigiDerslerSayisi.setText("0");

        girmedigiDerslerText.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        girmedigiDerslerText.setForeground(new java.awt.Color(255, 255, 255));
        girmedigiDerslerText.setText("Girmediği toplam ders sayısı:");

        girmedigiDerslerSayisi.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        girmedigiDerslerSayisi.setForeground(new java.awt.Color(255, 255, 255));
        girmedigiDerslerSayisi.setText("0");

        devamsizlikOraniText.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        devamsizlikOraniText.setForeground(new java.awt.Color(255, 255, 255));
        devamsizlikOraniText.setText("Devamsızlık oranı:");

        devamsizlikOrani.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        devamsizlikOrani.setForeground(new java.awt.Color(255, 255, 255));
        devamsizlikOrani.setText("5");

        panelKisiselBilgiler.setBackground(new java.awt.Color(0, 102, 102));

        kisiselBilgilerText.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        kisiselBilgilerText.setText("KİŞİSEL BİLGİLER:");

        adSoyadText.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        adSoyadText.setText("Ad Soyad:");

        adSoyad.setText("Ad");

        okulNoText.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        okulNoText.setText("Okul no:");

        okulNo.setText("2021111111");

        tcText.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tcText.setText("TC Kimlik No:");

        tc.setText("11111111111");

        yasText.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        yasText.setText("Yaş:");

        yas.setText("19");

        cinsiyetText.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cinsiyetText.setText("Cinsiyet:");

        cinsiyet.setText("Kız");

        informationIcon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yoklamatakipsistemi/information-button.png"))); // NOI18N
        informationIcon1.setText("jLabel1");
        informationIcon1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                informationIcon1MouseClicked(evt);
            }
        });

        bilgileriGosterGizleButton.setBackground(new java.awt.Color(51, 51, 51));
        bilgileriGosterGizleButton.setForeground(new java.awt.Color(255, 255, 255));
        bilgileriGosterGizleButton.setText("Bilgileri Göster");
        bilgileriGosterGizleButton.setBorderColor(new java.awt.Color(0, 0, 0));
        bilgileriGosterGizleButton.setColor(new java.awt.Color(51, 51, 51));
        bilgileriGosterGizleButton.setColorClick(new java.awt.Color(102, 102, 102));
        bilgileriGosterGizleButton.setColorOver(new java.awt.Color(102, 102, 102));
        bilgileriGosterGizleButton.setRadius(30);
        bilgileriGosterGizleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bilgileriGosterGizleButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelKisiselBilgilerLayout = new javax.swing.GroupLayout(panelKisiselBilgiler);
        panelKisiselBilgiler.setLayout(panelKisiselBilgilerLayout);
        panelKisiselBilgilerLayout.setHorizontalGroup(
            panelKisiselBilgilerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelKisiselBilgilerLayout.createSequentialGroup()
                .addGroup(panelKisiselBilgilerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelKisiselBilgilerLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(informationIcon1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelKisiselBilgilerLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(panelKisiselBilgilerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelKisiselBilgilerLayout.createSequentialGroup()
                                .addGroup(panelKisiselBilgilerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(adSoyadText, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(okulNoText, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tcText))
                                .addGap(53, 53, 53)
                                .addGroup(panelKisiselBilgilerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(tc, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(okulNo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(adSoyad, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panelKisiselBilgilerLayout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(kisiselBilgilerText))
                            .addGroup(panelKisiselBilgilerLayout.createSequentialGroup()
                                .addGroup(panelKisiselBilgilerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(yasText, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cinsiyetText, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(69, 69, 69)
                                .addGroup(panelKisiselBilgilerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cinsiyet, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(yas, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panelKisiselBilgilerLayout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(bilgileriGosterGizleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(30, 30, 30)))
                .addContainerGap())
        );
        panelKisiselBilgilerLayout.setVerticalGroup(
            panelKisiselBilgilerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelKisiselBilgilerLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(kisiselBilgilerText)
                .addGap(18, 18, 18)
                .addGroup(panelKisiselBilgilerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adSoyadText)
                    .addComponent(adSoyad))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelKisiselBilgilerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(okulNoText)
                    .addComponent(okulNo))
                .addGap(12, 12, 12)
                .addGroup(panelKisiselBilgilerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tcText)
                    .addComponent(tc))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelKisiselBilgilerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yasText)
                    .addComponent(yas))
                .addGap(12, 12, 12)
                .addGroup(panelKisiselBilgilerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cinsiyetText)
                    .addComponent(cinsiyet))
                .addGap(34, 34, 34)
                .addComponent(bilgileriGosterGizleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 206, Short.MAX_VALUE)
                .addComponent(informationIcon1)
                .addContainerGap())
        );

        javax.swing.GroupLayout panelGenelDurumLayout = new javax.swing.GroupLayout(panelGenelDurum);
        panelGenelDurum.setLayout(panelGenelDurumLayout);
        panelGenelDurumLayout.setHorizontalGroup(
            panelGenelDurumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGenelDurumLayout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addGroup(panelGenelDurumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(girmedigiDerslerText)
                    .addComponent(girdigiDerslerText, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(devamsizlikOraniText, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(panelGenelDurumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(girmedigiDerslerSayisi, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                    .addComponent(girdigiDerslerSayisi, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(devamsizlikOrani, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addComponent(panelKisiselBilgiler, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        panelGenelDurumLayout.setVerticalGroup(
            panelGenelDurumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelKisiselBilgiler, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelGenelDurumLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(panelGenelDurumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(girdigiDerslerText)
                    .addComponent(girdigiDerslerSayisi, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(panelGenelDurumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(girmedigiDerslerText)
                    .addComponent(girmedigiDerslerSayisi))
                .addGap(12, 12, 12)
                .addGroup(panelGenelDurumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(devamsizlikOraniText)
                    .addComponent(devamsizlikOrani))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Genel Durum", panelGenelDurum);

        panelDevamsızlıkları.setBackground(new java.awt.Color(51, 51, 51));
        panelDevamsızlıkları.setComponentPopupMenu(popupMenu);

        jScrollPane2.setViewportView(liste);

        dersSecCB.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                dersSecCBİtemStateChanged(evt);
            }
        });

        gelmedigiGunlerText.setForeground(new java.awt.Color(255, 255, 255));
        gelmedigiGunlerText.setText("Seçili derste gelmediği günler:");

        informationIcon3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yoklamatakipsistemi/information-button.png"))); // NOI18N
        informationIcon3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                informationIcon3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelDevamsızlıklarıLayout = new javax.swing.GroupLayout(panelDevamsızlıkları);
        panelDevamsızlıkları.setLayout(panelDevamsızlıklarıLayout);
        panelDevamsızlıklarıLayout.setHorizontalGroup(
            panelDevamsızlıklarıLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDevamsızlıklarıLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(panelDevamsızlıklarıLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(gelmedigiGunlerText, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dersSecCB, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(546, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDevamsızlıklarıLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(informationIcon3)
                .addContainerGap())
        );
        panelDevamsızlıklarıLayout.setVerticalGroup(
            panelDevamsızlıklarıLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDevamsızlıklarıLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(gelmedigiGunlerText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(dersSecCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addComponent(informationIcon3)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Devamsızlıkları", panelDevamsızlıkları);

        panelYoklamaListesi.setBackground(new java.awt.Color(51, 51, 51));
        panelYoklamaListesi.setComponentPopupMenu(popupMenu);

        tablo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ders Adı", "Tarih", "Başlangıç Saati", "Bitiş Saati", "Öğretmen Adı", "Derse Girdi Mi"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tablo);
        if (tablo.getColumnModel().getColumnCount() > 0) {
            tablo.getColumnModel().getColumn(0).setResizable(false);
            tablo.getColumnModel().getColumn(1).setResizable(false);
            tablo.getColumnModel().getColumn(2).setResizable(false);
            tablo.getColumnModel().getColumn(3).setResizable(false);
            tablo.getColumnModel().getColumn(4).setResizable(false);
            tablo.getColumnModel().getColumn(5).setResizable(false);
        }

        informationIcon2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yoklamatakipsistemi/information-button.png"))); // NOI18N
        informationIcon2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                informationIcon2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelYoklamaListesiLayout = new javax.swing.GroupLayout(panelYoklamaListesi);
        panelYoklamaListesi.setLayout(panelYoklamaListesiLayout);
        panelYoklamaListesiLayout.setHorizontalGroup(
            panelYoklamaListesiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelYoklamaListesiLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(panelYoklamaListesiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelYoklamaListesiLayout.createSequentialGroup()
                        .addComponent(informationIcon2)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelYoklamaListesiLayout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 757, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(63, Short.MAX_VALUE))))
        );
        panelYoklamaListesiLayout.setVerticalGroup(
            panelYoklamaListesiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelYoklamaListesiLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 344, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addComponent(informationIcon2)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Yoklama Listesi", panelYoklamaListesi);

        getContentPane().add(jTabbedPane1);

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

        temaButtonGroup.add(karanlikTema);
        karanlikTema.setSelected(true);
        karanlikTema.setText("Karanlık Tema");
        karanlikTema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                karanlikTemaActionPerformed(evt);
            }
        });
        temaMenu.add(karanlikTema);

        temaButtonGroup.add(aydinlikTema);
        aydinlikTema.setText("Aydınlık Tema");
        aydinlikTema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aydinlikTemaActionPerformed(evt);
            }
        });
        temaMenu.add(aydinlikTema);

        temaButtonGroup.add(renkliTema);
        renkliTema.setText("Renkli Tema");
        renkliTema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                renkliTemaActionPerformed(evt);
            }
        });
        temaMenu.add(renkliTema);

        menuBar.add(temaMenu);

        hesapMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yoklamatakipsistemi/user menu.png"))); // NOI18N
        hesapMenu.setText("Hesap");

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
        hesapMenu.add(jSeparator2);

        hesapSil.setText("Hesap Sil");
        hesapSil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hesapSilActionPerformed(evt);
            }
        });
        hesapMenu.add(hesapSil);

        menuBar.add(hesapMenu);

        menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yoklamatakipsistemi/menu.png"))); // NOI18N
        menu.setText("Menu");

        bilgileriGosterCheckMenu.setSelected(true);
        bilgileriGosterCheckMenu.setText("Bilgileri Göster");
        bilgileriGosterCheckMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bilgileriGosterCheckMenuActionPerformed(evt);
            }
        });
        menu.add(bilgileriGosterCheckMenu);

        menuBar.add(menu);

        setJMenuBar(menuBar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void karanlikTemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_karanlikTemaActionPerformed
        karanlikTemaYap();
    }//GEN-LAST:event_karanlikTemaActionPerformed

    private void aydinlikTemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aydinlikTemaActionPerformed
        aydinlikTemaYap();
    }//GEN-LAST:event_aydinlikTemaActionPerformed

    private void renkliTemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_renkliTemaActionPerformed
        renkliTemaYap();
    }//GEN-LAST:event_renkliTemaActionPerformed

    private void informationIcon1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_informationIcon1MouseClicked
        JOptionPane.showMessageDialog(rootPane, "Bu sayfada yoklama kaydınızın kısa bir özetini bulabilirsiniz.", "Bilgilendirme", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_informationIcon1MouseClicked

    private void informationIcon2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_informationIcon2MouseClicked
        JOptionPane.showMessageDialog(rootPane, "Bu sayfada yoklama kaydınızı detaylı olarak inceleyebilirsiniz.", "Bilgilendirme", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_informationIcon2MouseClicked

    private void informationIcon3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_informationIcon3MouseClicked
        JOptionPane.showMessageDialog(rootPane, "Bu sayfada seçili derse hangi tarihlerde girmediğinizi görüntüleyebilirsiniz.", "Bilgilendirme", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_informationIcon3MouseClicked

    private void dersSecCBİtemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_dersSecCBİtemStateChanged
        seciliDersinDevamsizliklariniYazdir();
    }//GEN-LAST:event_dersSecCBİtemStateChanged

    private void bilgileriGosterGizleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bilgileriGosterGizleButtonActionPerformed
        if (yazilarGizli) {
            kisiselBilgiYazdir();
            bilgileriGosterGizleButton.setText("Bilgileri Sakla");
            yazilarGizli = false;
            bilgileriGosterCheckMenu.setSelected(true);
        } else if (yazilarGizli == false) {
            kisiselBilgiyiGizliYazdir();
            bilgileriGosterGizleButton.setText("Bilgileri Göster");
            yazilarGizli = true;
            bilgileriGosterCheckMenu.setSelected(false);
        }
    }//GEN-LAST:event_bilgileriGosterGizleButtonActionPerformed

    private void bilgileriGosterCheckMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bilgileriGosterCheckMenuActionPerformed
        if (bilgileriGosterCheckMenu.isSelected()) {
            kisiselBilgiYazdir();
            bilgileriGosterGizleButton.setText("Bilgileri Sakla");
            yazilarGizli = false;
        } else {
            kisiselBilgiyiGizliYazdir();
            bilgileriGosterGizleButton.setText("Bilgileri Göster");
            yazilarGizli = true;
        }
    }//GEN-LAST:event_bilgileriGosterCheckMenuActionPerformed

    private void hesapSilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hesapSilActionPerformed
        baglanti.ogrenciSil(tcNo);
        GirisYap girisYap = new GirisYap();
        girisYap.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_hesapSilActionPerformed

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

    private void aydinlikTemaPopupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aydinlikTemaPopupActionPerformed
        aydinlikTemaYap();
        renkliTema.setSelected(false);
        aydinlikTema.setSelected(true);
        karanlikTema.setSelected(false);
    }//GEN-LAST:event_aydinlikTemaPopupActionPerformed

    private void karanlikTemaPopupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_karanlikTemaPopupActionPerformed
        karanlikTemaYap();
        renkliTema.setSelected(false);
        karanlikTema.setSelected(true);
        aydinlikTema.setSelected(false);
    }//GEN-LAST:event_karanlikTemaPopupActionPerformed

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
        baglanti.ogrenciSil(tcNo);
        GirisYap girisYap = new GirisYap();
        girisYap.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_hesabiSilPopupActionPerformed

    private void renkliTemaPopupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_renkliTemaPopupActionPerformed
        renkliTemaYap();
        renkliTema.setSelected(true);
        karanlikTema.setSelected(false);
        aydinlikTema.setSelected(false);
    }//GEN-LAST:event_renkliTemaPopupActionPerformed

    private void karanlikTemaYap() {
        Color anaPanelRengi = new Color(51, 51, 51);
        Color yaziRengi = Color.WHITE;
        panelRengiDegis(anaPanelRengi, yaziRengi);
        Color kBilgiPanelRengi = new Color(0, 102, 102);
        Color kBilgiYaziRengi = Color.BLACK;
        kisiselBilgilerPaneliRenkleriDegis(kBilgiPanelRengi, kBilgiYaziRengi);
    }

    private void aydinlikTemaYap() {
        Color anaPanelRengi = new Color(238, 237, 237);
        Color yaziRengi = Color.BLACK;
        panelRengiDegis(anaPanelRengi, yaziRengi);
        Color kBilgiPanelRengi = new Color(0, 102, 102);
        Color kBilgiYaziRengi = Color.BLACK;
        kisiselBilgilerPaneliRenkleriDegis(kBilgiPanelRengi, kBilgiYaziRengi);
    }

    private void renkliTemaYap() {
        JColorChooser colorChooser = new JColorChooser();
        Color anaPanelRengi = JColorChooser.showDialog(null, "Bir renk seçin", Color.BLACK);
        Color yaziRengi = Color.BLACK;
        panelRengiDegis(anaPanelRengi, yaziRengi);
        Color kBilgiPanelRengi = new Color(51, 51, 51);
        Color kBilgiYaziRengi = Color.WHITE;
        kisiselBilgilerPaneliRenkleriDegis(kBilgiPanelRengi, kBilgiYaziRengi);
    }

    private void panelRengiDegis(Color anaPanelRengi, Color yaziRengi) {
        panelGenelDurum.setBackground(anaPanelRengi);
        panelYoklamaListesi.setBackground(anaPanelRengi);
        panelDevamsızlıkları.setBackground(anaPanelRengi);
        girdigiDerslerText.setForeground(yaziRengi);
        girdigiDerslerSayisi.setForeground(yaziRengi);
        girmedigiDerslerText.setForeground(yaziRengi);
        girmedigiDerslerSayisi.setForeground(yaziRengi);
        devamsizlikOraniText.setForeground(yaziRengi);
        devamsizlikOrani.setForeground(yaziRengi);
        gelmedigiGunlerText.setForeground(yaziRengi);
    }

    private void kisiselBilgilerPaneliRenkleriDegis(Color panelRengi, Color yaziRengi) {
        panelKisiselBilgiler.setBackground(panelRengi);
        kisiselBilgilerText.setForeground(yaziRengi);
        adSoyad.setForeground(yaziRengi);
        adSoyadText.setForeground(yaziRengi);
        okulNo.setForeground(yaziRengi);
        okulNoText.setForeground(yaziRengi);
        tc.setForeground(yaziRengi);
        tcText.setForeground(yaziRengi);
        yas.setForeground(yaziRengi);
        yasText.setForeground(yaziRengi);
        cinsiyet.setForeground(yaziRengi);
        cinsiyetText.setForeground(yaziRengi);
    }

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Hesap;
    private javax.swing.JLabel adSoyad;
    private javax.swing.JLabel adSoyadText;
    private javax.swing.JRadioButtonMenuItem aydinlikTema;
    private javax.swing.JRadioButtonMenuItem aydinlikTemaPopup;
    private javax.swing.JCheckBoxMenuItem bilgileriGosterCheckMenu;
    private yoklamatakipsistemi.MyButton bilgileriGosterGizleButton;
    private javax.swing.JLabel cinsiyet;
    private javax.swing.JLabel cinsiyetText;
    private javax.swing.JComboBox<String> dersSecCB;
    private javax.swing.JLabel devamsizlikOrani;
    private javax.swing.JLabel devamsizlikOraniText;
    private javax.swing.JLabel gelmedigiGunlerText;
    private javax.swing.JMenu geriMenu;
    private javax.swing.JLabel girdigiDerslerSayisi;
    private javax.swing.JLabel girdigiDerslerText;
    private javax.swing.JLabel girmedigiDerslerSayisi;
    private javax.swing.JLabel girmedigiDerslerText;
    private javax.swing.JMenuItem hesabiSilPopup;
    private javax.swing.JMenu hesapMenu;
    private javax.swing.JMenuItem hesapSil;
    private javax.swing.JMenuItem hesaptanCıkMenu;
    private javax.swing.JMenuItem hesaptanCıkPopup;
    private javax.swing.JLabel informationIcon1;
    private javax.swing.JLabel informationIcon2;
    private javax.swing.JLabel informationIcon3;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JRadioButtonMenuItem karanlikTema;
    private javax.swing.JRadioButtonMenuItem karanlikTemaPopup;
    private javax.swing.JLabel kisiselBilgilerText;
    private javax.swing.JList<String> liste;
    private javax.swing.JMenu menu;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JLabel okulNo;
    private javax.swing.JLabel okulNoText;
    private javax.swing.JPanel panelDevamsızlıkları;
    private javax.swing.JPanel panelGenelDurum;
    private javax.swing.JPanel panelKisiselBilgiler;
    private javax.swing.JPanel panelYoklamaListesi;
    private javax.swing.JPopupMenu popupMenu;
    private javax.swing.ButtonGroup popupTemaButtonGroup;
    private javax.swing.JRadioButtonMenuItem renkliTema;
    private javax.swing.JRadioButtonMenuItem renkliTemaPopup;
    private javax.swing.JMenuItem sifreDegistir;
    private javax.swing.JMenuItem sifreDegistirPopup;
    private javax.swing.JTable tablo;
    private javax.swing.JLabel tc;
    private javax.swing.JLabel tcText;
    private javax.swing.JMenu tema;
    private javax.swing.ButtonGroup temaButtonGroup;
    private javax.swing.JMenu temaMenu;
    private javax.swing.JLabel yas;
    private javax.swing.JLabel yasText;
    // End of variables declaration//GEN-END:variables
}
