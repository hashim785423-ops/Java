class Employee {

    void calculateSalary() {
        System.out.println("Salary calculation");
    }
}

class FullTimeEmployee extends Employee {
    double monthlySalary;

    FullTimeEmployee(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    @Override
    void calculateSalary() {
        System.out.println("Full-Time Employee Salary = ₹" + monthlySalary);
    }
}

class PartTimeEmployee extends Employee {
    int hoursWorked;
    double ratePerHour;

    PartTimeEmployee(int hoursWorked, double ratePerHour) {
        this.hoursWorked = hoursWorked;
        this.ratePerHour = ratePerHour;
    }

    @Override
    void calculateSalary() {
        double salary = hoursWorked * ratePerHour;
        System.out.println("Part-Time Employee Salary = ₹" + salary);
    }
}

public class Main {
    public static void main(String[] args) {

        FullTimeEmployee fte = new FullTimeEmployee(50000);
        PartTimeEmployee pte = new PartTimeEmployee(80, 250);

        fte.calculateSalary();
        pte.calculateSalary();
    }
}
