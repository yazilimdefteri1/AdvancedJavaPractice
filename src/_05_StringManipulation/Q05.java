package _05_StringManipulation;

public class Q05 {
    public static void main(String[] args) {
    /*
        TASK :
        String seklinde verilen asagidaki fiyatlarin toplamini bulunuz.
        String  str 1= %13.99
        String str 2= %10.55
        ipucu: Double.parseDouble() methodunu kullanabilirsiniz.

     */
        String  str1= "%13.99";
        String str2= "%10.55";
        str1=str1.replace("%","");
        str2=str2.replace("%","");
        double sayi1 = Double.parseDouble(str1);
        double sayi2 = Double.parseDouble(str2);
        double toplam=sayi1+sayi2;
        System.out.println(toplam);


    }
}
