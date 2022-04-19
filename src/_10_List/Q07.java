package _10_List;

import java.util.Arrays;

public class Q07 {

    public static void main(String[] args) {
		/* TASK :
		ayna check sorusu:
		 input : int arr1[] = { 1, 2, 3, 4, 4, 3, 2, 1 };
		 output : verilen array simetriktir
		 */

        int arr1[] = {1, 2, 3, 4, 4, 3, 2, 1};
        int simetriOrt = arr1.length / 2;
        int sayac = 0;

        for (int i = 0; i < simetriOrt; i++) {
            if (arr1[i] == arr1[arr1.length - i - 1]) {
                sayac++;
            }
        }
        if (sayac == simetriOrt) {
            System.out.println("verilen array simetriktir");
        } else {
            System.out.println("verilen array simetrik degildir");
        }
    }
}
