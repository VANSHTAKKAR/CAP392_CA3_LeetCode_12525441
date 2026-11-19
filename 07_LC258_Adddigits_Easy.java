class Solution {
    public int addDigits(int num) {
        if (num == 0) {
            return 0;
        }
        if (num % 9 == 0) {
            return 9;
        }
        return num % 9;
    }

    public static void main(String[] args) {
        Solution solver = new Solution();
        int testInput = 38;
        int result = solver.addDigits(testInput);
        System.out.println(result);
    }
}
