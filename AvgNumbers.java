import java.util.Scanner;
public class AvgNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double posSum = 0, negSum = 0;
        int posCount = 0, negCount = 0;
        while (true) {
            int num = sc.nextInt();
            if (num == -1) break;
            if (num > 0) { posSum += num; posCount++; }
            else if (num < 0) { negSum += num; negCount++; }
        }
        System.out.println("Neg avg=" + (negCount > 0 ? negSum / negCount : "None"));
        System.out.println("Pos avg=" + (posCount > 0 ? posSum / posCount : "None"));
    }
}
