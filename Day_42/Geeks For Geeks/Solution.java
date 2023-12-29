class Solution {
    int kSubstrConcat(int n, String s, int k) {
        if (n == k) return 1;
        if (n % k != 0) return 0;

        HashMap<String, Integer> m = new HashMap<>();

        for (int i = 0; i < n; i += k) {
            m.put(s.substring(i, i + k), m.getOrDefault(s.substring(i, i + k), 0) + 1);
        }

        if (m.size() == 1) return 1;
        if (m.size() != 2) return 0;

        int val = 0;
        for (int i : m.values()) {
            val = i;
            break;
        }

        if ((val == (n / k - 1)) || (val == 1)) return 1;

        return 0;
    }
}
