package LoopPlusString;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultiplyWithoutMultOperator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("enter two positive number in order");
        int num1= scan.nextInt();
        int num2= scan.nextInt();

        if(num1<0||num2<0){
            System.out.println("Invalid numbers");

        }

        int output=0;
        for (int i = 0; i < num2; i++) {

            output+=num1;
        }
        System.out.println(output);

    }
}
/*Write a program that asks user to enter two positive numbers,
     then multiply those two numbers without using multiplication (*) operator.
        if user enters any negative numbers, print Invalid

            Ex:
                inputs:
                    10
                    20

                output:
                    200*/