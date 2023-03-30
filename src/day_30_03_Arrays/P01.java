package day_30_03_Arrays;

import java.util.Arrays;

public class P01 {
    public static void main(String[] args) {

        /*  Soru 1-Verilen bir int array’in tum elemanlarini 2 artirip bize donduren bir method olusturun.
                   Eski array’i yeni haliyle kaydedin.
         */

        int[] arr = {5, 8, 15, 20};


        int[] arrYeni = elemanArtir(arr);
        System.out.println(Arrays.toString(arrYeni));
    }

    public static int[] elemanArtir(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            arr[i] += 2;
        }
        return arr;
    }
}
