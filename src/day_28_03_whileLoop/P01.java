package day_28_03_whileLoop;

import java.util.Scanner;

public class P01 {
    public static void main(String[] args) {
       /*
             Soru 5- Kullanicidan bir sayi ve hesaplamak istedigi ussunu isteyin.
                     While loop kullanarak verilen sayinin istenen ussunu hesaplayip yazdiran bir method olusturun.
         */

        sayininUssunuBulma();


    }

    private static void sayininUssunuBulma() {
        Scanner scan=new Scanner(System.in);
        System.out.printf("Lutfen bir sayi giriniz");

        int sayi = scan.nextInt();
        System.out.printf("Lutfen girilen sayinin us degerini giriniz");
        int us = scan.nextInt();
        int sonuc=0;
        while (us!=1){
            sonuc*=sayi;
            us--;
        }
        System.out.println(sonuc);

        }
}
