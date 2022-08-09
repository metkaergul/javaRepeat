package Arrays.WarmUp;

import java.util.Scanner;

public class AverageNumber {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);


        System.out.println("How many numbers you want to enter");
        int size=scan.nextInt();
        System.out.println("press  the numbers that you want to collect");
        int[]numbers= new int[size];
        for (int i = 0; i <size ; i++) {
            int num= scan.nextInt();
            numbers[i]=num;
        }
        int averageNumber= 0;
        int sum= 0;

        for (int i = 0; i <numbers.length ; i++) {
            sum+=numbers[i];
        }
        averageNumber=sum/numbers.length;

        System.out.println(averageNumber);
    }


}
/*
	4. AverageNumber:
			1. Ask the user how many numbers they want to enter
			2. get all the inputs from the user and store them into an array
			3. Iterate the array & return the average number
*/