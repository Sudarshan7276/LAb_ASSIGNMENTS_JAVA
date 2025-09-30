package ASSINGMENTS_1_B;

import java.util.Scanner;

class Employee {
    String name;
    double salary;

    public void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name: ");
        name = sc.nextLine();
        System.out.print("Enter Salary: ");
        salary = sc.nextDouble();
    }

    public void display() {
        System.out.println("Name: " + name + ", Salary: " + salary);
    }

    public static void main(String[] args) {
        Employee[] emp = new Employee[5];
        for (int i = 0; i < emp.length; i++) {
            emp[i] = new Employee();
            System.out.println("Enter details for Employee " + (i + 1));
            emp[i].accept();
        }

        System.out.println("\nEmployee Details:");
        for (Employee e : emp) {
            e.display();
        }
    }
}
