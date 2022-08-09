package ForLoop;

public class OddSum {
    public static void main(String[] args) {


        int sumOddNumber=0;

        for (int i = 1; i <=100 ; i++) {
            if(i%2!=0){
                sumOddNumber+=i;
            }
        }
        System.out.println("sumOddNumber = " + sumOddNumber);

    }
}
/* Write a program that can return the sum of odd numbers between 1 to 100*/