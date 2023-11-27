class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        List<String> currentPartition = new ArrayList<>();
        backtrack(result, currentPartition, s, 0);
        return result;
    }

    private void backtrack(List<List<String>> result, List<String> currentPartition, String s, int start) {
        if (start == s.length()) {
            result.add(new ArrayList<>(currentPartition));
            return;
        }

        for (int end = start; end < s.length(); end++) {
            if (isPalindrome(s, start, end)) {
                currentPartition.add(s.substring(start, end + 1));
                backtrack(result, currentPartition, s, end + 1);
                currentPartition.remove(currentPartition.size() - 1);
            }
        }
    }
    private boolean isPalindrome(String s, int start, int end) {
        while (start < end) {
            if (s.charAt(start++) != s.charAt(end--)) {
                return false;
            }
        }
        return true;
    }
}
