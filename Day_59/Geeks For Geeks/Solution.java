class Solution {
    private int dpf(int i, int j, int[][] dp, int[] cost) {
        if (i == dp.length) return 0;
        if (dp[i][j] != -1) return dp[i][j];

        dp[i][j] = dpf(i + 1, j, dp, cost);
        if (j >= cost[i]) {
            dp[i][j] = Math.max(dp[i][j], 1 + dpf(i + 1, j - cost[i] + ((9 * cost[i]) / 10), dp, cost));
        }
        return dp[i][j];
    }

    public int max_courses(int n, int total, int[] cost) {
        int[][] dp = new int[n][total + 1];
        for (int i = 0; i < n; i++) {
            Arrays.fill(dp[i], -1);
        }
        return dpf(0, total, dp, cost);
    }
