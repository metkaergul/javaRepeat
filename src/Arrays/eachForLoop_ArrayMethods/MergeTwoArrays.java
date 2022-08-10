package Arrays.eachForLoop_ArrayMethods;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MergeTwoArrays {
    public static void main(String[] args) {

        int[]arr1={1,2,3,4};
        int[]arr2={5,6};
        int size1=arr1.length;
        int size2=arr2.length;


            int merged[]=new int[size1+size2];
        int i= 0;
        for (int each : arr1) {
            merged[i++]=each;
        }
        for (int each : arr2) {
            merged[i++]=each;
        }
        System.out.println(Arrays.toString(merged));

    }
}
/* write a program that can merge two arrays of integers
		Ex:
			arr1 = {1,2,3,4}
			arr2 = {5,6}

		output
			arr3 = {1,2,3,4,5,6}*/