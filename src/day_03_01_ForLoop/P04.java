package day_03_01_ForLoop;

import java.util.Scanner;

public class P04 {
    public static void main(String[] args) {
        /*
        Soru 4- Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin,
                sinirlar dahil olarak aralarindaki tum sayilarin toplamini yazdirin.
                Bitis degeri baslangic degerinden kucuk olsa da program calissin
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen pozitif 2 tamsayi giriniz");
        int sayi1= scan.nextInt();
        int sayi2=scan.nextInt();
        int toplam=0;
        if (sayi1<sayi2){
            for (int i = sayi1; i <=sayi2 ; i++) {
                toplam+=i;

            }
            System.out.println(toplam);
        }else {
            for (int i = sayi2; i <=sayi1 ; i++) {
                toplam+=i;

            }
            System.out.println(toplam);


        }
    }
}
