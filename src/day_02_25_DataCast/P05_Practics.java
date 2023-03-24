package day_02_25_DataCast;

import java.util.Scanner;

public class P05_Practics {
    public static void main(String[] args) {

        //Soru 5- Kullanicidan bir double, bir tamsayi alin,
        //        double sayiyi ikinci sayiya bolun
        //        ve bolum isleminin sonucununun tamsayi kismini yazdirin.

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen 2 adet tamsayi giriniz");

        double db = scan.nextDouble();
        int in = scan.nextInt();
        int sonuc = (int) (db / in);
        System.out.println("Sonuc :" + sonuc);
    }
}
