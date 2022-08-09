package ForLoop;

public class Factorial {
    public static void main(String[] args) {

    int result=1;

        int given= 5;

        for (int i = given; i >=1 ; i--) {

            result*=i;


        }
        System.out.println(given+"!: "+result);


    }
}
/*
	4. Write a program that can return the factorial number of any given number

            Ex:
                input: 5
                output: 120

                	( because: 5! = 5 * 4 * 3 * 2* 1 = 120 )*/