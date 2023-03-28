package day_02_25_DataCast;

import java.util.Scanner;

public class P06_Practics {
    public static void main(String[] args) {
        //Soru 1- Kullanicidan bir sayi isteyin,
        //        sayiyi kontrol edip 5 ile bolunebiliyorsa
        //        “Sayi 5’in tam kati” yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen 1 sayi giriniz");
        int sayi=scan.nextInt();

        if (sayi%5==0){
            System.out.println("Sayi 5’in tam kati");
        }
        System.out.println("=========");

        System.out.println(sayi%5==0 ?"Sayi 5’in tam kati": "Sayi 5'in kati degildir");

    }
}
