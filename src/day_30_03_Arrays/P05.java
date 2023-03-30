package day_30_03_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class P05 {
    public static void main(String[] args) {
        /*
         Soru 5-Kullanicidan array’in boyutunu ve elementlerini alip array’i olusturan ve
                bize donduren bir method olusturun.
         */


        int[] arr1 = arrayOlustur();
        System.out.println(Arrays.toString(arr1));

    }

    private static int[] arrayOlustur() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen array'in uzunlugunu girin");

        int uzunluk = scan.nextInt();
        int[] arr = new int[uzunluk];

        for (int i = 0; i < uzunluk; i++) {
            System.out.println("Array " + (i + 1) + ". elmani girin");
            arr[i] = scan.nextInt();
        }
        return arr;
    }
}
