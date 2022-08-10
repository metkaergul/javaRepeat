package CustomMethods.voidReturnType;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {

        anagram("face","cafe");
    }

    public static void anagram(String word,String word2){

        String[]arr1= word.split("");
        String[]arr2= word2.split("");

        Arrays.sort(arr1);
        Arrays.sort(arr2);

       if( Arrays.equals(arr1,arr2)){
           System.out.println(word+" and "+word2+" are anagram");
       }else{
           System.out.println(word+" and "+word2+" are not anagram");
       }




        }

    }
/*
    17. create a method that can check if two strings are anagram
    		ex:
    			anagram("silent", "listen")


			output:
				silent and listen are anagram
*/