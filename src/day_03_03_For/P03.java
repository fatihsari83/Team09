package day_03_03_For;

import java.util.Scanner;

public class P03 {
    public static void main(String[] args) {
        /*
            //Soru 5- Kullanicidan 20’den kucuk bir sayi alip,
            //        bu sayinin faktoryel degerini hesaplayin.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 20'den kucuk bir sayi giriniz");
        int sayi = scan.nextInt();
        int faktoryel = 1;

        if (sayi >= 20) {
            System.out.println("20'den kucuk bir sayi giriniz");
        } else {
            for (int i = sayi; i > 1; i--) {
                faktoryel *= i;
            }
            System.out.println(faktoryel);
        }
    }
}
