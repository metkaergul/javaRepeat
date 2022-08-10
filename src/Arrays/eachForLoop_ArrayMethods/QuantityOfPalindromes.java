package Arrays.eachForLoop_ArrayMethods;

public class QuantityOfPalindromes {
    public static void main(String[] args) {

            String[]array=  {"anna", "level", "Java"};

            int palindromeCount=0;


        for (String each : array) {
            String pal= "";
            for (int i = each.length()-1; i>=0 ; i--) {
                pal+=each.charAt(i);
            }
            if(each.equals(pal)){
                palindromeCount++;
            }
        }

        System.out.println(palindromeCount);

    }
}
/*write a program that can count how many palindromes in an array of string
        Ex:
            {"anna", "level", "Java"};

            output:
                2*/