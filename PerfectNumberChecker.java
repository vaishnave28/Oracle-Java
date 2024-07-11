import java.util.Scanner;
public class PerfectNumberChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            if (n <= 0) {
                System.out.println("Invalid input. Enter a positive integer.");
                return;
            }
            int sum = 0;
            for (int i = 1; i <= n / 2; i++) {
                if (n % i == 0) sum += i;
            }
            System.out.println(sum == n ? "Its a Perfect Number" : "Not a Perfect Number");
        } else {
            System.out.println("Invalid input. Please enter an integer.");
        }
    }
}
