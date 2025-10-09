import java.util.Scanner;

class Employee {
    String name;
    String department;
    double salary;

    Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    void displayDetails() {
        System.out.println("Name       : " + name);
        System.out.println("Department : " + department);
        System.out.println("Salary     : ₹" + salary);
        System.out.println("------------------------");
    }

    void updateSalary(double increment) {
        salary += increment;
    }
}

public class LAB2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Department: ");
        String department = sc.nextLine();
        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();

        Employee emp = new Employee(name, department, salary);

        if (args.length > 0) {
            double increment = Double.parseDouble(args[0]);
            emp.updateSalary(increment);
            System.out.println("Salary updated by ₹" + increment);
        }

        emp.displayDetails();
        sc.close();
    }
}
