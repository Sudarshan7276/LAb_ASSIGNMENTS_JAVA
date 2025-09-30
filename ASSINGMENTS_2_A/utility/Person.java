package utility;

import utility.CapitalString;
import java.util.Scanner;

public class Person {
    String name, city;

    public void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name: ");
        name = sc.nextLine();
        System.out.print("Enter City: ");
        city = sc.nextLine();
    }

    public void display() {
        CapitalString cs = new CapitalString();
        System.out.println("Name: " + cs.toCapital(name));
        System.out.println("City: " + city);
    }

    public static void main(String[] args) {
        Person p = new Person();
        p.accept();
        p.display();
    }
}
