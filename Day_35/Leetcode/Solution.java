class Solution {
    public int minDistance(String word1, String word2) {
        int len1 = word1.length();
        int len2 = word2.length();
        int[] editDistance = new int[len2 + 1];
        for (int j = 0; j <= len2; ++j) {
            editDistance[j] = j;
        }
        for (int i = 1; i <= len1; ++i) {
            int prev = editDistance[0];
            editDistance[0] = i;
            for (int j = 1; j <= len2; ++j) {
                int temp = editDistance[j];
                if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
                    editDistance[j] = prev;
                } else {
                    editDistance[j] = Math.min(prev, Math.min(editDistance[j], editDistance[j - 1])) + 1;
                }
                prev = temp;
            }
        }
        return editDistance[len2];
    }
}
