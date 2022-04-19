package _07_ForLoop;

public class K01_NestedForLoop {
    public static void main(String[] args) {

        //        1
        //        2 6
        //        3 7 10
        //        4 8 11 13
        //        5 9 12 14 15

        for (int i = 1; i <=5; i++) { // i=2  sadce 2 yazdırdı
            System.out.print(i+" ");
            for (int j =2; j <=i; j+=4) { // i=1  yazdırmadı
                System.out.print((i+4) +" ");
                for (int k = 3; k <=i; k+=3) {
                    System.out.print((i+7) + " ");
                    for (int l =4; l <=i ; l+=2) {
                        System.out.print((i+9) + " ");
                        for (int m = 5; m <=i ; m++) {
                            System.out.print((i+10) + " ");

                        }
                    }
                }
            }
            System.out.println();
        }
    }



}
