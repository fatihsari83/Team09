package day_03_09_NestedIf;

import java.util.Scanner;

public class P01 {
    public static void main(String[] args) {
        /*
            Soru 3- Kullanicidan bir sayi alin,
                    sayi tek ise negatif veya pozitif tek sayi oldugunu yazdirin,
                    sayi cift sayi ise 10’un tam kati olup olmadigini yazdirin.
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz");
        int sayi= scan.nextInt();

        if (sayi>0){
            if (sayi%2==0){
                if (sayi%10==0){
                    System.out.println("Girilen sayi :"+sayi+" pozitif 10'un katidir");
                }else {
                    System.out.println("Girilen sayi :" + sayi + " pozitif cift sayidir, 10'un kati degildir");
                }
            }else {
                System.out.println("Girilen sayi :"+sayi+" pozitif tek sayidir");
            }

        } else if (sayi<0) {
            if (sayi%2==0){
                if (sayi%10==0){
                    System.out.println("Girilen sayi :"+sayi+" negatif 10'un katidir");
                }else {
                    System.out.println("Girilen sayi :" + sayi + " negatif cift sayidir, 10'un kati degildir");
                }
            }else {
                System.out.println("Girilen sayi :"+sayi+" negatif tek sayidir");
            }


        }else {
            System.out.println("Gecersiz giris");
        }
    }
}
