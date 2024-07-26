import java.util.Scanner;
public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) numbers[i] = scanner.nextInt();
        int sum = 0;
        try {
            for (int i = 0; i <= n; i++) sum += numbers[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(sum);
        }
    }
}
