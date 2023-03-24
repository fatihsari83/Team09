package day_24_03_WhileLoop;

import java.util.Scanner;

public class P04 {
    public static void main(String[] args) {

        /*
             Soru 4- Kullanicidan toplanmak uzere pozitif tamsayilar isteyin
                     Kullaniciya bitirmek istediginde 0'a basmasini soyleyin
                     Kullanici bitirmek istediginde toplam kac adet pozitif tam sayi girdigini ve
                     bunlarin toplaminin kac oldugunu yazdirin
                     Kullanici negatif sayi girerse "negatif sayi kullanamazsiniz " yazdirin bu
                     negatif sayiyi sayi adedine ve toplama eklemeyin
         */

        Scanner scan = new Scanner(System.in);

        int sayi = 5;
        int sayac = 0;
        int toplam = 0;

        while (sayi != 0) {
            System.out.println("Lutfen pozitif bir tam sayi giriniz , bitirmek istediğinizde 0'a basın");
            sayi = scan.nextInt();

            if (sayi > 0) {
                sayac++;
                toplam += sayi;


            } else if (sayi < 0) {
                System.out.println("Lutfen pozitif bir tamsayi giriniz! Negatif sayi kullanamazsınız");
            }


        }
        System.out.println("Girilen " + sayac + " adet sayinin toplami : " + toplam);


    }

}
