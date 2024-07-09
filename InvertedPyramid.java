import java.util.Scanner;

public class InvertedPyramid {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int rows = s.nextInt();
        for (int i = rows; i > 0; i--) {
            System.out.println(" ".repeat(rows - i) + "*".repeat(2 * i - 1));
        }
    }
}
