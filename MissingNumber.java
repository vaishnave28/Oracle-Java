public class MissingNumber {
    public static void main(String[] args) {
        int[] a = {1, 4, 5, 3, 7, 8, 6}; // example array
        int n = 8; // range from 1 to 8

        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;

        for (int num : a) {
            actualSum += num;
        }

        int missingNumber = expectedSum - actualSum;
        System.out.println("Missing number: " + missingNumber);
    }
}
