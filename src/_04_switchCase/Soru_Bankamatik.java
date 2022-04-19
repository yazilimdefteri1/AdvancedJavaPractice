package _04_switchCase;

import java.util.Scanner;

public class Soru_Bankamatik {
  /*
  Bakıye (başlangıç bakıyesi 1000 tl) öğrenme, para yatırma ve cekme, çıkış işlemlerinin yapıldıgı bie ATM app. code create ediniz
   */
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int bakiye = 1000;

      System.out.println("        ********    ");
      System.out.println("   ATM'ye Hosgeldiniz :-)    ");

      System.out.println("   Bakiyeniz = " + bakiye);
      System.out.println("\n****İSLEMLER****\n");
      System.out.println("1. Para Çekme");
      System.out.println("2. Para Yatırma");
      System.out.println("3. Bakiye sorgulama");
      System.out.println("4. Kart İade");

      System.out.print("\nİsleminizi Seciniz: ");
      int islem = scan.nextInt();

      switch(islem) {
        case 1:
          System.out.println("Bakiyeniz = " + bakiye);
          System.out.print("Çekmek istediğiniz tutarı giriniz: ");
          int tutar = scan.nextInt();
          if(tutar > bakiye) {
            System.out.print("Yetersiz bakiye. Tekrar giriniz: ");
            tutar = scan.nextInt();
          }
          bakiye -= tutar;
          System.out.println("Yeni bakiyeniz = " + bakiye);
          break;
        case 2:
          System.out.println("Bakiyeniz = " + bakiye);
          System.out.print("Yatırmak istediğiniz tutarı giriniz: ");
          tutar = scan.nextInt();
          bakiye += tutar;
          System.out.println("Yeni bakiyeniz = " + bakiye);
          break;

        case 3:
          System.out.println("Bakiyeniz = " + bakiye);
          break;
        case 4:
          System.out.println("Kartınızı almayı unutmayınız.!!");
          break;
        default:
          System.out.println("Yanlıs islem secitiniz. Tekrar giriniz.");
      }



    }
}

