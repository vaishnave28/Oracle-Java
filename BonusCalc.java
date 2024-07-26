import java.util.Scanner;
public class BonusCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String g = sc.next();
        double s = sc.nextDouble();
        double b = (g.equals("A") ? s * 0.05 : g.equals("B") ? s * 0.10 : 0) + (s < 10000 ? s * 0.02 : 0);
        System.out.printf("Salary=%.2f\nBonus=%.2f\nTotal=%.2f\n", s, b, s + b);
    }
}
