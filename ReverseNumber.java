import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to reverse: ");
        String input = scanner.next();

        try {
            int number = Integer.parseInt(input);
            int reversedNumber = 0;
            while (number != 0) {
                reversedNumber = reversedNumber * 10 + number % 10;
                number /= 10;
            }
            System.out.println("Reverse Number: " + reversedNumber);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid number.");
        }

        scanner.close();
    }
}
