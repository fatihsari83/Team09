package day_16_03_Team09;

import java.util.Locale;
import java.util.Scanner;

public class P01_StringMan {
    public static void main(String[] args) {

        /*
             Soru 3 : Kullanicidan alinan metindeki istenmeyen rakam ve ozel karakterleri silip,
                      sadece ilk harfi buyuk diger harfler kucuk harf yapan bir program yazin.
                      input : java1 ogRe2@nMek3 #ne +Gu=zel
                      output : Java ogrenmek ne guzel.
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz");
        String cumle=scan.nextLine();
        cumle=cumle.toLowerCase(Locale.ROOT);

        cumle=cumle.replaceAll("[^a-z]","");
        //cumle=cumle.replaceAll(" ","5");


        System.out.println(cumle);
        //cumle=cumle.replaceAll()

    }
}
