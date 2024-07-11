import java.util.Scanner;
public class LCMGCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if (N <= 0) {
            System.out.println("Invalid input");
            return;
        }
        int lcm = sc.nextInt(), gcd = lcm;
        for (int i = 1; i < N; i++) {
            int num = sc.nextInt();
            gcd = gcd(gcd, num);
            lcm = lcm / gcd(lcm, num) * num;
        }
        System.out.println("LCM = " + lcm + "\nGCD = " + gcd);
    }
    private static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
