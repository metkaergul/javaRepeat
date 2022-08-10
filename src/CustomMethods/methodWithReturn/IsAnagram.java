package CustomMethods.methodWithReturn;

import java.util.Arrays;

public class IsAnagram {
    public static void main(String[] args) {

        boolean isAnagram= isAnagram("cba","bac");
        System.out.println(isAnagram);
    }

    public static boolean isAnagram(String str1,String str2){
        boolean flag = false;

            String []array1= str1.split("");
            String []array2= str2.split("");

        Arrays.sort(array2);
        Arrays.sort(array1);

          if(  Arrays.equals(array1,array2)){
              flag=true;
          }




      return flag;

    }

}
/*create a method named isAnagram that passes two String parameters, the method returns true if the given two strings are anagram, otherwise returns false
    			Ex:
    				str1 = "cba"
    				str2 = "bac";

    				isAnagram(str1, str2) ====> true*/