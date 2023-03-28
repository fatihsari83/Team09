package day_03_20_ForLoop;

import java.util.Scanner;

public class P03_forLoop {
    public static void main(String[] args) {
        /*
            Soru 7- Kullanicidan pozitif bir tamsayi alip, rakamlar toplamini yazdirin.

         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen pozitif birtamsayi giriniz");
        int sayi= scan.nextInt();
        int toplam=0;

        for (int i = (sayi+"").length(); i >0 ; i--) {

            int birlerBasamagi=sayi%10;
            toplam+=birlerBasamagi;
            sayi/=10;
        }
        System.out.println("Rakamlar toplami :"+toplam);
    }
}
