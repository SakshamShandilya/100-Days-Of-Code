class Solution {
    public long maxSumWithK(long[] a, long n, long k) {
        long[] maxSum = new long[(int) n];
        maxSum[0] = a[0];
        long currMax = a[0];
        for (int i = 1; i < n; i++) {
            currMax = Math.max(a[i], currMax + a[i]);
            maxSum[i] = currMax;
        }
        long sum = 0;
        for (int i = 0; i < k; i++) sum += a[i];
        long result = sum;
        for (int i = (int) k; i < n; i++) {
            sum = sum + a[i] - a[i - (int) k];
            result = Math.max(result, sum);
            result = Math.max(result, sum + maxSum[i - (int) k]);
        }
        return result;
    }
}
