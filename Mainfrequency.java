import java.util.*;

public class Mainfrequency {
    public static void main(String[] args) {
        int[] arr = {1, 2, 8, 3, 2, 2, 2, 5, 1};
        Map<Integer, Integer> frequency = new HashMap<>();
        for (int num : arr) {
            frequency.put(num, frequency.getOrDefault(num, 0) + 1);
        }
        frequency.forEach((k, v) -> System.out.println("Element: " + k + ", Frequency: " + v));
    }
}
