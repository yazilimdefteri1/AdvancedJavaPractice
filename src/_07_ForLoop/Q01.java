package _07_ForLoop;

public class Q01 {
    /*

       sayacı ritmik ilerleyen ve adım sayısı belli ise FOR kullanılır.
       DEĞİLSE While kullanılır, Eğer döngüye bir kez mutlaka girilecekse DO_WHILE kullanılır.

       TASK :
        100'den 0'a kadar 13'e tam bölünebilen sayıları ve toplamlarını ekrana yazdırınız (büyükten küçüğe).

         Ekran Çıktısı
        91
        78
        65
        52
        39
        26
        13       */
    public static void main(String[] args) {
		int top = 0;

		for (int i = 100; i > 0; i--) {
			if (i % 13 == 0) {
				System.out.println(i);
				top += i; //ali+veli+65+52+39+26+13=364
			}
			String arr= "ayhan";
			System.out.println(arr.toUpperCase());
		}
		System.out.println(top); //alivelihasanhüğseyin
	}							//100+20  120
}
