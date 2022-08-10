package Arrays.eachForLoop_ArrayMethods;

public class JavaPythonAppearances {
    public static void main(String[] args) {

        String sentence= "java python java python java";

        int freqJava= 0;
        int freqPython= 0;

        String []array=sentence.split(" ");

        for (String each : array) {
            if(each.contains("java")){
                freqJava++;
            }
            if(each.contains("python")){
                freqPython++;
            }

        }
        System.out.println("freqPython = " + freqPython);
        System.out.println("freqJava = " + freqJava);

    }
}
/*
	6. Write a program that can return the number of appearances of “java” and “python” anywhere in the sentence.
				(similar to the task 97 in repl.it, but this time you MUST use arrays and for each loop)*/