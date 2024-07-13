public class Mainsquareroot {
    public static void main(String[] args) {
        int number = 6561;
        System.out.println("Square Roots: " + squareRoot(number));
    }

    public static String squareRoot(int number) {
        if (number < 0) return "Number should be non-negative";
        int root = (int) Math.sqrt(number);
        if (root * root == number) {
            return root + ", " + -root;
        } else {
            return "Not a perfect square";
        }
    }
}
