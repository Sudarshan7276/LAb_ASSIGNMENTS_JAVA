package Series;


public class Square {
    public void print(int n) {
        System.out.print("Squares: ");
        for (int i = 1; i <= n; i++) {
            System.out.print((i * i) + " ");
        }
        System.out.println();
    }
}
