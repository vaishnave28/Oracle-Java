import java.util.*;
public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in array: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element" + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        int[] nonDuplicates = removeDuplicates(array);
        System.out.print("Non-duplicate items: ");
        System.out.print("[");
        for (int i = 0; i < nonDuplicates.length; i++) {
            System.out.print(nonDuplicates[i]);
            if (i < nonDuplicates.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
    public static int[] removeDuplicates(int[] array) {
        Set<Integer> set = new HashSet<>();
        for (int i : array) {
            set.add(i);
        }
        int[] nonDuplicates = new int[set.size()];
        int i = 0;
        for (int num : set) {
            nonDuplicates[i++] = num;
        }
        return nonDuplicates;
    }
}
