public class Mainarmstrong {
    public static void main(String[] args) {
        int number = 153;
        System.out.println("Is Armstrong: " + isArmstrong(number));
    }

    public static boolean isArmstrong(int number) {
        int sum = 0, temp = number, digits = String.valueOf(number).length();
        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }
        return sum == number;
    }
}
