package day_02_25_DataCast;

import java.util.Scanner;

public class P03_Practics {
    public static void main(String[] args) {
        //Soru 3- Kullanicidan bir sayi alin, kullanici kac degerini girerse girsin,
        //          o sayiyi -128 ile 127 arasindaki bir sayiya donusturup yazdirin.


        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");

        int sayi= scan.nextInt();

        byte byt= (byte) sayi;

        System.out.println("Girilen sayi :"+byt);
    }
}
