import java.util.Scanner;
public class GradeCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt() + sc.nextInt() + sc.nextInt() + sc.nextInt();
        double a = t / 4.0;
        System.out.println("Total=" + t);
        System.out.println("Aggregate=" + a);
        System.out.println(a > 75 ? "DISTINCTION" : a >= 60 ? "FIRST" : a >= 50 ? "SECOND" : a >= 40 ? "THIRD" : "FAIL");
    }
}
