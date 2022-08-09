package LoopPlusString;

public class UniqueCharachters {
    public static void main(String[] args) {


        String input="AABCCD";

        String output="";

        for (int i = 0; i < input.length(); i++) {

            char each= input.charAt(i);

            if(input.indexOf(each)==input.lastIndexOf(each)){

                output+=each;
            }

        }

        System.out.println("output = " + output);

    }
}
/*Write a program that can return the unique characters from a String

			Ex:
				input:
					AABCCD

				output:
					BD

			Hint: You will need indexOf() and lastIndexOf()
				  if the first and last index numbers of the character are same, then it's unique*/