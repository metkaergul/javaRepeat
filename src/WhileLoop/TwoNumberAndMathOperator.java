package WhileLoop;

import java.util.Scanner;

public class TwoNumberAndMathOperator {
    public static void main(String[] args) {


        Scanner scan =new Scanner(System.in);

        System.out.println("enter two number and math operator");
        int num1= scan.nextInt();
        int num2= scan.nextInt();
        char oper= scan.next().charAt(0);

        boolean validOper= oper=='*'||oper=='+'||oper=='-'||oper=='/';
        int result= 0;

        while(!validOper) {
                System.out.println("please re enter the operator");
                scan.next().charAt(0);
            }



                if(oper=='+'){
                  result=num1+num2;
                } else if (oper=='-') {
                    result=num1-num2;

                } else if (oper=='*') {
                    result=num1*num2;

                }else{
                    result=num1/num2;
                }

        System.out.println(result);

    }
}
/*write a program to ask user to enter two number and math operator, and return the result.

		if the operator is invalid operator, ask user to re-enter the operator until user provides a valid operator (+, -, *, /)
*/