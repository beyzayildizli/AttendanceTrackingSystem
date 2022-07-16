package yoklamatakipsistemi;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
public class Regex {

    public boolean isimSoyisimKontrol(String adSoyad) {
        boolean isimUygunMu = false;
        Pattern p = Pattern.compile("^(?<ad>[A-Z][a-z]{1,}\\s)(?<ikinciAd>[A-Z][a-z]{1,}\\s)?(?<ucuncuAd>[A-Z][a-z]{1,}\\s)?(?<soyAd>[A-Z][a-z]{1,})");
        Matcher m = p.matcher(adSoyad);
        if (m.matches()) {
            isimUygunMu = true;
        }
        return isimUygunMu;
    }

    public boolean tarihKontrol(String tarih) {
         boolean tarihUygunMu = false;
       Pattern p = Pattern.compile("^(?<gun>0?[1-9]|[12][0-9]|3[01])[.-](?<ay>0?[1-9]|1[012])[.-](?<yil>\\d{4})$");
        Matcher m = p.matcher(tarih);
        if (m.matches()) {
            tarihUygunMu = true;
        }
        return tarihUygunMu;
    }

    public boolean telefonKontrol(String tel) {
        boolean telUygunMu = false;
        Pattern p = Pattern.compile("^(?<ulkeKodu>90)\\s(?<ulusalAlanKodu3>\\d{3})\\s(?<aboneNo7>(\\d{7})|(\\d{3}\\s\\d{2}\\s\\d{2}))");
        Matcher m = p.matcher(tel);
        if (m.matches()) {
            telUygunMu = true;
        }
        return telUygunMu;
    }

    public boolean tcKontrol(String tc) {
        boolean tcUygunMu = false;
        //11 rakamdan oluşan ve son rakamı bir çift sayı olan bir sayıdır.
        Pattern p = Pattern.compile("^\\d{10}[02468]");
        Matcher m = p.matcher(tc);
        if (m.matches()) {
            tcUygunMu = true;
        }
        return tcUygunMu;
    }

    public boolean saatKontrol(String saat) {
         boolean saatUygunMu = false;
        Pattern p = Pattern.compile("^(?<saat>[01]?[0-9]|2[0-3]):(?<dakika>[0-5][0-9])$");
        Matcher m = p.matcher(saat);
        if (m.matches()) {
            saatUygunMu = true;
        }
        return saatUygunMu;
    }

    public boolean sayiKontrol(String sayi) {
        boolean sayiUygunMu = false;
        Pattern p = Pattern.compile("^\\d+");
        Matcher m = p.matcher(sayi);
        if (m.matches()) {
            sayiUygunMu = true;
        }
        return sayiUygunMu;
    }
}