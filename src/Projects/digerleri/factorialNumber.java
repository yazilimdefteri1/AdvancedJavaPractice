package projects.digerleri;

import java.util.Scanner;

public class factorialNumber {

    public static void main(String[] args) {

        /*
        Write a program to find the factorial value of any number entered through the scanner class.

        Example:
        number:7
        factorial:1*2*3*4*5*6*7=5040
        output should be == 5040

        number:6
        factorial:1*2*3*4*5*6=720
        output should be == 720

       */

        /*
        Scanner class aracılığıyla girilen herhangi bir sayının faktöriyel değerini bulmak için bir program yazın.

        number:6
        factorial:1*2*3*4*5*6=720
        output ---> 720
         */

        Scanner dp = new Scanner(System.in);
        System.out.print("Faktoriyelini almayi dusundugunuz bir sayi giriniz : ");
        String strNum = dp.nextLine();

        while (strNum.charAt(0) >= 'a' && strNum.charAt(0) <= 'z') {
            System.out.println("harf girdiniz lütfen sayi giriniz >>>> "); //true
            strNum = dp.nextLine();
        }
        while (strNum.charAt(0) >= 'A' && strNum.charAt(0) <= 'Z') {
            System.out.println("harf girdiniz lütfen sayi giriniz >>>> "); //true
            strNum = dp.nextLine();
        }
        int number = Integer.parseInt(strNum);

        //      code start here  use int number
        //      kodu burdan başlatın ve int number kullanın
        int faktoriyel = 1;
        int number1 = number;
        while (number1 < 0) {
            System.out.print("Faktoriyelini almayi dusundugunuz bir sayi giriniz : ");
            strNum = dp.nextLine();
            number1 = Integer.parseInt(strNum);
        }
        for (int i = 1; i <= number1; i++) {
            faktoriyel *= i;
            if (i != number1) {
                System.out.print(i + "*");
            } else {
                System.out.print(i);
            }
        }
        System.out.println("=" + faktoriyel);


    }
}
