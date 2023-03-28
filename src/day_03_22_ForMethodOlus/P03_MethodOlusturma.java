package day_03_22_ForMethodOlus;

import java.util.Scanner;

public class P03_MethodOlusturma {
    public static void main(String[] args) {



    /*
            Soru 2- Kullanicidan main method icinde ayri ayri isim ve soyismini alin
                    Isim ve soyismi ilk harfleri buyuk diger harfler kucuk olacak sekilde duzenleyip,
                    isim bosluk soyisim seklinde bize donduren bir method olusturun
                    input : isim : Ali soyisim :YILMAZ. output : Ali Yilmaz
     */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz");
        String isim = scan.nextLine();
        System.out.println("Lutfen soyisminizi giriniz");
        String soyisim = scan.nextLine();


        String yazdirma = isimSoyisimYazdirma(isim, soyisim);
        System.out.println(yazdirma);


    }

    public static String isimSoyisimYazdirma(String isim, String soyisim) {
        String sonuc = "";
        //isim= isim.toUpperCase().charAt(0);
        isim = isim.substring(0, 1).toUpperCase() + isim.substring(1).toLowerCase();
        soyisim = soyisim.substring(0, 1).toUpperCase() + soyisim.substring(1).toLowerCase();
        sonuc = isim + " " + soyisim;

        return sonuc;

    }
}
