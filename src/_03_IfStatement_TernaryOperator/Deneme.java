package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Deneme {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       System.out.println(" Lütfen bir karakter giriniz.");
       String kar=scan.next();
       char karak=kar.charAt(0);
       int ascii=karak;
        if (ascii>47 && ascii<58){
            System.out.println("girdiginiz karakter bir sayidir.");
        }
        System.out.println("girdiginiz karakter bir sayi degildir.");
    }
}
