class Solution {
    public String removeKdigits(String S, int K) {
        ArrayList<Character> ans = new ArrayList<Character>();
        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            while (ans.size() > 0 && ans.get(ans.size() - 1) > c && K > 0) {
                ans.remove(ans.size() -
                           1); 
                K--;
            }
            if (ans.size() > 0 || c != '0') {
                ans.add(c);
            }
        }
        while (ans.size() > 0 && K-- > 0) {
            ans.remove(ans.size() - 1);
        }
        if (ans.size() == 0) {
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        for (Character ch : ans) {
            sb.append(ch);
        }
        return sb.toString();
    }
}
