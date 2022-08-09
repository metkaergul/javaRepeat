package WhileLoop;

import java.util.Scanner;

public class SumOfTheNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a number");


        boolean flag = true;

        int sum = 0;

        while (flag) {

            int number = scan.nextInt();
            if (number > 0) {
                sum += number;
            } else {

                flag = false;
            }


        }
        System.out.println(sum);

    }
}

/*Write a program that calculates the sum of numbers entered by the user until user enters a negative number.

            hint: you need an infinite loop*/