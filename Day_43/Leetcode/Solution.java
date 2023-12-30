class Solution {
    public boolean canPartition(int[] nums) {
        int totalSum = 0;
        
        for (int num : nums) {
            totalSum += num;
        }
        
        if (totalSum % 2 != 0) return false;
        int subSetSum = totalSum / 2;
        int n = nums.length;
        Boolean[][] memo = new Boolean[n + 1][subSetSum + 1];
        return dfs(nums, n - 1, subSetSum, memo);
    }

    public boolean dfs(int[] nums, int n, int subSetSum, Boolean[][] memo) {
        
        if (subSetSum == 0)
            return true;
        if (n == 0 || subSetSum < 0)
            return false;
        
        if (memo[n][subSetSum] != null)
            return memo[n][subSetSum];
        boolean result = dfs(nums, n - 1, subSetSum - nums[n - 1], memo) ||
                dfs(nums, n - 1, subSetSum, memo);
        
        memo[n][subSetSum] = result;
        return result;
    }
}
