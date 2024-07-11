public class SkipNumbers {
    public static void main(String[] args) {
        printSkippingNumbers(50, 100, 7);
    }
    public static void printSkippingNumbers(int M, int N, int K) {
        for (int i = M; (K > 0 ? i <= N : i >= N); i += K) {
            System.out.print(i + (i + K <= N ? ", " : ""));
        }
    }
}
