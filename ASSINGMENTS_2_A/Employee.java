package ASSINGMENTS_2_A;

import java.util.Scanner;

class Employee {
    int id;
    String name;
    double salary;

    Employee() {
        id = 0;
        name = "";
        salary = 0;
    }

    public void accept(Scanner sc) {
        System.out.print("Enter ID: ");
        id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Name: ");
        name = sc.nextLine();
        System.out.print("Enter Salary: ");
        salary = sc.nextDouble();
    }

    public void display() {
        System.out.println("ID: " + id + " Name: " + name + " Salary: " + salary);
    }
}

class Manager extends Employee {
    private double bonus;

    public void accept(Scanner sc) {
        super.accept(sc);
        System.out.print("Enter Bonus: ");
        bonus = sc.nextDouble();
    }

    public double getTotalSalary() {
        return salary + bonus;
    }

    public void display() {
        super.display();
        System.out.println("Bonus: " + bonus + " Total Salary: " + getTotalSalary());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of managers: ");
        int n = sc.nextInt();

        Manager[] mgrs = new Manager[n];

        for (int i = 0; i < n; i++) {
            mgrs[i] = new Manager();
            System.out.println("Enter details for Manager " + (i + 1));
            mgrs[i].accept(sc);
        }

        Manager maxManager = mgrs[0];
        for (Manager m : mgrs) {
            if (m.getTotalSalary() > maxManager.getTotalSalary()) {
                maxManager = m;
            }
        }

        System.out.println("\nManager with highest total salary:");
        maxManager.display();
    }
}
