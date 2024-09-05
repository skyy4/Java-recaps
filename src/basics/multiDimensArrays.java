package basics;

import java.util.Arrays;

public class multiDimensArrays {
    public static void main(String[] args) {
//        int [] [] numbers = new int[2][3];
//        numbers[0][0]=0;
//        numbers[0][1]=1;
//        numbers[0][2]=0;
//        numbers[1][0]=0;
//        numbers[1][1]=1;
//        numbers[1][2]=0;

        int [] [] numbers = {{0,1,0},{0,1,0}};


        System.out.println(Arrays.deepToString(numbers));
    }
}
