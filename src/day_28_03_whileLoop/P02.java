package day_28_03_whileLoop;

public class P02 {
    public static void main(String[] args) {
        /*
        ’k’ harfinden ‘t’ harfine kadar harfleri yazdirin.
         */
        char harf = 'k';
        do {
            System.out.println(harf + " ");
            harf++;

        } while (harf <= 't');

    }
}
