package ForLoop;

public class ReturnSumOfDigits {
    public static void main(String[] args) {

        String input= "A1B2C3";
        int output=0;

        for (int i = 0; i < input.length(); i++) {

            if(input.charAt(i)>='1'&&input.charAt(i)<='9'){

                output+=input.charAt(i)-48; //48 represent '0' on the ascii table then we need to use it for converting char digits to number
            }
        }
        System.out.println(output);


    }
}
/*Write a program that can return the sum of digits from a  string
             Ex:
                 input: A1B2C3

                 output:    6

             Hint: You need to get each of the character by using a loop
	             	To convert char to number:
						             	   '0' - 48   ==> 0
						             	   '1' - 48   ==> 1
						             	   		...*/