package Encapsulation;

public class EmployeeTest {
    public static void main(String[] args) {


        Employee employee1= new Employee("daNIEL",'M',23,120.000);

        System.out.println(employee1);

       String employee1name=  employee1.getName();
        System.out.println("employee1name = " + employee1name);
    }
}
