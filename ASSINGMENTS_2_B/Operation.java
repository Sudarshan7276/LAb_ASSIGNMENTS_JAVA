package ASSINGMENTS_2_B;

interface Operation {
    double PI = 3.142;
    void area();
    void volume();
}

class Circle implements Operation {
    double radius;

    Circle(double r) {
        radius = r;
    }

    public void area() {
        System.out.println("Area of Circle: " + (PI * radius * radius));
    }

    public void volume() {
        System.out.println("Volume of Circle: N/A");
    }
}

class Cylinder implements Operation {
    double radius, height;

    Cylinder(double r, double h) {
        radius = r;
        height = h;
    }

    public void area() {
        System.out.println("Surface Area of Cylinder: " + (2 * PI * radius * (radius + height)));
    }

    public void volume() {
        System.out.println("Volume of Cylinder: " + (PI * radius * radius * height));
    }

    public static void main(String[] args) {
        Circle c = new Circle(5);
        c.area();
        c.volume();

        Cylinder cyl = new Cylinder(5, 10);
        cyl.area();
        cyl.volume();
    }
}
