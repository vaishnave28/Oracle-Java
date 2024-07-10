import java.util.Scanner;

public class HollowSquareDollarPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                System.out.print((i == 1 || i == size || j == 1 || j == size) ? "$ " : "  ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
