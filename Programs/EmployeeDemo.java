import java.util.ArrayList;
import java.util.List;

class Employee {
    private int id;
    private String name;
    private double salary;

    // Constructor
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Method to display details
    public void displayDetails() {
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: $" + salary);
    }
}

public class EmployeeDemo {
    public static void main(String[] args) {
        // Creating a list to store employees
        List<Employee> employees = new ArrayList<>();

        // Adding Employee objects to the list
        employees.add(new Employee(101, "Alice Johnson", 55000.0));
        employees.add(new Employee(102, "Bob Smith", 62000.5));
        employees.add(new Employee(103, "Charlie Brown", 48000.75));

        // Displaying employee details
        System.out.println("Employee Details:");
        for (Employee emp : employees) {
            emp.displayDetails();
        }
    }
}
