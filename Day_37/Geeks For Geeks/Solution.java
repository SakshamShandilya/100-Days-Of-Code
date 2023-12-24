class Solution {
    static class Pair implements Comparable<Pair> {
        int price;
        int day;

        public Pair(int price, int day) {
            this.price = price;
            this.day = day;
        }

        @Override
        public int compareTo(Pair other) {
            return Integer.compare(this.price, other.price);
        }
    }
    public static int buyMaximumProducts(int n, int k, int[] price) {
        Pair[] pairs = new Pair[n];

        for (int i = 0; i < n; i++) {
            pairs[i] = new Pair(price[i], i + 1);
        }

        Arrays.sort(pairs);

        int totalStocks = 0;
        for (Pair pair : pairs) {
            int currentDay = pair.day;
            int currentPrice = pair.price;

            int maxStocks = Math.min(currentDay, k / currentPrice);
            totalStocks += maxStocks;
            k -= maxStocks * currentPrice;
        }

        return totalStocks;
    }
}
