import java.util.Scanner;

public class PatternPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char character = scanner.next().charAt(0);
        int maxNumber = scanner.nextInt();
        for (int i = 1; i <= maxNumber; i++) {
            System.out.println(String.valueOf(character).repeat(i).replace("", " ").trim());
        }
        scanner.close();
    }
}
