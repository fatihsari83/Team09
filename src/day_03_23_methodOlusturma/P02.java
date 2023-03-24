package day_03_23_methodOlusturma;

import java.util.Scanner;

public class P02 {
    public static void main(String[] args) {
        /*
            Soru 4- Kullanicidan main method icinde bir tamsayi alin.
                    Girilen sayinin pozitif tam bolenleri sayisini bulup bize donduren bir method olusturun.
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz");
        int sayi= scan.nextInt();
        int tamBolen=pozitifTamBolenler(sayi);
        System.out.println(sayi+" sayisinin pozitif tam bolen sayisi :"+tamBolen);
    }

    public static int pozitifTamBolenler(int sayi) {
        int tamBolen=0;
        for (int i = 1; i <sayi ; i++) {
            if (sayi%i==0){
                tamBolen++;

            }
        }
        return tamBolen;

    }
}
