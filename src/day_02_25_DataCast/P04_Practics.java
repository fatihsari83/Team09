package day_02_25_DataCast;

import java.util.Scanner;

public class P04_Practics {
    public static void main(String[] args) {
        //Soru 4- Kullanicidan iki double sayi alin,
        //        ilk sayiyi ikinci sayiya bolun ve bolum
        //        isleminin sonucununun tamsayi kismini yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 2 adet sayi giriniz");

        double db1 = scan.nextDouble();
        double db2 = scan.nextDouble();
        int bol = (int) (db1 / db2);
        System.out.println("Bolum :" + bol);
    }
}
