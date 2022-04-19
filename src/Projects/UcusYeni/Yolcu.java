package projects.UcusYeni;

import static projects.UcusYeni.RunnerSon.scan;

public class Yolcu {
    static int yolcuS = 0;
    static int arr[];

    static void Yolcu() {
        System.out.println("Yolcu Sayisini Griniz..........: ");
        yolcuS = scan.nextInt();

        for (int i = 0; i < yolcuS; i++) {
            System.out.print((i+1) + ". Yolcu Yasini Griniz..........: ");
            arr[i] = scan.nextInt();
        }

    }
}
