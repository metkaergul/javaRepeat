package CustomMethods.voidReturnType;

public class calculateGrade {
    public static void main(String[] args) {

    calculateGrade(89);
    }

    public static void calculateGrade(int score){

        char grade= 0;

        if(score<=100&&score>=90){
            grade='A';
        } else if (score>=80) {
            grade='B';

        } else if (score>=70) {
            grade='C';

        } else if(score>=60){
            grade='D';
        }else{
            System.out.println("you failed");
        }
        System.out.println(grade);

    }



}
/*create a method that can calculate the grade of the student based on the score*/