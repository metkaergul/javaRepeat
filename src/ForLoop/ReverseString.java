package ForLoop;

public class ReverseString {
    public static void main(String[] args) {

        String input = "Wooden Spoon";
        String output="";
        for (int i = input.length()-1; i >=0; i--) {

            output+=input.charAt(i);

        }

        System.out.println("output = " + output);


    }
}
/*Write a program that can reverse any given string

			Ex:
				input:
					Wooden Spoon

				output:
					noopS nedooW*/