import java.util.*;
public class SortHashMap {
    public static void main(String[] args) {
        Map<String, Integer> map = new TreeMap<>(Map.of(
            "John", 25,
            "Jane", 30,
            "Doe", 20,
            "Smith", 35
        ));
        map.forEach((key, value) -> System.out.println("Key: " + key + ", Value: " + value));
    }
}
