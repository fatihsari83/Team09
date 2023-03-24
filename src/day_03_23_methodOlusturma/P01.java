package day_03_23_methodOlusturma;

import java.util.Scanner;

public class P01 {
    public static void main(String[] args) {
        /*
            Soru 3- Kullanicidan main method icinde pozitif bir tamsayi alin.
                    Girilen sayinin asal sayi olup olmadigini kontrol edip,
                    sonuc olarak “asal sayi” veya “asal sayi degil”
                    sonuclarini donduren bir method olusturun.

         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz");
        int sayi= scan.nextInt();

        String sonuc=asalMi(sayi);
        System.out.println(sonuc);
    }

    private static String  asalMi(int sayi) {
        int sayac=0;


        for (int i = 2; i <sayi ; i++) {
            if (sayi%i==0){
                sayac++;
            }
        }
        if (sayac==0){
            return "Girilen sayi asaldir";
        }else {
            return "Sayi asal degildir";
        }

    }
}
