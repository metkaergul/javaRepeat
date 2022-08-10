package CustomMethods.methodWithReturn;

public class frequencyOfNumber {
    public static void main(String[] args) {

        int[]array= {4,1,1,1,4,5,2};
        int result= freqOfNumber(array,1);
        System.out.println(result);
    }


    public static int freqOfNumber(int[]arr,int num){

   int freq=0;

        for (int each : arr) {

            if(each==num){
                freq++;
            }

        }

        return freq;


    }
}
/*
    5. create method that accepts one integer array and one integer number and returns the frequency of the number

                    Ex:
                        int[] array ={1,1,1,1,1,2,2};

                        frequency(array, 1) ==> 5*/