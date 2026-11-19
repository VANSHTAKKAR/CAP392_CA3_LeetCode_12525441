import java.util.Arrays;

class Solution {
    public int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }
        return nums;
    }

    public static void main(String[] args) {
        Solution solver = new Solution();
        int[] testInput = {1, 2, 3, 4};
        int[] result = solver.runningSum(testInput);
        System.out.println(Arrays.toString(result));
    }
}
