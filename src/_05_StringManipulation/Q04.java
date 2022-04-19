package _05_StringManipulation;

import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
        // TASK : Kullanicidan 4 harfli bir kelime isteyin ve girilen kelimeyi tersten yazdirin
        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen 4 harfli bir kelime giriniz : ");
        String input=scan.nextLine();
        System.out.println(input.substring(3) + input.substring(2,3) + input.substring(1,2)+ input.substring(0,1)) ;
        System.out.println(input.charAt(3)+""+input.charAt(2)+""+input.charAt(1)+input.charAt(0));
        String tersStr= input.substring(3).toUpperCase()+
                input.substring(2,3).toLowerCase()+
                input.substring(1,2).toLowerCase()+
                input.substring(0,1).toLowerCase();

        System.out.println(tersStr);


        System.out.print("Lutfen bir metin  giriniz : ");
        input=scan.nextLine();
        for (int i = input.length(); i >0; i--) {

        System.out.print(input.substring((i-1),(i)));
        tersStr+= input.substring((i-1),(i)).toUpperCase();

        }
        System.out.println(tersStr);

        System.out.println(tersStr);



    }
}
