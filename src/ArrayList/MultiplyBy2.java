package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class MultiplyBy2 {
    public static void main(String[] args) {


        ArrayList<Integer>list= new ArrayList<>();

        list.addAll(Arrays.asList(1,2,3,4,5));

        for (int i = 0; i < list.size(); i++) {
                    list.set(i,list.get(i)*2);
        }
        System.out.println(list);
    }
}
/*write a program that can multiply each odd number by 2
	            ex: list = [1,2,3,4,5];
	                output: [2,2,6,4,10]*/