import java.io.*;
import java.nio.file.*;
import java.util.stream.Stream;

public class FileCounter {
    public static void main(String[] args) {
        String fileName = "example.txt"; // replace with your file path

        try (Stream<String> lines = Files.lines(Paths.get(fileName))) {
            long lineCount = lines.count();

            String content = new String(Files.readAllBytes(Paths.get(fileName)));
            long charCount = content.length();
            long wordCount = Stream.of(content.split("\\W+")).count();

            System.out.println("Lines: " + lineCount);
            System.out.println("Words: " + wordCount);
            System.out.println("Characters: " + charCount);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
