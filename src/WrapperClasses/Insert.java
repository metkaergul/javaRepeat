package WrapperClasses;

import java.util.Arrays;

public class Insert {

    public static void main(String[] args) {

        int[]array={10,20,30,40,50};

          array=  insert(array,2,102);
        System.out.println(Arrays.toString(array));


        double[]array2={100,20,35,41,50};

        array2=  insert(array2,2,102.5);
        System.out.println(Arrays.toString(array2));
    }

    public static int [] insert(int[]arr,int index,int element){

        int []insertedNew= new int[arr.length+1];

            int j= 0;
        for (int i = 0; i < arr.length; i++) {

            if(i==index){
                insertedNew[j]=element;

                j=j+1;

            }
            insertedNew[j++]=arr[i];
        }
        return insertedNew;
    }


    public static double [] insert(double[]arr,int index,double element){

        double []insertedNew= new double[arr.length+1];

        int j= 0;
        for (int i = 0; i < arr.length; i++) {

            if(i==index){
                insertedNew[j]=element;

                j=j+1;

            }
            insertedNew[j++]=arr[i];
        }
        return insertedNew;
    }
}
/*Insert Task:
		1.1 Create a method named insert that passes three parameters: integer array, integer index, integer element.
		 the method inserts the given element to the given index of the array and returns the new array
				Ex:
					arr = {10, 20, 30, 40, 50};

					insert(arr, 2, 100) ==> {10, 20, 100, 30, 40, 50}


		1.2 Create the same function for double array, char array and string array
*/
