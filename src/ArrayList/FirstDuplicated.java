package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class FirstDuplicated {
    public static void main(String[] args) {

        ArrayList<Integer>list= new ArrayList<>();

        list.addAll(Arrays.asList(1,2,3,4,5,4,5,6,7,7));


        for (int i = 0; i < list.size(); i++) {
            int count= 0;
            int out= list.get(i);
            for (int j = 0; j < list.size(); j++) {
                int in=list.get(j);

                if(out==in){

                    count++;
                }

            }
            if(count>1){
                System.out.println("first duplicated: "+out);
                break;
            }

        }

    }
}
/*Write a program that can return the first duplicated element from an arrayList of Integer
		Ex:
			list = [1,2,2,3,4,4,5,6,7,7];
			output:
				2*/