package CustomClassConstructor.CustomClassStaticVariables;

public class CircleObjects {

    public static void main(String[] args) {

        Circle circle1= new Circle(2.5);
        Circle circle2= new Circle(3.5);



        System.out.println(circle1.radius);
        System.out.println(Circle.pi);
        System.out.println(circle1);

        double a= circle1.piValue();
        System.out.println(a);


    }

}
