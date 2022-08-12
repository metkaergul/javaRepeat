package Encapsulation;

public class Circle {

    private double radius;
    public  static double pi;

    static {

        pi=3.14;
    }

    public Circle(double radius) {
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if(radius<=0){
            System.err.println("invalid entry for radius:"+radius);
            throw new RuntimeException("Radius can not be negative or zero");
        }
        this.radius = radius;
    }

    public double calcArea(){
        return radius*radius*pi;
    }
    public double calcPerimeter(){
        return 2*radius*pi;
    }

    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                "perimeter=" + calcPerimeter() +
                "area=" + calcArea() +
                '}';
    }
}
/*2. Create a class named Circle

			privtae variables:
				radius

			public variable:
				pi

		 	Encapsulate all the private fields

		 			1. radius of the circle can not be zero or negative

 			Add a constructor that can set the raidus of coircle when circle object is created

 			Methods:
 				calcArea()
 				calcPerimeter()
 				toString()*/