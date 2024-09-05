package project;

import java.text.NumberFormat;
import java.util.Scanner;

public class mortgageCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int principal=0;
        float rate = 0;
        float r = 0;
        int n = 0;
       while(true){
           System.out.print("Principal : ");
           principal = sc.nextInt();
           if(principal>=1000  && principal<=100_000)
               break;
           System.out.println("Enter a value between 1000 and 100000");
       }
       while(true){
           System.out.print("Annual Interest Rate  : ");
            rate = sc.nextFloat();
           if(rate>=1  && rate<=30){
               r = (rate/100/12);
               break;
           }
           System.out.println("Enter a value between 1 and 30");

       }
       while(true){
           System.out.print("Period (Years) : ");
           int year = sc.nextInt();
           if(year>=1  && rate<=25) {
               n = year * 12;
               break;
           }
           System.out.println("Enter a value between 1 and 35");
       }
        var pow = Math.pow(1 + r,n);
        double mortgage = principal * (r*pow)/(pow-1);
        String result = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage : "+ result);

    }
}
