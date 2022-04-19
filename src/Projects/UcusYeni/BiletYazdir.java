package projects.UcusYeni;

import static projects.UcusYeni.Kimlik.ad;
import static projects.UcusYeni.Kimlik.soyAd;
import static projects.UcusYeni.RunnerSon.*;
import static projects.UcusYeni.UcusBilgileri.*;
import static projects.UcusYeni.YasKontrol.yolcuS;

public class BiletYazdir {
    public static void BiletYazdir() {

        System.out.println("**************Ucus Biletiniz***************");
        System.out.println("*   Adi...................: "+ ad);
        System.out.println("*   Soyadiniz.............: " + soyAd);
        System.out.println("*   Kalkis Ulke...........: " + ulke);
        System.out.println("*   Varis Ulke............: " + ulkeV);
        System.out.println("*   Gidis Tarihi..........: "+gGun+"/"+gAy+"/"+gYil);
        if(tekCift.contains("C")) {
        System.out.println("*   Donus Tarihi..........: "+dGun+"/"+dAy+"/"+dYil);}
        System.out.println("*   Bilet Ucretiniz.......: " + biletFiyati+"$"+ "("+yolcuS + " Kisilik)");
        System.out.println("**********İyi Ucuslar Dileriz**************");
    }
}
