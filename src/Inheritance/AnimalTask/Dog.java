package Inheritance.AnimalTask;

public class Dog extends Animal{
    public Dog( String breed, int age, char gender, String size, String color) {
        super("dog", breed, age, gender, size, color);
    }

    @Override
    public void eat() {
        System.out.println(getName()+"eating dog food");
    }
}
