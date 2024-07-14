import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
public class DistinctCharactersCount {
    public static void main(String[] args) {
        String str = "programming";
        // Count distinct characters and their occurrences
        Map<Character, Long> charCountMap = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        // Print distinct characters and their counts
        System.out.println("Distinct characters and their counts:");
        charCountMap.forEach((key, value) -> System.out.println(key + ": " + value));
    }
}
