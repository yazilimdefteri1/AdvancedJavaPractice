package _10_List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
        /* TASK :
         Bir öğretmenden girmek istediği kadar notu alınız, ve
         ortalamayı geçen öğrenci sayısını bulan code create ediniz.

         */
        Scanner scan=new Scanner(System.in);
        System.out.print("Kaç ogrencinin notunu gireceksiniz : ");
        int  ogrenciSayi=scan.nextInt();
        List<Integer> notlar=new ArrayList<>();
        int not;
        int toplam = 0;
        double ortalama=0;
        int sayac=0;

        for (int i = 0; i <ogrenciSayi ; i++) { // for dongusu ile ogrenci sayisi kadar not girisi
            System.out.print("Lutfen "+(i+1)+". ogrencinin notunu giriniz = ");
            not=scan.nextInt();
            while(not<0){ // Yanlış not girdiginde bir While kontrolü atarak Dogru not girmesini istedik
                System.out.print("Lutfen "+(i+1)+". ogrencinin notuna gecerli bir not giriniz = ");
                not=scan.nextInt();
            }
            notlar.add(not); // girilen notlari listeye ekliyoruz
            toplam+=not; // tüm notlarıin toplamini bulmak icin dongu icinde her notu toplama ekliyoruz
        }
        ortalama=toplam/ogrenciSayi; // not girisi bitince ortalamayi bulduruyouz
        System.out.println("Sinifin Not Ortalamasi = "+ortalama); // sinifin not ortalamasini yazdiriyoruz

        for (int i = 0; i <notlar.size(); i++) { // listedeki notlarin ortalam üstü olup olmadigi kontrol foru
            if(notlar.get(i)>ortalama){
                sayac++; // ortalama ustu ise sayaci artiriyoruz
            }
        }
        System.out.println("Sinifta Ortalamayi gecen ogrenci Sayisi = "+sayac);


    }
}
