package day_16_03_Team09;

import java.util.Scanner;

public class P02_StringMan {
    public static void main(String[] args) {
        /*
            Soru 4 : Kullanicidan bir sifre isteyip, asagidaki sartlari kontrol edin ve kullaniciya
                     duzeltmesi gereken tum eksikleri soyleyin, eger tum sartlari saglarsa,
                     "sifre basariyla kaydedildi" yazdirin
                     - ilk harf kucuk harf olmali
                     - son karakter rakam olmali
                     - sifre bosluk icermemeli
                     - uzunlugu en az 10 karakter olmali

         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sifre giriniz");
        String sifre = scan.nextLine();
        int flag = 0;
        char sonHarf = sifre.charAt(sifre.length() - 1);

        if (sifre.charAt(0) >= 'a' && sifre.charAt(0) <= 'z') {
            flag++;

        } else {
            System.out.println("Sifrenin ilk karakteri kucuk olmalidir");
        }
        if (sonHarf >= '0' && sonHarf <= '9') {
            flag++;
        } else {
            System.out.println("Sonkarakter rakam olmalidir");
        }
        if (!sifre.contains(" ")) {
            flag++;
        } else {
            System.out.println("Sifre bosluk icermemeli");
        }
        if (sifre.length() >= 10) {
            flag++;
        } else {
            System.out.println("Sifre 10 karakterden fazla olmali");
        }
        if (flag == 4) {
            System.out.println("Sifre basariyla kaydedilmistir");
        }
    }
}
