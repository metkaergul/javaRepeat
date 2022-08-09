package ForLoop.WarmUp;

import java.util.Scanner;

public class WarmUp3 {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        System.out.println("enter your first name");
        String firstName= scan.nextLine().toLowerCase();
        System.out.println("enter your last name");
        String lastName= scan.nextLine().toLowerCase();

        String fullName= firstName.substring(0,1).toUpperCase()+firstName.substring(1)+" "+
                lastName.substring(0,1).toUpperCase()+lastName.substring(1);

        System.out.println("fullName = " + fullName);



    }
}
/*3. Write a program that asks user to enter first and last names, and then prints the full name in regular format (first character in upper case)

                    input:
                        firstName = "cyDEo"
                        lastName = "SCHOOL";

                    output:
                        Cydeo School
*/