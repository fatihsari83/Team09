package day_03_01_ForLoop;

import java.util.Scanner;

public class P06 {
    public static void main(String[] args) {
        /*
        Soru 6- Kullanicidan 20’den kucuk bir sayi alip,
                bu sayinin faktoryel degerini hesaplayin.
                Konsolda faktoryel hesabinin yapilisini da yazdirin.
                Or : 6! = 6 * 5 * 4 * 3 * 2 * 1 = 720

         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen pozitif 20'den kucuk bir tamsayi giriniz");
        int sayi= scan.nextInt();
        int faktoryel=1;
        System.out.print(sayi+ " ! = ");
        for (int i = sayi; i >=1 ; i--) {
            faktoryel*=i;
            if (i>1){
                System.out.print(i+" * ");
            }else {
                System.out.print(i+" ");
            }
            

        }
        System.out.print("= "+faktoryel);
    }
}
