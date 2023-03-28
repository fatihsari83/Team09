package day_03_17_StringManupilationForLoop;

import java.util.Scanner;

public class P04_ForLoop {
    public static void main(String[] args) {

        /*
                Soru 3- Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin,
                        sinirlar dahil olarak aralarindaki tum sayilarin toplamini yazdirin.
                        Bitis degeri baslangic degerinden kucukse, uyari yazdirip islemi sonlandirin

         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen toplanmasini istediginiz sayilardan baslangic degerini giriniz");
        int sayi1 = scan.nextInt();
        System.out.println("Lutfen bitis degerini giriniz");
        int sayi2 = scan.nextInt();
        int toplam = 0;
        if (sayi1 < sayi2) {
            for (int i = sayi1; i <= sayi2; i++) {
                toplam += i;

            }
            System.out.println("Sonuc :" + toplam);
        } else {
            System.out.println("Yanlis giris yaptiniz");
        }
    }
}
