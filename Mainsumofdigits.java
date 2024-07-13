public class Mainsumofdigits {
    public static void main(String[] args) {
        int number = 143;
        System.out.println("Single digit sum: " + sumOfDigits(number));
    }

    public static int sumOfDigits(int number) {
        while (number >= 10) {
            int sum = 0;
            while (number > 0) {
                sum += number % 10;
                number /= 10;
            }
            number = sum;
        }
        return number;
    }
}
