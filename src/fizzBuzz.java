import java.sql.SQLOutput;
import java.util.Scanner;

public class fizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number :");
        int number = sc.nextInt();
        if(number%3==0 && number%5==0) {
            System.out.println("fizzbuzz");
        }else if(number%5==0){
            System.out.println("fizz");
        } else if (number%3==0) {
            System.out.println("buzz");
        }else
            System.out.println(number);

    }
}
