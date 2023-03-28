package day_03_01_ForLoop;

import java.util.Scanner;

public class P05 {
    public static void main(String[] args) {
        /*
        Soru 5- Kullanicidan 20’den kucuk bir sayi alip,
                bu sayinin faktoryel degerini hesaplayin
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen pozitif 20'den kucuk bir tamsayi giriniz");
        int sayi= scan.nextInt();
        int faktoryel=1;
        if (sayi>=20||sayi<0){
            System.out.println("Hatalii giris yaptiniz");
        }else {
            for (int i = sayi; i >=1 ; i--) {
                faktoryel*=i;
            }
            System.out.println(faktoryel);
        }
    }
}
