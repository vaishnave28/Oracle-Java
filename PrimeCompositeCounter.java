import java.util.Scanner;
public class PrimeCompositeCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int primeCount = 0, compositeCount = 0;
        while (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            if (number > 1) {
                boolean isPrime = true;
                for (int i = 2; i * i <= number; i++) {
                    if (number % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) primeCount++;
                else compositeCount++;
            }
        }

        System.out.println("Composite number: " + compositeCount);
        System.out.println("Prime number: " + primeCount);

        scanner.close();
    }
}
