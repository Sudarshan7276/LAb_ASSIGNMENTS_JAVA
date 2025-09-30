package ASSINGMENT_1_C;

import java.util.Scanner;

class MyDate {
    private int dd, mm, yy;

    public MyDate() {
        this.dd = 1;
        this.mm = 1;
        this.yy = 2000;
    }

    public MyDate(int dd, int mm, int yy) {
        this.dd = dd;
        this.mm = mm;
        this.yy = yy;
    }

    public void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter day: ");
        this.dd = sc.nextInt();
        System.out.print("Enter month: ");
        this.mm = sc.nextInt();
        System.out.print("Enter year: ");
        this.yy = sc.nextInt();
    }

    public void display() {
        System.out.print(dd + "-" + mm + "-" + yy);
    }
}

public class Person {
    private int id;
    private String name;
    private MyDate dob;
    private static int cnt = 1;

    public Person() {
        this.id = cnt++;
        this.name = "";
        this.dob = new MyDate();
    }

    public Person(String name, MyDate dob) {
        this.id = cnt++;
        this.name = name;
        this.dob = dob;
    }

    public void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name: ");
        name = sc.nextLine();
        dob = new MyDate();
        dob.accept();
    }

    public void display() {
        System.out.print("ID: " + id + ", Name: " + name + ", DOB: ");
        dob.display();
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();
        sc.nextLine(); // Consume newline

        Person[] persons = new Person[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Person " + (i + 1));
            persons[i] = new Person();
            persons[i].accept();
        }

        System.out.println("\nPerson Details:");
        for (Person p : persons) {
            p.display();
        }
    }
}
