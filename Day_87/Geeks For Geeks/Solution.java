class Solution {
    static long sequence(int n) {
        long MOD = 1000000007;
        long x = 1, ans = 0;
        for (int i = 1; i <= n; ++i) {
            long temp = 1;
            for (int j = 1; j <= i; ++j) {
                temp = (temp * x) % MOD;
                ++x;
            }
            ans = (ans + temp) % MOD;
        }
        return ans;
    }
}
