public class CompositeNumbers {

    // Function to check if a number is composite
    public static boolean isComposite(int n) {
        if (n <= 1) {
            return false;
        }
        if (n <= 3) {
            return false;
        }
        if (n % 2 == 0 || n % 3 == 0) {
            return true;
        }
        for (int i = 5; i * i <= n; i = i + 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return true;
            }
        }
        return false;
    }

    // Function to count composite numbers in an array
    public static int countCompositeNumbers(int[] arr) {
        int count = 0;
        for (int num : arr) {
            if (isComposite(num)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr1 = {16, 18, 27, 16, 23, 21, 19};
        int[] arr2 = {26, 28, 37, 26, 33, 31, 29};

        int count1 = countCompositeNumbers(arr1);
        int count2 = countCompositeNumbers(arr2);

        System.out.println("Number of Composite Numbers in arr1: " + count1);
        System.out.println("Number of Composite Numbers in arr2: " + count2);
    }
}
