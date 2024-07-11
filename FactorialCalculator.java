import java.util.Scanner;
public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            if (n < 0) {
                System.out.println("Factorial is not defined for negative numbers.");
            } else {
                System.out.println(n + " Factorial = " + factorial(n));
            }
        } else {
            System.out.println("Invalid input. Please enter a non-negative integer.");
        }
    }
    private static long factorial(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) result *= i;
        return result;
    }
}
