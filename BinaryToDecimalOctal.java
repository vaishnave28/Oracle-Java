public class BinaryToDecimalOctal {
    public static void main(String[] args) {
        String binary = "1101";
        int decimal = binaryToDecimal(binary);
        String octal = decimalToOctal(decimal);
        System.out.println("Decimal Number: " + decimal);
        System.out.println("Octal: " + octal);
    }
    public static int binaryToDecimal(String binary) {
        int decimal = 0;
        int power = 0;
        for (int i = binary.length() - 1; i >= 0; i--) {
            int digit = binary.charAt(i) - '0';
            decimal += digit * Math.pow(2, power);
            power++;
        }
        return decimal;
    }
    public static String decimalToOctal(int decimal) {
        StringBuilder octal = new StringBuilder();
        while (decimal > 0) {
            int rem = decimal % 8;
            octal.append(rem);
            decimal /= 8;
        }
        return octal.reverse().toString();
    }
}
