class Solution {
    void computeLPSArray(String pat, int M, int[] lps) {
        int len = 0;
        int i;
        lps[0] = 0;
        i = 1;
        while (i < M) {
            if (pat.charAt(i) == pat.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len != 0) {
                    len = lps[len - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
    }
    ArrayList<Integer> search(String pat, String txt) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        int M = pat.length();
        int N = txt.length();
        int[] lps = new int[M + 1];
        int j = 0;
        computeLPSArray(pat, M, lps);
        int f = 0;
        int i = 0; 
        while (i < N) {
            if (pat.charAt(j) == txt.charAt(i)) {
                j++;
                i++;
            }
            if (j == M) {
                f++;
                res.add(i - j + 1);
                j = lps[j - 1];
            } else if (i < N && pat.charAt(j) != txt.charAt(i)) {
                if (j != 0)
                    j = lps[j - 1];
                else
                    i = i + 1;
            }
        }
        if (f == 0)
            res.add(-1); 

        return res;
    }
}
