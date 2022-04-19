package _04_switchCase;

import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
// 2- Girilen 3 basamaklı bir sayıyı yazı ile yazdırınız

        Scanner scan = new Scanner(System.in);

        System.out.print("3 Basamaklı pozitif bir sayi giriniz: ");
        int sayi = scan.nextInt();


        if (sayi<100 || sayi> 999) { // Bir sefere mahsus  girilen sayı negatif beya üç basamaklı değil ise yeniden doğru girmesi isteniyor.
            System.out.println("Lutfen sayiyi pozitif 3 Basamakli giriniz : ");
            sayi = scan.nextInt();
        }

        int birler = sayi % 10;
        int yuzler = sayi /100;
        int onlar = ((sayi-yuzler*100) / 10);


        switch (yuzler) {
            case 1:
                System.out.print("Yüz ");
                break;
            case 2:
                System.out.print("İkiyüz ");
                break;
            case 3:
                System.out.print("Üçyüz ");
                break;
            case 4:
                System.out.print("Dörtyüz ");
                break;
            case 5:
                System.out.print("Beşyüz ");
                break;
            case 6:
                System.out.print("Altıyüz ");
                break;
            case 7:
                System.out.print("Yediyüz ");
                break;
            case 8:
                System.out.print("Sekizyüz ");
                break;
            case 9:
                System.out.print("Dokuzyüz ");
                break;
        }
        switch (onlar) {
            case 1:
                System.out.print("On");
                break;
            case 2:
                System.out.print("Yirmi");
                break;
            case 3:
                System.out.print("Otuz");
                break;
            case 4:
                System.out.print("Kırk");
                break;
            case 5:
                System.out.print("Elli");
                break;
            case 6:
                System.out.print("Altmıs");
                break;
            case 7:
                System.out.print("Yetmis");
                break;
            case 8:
                System.out.print("Seksen");
                break;
            case 9:
                System.out.print("Doksan");
                break;
        }
        switch (birler) {
            case 1:
                System.out.print(" Bir");
                break;
            case 2:
                System.out.print(" İki");
                break;
            case 3:
                System.out.print(" Üç");
                break;
            case 4:
                System.out.print(" Dört");
                break;
            case 5:
                System.out.print(" Beş");
                break;
            case 6:
                System.out.print(" Altı");
                break;
            case 7:
                System.out.print(" Yedi");
                break;
            case 8:
                System.out.print(" Sekiz");
                break;
            case 9:
                System.out.print(" Dokuz");
                break;

        }

    }
}
