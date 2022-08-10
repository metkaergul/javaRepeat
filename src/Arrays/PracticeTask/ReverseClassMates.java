package Arrays.PracticeTask;

public class ReverseClassMates {
    public static void main(String[] args) {

       String []array ={"Serdar Fesli","Okan Sumnulu","Kenan Evni"};

        for (int i = 0; i < array.length; i++) {
            String output="";
            for (int j = array[i].length()-1; j >=0 ; j--) {
                  output+=  array[i].charAt(j);
            }
            System.out.println(output);
        }


    }
}
/*create string array, and store the names of your  class mates (10)
            reverse each students names and print them in separate lines
            	ex:
            		arr = {java, python, c#}

        		output:
        			avaJ
        			nohtyp
        			#c*/