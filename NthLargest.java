import java.util.Arrays;
public class NthLargest {
    public static void main(String[] args) {
        int[] array = {14, 67, 48, 23, 5, 62};
        int n = 4;
        int result = findNthLargest(array, n);
        System.out.println(n + "th Largest number: " + result);
    }
    public static int findNthLargest(int[] array, int n) {
        Arrays.sort(array); 
        int length = array.length;
        return array[length - n];
    }
}
