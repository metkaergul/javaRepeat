package LoopPlusString;

public class CatAndDog {
    public static void main(String[] args) {

        boolean sameAppearance=false;

        String sentence= "caT dog dogG cAt";

        sentence.toLowerCase();

        int numberOfCat= 0;
        int numberOfDog=0;



        for (int i = 0; i <sentence.length()-2 ; i++) {

            if(sentence.substring(i,i+2).equals("cat")){
                numberOfCat++;
            }else if(sentence.substring(i,i+2).equals("dog")){

                numberOfDog++;
            }

        }

        if(numberOfCat==numberOfDog){
            sameAppearance=true;
        }
        System.out.println("numberOfDog = number of cat is "+sameAppearance );

    }
}
/*write a program to print true if the string "cat" and "dog" appear the same number of times in the given sentence

	        Ex:
	            sentence = "caT dog dogG cAt"

	            output:
	                true
*/