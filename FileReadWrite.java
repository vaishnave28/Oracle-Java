import java.io.*;
public class FileReadWrite {
    public static void main(String[] args) {
        try (FileWriter w = new FileWriter("output.txt")) { w.write("Computer Science and Engineering"); }
        catch (IOException e) { System.out.println("Write error: " + e); }
        try (FileReader r = new FileReader("output.txt")) {
            for (int ch; (ch = r.read()) != -1; ) System.out.print((char) ch);
        } catch (IOException e) { System.out.println("Read error: " + e); }
    }
}
