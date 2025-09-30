package ASSINGMENTS_1_B;

public class MyNumber {
    private int num;

    public MyNumber() {
        this.num = 0;
    }

    public MyNumber(int num) {
        this.num = num;
    }

    public boolean isNegative() {
        return num < 0;
    }

    public boolean isPositive() {
        return num > 0;
    }

    public boolean isOdd() {
        return num % 2 != 0;
    }

    public boolean isEven() {
        return num % 2 == 0;
    }

    public static void main(String[] args) {
        int value = Integer.parseInt(args[0]);
        MyNumber obj = new MyNumber(value);

        System.out.println("Number is Positive: " + obj.isPositive());
        System.out.println("Number is Negative: " + obj.isNegative());
        System.out.println("Number is Odd: " + obj.isOdd());
        System.out.println("Number is Even: " + obj.isEven());
    }
}

