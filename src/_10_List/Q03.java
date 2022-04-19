package _10_List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q03 {

    public static void main(String[] args) {
    /* TASK :
   Bir integer list oluşturunuz ve bu list’deki tum sayıların karesinin
   toplamını bulan code create ediniz.
    */
        ArrayList<Integer> list1=new ArrayList<Integer>();
        list1.add(1);  // tek tek ekleme yapılabiliyor
        list1.add(2);
        list1.add(2);
        list1.add(3);
        list1.add(10);
        int toplam=0;

        for (int i = 0; i <list1.size() ; i++) {
            toplam+=list1.get(i)*list1.get(i);
       }
        System.out.println("Listedeki Sayilarin Karelerinin Toplami = " + toplam);

    }
}
