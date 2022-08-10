package WrapperClasses;

import java.util.Collections;

public class Lowerupper {
    public static void main(String[] args) {

        String str= "JAVaR java";

       boolean isEqual =  isEqual(str);
        System.out.println(isEqual);

    }
    public static boolean isEqual(String str){
        boolean flag=false;
        int numberUpper=0;
        int numberLower=0;

        for (int i = 0; i <str.length() ; i++) {

            char ch= str.charAt(i);

            if(ch>='A'&&ch<='Z'){
                numberUpper++;
            } else if (ch>='a'&&ch<='z') {
                numberLower++;

            }
        }

            if(numberLower==numberUpper){
                flag=true;
            }

        return flag;
    }

}
/*
4. Write program that returns true if the total number of upper case characters are equal
 to total number of Lowercase characters of a string
		Ex:
			str = "JAVA java";

		output:
			true

*/