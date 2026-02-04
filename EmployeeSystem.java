import java.util.ArrayList;
import java.util.Scanner;

class Employee {
    int id;
    String name;
    double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void display() {
        System.out.println("ID: " + id + " | Name: " + name + " | Salary: $" + salary);
    }
}

public class EmployeeSystem {
    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Employee Management System ---");
        System.out.println("1. Add Employee  2. View All  3. Exit");

        while (true) {
            System.out.print("\nEnter Choice: ");
            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter ID: ");
                int id = sc.nextInt();
                System.out.print("Enter Name: ");
                String name = sc.next();
                System.out.print("Enter Salary: ");
                double sal = sc.nextDouble();
                list.add(new Employee(id, name, sal));
                System.out.println("Employee Added!");
            } else if (choice == 2) {
                System.out.println("\n--- Employee List ---");
                for (Employee e : list) e.display();
            } else {
                System.out.println("System Exiting...");
                break;
            }
        }
    }
}