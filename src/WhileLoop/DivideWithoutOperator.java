package WhileLoop;

public class DivideWithoutOperator {
    public static void main(String[] args) {

        int num1= 99;
        int num2=8;
        boolean flag =true;
        int counter=0;
       if(!(num1>0&&num2>0)) {

           System.out.println("invalid numbers");
           return;
       }
        while(flag){


            if(num1>=num2){

                num1=num1-num2;
                counter++;
            }
            if(num1<num2){
                flag=false;
            }



        }
        System.out.println("division "+counter);
        System.out.println("remainder "+num1);

    }
}
/*1. Write a program that can divide two positive numbers without using / (division) and * (multiplication) operators.
 */