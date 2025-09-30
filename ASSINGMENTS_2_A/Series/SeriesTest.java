package Series;

import Series.Fibonacci;
import Series.Square;
import Series.Cube;
import java.util.Scanner;

public class SeriesTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        Fibonacci fib = new Fibonacci();
        Square sq = new Square();
        Cube cb = new Cube();

        fib.print(n);
        sq.print(n);
        cb.print(n);
    }
}

