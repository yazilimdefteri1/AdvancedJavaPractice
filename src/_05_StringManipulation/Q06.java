package _05_StringManipulation;

import java.util.Scanner;

public class Q06 {
    public static void main(String[] args) {
       /*
        TASK :
        kullanıcıdan bir e-posta adresi girmesini isteyin, ardından "hotmail" içeriyorsa, "gmail" ile değiştirin,
        örneğin: johnbrown@hotmail.com ==> johnbrown@gmail.com
        */

        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen mail adresinizi giriniz...: ");
        String mail = scan.nextLine();
        int index = mail.indexOf("@");

        String cont = mail.substring((index+1),(mail.length()));
        System.out.println(cont);

        if (cont.equals("hotmail.com")){
           mail=mail.replace("hot","g");
            System.out.println("mailiniz basariyla degistirildi  : " + mail);
        } else{
            System.out.println("mailinizde sorun bulunmamaktadir");

        }


    }
}
