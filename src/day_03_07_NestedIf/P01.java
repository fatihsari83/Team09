package day_03_07_NestedIf;

import java.util.Scanner;

public class P01 {
    public static void main(String[] args) {
        /*
            Soru 2- Kullanicidan aldigi urun adedi ve ve liste fiyatini alin,
                    kullaniciya musteri karti olup olmadigini sorun.
                    Musteri karti varsa 10 urunden fazla alirsa %20, yoksa %15 indirim yapin,
                    Musteri karti yoksa 10 urunden fazla alirsa %15, yoksa %10 indirim yapin
         */


        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen urun adedini giriniz");
        int urunAdedi= scan.nextInt();
        System.out.println("Lutfen liste fiyatini giriniz");
        int listeFiyati= scan.nextInt();
        System.out.println("Musteri kartiniz varsa true, yoksa false yaziniz");
        boolean musteriKarti= scan.nextBoolean();
        double toplam= 0;
        if (musteriKarti==true){
            if (urunAdedi>=10){
                toplam=(urunAdedi*listeFiyati*0.8);
            }else {
                toplam=(urunAdedi*listeFiyati*0.8);
            }
            System.out.println("Toplam fiyat :"+toplam);
        } else if (musteriKarti==false) {
            if (urunAdedi>=10){
                toplam=(urunAdedi*listeFiyati*0.85);
            }else {
                toplam=(urunAdedi*listeFiyati*0.9);
            }
            System.out.println("Toplam fiyat :"+toplam);

        }

    }
}
