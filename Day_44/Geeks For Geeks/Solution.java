class Solution {
    public static boolean isPossible(int N, int[] coins) {
        int sum = 0;
        for (int i = 0; i < N; i++)
            sum += coins[i];

        boolean[][] isSum = new boolean[N + 1][sum + 1];
        for (int i = 0; i <= N; i++)
            isSum[i][0] = true;
        for (int i = 1; i <= sum; i++)
            isSum[0][i] = false;

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= sum; j++) {
                if (j < coins[i - 1])
                    isSum[i][j] = isSum[i - 1][j];
                if (j >= coins[i - 1])
                    isSum[i][j] = isSum[i - 1][j] || isSum[i - 1][j - coins[i - 1]];
            }
        }

        for (int i = 1; i <= sum; i++) {
            if ((i % 20 == 0 || i % 24 == 0 || i == 2024) && isSum[N][i])
                return true;
        }
        return false;
    }
}
