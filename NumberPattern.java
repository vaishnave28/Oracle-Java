public class NumberPattern {
    public static void main(String[] args) {
        int n = 4; // Change this value to print more or fewer lines
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
