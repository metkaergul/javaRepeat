package Arrays.WarmUp;

import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);

        System.out.println("enter number ten times in order");
        int []number= new int[10];
        for (int i = 0; i <10 ; i++) {
            int num= scan.nextInt();
            number[i]=num;
        }

        int max= number[0];

        for (int i = 0; i < number.length ; i++) {
            if(number[i]>max){

                max=number[i];
            }
        }
        System.out.println(max);




    }
}
/*3. Write a program that asks user to enter a number 10 times:
			1. store all user entered numbers in an array
			2. find the max number
			3. find the min number*/