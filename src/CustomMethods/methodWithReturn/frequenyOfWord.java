package CustomMethods.methodWithReturn;

public class frequenyOfWord {
    public static void main(String[] args) {

       int result= frequencyOfWord("Java java java python python","java");
        System.out.println(result);
    }

    public static int frequencyOfWord(String sentence,String word){
        int freq= 0;


        String []array= sentence.split(" ");

        for (String each : array) {
            if(each.equalsIgnoreCase("java")){
                freq++;
            }
        }


        return freq;
    }

}
/*
	1.  create a method named frequencyOfWord that passes two parameters: string sentence and String word, then returns the frequency of word from the sentence
                Ex:
                    sentence = "Java java java python python"
                    word = "java";
                    frequencyOfWord(sentence, word) ==>  3*/