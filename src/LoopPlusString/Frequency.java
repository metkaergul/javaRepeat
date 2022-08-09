package LoopPlusString;

import java.util.Scanner;

public class Frequency {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("enter a string");
        String str= scan.nextLine();
        System.out.println("enter a char");
        char ch= scan.nextLine().charAt(0);
        int freq= 0;
        for (int i = 0; i <str.length() ; i++) {

            if(str.charAt(i)==ch){
                freq++;
            }

        }
        System.out.println(ch+" occurred "+freq+" time "+" in the given "+"\'"+str+"\'");

    }
}
/*Write a program that asks user to entera string and a char, the returns the frequency of the char from the given string
            Ex:
                inputs:
                    str = "aabcccd";
                    char = 'c';

                output: 3

                inputs:
                    "Java programming language"
                    'g'

                output: 4*/