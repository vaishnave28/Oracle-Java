import java.util.Arrays;
public class MthMaxNthMin {
    public static void main(String[] args) {
        int[] array = {14, 16, 87, 36, 25, 89, 34};
        int M = 1;
        int N = 3;
        Arrays.sort(array);
        if (M >= array.length || N >= array.length) {
            System.out.println("Invalid M or N");
            return;
        }
        int mthMax = array[array.length - 1 - M];
        int nthMin = array[N];
        int sum = mthMax + nthMin;
        int diff = mthMax - nthMin;
        System.out.println((M + 1) + "th Maximum Number = " + mthMax);
        System.out.println((N + 1) + "th Minimum Number = " + nthMin);
        System.out.println("Sum = " + sum);
        System.out.println("Difference = " + diff);
    }
}
