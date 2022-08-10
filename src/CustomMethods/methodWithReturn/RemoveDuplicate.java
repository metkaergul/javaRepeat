package CustomMethods.methodWithReturn;

public class RemoveDuplicate {

    public static void main(String[] args) {

                String str= removeDuplicate("aaabbccd");
        System.out.println(str);
    }

    public static String removeDuplicate(String sentence){

        String removed ="";

        for (int i = 0; i <sentence.length() ; i++) {
            int count= 0;
            char outer=sentence.charAt(i);
            for (int j = 0; j <sentence.length() ; j++) {
                char inner= sentence.charAt(j);
                    if(inner==outer){
                        count++;
                    }
                if(count>=1&&!removed.contains(""+outer)){
                    removed+=outer;
                }
            }

        }





        return removed;
    }


}
