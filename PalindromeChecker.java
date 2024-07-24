import java.util.Scanner;
public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1 for string, 2 for number: ");
        int choice = sc.nextInt();
        sc.nextLine();  // Consume the newline
        String input = sc.nextLine();
        String clean = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        boolean isPalindrome = clean.equals(new StringBuilder(clean).reverse().toString());
        System.out.println((choice == 1 || choice == 2) ? (isPalindrome ? "Palindrome" : "Not a Palindrome") : "Invalid choice");
        sc.close();
    }
}
