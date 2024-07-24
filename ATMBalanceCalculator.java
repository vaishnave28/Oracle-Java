import java.util.Scanner;
public class ATMBalanceCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] denominations = new int[4];
        int[] notes = new int[4];
        int totalBalance = 0;
        for (int i = 0; i < 4; i++) {
            System.out.println("Enter the " + (i + 1) + "th Denomination:");
            denominations[i] = scanner.nextInt();
            System.out.println("Enter the " + (i + 1) + "th Denomination number of notes:");
            notes[i] = scanner.nextInt();
            totalBalance += denominations[i] * notes[i];
        }
        System.out.println("Total Available Balance in ATM: " + totalBalance);
        scanner.close();
    }
}
