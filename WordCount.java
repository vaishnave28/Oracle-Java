import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
public class WordCount {
    public static void main(String[] args) {
        String text = "This is a test. This test is only a test.";
        // Remove non-word characters and split into words
        String[] words = text.toLowerCase().replaceAll("[^a-zA-Z ]", "").split("\\s+");
        // Count occurrences of each word using HashMap
        Map<String, Long> wordCount = Arrays.stream(words)
                .collect(HashMap::new, (map, word) -> map.merge(word, 1L, Long::sum), HashMap::putAll);
        // Print the word count
        wordCount.forEach((word, count) -> System.out.println(word + ": " + count));
    }
}
