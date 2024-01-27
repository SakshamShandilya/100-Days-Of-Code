class Solution{
    static String str = "";
    static char name = 'A';
    static String matrixChainOrder(int p[], int n){
        str = "";
        name = 'A';
        int[][] dp = new int[n][n];
        int[][] bracket = new int[n][n];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                dp[i][j] = -1;
            }
        }

        solve(p, 1, n-1, dp,bracket);
        printOptimalParenthesis(1, n-1, bracket);
        return str;
    }
    public static void printOptimalParenthesis(int i, int j, int[][] memoization ) {
        if (i == j) {
            str = str + name;
            name++;
        } else {
            int k = memoization[i][j];
            str = str + "(";
            printOptimalParenthesis(i, k, memoization);
            printOptimalParenthesis(k + 1, j, memoization);
            str = str + ")";
        }
    }
    static int solve(int[] p, int i, int j, int[][] dp, int[][] bracket) {
        if(i >= j) {
            return 0;
        }
        if(dp[i][j] != -1)return dp[i][j];
        int min = Integer.MAX_VALUE;
        for(int k = i; k < j; k++) {
            int temp = solve(p, i, k, dp, bracket) + solve(p, k+1, j, dp, bracket) + p[i-1] * p[k] * p[j];
            if(min > temp) {
                min = Math.min(min, temp);
                dp[i][j] = min;
                bracket[i][j] = k;
            }
        }
        return min;
    }
}
