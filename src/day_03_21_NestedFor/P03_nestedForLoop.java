package day_03_21_NestedFor;

public class P03_nestedForLoop {
    public static void main(String[] args) {

        /*

        Soru - Asagidaki sekli olusturan bir program yazin

                *  *  *  *  *  *
                *  *  *  *  *  *
                *  *  *  *  *  *
                *  *  *  *  *  *
                *  *  *  *  *  *

         */
        int satir = 5;
        int sutun = 6;

        for (int i = 1; i <= satir; i++) {
            for (int j = 1; j <= sutun; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
