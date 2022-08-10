package Arrays.eachForLoop_ArrayMethods;

public class CountEvenAndOdd {
    public static void main(String[] args) {

        int[]numbers= {12,32,41,57,85};

        int countEven= 0;
        int countOdd= 0;

        for (int each : numbers) {
            if(each%2==0){
                countEven++;
            }else{
                countOdd++;
            }
        }
        System.out.println("countOdd = " + countOdd);
        System.out.println("countEven = " + countEven);

    }
}
/*Write a program that can count the even and odd number from an array of integers

			Note: MUST use for each loop*/