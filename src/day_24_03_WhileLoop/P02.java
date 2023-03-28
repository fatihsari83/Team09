package day_24_03_WhileLoop;

import java.util.Scanner;

public class P02 {
    public static void main(String[] args) {
        /*
            Soru 2- While loop kullanarak kullanicidan alinan sayinin rakamlar toplamini bulun.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int sayi = scan.nextInt();
        int rakamlarToplami = 0;

        while (sayi > 0) {
            rakamlarToplami += sayi % 10;
            sayi /= 10;


        }
        System.out.println("Sayinin rakamlar toplami :"+rakamlarToplami);
    }
}
