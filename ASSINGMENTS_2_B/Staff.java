package ASSINGMENTS_2_B;

import java.util.Scanner;

abstract class Staff {
    String name, address;

    Staff(String name, String address) {
        this.name = name;
        this.address = address;
    }

    abstract double calculateSalary();

    public void display() {
        System.out.print("Name: " + name + ", Address: " + address);
    }
}

