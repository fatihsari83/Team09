package day_03_06_ForLoop;

import java.util.Scanner;

public class P02_AsalMi {
    public static void main(String[] args) {
        /*
            Soru 11- Kullanicidan pozitif bir tamsayi isteyip,
                     sayinin asal sayi olup olmadigini kontrol edin ve sonucu yazdirin.

         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi  giirniz");
        int sayi = scan.nextInt();
        boolean sayac = true;
        if (sayi == 1) {
            System.out.println("1 sayisi asal degildir");
        } else {
            for (int i = 2; i < sayi; i++) {
                if (sayi % i == 0) {
                    sayac = false;
                    break;
                }
            }
            if (sayac == true) {
                System.out.println("Girilen sayi asaldir");
            } else {
                System.out.println("Girilen sayi asal degildir");
            }

        }

    }
}
