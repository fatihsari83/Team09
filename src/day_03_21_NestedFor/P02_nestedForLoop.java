package day_03_21_NestedFor;

public class P02_nestedForLoop {
    public static void main(String[] args) {
        /*
            Soru - Asagidaki sekli yazdiran bir program yaziniz,

                *
                *   *
                *   *   *
                *   *   *   *


         */

        int satirSayisi = 4;
        int sutunSayisi = 4;

        for (int i = 1; i <= satirSayisi; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");

            }
            System.out.println("");

        }
    }
}
