package day_03_28_whileLoop;

public class P02 {
    public static void main(String[] args) {
        /*
            Soru 1- ’k’ harfinden ‘t’ harfine kadar harfleri yazdirin.
         */
        char harf = 'k';
        do {
            System.out.println(harf + " ");
            harf++;

        } while (harf <= 't');

    }
}
