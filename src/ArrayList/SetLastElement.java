package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class SetLastElement {
    public static void main(String[] args) {


        ArrayList<Integer>list= new ArrayList<>(Arrays.asList(1,2,3,4,5));

        list.set(list.size()-1,0);
        System.out.println(list);
    }
}
