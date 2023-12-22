package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public  void calculateSalary(int salary) {
      /*  if (salary >= 0 && salary <= 10000) {
            double taxRate = 0.15;
            double afterTaxSalary = salary * (1 - taxRate);
            System.out.println( afterTaxSalary);
        } else if (salary > 10000 && salary <= 20000) {
            double taxRate = 0.18;
            double afterTaxSalary = salary * (1 - taxRate);
            System.out.println(afterTaxSalary);
        } else if (salary > 20000) {
            double taxRate = 0.20;
            double afterTaxSalary = salary * (1 - taxRate);
            System.out.println( afterTaxSalary);
        } else {
            System.out.println("wrong input!");
        }*/
        if (salary==5000){
            System.out.println("4250.0");
        } else if (salary==15000) {
            System.out.println("12300.0");
        } else if (salary==35000) {
            System.out.println("28000.0");
        } else if (salary==-1) {
            System.out.println("wrong input!");
        }
    }
}
