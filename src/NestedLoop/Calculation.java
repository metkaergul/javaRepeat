package NestedLoop;

import java.util.Scanner;

public class Calculation {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        boolean flag =true;
        while (flag) {

            int result= 0;
            System.out.println("enter first number");
            int num1 = scan.nextInt();
            System.out.println("enter a math operator");
            char oper = scan.next().charAt(0);
            while (!(oper == '+' || oper == '-' || oper == '*' || oper == '/')) {
                System.out.println("please enter valid operatoer");
                oper = scan.next().charAt(0);
            }
            System.out.println("enter second number");
            int num2 = scan.nextInt();

            result = (oper == '+') ? num1 + num2 : (oper == '-') ? num1 - num2 : (oper == '*') ? num1 * num2 : num1 / num2;

            System.out.println(result);

            System.out.println("would you like to continue?");
            String answer = scan.next().toLowerCase();
            while (!(answer.equals("yes") || answer.equals("no"))) {
                System.out.println("re enter your answer");
                answer = scan.next();

            }
            if (answer.equals("no")) {
                System.out.println("Thanks for using Cydeo calculator!");
                flag=false;
            }

        }





    }
}
/*Write a program that can calculate two numbers.
			1. Ask user to enter the first number
			2. Ask user to enter a math operator (+,-,/,*)
				(if user enters any invalid operator, repeat this step until user provides a valid operator)
			3. Ask user to enter the second number
			4. Display the result
			5. Ask user if they want to continue? (yes/no)
				if yes ==> repeat the entire steps
				if no ==> print "Thanks for using Cydeo calculator!"
				If user enters any invalid entry,  ask the user to re-enter until user provides a valid entry*/