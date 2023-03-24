package day_03_01_ForLoop;

import java.util.Scanner;

public class P03 {
    public static void main(String[] args) {

        /*
        Soru 3- Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin,
                  sinirlar dahil olarak aralarindaki tum sayilarin toplamini yazdirin.
                  Bitis degeri baslangic degerinden kucukse, uyari yazdirip islemi sonlandirin

         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen pozitif 2 tamsayi giriniz");
        int sayi1= scan.nextInt();
        int sayi2=scan.nextInt();
        int toplam=0;
        if (sayi2<sayi1){
            System.out.println("Gecersiz giris yaptiniz, lutfen tekrar deneyiniz");
        }else {
            for (int i = sayi1; i <=sayi2 ; i++) {
                toplam+=i;

            }
            System.out.println(toplam);
        }
    }
}
