package yoklamatakipsistemi;

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
public class GirisYap extends javax.swing.JFrame {

    public GirisYap() {
        initComponents();
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        //UYARILARI GÖRÜNMEZ YAP:
        uyariOgretmenOgrenci.setText(" ");
        uyariTC.setText(" ");
        uyariSifre.setText(" ");
        uyariSifre2.setText(" ");
        uyariHesapYok.setText(" ");
        uyariHesapYok2.setText(" ");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        kayitOlText = new javax.swing.JLabel();
        ogrenciRdB = new javax.swing.JRadioButton();
        ogretmenRdB = new javax.swing.JRadioButton();
        uyariOgretmenOgrenci = new javax.swing.JLabel();
        kayitAdText = new javax.swing.JLabel();
        kayitTC = new javax.swing.JTextField();
        uyariTC = new javax.swing.JLabel();
        kayitSifreText = new javax.swing.JLabel();
        kayitSifre = new javax.swing.JPasswordField();
        uyariSifre = new javax.swing.JLabel();
        kayitSifreTekrarText = new javax.swing.JLabel();
        kayitSifre2 = new javax.swing.JPasswordField();
        uyariSifre2 = new javax.swing.JLabel();
        kaydolButton = new javax.swing.JButton();
        hesabinizYokMuText = new javax.swing.JLabel();
        appName = new javax.swing.JLabel();
        girisSifreText = new javax.swing.JLabel();
        girisTC = new javax.swing.JTextField();
        tcText = new javax.swing.JLabel();
        girisButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        kayitOlText1 = new javax.swing.JLabel();
        uyariHesapYok = new javax.swing.JLabel();
        uyariHesapYok2 = new javax.swing.JLabel();
        girisSifre = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(861, 555));
        setPreferredSize(new java.awt.Dimension(861, 555));
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setPreferredSize(new java.awt.Dimension(226, 555));

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setPreferredSize(new java.awt.Dimension(192, 228));

        kayitOlText.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        kayitOlText.setForeground(new java.awt.Color(255, 255, 255));
        kayitOlText.setText("KAYIT OL");

        buttonGroup1.add(ogrenciRdB);
        ogrenciRdB.setForeground(new java.awt.Color(255, 255, 255));
        ogrenciRdB.setText("Öğrenci");

        buttonGroup1.add(ogretmenRdB);
        ogretmenRdB.setForeground(new java.awt.Color(255, 255, 255));
        ogretmenRdB.setText("Öğretmen");

        uyariOgretmenOgrenci.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        uyariOgretmenOgrenci.setForeground(new java.awt.Color(204, 51, 0));
        uyariOgretmenOgrenci.setText("Birini seçmek zorunludur!");

        kayitAdText.setForeground(new java.awt.Color(255, 255, 255));
        kayitAdText.setText("TC:");

        uyariTC.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        uyariTC.setForeground(new java.awt.Color(204, 51, 0));
        uyariTC.setText("Burası boş bırakılamaz!");

        kayitSifreText.setForeground(new java.awt.Color(255, 255, 255));
        kayitSifreText.setText("Şifre:");

        uyariSifre.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        uyariSifre.setForeground(new java.awt.Color(204, 51, 0));
        uyariSifre.setText("Burası boş bırakılamaz!");

        kayitSifreTekrarText.setForeground(new java.awt.Color(255, 255, 255));
        kayitSifreTekrarText.setText("Şifre tekrar:");

        uyariSifre2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        uyariSifre2.setForeground(new java.awt.Color(204, 51, 0));
        uyariSifre2.setText("Şifreler aynı değil!");

