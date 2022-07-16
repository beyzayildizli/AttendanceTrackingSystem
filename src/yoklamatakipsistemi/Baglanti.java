package yoklamatakipsistemi;

import java.util.ArrayList;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

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
public class Baglanti {

    private String kullanici_adi = "root";
    private String parola = "";

    private String db_ismi = "myproject";

    private String host = "localhost";

    private int port = 3306;

    private Connection con = null;

    private Statement statement = null;
    private PreparedStatement preparedStatement = null;

    public Baglanti() {
        String url = "jdbc:mysql://" + host + ":" + port + "/" + db_ismi + "?useUnicode=true&characterEncoding=utf8";

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver bulunamadı....");
        }

        try {
            con = DriverManager.getConnection(url, kullanici_adi, parola);
            System.out.println("Bağlantı başarılı");
        } catch (SQLException ex) {
            System.out.println("Bağlantı başarısız.");
        }
    }

    public void ogrenciEkle(String tc, String sifre, String adSoyad, int yas, String cinsiyet,
            int matematik, int fizik, int kimya, int biyoloji,
            int edebiyat, int felsefe, int cografya, int tarih,
            int ingilizce, int fransizca, int arapca, int almanca,
            int din, int resim, int muzik, int beden) {
        try {
            statement = (Statement) con.createStatement();

            String sorgu = "Insert Into ogrenci (tc, sifre, adSoyad, yas, cinsiyet,"
                    + "matematik, fizik, kimya, biyoloji,"
                    + "edebiyat, felsefe, cografya, tarih, "
                    + "ingilizce, fransizca, arapca, almanca,"
                    + "din, resim, muzik, beden)"
                    + "VALUES('" + tc + "','" + sifre + "','" + adSoyad + "','"
                    + yas + "','" + cinsiyet + "','"
                    + matematik + "','" + fizik + "','" + kimya + "','" + biyoloji + "','"
                    + edebiyat + "','" + felsefe + "','" + cografya + "','" + tarih + "','"
                    + ingilizce + "','" + fransizca + "','" + arapca + "','" + almanca + "','"
                    + din + "','" + resim + "','" + muzik + "','" + beden + "')";
            statement.executeUpdate(sorgu);
        } catch (SQLException ex) {
            System.out.println("Öğrenci ekleme başarısız.");
            Logger.getLogger(Baglanti.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void ogretmenEkle(String tc, String sifre, String adSoyad, String telefon, int yas, String cinsiyet,
            int matematik, int fizik, int kimya, int biyoloji,
            int edebiyat, int felsefe, int cografya, int tarih,
            int ingilizce, int fransizca, int arapca, int almanca,
            int din, int resim, int muzik, int beden) {
        try {
            statement = (Statement) con.createStatement();

            String sorgu = "Insert Into ogretmen (tc, sifre, adSoyad, telefon, yas, cinsiyet,"
                    + "matematik, fizik, kimya, biyoloji,"
                    + "edebiyat, felsefe, cografya, tarih, "
                    + "ingilizce, fransizca, arapca, almanca,"
                    + "din, resim, muzik, beden)"
                    + "VALUES('" + tc + "','" + sifre + "','" + adSoyad + "','"
                    + telefon + "','" + yas + "','" + cinsiyet + "','"
                    + matematik + "','" + fizik + "','" + kimya + "','" + biyoloji + "','"
                    + edebiyat + "','" + felsefe + "','" + cografya + "','" + tarih + "','"
                    + ingilizce + "','" + fransizca + "','" + arapca + "','" + almanca + "','"
                    + din + "','" + resim + "','" + muzik + "','" + beden + "')";
            statement.executeUpdate(sorgu);
        } catch (SQLException ex) {
            System.out.println("Öğretmen ekleme başarısız.");
            Logger.getLogger(Baglanti.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void yoklamaKaydet(int ogrenciNo, String dersAdi, String tarih,
            String baslangicSaati, String bitisSaati, String ogretmenTc, int derseGirdi) {
        try {
            statement = (Statement) con.createStatement();
            String sorgu = "Insert Into yoklama (ogrenciNo, dersAdi, tarih, baslangicSaati, bitisSaati,"
                    + " ogretmenTc, derseGirdi) VALUES('" + ogrenciNo + "','" + dersAdi + "','" + tarih + "','"
                    + baslangicSaati + "','" + bitisSaati + "','" + ogretmenTc + "','" + derseGirdi + "')";
            statement.executeUpdate(sorgu);
        } catch (SQLException ex) {
            System.out.println("yoklamaKaydet metodu hatalı.");
            Logger.getLogger(Baglanti.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void tümOgrencileriSil() {
        try {
            statement = (Statement) con.createStatement();
            String sorgu = "Delete from ogrenci where okulNo > 0";
            statement.executeUpdate(sorgu);
        } catch (SQLException ex) {
            Logger.getLogger(Baglanti.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void tümOgretmenleriSil() {
        try {
            statement = (Statement) con.createStatement();
            String sorgu = "Delete from ogretmen where yas > 0";
            statement.executeUpdate(sorgu);
        } catch (SQLException ex) {
            Logger.getLogger(Baglanti.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void tümYoklamayıSil() {
        try {
            statement = (Statement) con.createStatement();
            String sorgu = "Delete from yoklama where ogrenciNo > 0";
            statement.executeUpdate(sorgu);
        } catch (SQLException ex) {
            Logger.getLogger(Baglanti.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void tümSistemiSifirla() {
        tümOgrencileriSil();
        tümOgretmenleriSil();
        tümYoklamayıSil();
    }

    public void ogrenciSil(String tc) {
        try {
            statement = (Statement) con.createStatement();
            String sorgu = "Delete from ogrenci where tc like ?";
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setString(1, tc);
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Baglanti.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void ogretmenSil(String tc) {
        try {
            statement = (Statement) con.createStatement();
            String sorgu = "Delete from ogretmen where tc like ?";
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setString(1, tc);
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Baglanti.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public boolean boyleBirOgretmenVarMi(String tcKimlik) {
        boolean boyleBirOgretmenVarMi = false;
        try {
            int ogrenciSayisi = 0;
            String sorgu = "Select * From ogretmen where tc like ?";
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setString(1, tcKimlik);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                ogrenciSayisi++;
            }
            if (ogrenciSayisi == 0) {
                boyleBirOgretmenVarMi = false;
            } else {
                boyleBirOgretmenVarMi = true;
            }
        } catch (SQLException ex) {
            System.out.println("boyleBirOgrenciVarMi hatalı.");
            Logger.getLogger(Baglanti.class.getName()).log(Level.SEVERE, null, ex);
        }
        return boyleBirOgretmenVarMi;
    }

    public boolean boyleBirOgrenciVarMi(String tcKimlik) {
        boolean boyleBirOgrenciVarMi = false;
        try {
            int ogrenciSayisi = 0;
            String sorgu = "Select * From ogrenci where tc like ?";
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setString(1, tcKimlik);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                ogrenciSayisi++;
            }
            if (ogrenciSayisi == 0) {
                boyleBirOgrenciVarMi = false;
            } else {
                boyleBirOgrenciVarMi = true;
            }
        } catch (SQLException ex) {
            System.out.println("boyleBirOgrenciVarMi hatalı.");
            Logger.getLogger(Baglanti.class.getName()).log(Level.SEVERE, null, ex);
        }
        return boyleBirOgrenciVarMi;

    }

    public boolean sifreDogruMu(String tc, String sifre) {
        boolean sifreDogruMu = false;
        try {
            String sorgu;
            if (boyleBirOgrenciVarMi(tc)) {
                sorgu = "Select * From ogrenci where tc like ?";
            } else if (boyleBirOgretmenVarMi(tc)) {
                sorgu = "Select * From ogretmen where tc like ?";
            } else {
                sorgu = "";
            }
            int kontrolDegeri = 0;
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setString(1, tc);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                String sifresi = rs.getString("sifre");
                if (sifresi.compareTo(sifre) == 0) {
                    kontrolDegeri++;
                }
            }
            if (kontrolDegeri == 0) {
                sifreDogruMu = false;
            } else {
                sifreDogruMu = true;
            }

        } catch (SQLException ex) {
            System.out.println("sifreDogruMu metodu hatalı.");
            Logger.getLogger(Baglanti.class.getName()).log(Level.SEVERE, null, ex);
        }
        return sifreDogruMu;

    }

    public void sifreDegis(String tcNo, String yeniSifre) {
        try {
            String sorgu;
            if (boyleBirOgrenciVarMi(tcNo)) {
                sorgu = "Update ogrenci set sifre like ? where tc like ?";

            } else if (boyleBirOgretmenVarMi(tcNo)) {
                sorgu = "Update ogretmen set sifre = ? where tc like ?";
            } else {
                sorgu = "";
            }
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setString(1, yeniSifre);
            preparedStatement.setString(2, tcNo);
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("sifreDegis metodu hatalı.");
            Logger.getLogger(Baglanti.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void ogretmeninVerdigiDersler(String tc, ArrayList dersler) {
        try {
            String sorgu = "Select * From ogretmen where tc like ?";
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setString(1, tc);

            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                int matematik = rs.getInt("matematik");
                int fizik = rs.getInt("fizik");
                int kimya = rs.getInt("kimya");
                int biyoloji = rs.getInt("biyoloji");

                int edebiyat = rs.getInt("edebiyat");
                int cografya = rs.getInt("cografya");
                int tarih = rs.getInt("tarih");
                int felsefe = rs.getInt("felsefe");

                int ingilizce = rs.getInt("ingilizce");
                int fransizca = rs.getInt("fransizca");
                int almanca = rs.getInt("almanca");
                int arapca = rs.getInt("arapca");

                int din = rs.getInt("din");
                int resim = rs.getInt("resim");
                int muzik = rs.getInt("muzik");
                int beden = rs.getInt("beden");
                ////////////////////////////                
                if (matematik == 1) {
                    dersler.add("matematik");
                }
                if (fizik == 1) {
                    dersler.add("fizik");
                }
                if (kimya == 1) {
                    dersler.add("kimya");
                }
                if (biyoloji == 1) {
                    dersler.add("biyoloji");
                }
                ////////////////////////////
                if (edebiyat == 1) {
                    dersler.add("edebiyat");
                }
                if (cografya == 1) {
                    dersler.add("cografya");
                }
                if (tarih == 1) {
                    dersler.add("tarih");
                }
                if (felsefe == 1) {
                    dersler.add("felsefe");
                }
                ////////////////////////////                
                if (ingilizce == 1) {
                    dersler.add("ingilizce");
                }
                if (fransizca == 1) {
                    dersler.add("fransizca");
                }
                if (almanca == 1) {
                    dersler.add("almanca");
                }
                if (arapca == 1) {
                    dersler.add("arapca");
                }
                ////////////////////////////                
                if (din == 1) {
                    dersler.add("din");
                }
                if (resim == 1) {
                    dersler.add("resim");
                }
                if (muzik == 1) {
                    dersler.add("muzik");
                }
                if (beden == 1) {
                    dersler.add("beden");
                }
            }

        } catch (SQLException ex) {
            System.out.println("ogretmeninVerdigiDersler metodu başarısız.");
            Logger.getLogger(Baglanti.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void ogrencininAldigiDersler(String tc, ArrayList dersler) {
        try {
            String sorgu = "Select * From ogrenci where tc like ?";
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setString(1, tc);

            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                int matematik = rs.getInt("matematik");
                int fizik = rs.getInt("fizik");
                int kimya = rs.getInt("kimya");
                int biyoloji = rs.getInt("biyoloji");

                int edebiyat = rs.getInt("edebiyat");
                int cografya = rs.getInt("cografya");
                int tarih = rs.getInt("tarih");
                int felsefe = rs.getInt("felsefe");

                int ingilizce = rs.getInt("ingilizce");
                int fransizca = rs.getInt("fransizca");
                int almanca = rs.getInt("almanca");
                int arapca = rs.getInt("arapca");

                int din = rs.getInt("din");
                int resim = rs.getInt("resim");
                int muzik = rs.getInt("muzik");
                int beden = rs.getInt("beden");
                ////////////////////////////                
                if (matematik == 1) {
                    dersler.add("matematik");
                }
                if (fizik == 1) {
                    dersler.add("fizik");
                }
                if (kimya == 1) {
                    dersler.add("kimya");
                }
                if (biyoloji == 1) {
                    dersler.add("biyoloji");
                }
                ////////////////////////////
                if (edebiyat == 1) {
                    dersler.add("edebiyat");
                }
                if (cografya == 1) {
                    dersler.add("cografya");
                }
                if (tarih == 1) {
                    dersler.add("tarih");
                }
                if (felsefe == 1) {
                    dersler.add("felsefe");
                }
                ////////////////////////////                
                if (ingilizce == 1) {
                    dersler.add("ingilizce");
                }
                if (fransizca == 1) {
                    dersler.add("fransizca");
                }
                if (almanca == 1) {
                    dersler.add("almanca");
                }
                if (arapca == 1) {
                    dersler.add("arapca");
                }
                ////////////////////////////                
                if (din == 1) {
                    dersler.add("din");
                }
                if (resim == 1) {
                    dersler.add("resim");
                }
                if (muzik == 1) {
                    dersler.add("muzik");
                }
                if (beden == 1) {
                    dersler.add("beden");
                }
            }

        } catch (SQLException ex) {
            System.out.println("ogretmeninVerdigiDersler metodu başarısız.");
            Logger.getLogger(Baglanti.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void seciliDersiAlanOgrenciler(String ders, ArrayList ogrenciler) {
        try {
            String sorgu;
            if (ders.compareTo("matematik") == 0) {
                sorgu = "Select * From ogrenci where matematik = 1";
            } else if (ders.compareTo("fizik") == 0) {
                sorgu = "Select * From ogrenci where fizik = 1";
            } else if (ders.compareTo("kimya") == 0) {
                sorgu = "Select * From ogrenci where kimya = 1";
            } else if (ders.compareTo("biyoloji") == 0) {
                sorgu = "Select * From ogrenci where biyoloji = 1";
            } else if (ders.compareTo("edebiyat") == 0) {
                sorgu = "Select * From ogrenci where edebiyat = 1";
            } else if (ders.compareTo("cografya") == 0) {
                sorgu = "Select * From ogrenci where cografya = 1";
            } else if (ders.compareTo("tarih") == 0) {
                sorgu = "Select * From ogrenci where tarih = 1";
            } else if (ders.compareTo("felsefe") == 0) {
                sorgu = "Select * From ogrenci where felsefe = 1";
            } else if (ders.compareTo("ingilizce") == 0) {
                sorgu = "Select * From ogrenci where ingilizce = 1";
            } else if (ders.compareTo("fransizca") == 0) {
                sorgu = "Select * From ogrenci where fransizca = 1";
            } else if (ders.compareTo("almanca") == 0) {
                sorgu = "Select * From ogrenci where almanca = 1";
            } else if (ders.compareTo("arapca") == 0) {
                sorgu = "Select * From ogrenci where arapca = 1";
            } else if (ders.compareTo("din") == 0) {
                sorgu = "Select * From ogrenci where din = 1";
            } else if (ders.compareTo("resim") == 0) {
                sorgu = "Select * From ogrenci where felsefe = 1";
            } else if (ders.compareTo("muzik") == 0) {
                sorgu = "Select * From ogrenci where muzik = 1";
            } else if (ders.compareTo("beden") == 0) {
                sorgu = "Select * From ogrenci where beden = 1";
            } else {
                sorgu = "";
            }
            statement = (Statement) con.createStatement();
            ResultSet rs = statement.executeQuery(sorgu);
            while (rs.next()) {
                int okulNo = rs.getInt("okulNo");
                ogrenciler.add(okulNo);
            }
        } catch (SQLException ex) {
            System.out.println("seciliDersiAlanOgrenciler metodu başarısız.");
            Logger.getLogger(Baglanti.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public boolean ogrenciSeciliDersiAliyorMu(String ders, int ogrenciNo) {
        boolean ogrenciSeciliDersiAliyorMu = false;
        ArrayList arrayList = new ArrayList();
        seciliDersiAlanOgrenciler(ders, arrayList);
        for (int i = 0; i < arrayList.size(); i++) {
            if (ogrenciNo == (int) arrayList.get(i)) {
                ogrenciSeciliDersiAliyorMu = true;
            }
        }
        return ogrenciSeciliDersiAliyorMu;

    }

    public int girdigiDersSayisi(int okulNo) {
        int girdigiDersSayisi = 0;
        try {
            String sorgu = "Select * From yoklama where ogrenciNo = ?";
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setInt(1, okulNo);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                int derseGirdiMi = rs.getInt("derseGirdi");
                if (derseGirdiMi == 1) {
                    girdigiDersSayisi++;
                }
            }
        } catch (SQLException ex) {
            System.out.println("girdigiDersSayisi hatalı.");
            Logger.getLogger(Baglanti.class.getName()).log(Level.SEVERE, null, ex);
        }
        return girdigiDersSayisi;
    }

    public int girmedigiDersSayisi(int okulNo) {
        int girmedigiDersSayisi = 0;
        try {
            String sorgu = "Select * From yoklama where ogrenciNo = ?";
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setInt(1, okulNo);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                int derseGirdiMi = rs.getInt("derseGirdi");
                if (derseGirdiMi == 0) {
                    girmedigiDersSayisi++;
                }
            }
        } catch (SQLException ex) {
            System.out.println("girdigiDersSayisi hatalı.");
            Logger.getLogger(Baglanti.class.getName()).log(Level.SEVERE, null, ex);
        }
        return girmedigiDersSayisi;
    }

    public void seciliDerseGelmedigiGünler(int okulNo, String ders, ArrayList gelmedigiGünler) {
        try {
            String sorgu = "Select * From yoklama where ogrenciNo = ? and dersAdi like ? and derseGirdi = 0";
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setInt(1, okulNo);
            preparedStatement.setString(2, ders);
            gelmedigiGünler.clear();
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                String tarih = rs.getString("tarih");
                gelmedigiGünler.add(tarih);
            }
        } catch (SQLException ex) {
            System.out.println("seciliDerseGelmedigiGünler hatalı.");
            Logger.getLogger(Baglanti.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String[] ogrenciBilgileriArray(String tc) {
        String[] ogrenciBilgilerim = new String[4];
        try {
            String sorgu = "Select * From ogrenci where tc like ?";
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setString(1, tc);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                ogrenciBilgilerim[0] = rs.getString("adSoyad");
                ogrenciBilgilerim[1] = rs.getString("okulNo");
                ogrenciBilgilerim[2] = rs.getString("yas");
                ogrenciBilgilerim[3] = rs.getString("cinsiyet");
            }

        } catch (SQLException ex) {
            Logger.getLogger(Baglanti.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ogrenciBilgilerim;
    }

    public void ismiXIleBaşlayanOgrenciler(String x, ArrayList ogrenciler) {
        ogrenciler.clear();
        try {
            String sorgu = "Select * From ogrenci where adSoyad like ?";
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setString(1, x + "%");
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                ogrenciler.add(rs.getString("adSoyad") + ": " + rs.getInt("okulNo"));
            }

        } catch (SQLException ex) {
            System.out.println("ismiXIleBaşlayanOgrenciler metodu başarısız.");
            Logger.getLogger(Baglanti.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String ogrenciNodanTcBulma(int ogrenciNo) {
        String tc = "";
        try {
            String sorgu = "Select * From ogrenci where okulNo like ?";
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setInt(1, ogrenciNo);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                tc = rs.getString("tc");
            }
        } catch (SQLException ex) {
            System.out.println("ismiXIleBaşlayanOgrenciler metodu başarısız.");
            Logger.getLogger(Baglanti.class.getName()).log(Level.SEVERE, null, ex);
        }
        return tc;
    }

    public String[][] tabloVerileriMultiArray(int ogrenciNo) {
        int yoklamaSayisi = ogrenciyeAitYoklamaSayisi(ogrenciNo);
        String[][] tabloVerileri = new String[yoklamaSayisi][6];
        try {
            String sorgu = "Select * From yoklama where ogrenciNo = ?";
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setInt(1, ogrenciNo);
            ResultSet rs = preparedStatement.executeQuery();
            int i = 0;
            while (rs.next()) {
                tabloVerileri[i][0] = rs.getString("dersAdi");
                tabloVerileri[i][1] = rs.getString("tarih");
                tabloVerileri[i][2] = rs.getString("baslangicSaati");
                tabloVerileri[i][3] = rs.getString("bitisSaati");
                tabloVerileri[i][4] = rs.getString("ogretmenTC");
                if (rs.getInt("derseGirdi") == 0) {
                    tabloVerileri[i][5] = "Yok";
                } else {
                    tabloVerileri[i][5] = "Var";
                }
                i++;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Baglanti.class.getName()).log(Level.SEVERE, null, ex);
        }
        return tabloVerileri;
    }

    public int ogrenciyeAitYoklamaSayisi(int ogrenciNo) {
        int ogrenciyeAitYoklamaSayisi = 0;
        try {
            String sorgu = "Select * From yoklama where ogrenciNo = ?";
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setInt(1, ogrenciNo);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                ogrenciyeAitYoklamaSayisi++;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Baglanti.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ogrenciyeAitYoklamaSayisi;

    }
}
