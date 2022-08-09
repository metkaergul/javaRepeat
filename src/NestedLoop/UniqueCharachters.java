package NestedLoop;

public class UniqueCharachters {
    public static void main(String[] args) {

        String str= "aabccdeef";
        String output="";

        for (int i = 0; i <str.length() ; i++) {
            int freq= 0;
            char outer =str.charAt(i);
            for (int j = 0; j <str.length() ; j++) {
                char inner= str.charAt(j);

                if(inner==outer){

                    freq++;
                }

            }
            if(freq==1){
                output+=outer;
            }


        }
        System.out.println(output);

    }
}
/*Write a program that can find the unique characters from a string without using index() and lastIndexOf() methods

    			Ex:
                        str = "aabccdeef";

                        output:
                                bdf

            Hint: if you find out how to find the frequency of one character, then you can repeat it for the remaining characters to find the frequency.
            		if frequency of a character == 1  =========> unique
*/