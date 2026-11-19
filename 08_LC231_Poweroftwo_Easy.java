class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }
        return (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {
        Solution solver = new Solution();
        int testInput = 16;
        boolean result = solver.isPowerOfTwo(testInput);
        System.out.println(result);
    }
}
