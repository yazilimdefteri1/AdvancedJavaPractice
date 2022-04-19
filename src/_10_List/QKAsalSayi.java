package _10_List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class QKAsalSayi<Static, sayilar> {

    /* TASK :
    100 den kucuk asal sayilari yazdiran bir code create ediniz.
     */

    public static void main(String[] args) {
        List<Integer> sayilar= new ArrayList<>();
         List<Integer> asalSayilar= new ArrayList<>();
        asalSayilar.add(2);
        asalSayilar.add(3);
        asalSayilar.add(5);
        asalSayilar.add(7);

        for (int i = 8; i <100 ; i++) {
            sayilar.add(i);}

      for(int k=0; k<sayilar.size(); k++) {
          if (sayilar.get(k) % 2 == 0) {
          } else if (sayilar.get(k) % 3 == 0) {
          } else if (sayilar.get(k) % 5 == 0) {
          } else if (sayilar.get(k) % 7 == 0) {
          } else {
              asalSayilar.add(sayilar.get(k));
          }
      } //2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97.
        System.out.println(asalSayilar);
        System.out.println(asalSayilar.size());

    }
}
