import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter two numbers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        try {
            System.out.println("Sum: " + (a + b));
            System.out.println("Difference: " + (a - b));
            System.out.println("Product: " + (a * b));
            System.out.println("Quotient: " + (a / b));
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        }
    }
}
30
