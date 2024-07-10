import java.util.Scanner;

public class HollowSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        char ch = scanner.next().charAt(0);
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print((i == 0 || i == size - 1 || j == 0 || j == size - 1 ? ch : ' ') + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
