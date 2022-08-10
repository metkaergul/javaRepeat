package Arrays.eachForLoop_ArrayMethods;

import java.util.Arrays;

public class DescendingSort {

    public static void main(String[] args) {

        int[]array={3,5,2,7,6};

        Arrays.sort(array);

        int[]descendingArray=new int[array.length];

                int j=0;
        for (int i = array.length - 1; i >= 0; i--) {
            descendingArray[j++]=array[i];
        }
        System.out.println(Arrays.toString(descendingArray));

    }
}
/*Write a program that sort the array of integer in descending order*/