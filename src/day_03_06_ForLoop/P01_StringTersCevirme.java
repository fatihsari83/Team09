package day_03_06_ForLoop;

import java.util.Scanner;

public class P01_StringTersCevirme {
    public static void main(String[] args) {
        /*
            Soru 9 (interview)- Kullanicidan bir String isteyin ve String’i tersten yazdirin.
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir metin giirniz");
        String mtn=scan.nextLine();
        String tersmtn="";
        for (int i = mtn.length(); i >=1 ; i--) {

            tersmtn+=mtn.substring(i-1,i);
        }
        System.out.println("Girilen metnin tersi :"+tersmtn);

    }
}
