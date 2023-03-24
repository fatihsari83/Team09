package day_03_17_StringManupilationForLoop;

import java.util.Scanner;

public class P02_StringMan {
    public static void main(String[] args) {
        /*
                Soru 6 : Kullanicidan alinan bir String alin,
                         String’in uzunlugu cift sayi ise tam ortasina :) ekleyin,
                         String’in uzunlugu tek sayi ise ortadaki harfi silin ve yerine :( yazdirin.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir cümle giriniz");
        String input = scan.nextLine();
        int uzunluk = input.length();

        if (uzunluk % 2 == 0) {
            int mid = uzunluk / 2;
            input = input.substring(0, mid) + ":)" + input.substring(mid);
        } else {
            int mid = uzunluk / 2;
            input = input.substring(0, mid) + ":(" + input.substring(mid + 1);
        }
        System.out.println("sonuç:" + input);

    }
}
