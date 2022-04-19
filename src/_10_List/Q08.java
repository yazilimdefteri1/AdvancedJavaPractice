package _10_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q08 {

    public static void main(String[] args) {
        /* TASK :
         * 10 elamanli bir list olusturun. Ardindan dizinin 3. elemani ile
         * 8. elemaninin yerlerini degistirin.
         *
         * ORNEK:
         *
         * INPUT : String[] isimler={"Umit","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"};
         * OUTPUT : String[] isimler={"Umit","Emin","Furkan","Kerem","Taylan","Orhan","Sinan","Kemal","Ahmet","Ali"};
         */

        List<String> isimler=new ArrayList<>(Arrays.asList("Umit","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"));
        System.out.println("Liste ilk hali");
        System.out.println(isimler);
        String depo1=isimler.get(2);
        String depo2=isimler.get(7);
        isimler.set(2,depo2);
        isimler.set(7,depo1);
        System.out.println("Liste set olmus hali");
        System.out.println(isimler);


    }

}
