package NestedLoop;

public class Frequency {
    public static void main(String[] args) {

        String str="aabcccd";

        String output= "";



        for (int i = 0; i <str.length() ; i++) {
            int freq= 0;
            String outer =""+str.charAt(i);
            for (int j = 0; j < str.length(); j++) {
                String inner=""+ str.charAt(j);

                if(outer.equals(inner)){
                    freq++;
                }

            }
            if(!output.contains(outer)){
                output+=outer;
                output+=freq;
            }


        }
        System.out.println(output);

    }
}
/*Write a program that can find the frequency of the characters from a string

			 Ex:
                        str = "aabcccd";

                        output:
                                a2b1c3d1


            Hint: if you find out how to find the frequency of one character, then repeat it for all the remaining characters*/