public class PascalTriangle {

    // Function to calculate factorial
    public static int factorial(int n) {
        return (n == 0 || n == 1) ? 1 : n * factorial(n - 1);
    }

    // Function to calculate nCr (combination)
    public static int nCr(int n, int r) {
        return factorial(n) / (factorial(r) * factorial(n - r));
    }

    public static void main(String[] args) {
        int n = 5; // Number of rows

        for (int i = 0; i < n; i++) {
            for (int k = 0; k <= i; k++) {
                System.out.print(nCr(i, k) + " ");
            }
            System.out.println();
        }
    }
}
