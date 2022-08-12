package Inheritance.AnimalTask;

public class Zoo {
    public static void main(String[] args) {


        Cat cat1= new Cat("Van",2,'M',"Small","White");

        System.out.println(cat1);
        cat1.eat();
        cat1.setAge(3);
        System.out.println(cat1);



    }
}
