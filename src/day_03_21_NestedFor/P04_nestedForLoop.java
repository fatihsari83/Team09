package day_03_21_NestedFor;

public class P04_nestedForLoop {
    public static void main(String[] args) {
        /*
        Soru - Asagidaki sekli olusturan bir program yazin

                *  *  *  *  *  *  *  *
                *  *  *  *  *  *
                *  *  *  *
                *  *

         */
        int satir = 4;
        int sutun = 8;

        for (int i = 1; i <= satir; i++) {

            for (int j = 1; j <= sutun; j++) {

                System.out.print("* ");
            }
            sutun -= 2;
            System.out.println("");
        }
    }

}
