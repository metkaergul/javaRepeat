package CustomMethods.methodWithReturn;

import com.sun.source.tree.ArrayAccessTree;

import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {

        int []array= {1,2,3,4,5};

       array= removeElement(array,2);
        System.out.println(Arrays.toString(array));
    }

    public static int[] removeElement(int[]arr,int index){

        int[]removedArr= new int[arr.length-1];


        int j=0;
        for (int i = 0; i < arr.length-1; i++) {

            if(i==index){

                j=i+1;
            }
            removedArr[i]=arr[j++];
        }


       return removedArr;
    }

}
/*create a method named removeElement that passes one integer array and one integer, the method removes the integer index from the integer array and returns the new array
			Ex:
				array = {10, 20, 30, 40, 50, 60}
				index = 2


				removeElement(array, index) ==== {10, 20, 40, 50, 60}*/