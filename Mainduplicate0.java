import java.util.*;

public class Mainduplicate0 {
    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 3, 0, 4, 5, 0};
        duplicateZeros(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void duplicateZeros(int[] arr) {
        int n = arr.length, zeros = 0;
        for (int num : arr) if (num == 0) zeros++;
        for (int i = n - 1; i >= 0; i--) {
            if (i + zeros < n) arr[i + zeros] = arr[i];
            if (arr[i] == 0 && --zeros + i < n) arr[i + zeros] = 0;
        }
    }
}
