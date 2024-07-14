import java.util.Arrays;
public class GenericSorter<T extends Comparable<T>> {
    private T[] values;

    public GenericSorter(T[] values) {
        this.values = values;
    }
    public void sortAndPrint() {
        Arrays.sort(values);
        System.out.println(Arrays.toString(values));
    }
    public static void main(String[] args) {
        new GenericSorter<>(new Integer[]{4, 3, 2, 1}).sortAndPrint();
        new GenericSorter<>(new String[]{"banana", "apple", "cherry"}).sortAndPrint();
    }
}
