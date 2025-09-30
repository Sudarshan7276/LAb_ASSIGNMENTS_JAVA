package Series;

public class Cube {
    public void print(int n) {
        System.out.print("Cubes: ");
        for (int i = 1; i <= n; i++) {
            System.out.print((i * i * i) + " ");
        }
        System.out.println();
    }
}
