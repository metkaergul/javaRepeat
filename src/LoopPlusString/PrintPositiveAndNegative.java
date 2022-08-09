package LoopPlusString;

import java.util.Scanner;

public class PrintPositiveAndNegative {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter five numbers in order");

        int sumPositive=0;
        int sumNegative= 0;
        for (int i = 0; i <5 ; i++) {
            int number= scan.nextInt();
            if(number>0){
                sumPositive++;

            }
            if(number<0){
                sumNegative++;
            }
        }

        System.out.println(sumPositive+" positive and "+sumNegative+" negative " );





    }
}
/*Write a program that asks user to enter number for 5 times, and print how many positive and negative numbers user entered
			Ex:
				Inputs:
					10
					20
					-1
					0
					3

				Output:
					3 positive and 1 negative
*/