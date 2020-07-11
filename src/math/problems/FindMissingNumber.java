package math.problems;


import java.util.List;

/**
 * Created by mrahman on 04/22/17.
 */
public class FindMissingNumber {


    public static void main(String[] args) {
        /*
         * If n = 10, then array will have 9 elements in the range from 1 to 10.
         * For example {10, 2, 1, 4, 5, 3, 7, 8, 6}. One number will be missing in array (9 in this case).
         * Write java code to find the missing number from the array. Write static helper method to find it.
         */
        int[] array = new int[]{10, 2, 1, 4, 5, 3, 7, 8, 6};


        Integer[] input = {10, 2, 1, 4, 5, 3, 7, 8, 6};

        int max = calculateArrayMaxValue(input);


        int[] copyArray = new int[100];

        for(int i : input) {
            copyArray[i] = 1;
        }

        System.out.print("Missing numbers in an array are : ");

        for(int i=1 ;i <= max; i++){
            if(copyArray[i]==0)
                System.out.print(i + " ");
        }
    }

    public static int calculateArrayMaxValue(Integer[] input) {

        int max = input[0];

        for (int i = 1; i < input.length; i++)
            if (input[i] > max)
                max = input[i];

        return max;



    }



}
