package _05_StringManipulation;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        // TASK : Kullanıcıdan alacağınız bir stringde boşluk karakterinin olup olmadığını kontrol ediniz.

        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen bir String deger giriniz : ");
        String text = scan.nextLine();
        int index = text.indexOf(" ");
        System.out.println(index);
        if (index > -1) {
            System.out.println("Space  String'imizde bulunmaktadir. İndex Degeri = " + text.indexOf(" ")); // indexler 0 dan başlar
        }else {
            System.out.println("Space  String'imizde bulunmamaktadir");
            System.out.println(index);
        }
    }
}

