package ForLoop;

public class Palindrome {
    public static void main(String[] args) {

        String input="anna";
        String reverse= "";

        boolean palindrome=false;

        for (int i = input.length()-1; i>=0 ; i--) {

            reverse+=input.charAt(i);

        }
        if(input.equals(reverse)){
            palindrome=true;
        }
        System.out.println("palindrome = " + palindrome);

    }
}
/*Write a program that can check if the given String is palindrome

			Ex:
				input:
					Level

				output:
					true


				input:
					Anna

				output:
					true
*/