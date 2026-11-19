class Solution {
    public int findNumbers(int[] nums) {
        int evenDigitCount = 0;
        for (int num : nums) {
            int digitCount = 0;
            while (num > 0) {
                digitCount++;
                num /= 10;
            }
            if (digitCount % 2 == 0) {
                evenDigitCount++;
            }
        }
        return evenDigitCount;
    }

    public static void main(String[] args) {
        Solution solver = new Solution();
        int[] testInput = {12, 345, 2, 6, 7896};
        int result = solver.findNumbers(testInput);
        System.out.println(result);
    }
}
