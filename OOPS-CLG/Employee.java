
import java.util.Scanner;
// Java Program to demonstrate Use of Class and Objects

public class Employee {
    private String name;
    private float salary;

    public Employee(String name, float salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() { 
        return name;
    }

    public float getSalary() { 
        return salary; 
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("Employee: " +name);
        System.out.println("Salary: " +salary);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter emp Name: ");
        String name = in.nextLine();
        System.out.print("Enter emp salary: ");
        float salary = in.nextFloat();

        Employee emp = new Employee(name, salary);
        emp.displayDetails();
        in.close();
    }
}
