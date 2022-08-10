package Arrays.eachForLoop_ArrayMethods;

public class CommonElements {

    public static void main(String[] args) {

        int[]arr1={1,2,3,4,5};
        int[]arr2={4,5,6,7,8};

        String common= "";

        for (int i : arr1) {
            for (int j : arr2) {

                if(i==j){
                    common+=i;
                }
            }

        }
        System.out.println(common);

    }
}
/*Write a program that can print out the common elements from two integer array
          Ex:
              arr1: {1,2,3,4,5}
              arr2: {4,5,6,7,8}

          output:
              4 5


          MUST use for each loops*/