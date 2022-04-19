package projects.digerleri;

import java.util.Scanner;

public class checkNumberEven {

    /*
        Given an int check the number is even or not
        if the number is even print true
        if the number is odd print false
        result should be true or false.
     */

     /*
        Veri tipi int olan number verildiğinde, number  çift mi tek mi kontrol et
        Eğer number çift ise  print true
        Eğer number tek ise  print false
        result true ya da false olmalı.
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen bir tam sayi giriniz = ");
        Double number=scanner.nextDouble();
        Double kontrol=number%1;
        while(kontrol!=0){
            System.out.print("Girdiginiz sayi tamsayi degildir. Lütfen bir tam sayi giriniz = ");
            number=scanner.nextDouble();
            kontrol=number%1;
        }

        //  code Start here don't change before this line
        // Kodu burdan baslatin ve bu satırdan önceki kodlari değiştirmeyin
        boolean sonuc;
        if(number%2==0){
            System.out.println("true");
            sonuc=true;
        } else{
            System.out.println("false");
            sonuc=false;
        }
        System.out.println(sonuc);

    }

}
