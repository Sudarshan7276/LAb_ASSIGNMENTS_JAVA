package ASSINGMENTS_1_A;

public class MyDate {
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

    public void display() {
        System.out.println("Date: " + this.dd + "-" + this.mm + "-" + this.yy);
    }
}
