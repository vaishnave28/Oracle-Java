import java.util.Scanner;
public class SimpleInterestCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double principal = sc.nextDouble();
        int years = sc.nextInt();
        char senior = sc.next().charAt(0);
        double rate = (senior == 'y' || senior == 'Y') ? 0.12 : 0.10;
        double interest = (principal > 0 && years > 0) ? principal * years * rate : 0;
        System.out.println("Interest: " + interest);
    }
}
