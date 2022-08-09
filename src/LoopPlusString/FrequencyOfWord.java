package LoopPlusString;

public class FrequencyOfWord {
    public static void main(String[] args) {

        String sentence= "Java JavakJava";

        int freq= 0;

        for (int i = 0; i < sentence.length()-3; i++) {

           if( sentence.substring(i,i+4).equals("Java")){

               freq++;
           }

        }
        System.out.println(freq);


    }
}
/*write a program that can return the frequency of the  word 'Java' from the sentence

        Ex:
            sentence = "Java Java";

            output:
                2

            Hint: you need to create */