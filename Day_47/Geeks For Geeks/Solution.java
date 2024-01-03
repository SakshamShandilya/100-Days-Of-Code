class Solution {
    public int smallestSubstring(String S) {
        boolean answerExist = false;
        int lastZero = -1, lastOne = -1, lastTwo = -1;
        int ans = S.length();
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == '0') {
                lastZero = i;
            } else if (S.charAt(i) == '1') {
                lastOne = i;
            } else {
                lastTwo = i;
            }
            if (lastZero != -1 && lastOne != -1 && lastTwo != -1) {
                answerExist = true;
                ans = Math.min(
                    ans,
                    1 + i - Math.min(lastZero, Math.min(lastOne, lastTwo)));
            }
        }
        if (answerExist) {
            return ans;
        }
        return -1;
    }
};
