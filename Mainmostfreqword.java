import java.util.*;

public class Mainmostfreqword {
    public static void main(String[] args) {
        String paragraph = "Ram hit a ball, the hit ball flew far after it was hit";
        String[] banned = {"hit"};
        System.out.println("Most Frequent Word: " + mostFrequentWord(paragraph, banned));
    }

    public static String mostFrequentWord(String paragraph, String[] banned) {
        Set<String> bannedSet = new HashSet<>(Arrays.asList(banned));
        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : paragraph.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+")) {
            if (!bannedSet.contains(word)) {
                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
            }
        }
        return Collections.max(wordCount.entrySet(), Map.Entry.comparingByValue()).getKey();
    }
}
