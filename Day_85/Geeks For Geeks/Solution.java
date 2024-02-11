class Solution{
    public long f(int i, int j, int n, int k, int a[][], long dp[][][]) {
        if (i == n - 1 && j == n - 1 && k == a[i][j]) {
            return 1;
        }
        if (i >= n || j >= n || k < 0) {
            return 0;
        }
        if (dp[i][j][k] != -1) {
            return dp[i][j][k];
        }
        long d = f(i + 1, j, n, k - a[i][j], a, dp);
        long r = f(i, j + 1, n, k - a[i][j], a, dp);
        return dp[i][j][k] = d + r;
    }
    public long numberOfPath(int N, int K, int[][] arr) {
        long dp[][][] = new long[N][N][K + 1];
        for (long row[][] : dp) {
            for (long row2[] : row) {
                Arrays.fill(row2, -1);
            }
        }
        
        return f(0, 0, N, K, arr, dp);
    }
}
