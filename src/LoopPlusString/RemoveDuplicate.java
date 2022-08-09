package LoopPlusString;

public class RemoveDuplicate {
    public static void main(String[] args) {

        String input= "AABBCCBC";
        String output="";

        for (int i = 0; i <input.length()-1 ; i++) {

            char each= input.charAt(i);

            if(!(output.contains(""+each))){

                output+=each;

            }

        }
        System.out.println("output = " + output);


    }
}
/*Write a program that can remove the duplicated characters from a String
			Ex:
				input:
					AABBCCBC

				Output:
					ABC

			Hint: You can add each characters of the string into another String
				  Condition: the character is not contained in the other String yet before you are adding*/