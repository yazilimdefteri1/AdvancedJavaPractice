package _10_List;

import java.util.*;

public class Q01 {

    public static void main(String[] args) {
        /* TASK :

         * Input olarak verilen listteki isimlerden
         * icinde ‘a’ harfi bulunanlari silen bir code create ediniz.
         *
         * INPUT : list1={"Ali","Veli","Ayse","Fatma","Omer"}
         * OUTPUT : [Veli,Omer]
         */

        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();

        list1.add("Ali");
        list1.add("Veli");
        list1.add("Ayse");
        list1.add("Fatma");
        list1.add("Selcuk");
        list1.add("Selim");
        list1.add("Ersin");
        list1.add("Aykut");
        list1.add("Ayhan");
        list1.add("Omer");

        String str;

        for (int i = 0; i < list1.size(); i++) {
            str = list1.get(i);
            if (!str.toLowerCase().contains("a")) {
                list2.add(str);
            }
        }
        System.out.println(list2);


        List<String> isimler = new ArrayList<>(Arrays.asList("Ali","Veli","Ayse","Fatma","Omer"));
        List<String> aOlmayanIsimler = new ArrayList<>();

        for (String w : isimler) {
            if (!w.toLowerCase().contains("a")) {
                aOlmayanIsimler.add(w);
            }
        }
        System.out.println("a olmayan isimler : "+ aOlmayanIsimler);
    }
}



