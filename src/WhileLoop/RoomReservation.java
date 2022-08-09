package WhileLoop;

import java.util.Scanner;

public class RoomReservation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String output = "";

        System.out.println("Do you want to reserve a room");

        String answer = scan.nextLine();


        while (!(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no"))) {

            System.out.println("please re enter valid answer");
            answer = scan.nextLine();

        }

        if (answer.equalsIgnoreCase("yes")) {


            System.out.println("Which type of room do you want to reserve?");
            String roomType = scan.nextLine();

            while (!(roomType.equalsIgnoreCase("King Bed") || roomType.equalsIgnoreCase("Queen Bed") || roomType.equalsIgnoreCase("Single Bed"))) {
                System.out.println("please re enter room type");
                roomType = scan.nextLine();

            }
            if (roomType.equalsIgnoreCase("King bed")) {
                output = "King Bed==> 120$";
            } else if (roomType.equalsIgnoreCase("Queen Bed")) {
                output = "Queen Bed ==> 100$";

            } else {

                output = " single Bed ==> 80$";
            }
            System.out.println(output);

        } else {
            System.out.println("Have a nice day");
        }


    }

}




/*Create a class called RommReservation, write a program for the room reservation, your program asks the user wants to reserve a room.
    	if user entered yes, then ask which type of room the user wants to reserve. if user entered no, print "have a nice day"
    			(if user entered any invalid answer (other than yes/no) ask user to reenter until user provides a valid entry)

	            King Bed ==> 120$
	            Queen Bed ==> 100$
	            single Bed ==> 80$

            the program should be able to display the room he/she reserved and total price of the room.

            (if the user selected an invalid room, ask the user to reselect the room until user provides a valid entry)*/