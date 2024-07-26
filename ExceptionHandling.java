public class ExceptionHandling {
    public static void main(String[] args) {
        try {
            int a = 10 / 0, arr[] = new int[5], num = arr[10];
            String str = null; str.length();
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException | NullPointerException e) {
            System.out.println("Exception: " + e);
        }
    }
}
