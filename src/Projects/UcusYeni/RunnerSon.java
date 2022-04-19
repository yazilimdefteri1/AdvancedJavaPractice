package projects.UcusYeni;

import java.util.Scanner;

import static projects.UcusYeni.BiletHesapla.BiletHesapla;
import static projects.UcusYeni.BiletYazdir.BiletYazdir;
import static projects.UcusYeni.Karsilama.Karsilama;
import static projects.UcusYeni.Kimlik.Kimlik;
import static projects.UcusYeni.UcusBilgileri.UcusBilgileri;
import static projects.UcusYeni.YasKontrol.YasKontrol;

public class RunnerSon {
    static Scanner scan = new Scanner(System.in);
    static String ulke = "";
    static String ulkeV = "";
    static String tekCift = "";
    static int uKont;
    static double biletFiyati;
    static double tekCiftYonIndirim;
    static double yasIndirim;


    public static void main(String[] args) {

        Karsilama();
        UcusBilgileri();
        Kimlik();
        //Yolcu();
        YasKontrol();
        BiletHesapla();
        BiletYazdir();



    }


}




