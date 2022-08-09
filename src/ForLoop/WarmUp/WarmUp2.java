package ForLoop.WarmUp;

import java.util.Scanner;

public class WarmUp2 {
    public static void main(String[] args) {

        System.out.println("Enter a word");

        String word= new Scanner(System.in).nextLine().toLowerCase();

      word=  word.replaceAll("x","a");

        System.out.println(word);

    }
}
/* Write a program that asks user to enter a word. and replace all the x or X with character a
                    Input:
                        xcodeX
                    Output:
                        acodea
*/