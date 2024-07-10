import java.util.Scanner;

public class DecimalToBinaryReverse {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String n = s.nextLine();
        try {
            int d = Integer.parseInt(n);
            int r = Integer.parseInt(new StringBuilder(Integer.toBinaryString(d)).reverse().toString(), 2);
            System.out.println(r);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid decimal number.");
        }
        s.close();
    }
}
