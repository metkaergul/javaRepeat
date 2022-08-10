package Arrays.PracticeTask;

public class ClassMates {
    public static void main(String[] args) {

        String[]classmates= {"Serdar Fesli","Okan Sumnulu","Kenan Evni","Melih Calikoglu","Turgay Kenger"};

        System.out.println( classmates.length);

        for (int i = 0; i <classmates.length ; i++) {


            System.out.println(classmates[i].charAt(0)+"."+classmates[i].substring(classmates[i].indexOf(" ")+1,classmates[i].indexOf(" ")+2));
        }




    }
}
/*
1. create an array named classmates, and store 5 of your classmates' full names
            print the initials of each classmates in separate lines*/