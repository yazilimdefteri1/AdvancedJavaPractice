package projects.UcusYeni;

import static projects.UcusYeni.RunnerSon.*;
import static projects.UcusYeni.YasKontrol.yasIndirimY;

public class BiletHesapla {
    public static double BiletHesapla() {
        for (int i = 0; i <yasIndirimY.length ; i++) {
            biletFiyati+=biletFiyati*tekCiftYonIndirim*yasIndirimY[i];
         }

        return biletFiyati;

    }
}
