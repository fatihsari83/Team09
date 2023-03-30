package day_30_03_Arrays;

public class P02 {
    public static void main(String[] args) {

        /*
        Soru 2-Verilen bir array’deki pozitif tamsayilari toplayip sonucu bize donduren bir method yaziniz.
         */

        int [] arr={5,12,-9,12,-6};

        System.out.println(sayiTopla(arr));

    }

    private static int sayiTopla(int [] arr) {
        int toplam=0;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]>0){
                toplam+=arr[i];

            }
        }
        return toplam;
    }
}
