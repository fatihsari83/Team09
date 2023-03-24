package day_03_15_Team09_StringMan;

public class P02_StringMan {
    public static void main(String[] args) {

        /*
                Soru 2 : Kullanicinin belirli bir formatta verdigi String fiyatlari toplayip yazdirin.
                         input1 : “15.30 €” ,
                         input2 : “11.40 €”
                         output : 36.70 €
         */


        String input1 = "15.30 €";
        String input2 = "11.40 €";
        double output = 0;
        input1 = input1.replaceAll("\\D", "");
        input2 = input2.replaceAll("\\D", "");

        System.out.println(input1);
        System.out.println(input2);
        double db1 = Double.parseDouble(input1);
        double db2 = Double.parseDouble(input2);
        System.out.println((db1 + db2) / 100 + " €");


    }
}
