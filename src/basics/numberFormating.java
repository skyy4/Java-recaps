package basics;

import java.text.NumberFormat;

public class numberFormating {
    public static void main(String[] args) {
//        NumberFormat currency = NumberFormat.getCurrencyInstance();
//        String result = currency.format(123459.34);

//        NumberFormat percent =NumberFormat.getPercentInstance();
//        String result = percent.format(.9);

       String result =  NumberFormat.getPercentInstance().format(0.3);


       System.out.println(result);
    }
}

