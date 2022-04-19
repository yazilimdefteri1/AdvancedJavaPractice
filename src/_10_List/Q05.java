package _10_List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.util.Collections.list;

public class Q05 {
    public static void main(String[] args) {
       /* TASK :
        Kullanıcıdan alacağınız 6 elemanlı bir dizinin
        sadece tek elemanlarını ayrı diziye bir metodda atayarak
         yazdırınız.

        */
        List<String> list = new ArrayList<>();

        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");

        telElemanYazdir(list);
    }

    private static void telElemanYazdir(List<String> list) {
        List<String> listTek = new ArrayList<>();
        for (int i = 0; i < list.size(); i += 2) {
            listTek.add(list.get(i));
        }
        System.out.println(listTek);
    }


}
