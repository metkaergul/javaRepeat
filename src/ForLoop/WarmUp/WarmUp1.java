package ForLoop.WarmUp;

import java.util.Scanner;

public class WarmUp1 {
    public static void main(String[] args) {

        System.out.println("Enter a word");
        String word= new Scanner(System.in).nextLine();
//
//        if(word.startsWith("x")){
//            char firstWord=word.charAt(0);
//            firstWord='a';
//            word=""+firstWord+word.substring(1);
//        }
        if(word.startsWith("x")){
           word= word.replaceFirst("x","a");
        }

        System.out.println(word);

    }
}
/*Write a program that asks user to enter a word. If the work starts with x, replace it with a.
                    Input:
                        xcodex
                    Output:
                        acodex*/