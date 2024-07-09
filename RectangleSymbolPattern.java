import java.util.Scanner;

public class RectangleSymbolPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the symbol: ");
        String symbol = scanner.next();
        System.out.print("Rows: ");
        int rows = scanner.nextInt();
        System.out.print("Columns: ");
        int columns = scanner.nextInt();
        
        for (int i = 0; i < rows; i++) {
            System.out.println(symbol.repeat(columns));
        }
        
        scanner.close();
    }
}
