package CustomMethods.MethodOverloading;

import java.util.Arrays;

public class MergeArrays {


    public static void main(String[] args) {
        int[]array1= {1,2,3,4,5};
        int[]array2={6,7,8,9};

        mergeArrays(array1,array2);

        double[]array3= {1.3,2.5,3.1,4.7,5.4};
        double[]array4={6.3,7.2,8.1,9.6};
        mergeArrays(array3,array4);
    }


    public static void mergeArrays(int[]arr1,int[]arr2){

        int[]arrMerged=new int[arr1.length+ arr2.length];

        int iter=0;

        for (int each : arr1) {
            arrMerged[iter++]=each;
        }
        for (int each : arr2) {
            arrMerged[iter++]=each;
        }
        System.out.println(Arrays.toString(arrMerged));



    }
    public static void mergeArrays(double[]arr1,double[]arr2){

        double[]arrMerged=new double[arr1.length+ arr2.length];

        int iter=0;

        for (double each : arr1) {
            arrMerged[iter++]=each;
        }
        for (double each : arr2) {
            arrMerged[iter++]=each;
        }
        System.out.println(Arrays.toString(arrMerged));



    }


}
/*1. create a method that can merge two integer arrays.

	2. create a method that can merge two double arrays.

	3. create a method that can merge two char arrays.

	4. create a method that can merge two String arrays.
*/