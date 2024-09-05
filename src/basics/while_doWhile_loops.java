package basics;

import java.util.Scanner;

public class while_doWhile_loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = "";
        while(!input.equals("quit")){
            System.out.print("Input : ");
            input = sc.next().toLowerCase();
            System.out.println(input);
        }

//        do{
//            System.out.print("Input : ");
//            input = sc.next().toLowerCase();
//            System.out.println(input);
//        }while(!input.equals("quit"));
    }
}
