import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0, b = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(a + (i < n - 1 ? "\t" : ""));
            int sum = a + b;
            a = b;
            b = sum;
        }
    }
}
