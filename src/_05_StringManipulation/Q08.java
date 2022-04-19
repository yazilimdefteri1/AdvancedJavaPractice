package _05_StringManipulation;

import java.util.Scanner;

public class Q08 {
    public static void main(String[] args) {
        /* TASK :
         * Kulanicidan bir kelime isteyin eger kelime 3 ve daha fazla harfden olusuyorsa son
         * iki harfini 3 kere yan yana yazdirin. degil ise girilen kelimeyi yazdirin
         *
         * ornek
         * input = Ali
         * output = lilili
         *
         * input = el
         * output = el
         */

        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen bir kelime giriniz...: ");
        String str = scan.nextLine();
        int uzunluk = str.length();

        while (uzunluk <= 3) {
            System.out.println("Girdiginiz metin kısa");
            System.out.print("Lutfen yeni bir kelime giriniz...: ");
            str = scan.nextLine();
            uzunluk = str.length();
        }
        for (int i = 0; i < 3; i++) {
            System.out.print(str.substring(uzunluk - 2));
        }

    }

}

