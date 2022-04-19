package _05_StringManipulation;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {
       /*  TASK :
        Kullanıcıdan alacağınız, 3 kelimedne oluşan ismi
         Örn. Ahmet Emin Yılmaz -> A.E.Y.  formatıyla yazdırınız.
        */
        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen Adinizi ve Soyadinizi giriniz : ");
        String text = scan.nextLine();



        System.out.print(text.substring(0,1).toUpperCase()+".");
        System.out.print(text.substring((text.indexOf(" ")+1),(text.indexOf(" ")+2)).toUpperCase() +".");
        System.out.print(text.substring((text.lastIndexOf(" ")+1),(text.lastIndexOf(" ")+2)).toUpperCase() );

        System.out.println();
        int bosluk1=text.indexOf(" ");
        int bosluk2=text.lastIndexOf(" ");

        System.out.print(text.substring(0,1).toUpperCase()+".");
        System.out.print(text.substring(++bosluk1,++bosluk1).toUpperCase() + ".");
        System.out.print(text.substring(++bosluk2,++bosluk2).toUpperCase() );
       // System.out.println(bosluk2);
        /*int bosluk1=text.indexOf(" ");
        int bosluk2=text.substring(bosluk1).indexOf(" ");
        System.out.println(bosluk1);
        System.out.println(bosluk2);
        */

    }
}
