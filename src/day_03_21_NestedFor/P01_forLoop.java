package day_03_21_NestedFor;

import java.util.Scanner;

public class P01_forLoop {
    public static void main(String[] args) {
        /*
                Soru 11- Kullanicidan pozitif bir tamsayi isteyip, sayinin asal sayi olup olmadigini
                         kontrol edin ve sonucu yazdirin.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz");
        int sayi = scan.nextInt();
        int flag = 0;

        for (int i = 2; i < sayi; i++) {

            if (sayi % i == 0) {
                flag++;
            }
        }
        if (flag == 0) {
            System.out.println("Girilen sayi asaldir");
        } else {
            System.out.println("Girilen sayi asal degildir");
        }
        System.out.println("Flag :"+flag);
    }
}
