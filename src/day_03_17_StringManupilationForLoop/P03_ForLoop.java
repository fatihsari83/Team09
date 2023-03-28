package day_03_17_StringManupilationForLoop;

import java.util.Scanner;

public class P03_ForLoop {
    public static void main(String[] args) {


    /*
            Soru 1- 1’den 100’e kadar sayilari ayni satirda aralarinda bir bosluk birakarak
                    yazdirin.
     */



       for (int i = 1; i <=100 ; i++) {
           System.out.print(i+" ");
        }

        /*
                Soru 2- Kullanicidan pozitif bir tamsayi alin,
                        1’den girilen sayiya kadar(girilen sayi dahil) 7 ila bolunebilen sayilari yazdirin.
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi giriniz");
        int sayi= scan.nextInt();

        for (int i = 1; i <=sayi ; i++) {

            if (i%7==0){
                System.out.print(i+" ");
            }

        }

    }


}
