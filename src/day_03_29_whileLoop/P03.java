package day_03_29_whileLoop;

import java.util.Scanner;

public class P03 {
    public static void main(String[] args) {
        /*
        Soru 3- Kullanicidan bir pozitif sayi isteyin, sayının tam kare olup olmadığını bulunuz,
                tamkare ise true değilse false yazdırınız.
                Ornek : input : 16, output: 4v
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz");
        int sayi = scan.nextInt();
        int flag = 0;

        for (int i = 1; i < sayi; i++) {
            if (sayi == i * i) {
                System.out.println("True");
                flag++;
            }
        }
        if (flag == 0) {
            System.out.println("False");
        }

    }
}
