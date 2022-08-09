package ForLoop;

public class RetrieveFromString {
    public static void main(String[] args) {


        String input= " mn@#123Ab!";

        String letters="";
        String digits="";
        String specialChars= "";

        for (int i = 0; i <input.length() ; i++) {

            if((input.charAt(i)>='a'&&input.charAt(i)<='z')||(input.charAt(i)>='A'&&input.charAt(i)<='Z')){

                letters+=input.charAt(i);
            }else if((input.charAt(i)>='1'&&input.charAt(i)<='9')){

                digits+=input.charAt(i);

            }else{
                specialChars+=input.charAt(i);
            }

        }

        System.out.println("letters = " + letters);
        System.out.println("digits = " + digits);
        System.out.println("specialChars = " + specialChars);

    }
}
/*write a program that can retrive the digits, letters and special characters from a string
            Ex:
                input:
                    mn@#123Ab!

                output:
                    letters: mnAb
                    digits: 123
                    special chars: @#!*/