class Solution {
    static int minCandy(int N, int ratings[]) {
        if (N == 0) {
            return 0;
        }

        int[] candies = new int[N];
        Arrays.fill(candies, 1);

        // Left to right pass
        for (int i = 1; i < N; i++) {
            if (ratings[i] > ratings[i - 1]) {
                candies[i] = candies[i - 1] + 1;
            }
        }

        // Right to left pass
        for (int i = N - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1]) {
                candies[i] = Math.max(candies[i], candies[i + 1] + 1);
            }
        }

        // Sum up the candies array
        int minCandies = 0;
        for (int candy : candies) {
            minCandies += candy;
        }

        return minCandies;
    }
}
