package day_03_20_ForLoop;

import java.util.Scanner;

public class P01_ForLoop {
    public static void main(String[] args) {

        /*
            Soru 5- Kullanicidan 20’den kucuk bir sayi alip,
                    bu sayinin faktoryel degerini hesaplayin.
         */


        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen 20'den kucuk bir pozitif tamsayi giriniz");
        int sayi= scan.nextInt();
        int faktoryel=1;

        for (int i = sayi; i >=1 ; i--) {
            faktoryel*=i;
        }
        System.out.println("Girilen sayinin faktoryel degeri :"+faktoryel);
    }
}
