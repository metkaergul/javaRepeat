package CustomMethods.voidReturnType;

public class PrintOdd {
    public static void main(String[] args) {

printOdd();
    }

    public static void printOdd(){

        for (int i = 1; i <=100 ; i++) {
            if(!(i%2==0)){

                System.out.print(i+" ");
            }
        }

    }


}
