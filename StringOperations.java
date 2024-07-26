import java.util.Scanner;
public class StringOperations {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        System.out.println("Replaced: " + input.replace("Saveetha", "XYZ"));
        System.out.println("Length: " + input.length());
        System.out.println("Uppercase: " + input.toUpperCase());

        s.close();
    }
}
