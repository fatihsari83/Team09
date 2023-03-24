package day_03_14_StringManupilation;

import java.util.Scanner;

public class P01_StringManipulation {
    public static void main(String[] args) {
        /*
            Soru 1 : Kullanicidan bir String ve aranacak metin alin.
                     String’in aranan metni icerip icermedigini indexOf( ) method’u kullanarak yazdirin.
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen bir cumle giriniz");

        String cumle = scan.nextLine();

        System.out.println("Lutfen cumlede arancak metni giriniz");

        String metin = scan.next();

        if (cumle.contains(metin)) {

            System.out.println(cumle.indexOf(metin));

        } else {

            System.out.println("Aradigiiz kelime cumlede bulunmamaktadir");

        }
    }
}
