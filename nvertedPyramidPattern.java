import java.util.Scanner;

public class InvertedPyramidPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        scanner.close();
        
        for (int i = 0; i < rows; i++) {
            System.out.printf("%" + (i + rows) + "s", "");
            for (int j = 0; j < 2 * (rows - i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
