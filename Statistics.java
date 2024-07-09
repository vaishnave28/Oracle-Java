import java.util.*;

public class Statistics {
    public static void main(String[] args) {
        int[] arr = {16, 18, 27, 16, 23, 21, 19};
        System.out.println("Mean = " + mean(arr));
        System.out.println("Median = " + median(arr));
        System.out.println("Mode = " + mode(arr));
    }

    static double mean(int[] arr) {
        return Arrays.stream(arr).average().orElse(0);
    }

    static double median(int[] arr) {
        Arrays.sort(arr);
        int mid = arr.length / 2;
        return arr.length % 2 == 0 ? (arr[mid - 1] + arr[mid]) / 2.0 : arr[mid];
    }

    static int mode(int[] arr) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int num : arr) freq.put(num, freq.getOrDefault(num, 0) + 1);
        return Collections.max(freq.entrySet(), Map.Entry.comparingByValue()).getKey();
    }
}
