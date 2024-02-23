class Solution {
    public static int maxProfit(int n, int[] price) {
        int[] profit = new int[n];
        int maxPrice = price[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            if (price[i] > maxPrice)
                maxPrice = price[i];
            
            profit[i] = Math.max(profit[i + 1], maxPrice - price[i]);
        }
        int minPrice = price[0];
        for (int i = 1; i < n; i++) {
            if (price[i] < minPrice)
                minPrice = price[i];
            
            profit[i] = Math.max(profit[i - 1], profit[i] + (price[i] - minPrice));
        }
        return profit[n - 1];
    }
}
