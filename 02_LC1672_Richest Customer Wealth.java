class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        for (int[] customer : accounts) {
            int currentWealth = 0;
            for (int bank : customer) {
                currentWealth += bank;
            }
            maxWealth = Math.max(maxWealth, currentWealth);
        }
        return maxWealth;
    }

    public static void main(String[] args) {
        Solution solver = new Solution();
        int[][] testAccounts = {
            {1, 2, 3},
            {3, 2, 1}
        };
        int result = solver.maximumWealth(testAccounts);
        System.out.println(result);
    }
}
ś