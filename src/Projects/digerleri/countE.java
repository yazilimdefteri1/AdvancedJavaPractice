package projects.digerleri;

import java.util.Scanner;

public class countE {

/*    Determine and print the number of times
      the character ‘b’ appears in the input entered by the user.
     input: Test output
            b: 0
        output should be 0
     input: bucket
            b:1
        output should be 1
        */
    //hint: .charAt, length(), for, index, counter,



    /*  Kullanıcı tarafından girilen inputda kac tane 'b' karakteri olduğunu belirle ve print et.

     input: Test output
            b: 0
        output 0 olmalı


     input: bucket
            b:1
        output 1 olmalı
        */

    //hint: .charAt, length(), for, index, counter,


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir metin giriniz");
        String text = input.nextLine().toLowerCase();

         // code start here
         // kodu burdan başlatın ve bu satırdan önceki kodlari değiştirmeyin
        int sayac=0;
        for (int i = 0; i < text.length(); i++)  {
            if(text.charAt(i)=='b'){
                sayac++;
            }
        }
        System.out.println("Metindeki 'b' karaktei sayisi : " + sayac);
        }

}
