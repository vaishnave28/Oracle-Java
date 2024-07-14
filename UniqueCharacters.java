import java.util.*;
public class UniqueCharacters {
    public static void main(String[] args) {
        String input = "abcb";
        Set<Character> uniqueChars = new HashSet<>();
        Set<Character> repeatedChars = new HashSet<>();
        for (char c : input.toCharArray()) {
            if (!repeatedChars.contains(c)) {
                (uniqueChars.contains(c) ? uniqueChars.remove(c) : uniqueChars.add(c));
                repeatedChars.add(c);
            }
        }
        System.out.println("Unique characters:");
        uniqueChars.forEach(System.out::println);
    }
}
