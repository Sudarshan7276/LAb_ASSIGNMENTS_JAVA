package ASSINGMENTS_2_B;
class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
}

class Developer extends Employee {
    String projectName;

    Developer(String name, double salary, String projectName) {
        super(name, salary);
        this.projectName = projectName;
    }

    public void display() {
        System.out.println("Name: " + name + ", Salary: " + salary + ", Project: " + projectName);
    }
}

class Programmer extends Developer {
    String progLang;

    Programmer(String name, double salary, String projectName, String progLang) {
        super(name, salary, projectName);
        this.progLang = progLang;
    }

    public void display() {
        super.display();
        System.out.println("Programming Language: " + progLang);
    }

    public static void main(String[] args) {
        Developer dev = new Developer("John", 75000, "AI System");
        dev.display();

        Programmer prog = new Programmer("Alice", 90000, "Chatbot", "Java");
        prog.display();
    }
}

