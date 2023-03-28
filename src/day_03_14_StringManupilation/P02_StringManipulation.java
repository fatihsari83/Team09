package day_03_14_StringManupilation;

import java.util.Scanner;

public class P02_StringManipulation {
    public static void main(String[] args) {

        /*
             Soru 2 : Kullanicidan bir String ve aranacak metin alin.
                      Aranan metnin String icerisinde kullanimini kontrol ederek asagidaki cumlelerden uygun olanini yazdirin.
                    - String aranan metni icermiyor
                    - Aranan metin String’de sadece 1 kere kullanilmis
                    - Aranan metin String’de sadece 1’den fazla kullanilmis
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz");
        String cumle = scan.nextLine();
        System.out.println("Lutfen cumlede aranacak metni giriniz");
        String metin = scan.next();
        if (!cumle.contains(metin)) {
            System.out.println("Aradiginiz kelime cumlede kullanilmaistir");
        } else if (cumle.indexOf(metin) == cumle.lastIndexOf(metin)) {
            System.out.println("Kelime cumlede bir defa kullanilmistir");

        } else {
            System.out.println("Birden fazla kullanilmistir");
        }

    }
}
