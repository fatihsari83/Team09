package day_30_03_Arrays;

public class P04 {
    public static void main(String[] args) {

        /*
            Soru 4-Verilen bir array’de istenen bir elemanin var olup olmadigini ve
                   varsa kac kere kullanildigini yazdiran bir method olusturun.
         */

        int[] arr = {4, 7, 9, 1, 2, 7, 1, 8, 9};

        String[] arr2 = {"d", "k", "L", "M", "k", "d"};


        kelimeSayisiYazdir(arr2, "K");

        elemanSayisiYazdir(arr, 7);


    }

    private static void kelimeSayisiYazdir(String[] arr2, String arananKelime) {
        int sayac = 0;
        for (int i = 0; i < arr2.length; i++) {

            if (arr2[i].equals(arananKelime)) {
                sayac++;

            }

        }
        System.out.println(arananKelime + " harfi " + sayac + " kez kullanilmistir");
    }

    private static void elemanSayisiYazdir(int[] arr, int arananEleman) {
        int flag = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == arananEleman) {
                flag++;
            }

        }
        System.out.println(arananEleman + " sayisi " + flag + " kez kullanilmistir");
    }


}
