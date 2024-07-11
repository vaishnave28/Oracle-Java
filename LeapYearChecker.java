import java.util.Scanner;
public class LeapYearChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] parts = sc.nextLine().split("/");
        if (parts.length == 3) {
            try {
                int year = Integer.parseInt(parts[2]);
                System.out.println("Given year is " + (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0) ? "Leap Year" : "Non Leap Year"));
            } catch (NumberFormatException e) {
                System.out.println("Invalid input.");
            }
        } else {
            System.out.println("Invalid date format.");
        }
    }
}
