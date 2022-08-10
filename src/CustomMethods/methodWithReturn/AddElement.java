package CustomMethods.methodWithReturn;

import java.util.Arrays;

public class AddElement {

    public static void main(String[] args) {

        int []array= {1,2,3,4};
        int num=5;

        array=addElement(array,num);
        System.out.println(Arrays.toString(array));
    }

    public static int[] addElement(int[]arr1,int num){

        int []addedArray=new int[arr1.length+1];


        for (int i = 0; i < arr1.length ; i++) {

            addedArray[i]=arr1[i];

        }
        addedArray[addedArray.length-1]=num;


        return addedArray;
    }


}
/*create a method named addElement that takes one integer array and one integer, the method can add the Integer number after the  last index of the integer array and returns the new array

    			Ex:
    				arr ={1,2,3};
    				num = 4;

    				addElement(arr, num) ==> {1,2,3,4}
*/