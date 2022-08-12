package CustomClassConstructor.CarTask;

public class CarObjects {
    public static void main(String[] args) {
        Car car1= new Car("mbw");
        car1.brand="vds";


        System.out.println( car1.brand);//null because car1 objcet constructor does not set the fields other than brand

//       //==============================
        Car car2= new Car("mercedes","x23",2021);

        System.out.println(car2);
    }
}
