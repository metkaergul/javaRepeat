package CustomMethods.voidReturnType;

public class Calculator {
    public static void main(String[] args) {
        calculator(10,20,'+');

    }
    public static void calculator(int num1,int num2,char mathOperator){

        int result= (mathOperator=='+')?num1+num2:(mathOperator=='-')?num1-num2:(mathOperator=='*')?num1*num2:num1/num2;

        System.out.println(result);
    }


}
/*15. create a method named calculator that passes three arguments (num1, num2, mathOperator), prints the calculation result
 */