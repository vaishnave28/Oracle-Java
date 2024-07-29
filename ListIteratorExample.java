import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
public class ListIteratorExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("C", "A", "E", "B", "D", "F"));
        ListIterator<String> iterator = list.listIterator();
        
        // Append + symbol
        while (iterator.hasNext()) {
            iterator.set(iterator.next() + "+");
        }

        // Print in reverse order
        Collections.reverse(list);
        System.out.println("List in reverse with +: " + list);
    }
}
29
