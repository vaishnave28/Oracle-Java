import java.util.Scanner;
public class FactorCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Invalid input. Enter a positive integer.");
            return;
        }
        int count = 0;
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                count += (i * i == n) ? 1 : 2;
            }
        }
        System.out.println("Number of factors = " + count);
    }
}
