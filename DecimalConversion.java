import java.util.Scanner;
public class DecimalConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Decimal Number: ");
        String input = sc.nextLine();
        try {
            int decimal = Integer.parseInt(input);
            System.out.println("Binary Number = " + Integer.toBinaryString(decimal));
            System.out.println("Octal = " + Integer.toOctalString(decimal));
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid decimal number.");
        }
        sc.close();
    }
}
