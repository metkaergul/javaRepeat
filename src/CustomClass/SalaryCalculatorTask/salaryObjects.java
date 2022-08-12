package CustomClass.SalaryCalculatorTask;

public class salaryObjects {
    public static void main(String[] args) {

        SalaryCalculator salary1= new SalaryCalculator(21,0.15,0.12,45);

        System.out.println(salary1.salary());

        System.out.println(salary1);
        System.out.println(salary1.federalTax());



    }
}
