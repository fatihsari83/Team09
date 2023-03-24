package day_03_17_StringManupilationForLoop;

import java.util.Scanner;

public class P01_StringMan {
    public static void main(String[] args) {

        /*
             Soru 5 : Kullanicidan isim ve soyismini ayri ayri alin.
                    - ismi daha uzun ise, isim ve soyismi ilk harf buyuk kalanlar kucuk seklinde yazdirin
                    - soyisim daha uzun ise ismi ilk harf buyuk digerleri kucuk, soyismi buyuk
                      harflerle yazdirin.
         */


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen isminzi giriniz");
        String isim = scan.nextLine();
        System.out.println("Lutfen soyisminizi giriniz");
        String soyIsim = scan.nextLine();

        if (isim.length() > soyIsim.length()) {
            isim = isim.substring(0, 1).toUpperCase() + isim.substring(1).toLowerCase();
            soyIsim = soyIsim.substring(0, 1).toUpperCase() + soyIsim.substring(1).toLowerCase();
            System.out.println(isim + " " + soyIsim);

        } else if (soyIsim.length() > isim.length()) {
            isim = isim.substring(0, 1).toUpperCase() + isim.substring(1).toLowerCase();
            soyIsim = soyIsim.substring(0).toUpperCase();
            System.out.println(isim + " " + soyIsim);
        }
    }
}
