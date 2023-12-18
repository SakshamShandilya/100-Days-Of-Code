class Solution {
public:
    int longestValidParentheses(string s) {
        int n = s.size();
        if (n <= 1) return 0;
        int ans = 0;
        int start = -1;
        stack<int> stk;

        for (int i = 0; i < n; ++i) {
            if (s[i] == '(') {
                if (start == -1) {
                    start = i;
                }
                stk.push(i);
            } else {
                if (stk.empty()) {
                    start = -1;
                } else {
                    stk.pop();
                    if (stk.empty()) {
                        ans = max(ans, i - start + 1);
                    } else {
                        ans = max(ans, i - stk.top());
                    }
                }
            }
        }
        return ans;
    }
};
