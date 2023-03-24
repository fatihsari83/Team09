package day_03_20_ForLoop;

import java.util.Scanner;

public class P05_forLoop {
    public static void main(String[] args) {
        /*
            Soru 9 (interview)- Kullanicidan bir String isteyin ve String’i tersten yazdirin.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir ifade giriniz");
        String cumle = scan.nextLine();
        String tersCumle = "";

        for (int i = cumle.length() - 1; i >= 0; i--) {
            tersCumle += cumle.charAt(i);

        }
        System.out.println(tersCumle);
    }
}
