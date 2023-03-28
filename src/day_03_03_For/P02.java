package day_03_03_For;

import java.util.Scanner;

public class P02 {
    public static void main(String[] args) {
        /*
         //Soru 10 (interview)- Kullanicidan bir String isteyin
        //                      ve String’i tersine cevirip kaydedin.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir kelime giriniz");
        String metin = scan.nextLine();
        String yeniMetin = "";
        for (int i = metin.length() - 1; i >= 0; i--) {
            yeniMetin += metin.charAt(i);
        }
        System.out.println(yeniMetin);

    }
}
