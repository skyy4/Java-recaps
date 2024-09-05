package basics;

import java.util.Arrays;

public class arrays {
   public static void main(String[] args) {
//        int [] numbers = new int [5];
//        numbers[0]=1;
//        numbers[1]=2;
        int [] numbers = {1,4,2,7,4,5};
       System.out.println(numbers.length);
       Arrays.sort(numbers);
        System.out.println( Arrays.toString(numbers));
    }
}
