public class Mainmissingnum {
    public static void main(String[] args) {
        int[] nums = {3, 0, 1};
        System.out.println(missingNumber(nums));
    }

    static int missingNumber(int[] nums) {
        int sum = 0, n = nums.length;
        for (int num : nums) sum += num;
        return n * (n + 1) / 2 - sum;
    }
}
