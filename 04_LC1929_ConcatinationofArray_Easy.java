import java.util.Arrays;

class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2 * n];
        for (int i = 0; i < n; i++) {
            ans[i] = nums[i];
            ans[i + n] = nums[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        Solution solver = new Solution();
        int[] testInput = {1, 2, 1};
        int[] result = solver.getConcatenation(testInput);
        System.out.println(Arrays.toString(result));
    }
}
