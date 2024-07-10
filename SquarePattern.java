public class SquarePattern {
    public static void main(String[] args) {
        int n = 4; // Number of lines
        int number = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.printf("%-4d", number * number);
                number++;
            }
            System.out.println();
        }
    }
}
