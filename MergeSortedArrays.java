import java.util.*;

public class MergeSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 4, 5}, arr2 = {2, 4, 6, 8};
        List<Integer> merged = new ArrayList<>();
        for (int i = 0, j = 0; i < arr1.length || j < arr2.length; ) {
            if (i < arr1.length && (j == arr2.length || arr1[i] <= arr2[j])) merged.add(arr1[i++]);
            else merged.add(arr2[j++]);
        }
        System.out.println(merged);
    }
}
