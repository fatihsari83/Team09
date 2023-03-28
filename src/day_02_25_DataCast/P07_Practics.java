package day_02_25_DataCast;

import java.util.Scanner;

public class P07_Practics {
    public static void main(String[] args) {
        //Soru 3- Kullanicidan bir sayi alin,
        //        sayi 3 ile bolunuyorsa ”Uc ile bolunebilen sayi”,
        //        5 ile bolunebiliyorsa “Bes ile bolunebilen sayi” yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 1 sayi giriniz");
        int sayi = scan.nextInt();

        if (sayi % 3 == 0 && sayi %5 == 0) {
            System.out.println("Uc ve bes ile bolunebilen sayi ");
        } else if (sayi %5 == 0){
            System.out.println("Bes ile bolunebilen sayi");
        }else if (sayi % 3 == 0){
            System.out.println("Uc ile bolunebilen sayi");
        }else {
            System.out.println("Sayi 3 ve 5 ile bolunemez");
        }

    }
}
