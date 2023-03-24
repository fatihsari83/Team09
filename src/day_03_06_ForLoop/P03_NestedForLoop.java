package day_03_06_ForLoop;

public class P03_NestedForLoop {
    public static void main(String[] args) {
        /*
        Soru – Asagidaki sekilleri yazdirin

              * * * * * * * *
              * * * * * *
              * * * *
              * *
         */
        int satirSayisi = 4;
        int sutunSayisi = 8;

        int sembol = 8;   //Yıldız sembolümüzün program başlangıçında, 9 tane yıldız yazdıracağını belirtiriz.

        for (int i = 0; i < satirSayisi; i++) {

            for (int j = 0; j < sutunSayisi; j++) {

                System.out.print("* ");
            }
            System.out.println("");
            sutunSayisi -= 2;
        }
    }
}




