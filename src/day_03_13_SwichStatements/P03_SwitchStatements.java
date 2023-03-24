package day_03_13_SwichStatements;

import java.util.Scanner;

public class P03_SwitchStatements {
    public static void main(String[] args) {
        /*
            Soru 5- Kullanicidan gun numarasini alip hafta ici veya hafta sonu yazdirin

         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen gun numarasini giriniz");

        int sayi = scan.nextInt();

        switch (sayi) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Hafta ici");
                break;
            case 6:
            case 7:
                System.out.println("Hafta sonu");
                break;
            default:
                System.out.println("Yanlis giris");
        }


    }
}
