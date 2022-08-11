package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class FindMax {
    public static void main(String[] args) {

        ArrayList<Integer>list= new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5));


        int max= list.get(0); // we are converting object to the primitive data type this is called unboxing
        for (Integer integer : list) {

            if(integer>max){
                max=integer;
            }

        }
        System.out.println(max);
    }
}
/* Write a program that can find the maximum number from an ArrayList of integers
		Ex:
			list = [1,2,3,4,5];
			output:
				5*/