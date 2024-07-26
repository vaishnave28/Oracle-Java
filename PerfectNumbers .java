public class PerfectNumbers {
    public static void main(String[] args) {
        int n = 3, c = 0, i = 1;
        while (c < n) {
            int sum = 0;
            for (int j = 1; j <= i / 2; j++) if (i % j == 0) sum += j;
            if (sum == i) { System.out.print(i + " "); c++; }
            i++;
        }
    }
}
