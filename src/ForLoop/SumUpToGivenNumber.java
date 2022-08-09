package ForLoop;

public class SumUpToGivenNumber {
    public static void main(String[] args) {

        int sum= 0;

        int given=100 ;

        for (int i = 1; i <=given ; i++) {

            sum+=i;
        }


        System.out.println("sum up to "+given+" is: "+sum);
    }

}
/*write a program that can calculate the sum of all numbers between 1 to any given number
            ex:
                input: 100
                output: 5050

                input: 50
                output: 1275 */