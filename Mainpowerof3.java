public class Mainpowerof3 {
    public static void main(String[] args) {
        System.out.println(isPowerOfThree(27));
    }

    static boolean isPowerOfThree(int n) {
        return n > 0 && 1162261467 % n == 0;
    }
}
