import java.util.Scanner;

// Superclass
class Employee {

    void calculateSalary() {
        System.out.println("Salary Calculation");
    }
}

// Subclass for Full Time Employee
class FullTimeEmployee extends Employee {

    double monthlySalary;

    FullTimeEmployee(double salary) {
        monthlySalary = salary;
    }

    @Override
    void calculateSalary() {
        System.out.println("Full Time Employee Salary = " + monthlySalary);
    }
}

// Subclass for Part Time Employee
class PartTimeEmployee extends Employee {

    int hoursWorked;
    double ratePerHour;

    PartTimeEmployee(int hours, double rate) {
        hoursWorked = hours;
        ratePerHour = rate;
    }

    @Override
    void calculateSalary() {
        double salary = hoursWorked * ratePerHour;
        System.out.println("Part Time Employee Salary = " + salary);
    }
}

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Full Time Employee Input
        System.out.print("Enter Full Time Employee Monthly Salary: ");
        double fullSalary = sc.nextDouble();

        FullTimeEmployee ft = new FullTimeEmployee(fullSalary);

        // Part Time Employee Input
        System.out.print("Enter Part Time Employee Working Hours: ");
        int hours = sc.nextInt();

        System.out.print("Enter Rate Per Hour: ");
        double rate = sc.nextDouble();

        PartTimeEmployee pt = new PartTimeEmployee(hours, rate);

        // Method Overriding Demonstration
        ft.calculateSalary();
        pt.calculateSalary();

        sc.close();
    }
}
