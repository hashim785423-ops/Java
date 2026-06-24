class Employee {
    void calculateSalary() {
        System.out.println("Employee Salary");
    }
}

class FullTimeEmployee extends Employee {
    void calculateSalary() {
        System.out.println("Salary = Rs.50000");
    }
}

class PartTimeEmployee extends Employee {
    void calculateSalary() {
        System.out.println("Salary = Rs.15000");
    }
}

public class SalaryDemo {
    public static void main(String[] args) {

        FullTimeEmployee f = new FullTimeEmployee();
        PartTimeEmployee p = new PartTimeEmployee();

        f.calculateSalary();
        p.calculateSalary();
    }
}
