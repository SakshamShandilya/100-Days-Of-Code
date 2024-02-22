class Solution {
	int subsequenceCount(String S, String T) {
		int mod = 1000000007;
		
		int m = T.length();
		int n = S.length();
		
		if (m > n) {
			return 0;
		}
		
		int mat[][] = new int[m + 2][n + 2];
		
		for (int i = 1; i <= m; i++) {
			mat[i][0] = 0;
		}
		
		for (int j = 0; j <= n; j++) {
			mat[0][j] = 1;
		}
		
		for (int i = 1; i <= m; i++) {
			for (int j = 1; j <= n; j++) {
				
				if (T.charAt(i - 1) != S.charAt(j - 1)) {
					mat[i][j] = mat[i][j - 1] % mod;
				}
				else {
					mat[i][j] = (mat[i][j - 1] % mod + mat[i - 1][j - 1] % mod) % mod;
				}
			}
		}
		return mat[m][n] % mod;
	}
}
