package CustomClassConstructor.CustomClassStaticVariables;

public class Circle {

    public double radius ;
    public static double pi=3.14;

    public Circle(double radius) {
        this.radius = radius;
    }


    public  double calcArea(){

        return radius*radius*pi;

    }
    public double calcPerimeter(){

        return radius*pi*2;
    }

    public static double piValue(){

        return pi;

    }

    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                "pi=" + pi +
                "calcArea=" + calcArea() +
                "calcPerimeter=" + calcPerimeter() +
                '}';
    }
}
