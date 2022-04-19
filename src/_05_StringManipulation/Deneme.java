package _05_StringManipulation;

import java.util.Scanner;

public class Deneme {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Göndermek istediğiniz iban numarasini giriniz : ");
        System.out.print("TR");
        String iban = scan.nextLine();
        iban = iban.replaceAll("\\s", "");

        if (iban.length() != 24) {
            System.out.println("Geçersiz iban Lutfen yeniden giriniz : ");
            System.out.print("TR");
            iban = scan.nextLine();
            iban = iban.replaceAll("\\s", "");
        }
    }
}
