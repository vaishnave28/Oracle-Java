public class Mainsquarecube {
    public static void main(String[] args) {
        double[] testCases = {0.6, 12, 0, -0.5, 14.25, -296};

        for (double num : testCases) {
            double square = Math.pow(num, 2);
            double cube = Math.pow(num, 3);
            System.out.printf("Given Number: %.2f\n", num);
            System.out.printf("Square Number: %.2f\n", square);
            System.out.printf("Cube Number: %.3f\n", cube);
            System.out.println();
        }
    }
}
