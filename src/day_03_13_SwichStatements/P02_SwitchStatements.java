package day_03_13_SwichStatements;

import java.util.Scanner;

public class P02_SwitchStatements {
    public static void main(String[] args) {

        /*
             Soru 4- Kullanicidan ISTQB kisaltmasindan harfin anlamini ogrenmek istedigini alin
                     ve girilen harfin karsiligini yazdirin.
                     I : International S : Software T : Testing Q : Qualifications B: Board
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen anlamini ogrenmek istediginiz harfi giriniz");
        char krk = scan.next().charAt(0);
        krk = Character.toLowerCase(krk);
        switch (krk) {
            case 'i':
                System.out.println("International");
                break;
            case 's':
                System.out.println("Software");
                break;
            case 't':
                System.out.println("Testing");
                break;
            case 'q':
                System.out.println("Qualifications");
                break;
            case 'b':
                System.out.println("Board");
                break;
            default:
                System.out.println("Yanlis giris yaptiniz");

        }
    }
}
