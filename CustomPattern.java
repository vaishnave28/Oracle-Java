import java.util.Scanner;

public class CustomPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = scanner.nextInt();
        System.out.print("Max times printed: ");
        int maxCount = scanner.nextInt();
        
        for (int i = 1; i <= maxCount * 2 - 1; i++) {
            int count = i <= maxCount ? i : maxCount * 2 - i;
            System.out.println("".format("%0" + count + "d", 0).replace("0", String.valueOf(num)));
        }
        
        scanner.close();
    }
}
