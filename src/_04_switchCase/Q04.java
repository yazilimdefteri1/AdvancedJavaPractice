package _04_switchCase;

import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {

        // Bugüne göre 100 gün sonra hangi gün olduğunuz yazdırınız.
        // pazartesi

        // Bugüne göre 100 gün sonra hangi gün olduğunuz yazdırınız.
        // pazartesi 100%7=2 oldugundan +2 ekleyecegiz

        Scanner scan = new Scanner(System.in);
        System.out.print("\nPazartesi - 1\nSali - 2\nÇarşamba - 3\nPerşembe - 4\nCuma - 5\nCumartesi - 6\nPazar - 7\nlutfen  haftanın gunune göre numara tuslayınız : ");
        int gun = scan.nextInt();


if (gun<=0 || gun>7){
    System.out.println("Hatalı veri girdiniz");
} else
    System.out.print("Kac gün sonrasini ogrenmek istiyorsunuz : ");
        int kacGun= scan.nextInt();
        int bulunanGun= (kacGun%7+gun)%7;
        //  100%7=2 oldugundan hergün e +2 gün  ekleyecegiz
        switch (bulunanGun) {
            case (1):
                System.out.println(kacGun + " gun sonra gun = Pazartesi");
                break;
            case (2):
                System.out.println(kacGun + " gun sonra gun = Sali");
                break;
            case (3):
                System.out.println(kacGun + " gun sonra gun = Çarşamba");
                break;
            case (4):
                System.out.println(kacGun + " gun sonra gun = Perşembe");
                break;
            case (5):
                System.out.println(kacGun + " gun sonra gun = Cuma");
                break;
            case (6):
                System.out.println(kacGun + " gun sonra gun = Cumartesi");
                break;
            case (0):
                System.out.println(kacGun + " gun sonra gun = Pazar");
                break;
            default:
                System.out.println("hatalı giris yaptiniz");
        }


          }
    }



