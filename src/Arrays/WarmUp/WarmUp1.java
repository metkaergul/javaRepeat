package Arrays.WarmUp;

import java.util.Arrays;

public class WarmUp1 {

    public static void main(String[] args) {

        int[]numbers=new int[100];

        for (int i = 0; i <numbers.length ; i++) {

            numbers[i]=i+1;
        }
        System.out.println(Arrays.toString(numbers));


        int[] numbers2= new int[100];
        int j= 0;
        for (int i = numbers2.length-1; i >= 0 ; i--,j++) {
            numbers2[j]=i+1;
        }
        System.out.println(Arrays.toString(numbers2));

    }
}
/*1. create an array that has the numbers 1 to 100
	2. create an array that has the numbers 100 to 1*/