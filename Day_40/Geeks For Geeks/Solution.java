class Solution {
    public int[] antiDiagonalPattern(int[][] matrix) {
        int n = matrix.length;
        int[][] b = new int[2 * n - 1][2];
        for (int i = 0; i < n; i++) {
            b[i][0] = 0;
            b[i][1] = i;
        }
        for (int j = 1; j < n; j++) {
            b[j + n - 1][0] = j;
            b[j + n - 1][1] = n - 1;
        }
        ArrayList<Integer> ans = new ArrayList<>();
        int x, y;
        for (int i = 0; i < 2 * n - 1; i++) {
            x = b[i][0];
            y = b[i][1];
            while (x < n && y >= 0) {
                ans.add(matrix[x][y]);
                x += 1;
                y -= 1;
            }
        }

        int[] result = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            result[i] = ans.get(i);
        }

        return result;
    }
}
