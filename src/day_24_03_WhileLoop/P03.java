package day_24_03_WhileLoop;

public class P03 {
    public static void main(String[] args) {
        /*
                Soru 3- While loop kullanarak verilen bir String’i terse cevirip,
                        bu halini bize donduren bir method olusturun.
         */


        String metin = "İnsallah kurstan sonra is buluruz";

        String tersMetin = metniTersCevir(metin);
        System.out.println(tersMetin);
    }

    public static String metniTersCevir(String metin) {

        String tersMetin = "";
        int a = metin.length() - 1;

        while (a >= 0) {
            tersMetin += metin.charAt(a);
            a--;

        }
        return tersMetin;
    }
}