        kaydolButton.setText("Kaydol");
        kaydolButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kaydolButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(kayitSifreText, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kayitTC)
                    .addComponent(kayitAdText, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kayitSifreTekrarText)
                    .addComponent(uyariSifre2)
                    .addComponent(uyariTC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(kayitSifre)
                    .addComponent(kayitSifre2)
                    .addComponent(uyariSifre, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(ogretmenRdB, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ogrenciRdB, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(kayitOlText, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(uyariOgretmenOgrenci, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                .addGap(22, 22, 22))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(kaydolButton)
                .addGap(60, 60, 60))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(kayitOlText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ogrenciRdB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ogretmenRdB)
                .addGap(6, 6, 6)
                .addComponent(uyariOgretmenOgrenci)
                .addGap(10, 10, 10)
                .addComponent(kayitAdText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(kayitTC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(uyariTC)
                .addGap(10, 10, 10)
                .addComponent(kayitSifreText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(kayitSifre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(uyariSifre)
                .addGap(10, 10, 10)
                .addComponent(kayitSifreTekrarText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(kayitSifre2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(uyariSifre2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(kaydolButton)
                .addGap(30, 30, 30))
        );

        hesabinizYokMuText.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        hesabinizYokMuText.setText("Hesabınız yok mu?");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(hesabinizYokMuText)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(hesabinizYokMuText)
                .addGap(12, 12, 12)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        appName.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        appName.setForeground(new java.awt.Color(255, 255, 255));
        appName.setText("YOKLAMA TAKIP SISTEMI");

        girisSifreText.setForeground(new java.awt.Color(255, 255, 255));
        girisSifreText.setText("Şifre:");

        girisTC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                girisTCMouseClicked(evt);
            }
        });

        tcText.setForeground(new java.awt.Color(255, 255, 255));
        tcText.setText("TC Kimlik No:");

        girisButton.setText("Giriş Yap");
        girisButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                girisButtonActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yoklamatakipsistemi/user.png"))); // NOI18N

        kayitOlText1.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        kayitOlText1.setForeground(new java.awt.Color(255, 255, 255));
        kayitOlText1.setText("GİRİŞ YAP");

        uyariHesapYok.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        uyariHesapYok.setForeground(new java.awt.Color(204, 51, 0));
        uyariHesapYok.setText("Hesap Bulunamadı!");

        uyariHesapYok2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        uyariHesapYok2.setForeground(new java.awt.Color(204, 51, 0));
        uyariHesapYok2.setText("Hesabınız yoksa hesap oluşturun!");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(kayitOlText1)
                                    .addComponent(tcText, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(girisSifreText, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(girisButton)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(girisSifre, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(girisTC, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(74, 74, 74)
                                .addComponent(uyariHesapYok, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(appName)
                        .addGap(74, 74, 74)
                        .addComponent(uyariHesapYok2, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(kayitOlText1)
                        .addGap(18, 18, 18)
                        .addComponent(tcText)
                        .addGap(6, 6, 6)
                        .addComponent(girisTC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(girisSifreText)
                        .addGap(6, 6, 6)
                        .addComponent(girisSifre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(girisButton)
                        .addGap(11, 11, 11)
                        .addComponent(uyariHesapYok)))
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(appName)
                    .addComponent(uyariHesapYok2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    Baglanti baglanti = new Baglanti();
    Regex regex = new Regex();

    private void girisButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_girisButtonActionPerformed
        if (girisTC.getText().isEmpty() && girisSifre.getText().isEmpty()) {
            uyariHesapYok.setText("Lütfen tüm bilgilerinizi giriniz!");
            uyariHesapYok2.setText("");
        } else if (girisTC.getText().isEmpty()) {
            uyariHesapYok.setText("Lütfen tc numaranizi giriniz!");
            uyariHesapYok2.setText("");
        } else if (regex.tcKontrol(girisTC.getText()) == false) {
            uyariHesapYok.setText("Geçerli bir tc giriniz!");
            uyariHesapYok2.setText("");
        } else if (girisSifre.getText().isEmpty()) {
            uyariHesapYok.setText("Lütfen sifrenizi giriniz!");
            uyariHesapYok2.setText("");
        } else {
            //hesap var mı ve kimin bul
            boolean hesapOgrencinin = false;
            boolean hesapOgretmenin = false;
            if (baglanti.boyleBirOgrenciVarMi(girisTC.getText()) == true) {
                hesapOgrencinin = true;
            }
            if (baglanti.boyleBirOgretmenVarMi(girisTC.getText()) == true) {
                hesapOgretmenin = true;
            }

            boolean hesapVar = false;
            if (hesapOgrencinin == true || hesapOgretmenin == true) {
                hesapVar = true;
            } else {
                hesapVar = false;
            }
            if (hesapVar) {
                boolean sifreDogru = false;
                if (baglanti.sifreDogruMu(girisTC.getText(), girisSifre.getText()) == true) {
                    sifreDogru = true;
                }
                if (sifreDogru) {
                    uyariHesapYok.setText(" ");
                    uyariHesapYok2.setText(" ");
                    String tc = girisTC.getText();
                    if (hesapOgrencinin) {
                        OgrenciIlkFrame OgrenciIlkFrame = new OgrenciIlkFrame(tc);
                        OgrenciIlkFrame.setVisible(true);
                        this.dispose();
                    }
                    if (hesapOgretmenin) {
                        OgretmenIlkFrame ogretmenIlkFrame = new OgretmenIlkFrame(tc);
                        ogretmenIlkFrame.setVisible(true);
                        this.dispose();
                    }
                } else {
                    uyariHesapYok.setText("Şifrenizi yanlış girdiniz.");
                    uyariHesapYok2.setText("");
                }
            } else {
                uyariHesapYok.setText("Hesap Bulunamadı!");
                uyariHesapYok2.setText("Hesabınız yoksa hesap oluşturun!");
            }
        }
    }//GEN-LAST:event_girisButtonActionPerformed

    private void kaydolButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kaydolButtonActionPerformed
        uyariOgretmenOgrenci.setText("   ");
        uyariTC.setText("   ");
        uyariSifre.setText("   ");
        uyariSifre2.setText("   ");
        //hepsi dolu mu?
        boolean hepsiDolu = false;
        if (ogrenciRdB.isSelected() || ogretmenRdB.isSelected()) {
            if (kayitTC.getText().isEmpty() == false) {
                uyariTC.setText("   ");
                if (regex.tcKontrol(kayitTC.getText())) {
                    if (kayitSifre.getText().isEmpty() == false) {
                        if (kayitSifre2.getText().isEmpty() == false) {
                            uyariSifre.setText("   ");
                            hepsiDolu = true;
                        } else {
                            uyariSifre2.setText("Burası boş bırakılamaz!");
                        }
                    } else {
                        uyariSifre.setText("Burası boş bırakılamaz!");
                    }
                } else {
                    uyariTC.setText("Geçerli bir TC giriniz!");
                }
            } else {
                uyariTC.setText("Burası boş bırakılamaz!");
            }
        } else {
            uyariOgretmenOgrenci.setText("Birini seçmek zorunludur!");
        }

        //şifre aynı mı?
        boolean sifreAyni = false;
        if (kayitSifre.getText().isEmpty() == false && kayitSifre2.getText().isEmpty() == false) {
            if (kayitSifre.getText().equals(kayitSifre2.getText())) {
                sifreAyni = true;
                uyariSifre2.setText("   ");
            } else {
                uyariSifre2.setText("Şifreler aynı değil!");
            }
        }

        //hesap var mı ve kimin bul
        boolean hesapOgrencinin = false;
        boolean hesapOgretmenin = false;
        if (baglanti.boyleBirOgrenciVarMi(kayitTC.getText()) == true) {
            hesapOgrencinin = true;
        }
        if (baglanti.boyleBirOgretmenVarMi(kayitTC.getText()) == true) {
            hesapOgretmenin = true;
        }

        boolean hesapVar;
        if (hesapOgrencinin == true || hesapOgretmenin == true) {
            hesapVar = true;
        } else {
            hesapVar = false;
        }

        //hepsiUygunMu
        boolean hepsiUygun = false;
        if (hesapVar == false && sifreAyni == true) {
            hepsiUygun = true;
        }
        if (hepsiDolu == true && hepsiUygun == true) {
            if (ogrenciRdB.isSelected()) {
                KayitOlOgrenci ogrenciKayit = new KayitOlOgrenci(kayitTC.getText(), kayitSifre.getText());
                ogrenciKayit.setVisible(true);
                this.dispose();
            } else if (ogretmenRdB.isSelected()) {
                KayitOlOgretmen ogretmenKayit = new KayitOlOgretmen(kayitTC.getText(), kayitSifre.getText());
                ogretmenKayit.setVisible(true);
                this.dispose();
            }
        } else if (hesapVar == true) {
            JOptionPane.showMessageDialog(rootPane, "Zaten bir hesabınız var. Giriş yapabilirsiniz", "Message", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_kaydolButtonActionPerformed

    private void girisTCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_girisTCMouseClicked
        uyariHesapYok.setText(" ");
        uyariHesapYok2.setText(" ");
    }//GEN-LAST:event_girisTCMouseClicked
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(GirisYap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GirisYap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GirisYap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GirisYap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GirisYap().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel appName;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton girisButton;
    private javax.swing.JPasswordField girisSifre;
    private javax.swing.JLabel girisSifreText;
    private javax.swing.JTextField girisTC;
    private javax.swing.JLabel hesabinizYokMuText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton kaydolButton;
    private javax.swing.JLabel kayitAdText;
    private javax.swing.JLabel kayitOlText;
    private javax.swing.JLabel kayitOlText1;
    private javax.swing.JPasswordField kayitSifre;
    private javax.swing.JPasswordField kayitSifre2;
    private javax.swing.JLabel kayitSifreTekrarText;
    private javax.swing.JLabel kayitSifreText;
    private javax.swing.JTextField kayitTC;
    private javax.swing.JRadioButton ogrenciRdB;
    private javax.swing.JRadioButton ogretmenRdB;
    private javax.swing.JLabel tcText;
    private javax.swing.JLabel uyariHesapYok;
    private javax.swing.JLabel uyariHesapYok2;
    private javax.swing.JLabel uyariOgretmenOgrenci;
    private javax.swing.JLabel uyariSifre;
    private javax.swing.JLabel uyariSifre2;
    private javax.swing.JLabel uyariTC;
    // End of variables declaration//GEN-END:variables
}
