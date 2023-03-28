package day_03_22_ForMethodOlus;

public class P02_MethodOlusturma {
    public static void main(String[] args) {
        /*
            Soru 1- Kullanicidan input olarak verilen bir String, 
                    baslangic ve bitis indexlerine gore baslangic index'i dahil, 
                    bitis index'i haric olacak sekilde aradaki harfleri yazdiran bir method olusturun.
                    - kullanici baslangic degeri olarak, bitis degerinden buyuk bir sayi girerse, hata mesaji verin
                    - kullanici str'da olan index'lerden daha buyuk bir index girerse hata mesaji
                    yazdirin.
         */
        indexYazdirma("Ali CANDIR",5,9);
        
    }

    public static void indexYazdirma (String metin, int baslangicIndex, int bitisIndex) {

        if (baslangicIndex > bitisIndex) {
            System.out.println("Hata");
        } else if (metin.length() < baslangicIndex || metin.length() < bitisIndex) {
            System.out.println("Hata veriyor");

        } else {
            metin = metin.substring(baslangicIndex, bitisIndex);
            System.out.println(metin);

        }

    }
}
