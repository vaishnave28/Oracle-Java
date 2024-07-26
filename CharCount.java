import java.util.Scanner;
public class CharCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int upper = 0, lower = 0, digit = 0;
        while (true) {
            char c = sc.next().charAt(0);
            if (c == '*') break;
            if (Character.isUpperCase(c)) upper++;
            else if (Character.isLowerCase(c)) lower++;
            else if (Character.isDigit(c)) digit++;
        }
        System.out.println("Lowercase=" + lower);
        System.out.println("Uppercase=" + upper);
        System.out.println("Numbers=" + digit);
    }
}
