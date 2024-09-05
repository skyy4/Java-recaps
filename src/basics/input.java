package basics;

import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.print("Age : ");
//        byte age = sc.nextByte();
//        System.out.println("Your age " + age );

        System.out.print("name : ");
        String name = sc.nextLine().trim();
        System.out.println("Your name " + name );
    }
}
