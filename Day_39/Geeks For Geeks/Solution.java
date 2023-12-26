class Solution {
    static boolean sumZero(int[] temp, int[] starti, int[] endj, int n) {
        Map<Integer, Integer> presum = new HashMap<>();
        int sum = 0;
        int max_length = 0;
        for (int i = 0; i < n; i++) {
            sum += temp[i];

            if (temp[i] == 0 && max_length == 0) {
                starti[0] = i;
                endj[0] = i;
                max_length = 1;
            }
            if (sum == 0) {
                if (max_length < i + 1) {
                    starti[0] = 0;
                    endj[0] = i;
                }
                max_length = i + 1;
            }
            if (presum.containsKey(sum)) {
                int old = max_length;
                max_length = Math.max(max_length, i - presum.get(sum));
                if (old < max_length) {
                    endj[0] = i;
                    starti[0] = presum.get(sum) + 1;
                }
            } else
                presum.put(sum, i);
        }
        return (max_length != 0);
    }
    public static ArrayList<ArrayList<Integer>> sumZeroMatrix(int[][] a) {
        int row = a.length;
        int col = a[0].length;
        int[] temp = new int[row];
        int fup = 0, fdown = 0, fleft = 0, fright = 0;
        int sum;
        int up, down;
        int maxl = Integer.MIN_VALUE;

        for (int left = 0; left < col; left++) {
            Arrays.fill(temp, 0);
            for (int right = left; right < col; right++) {
                for (int i = 0; i < row; i++)
                    temp[i] += a[i][right];
                int[] starti = new int[1];
                int[] endj = new int[1];
                boolean sumResult = sumZero(temp, starti, endj, row);
                int ele = (endj[0] - starti[0] + 1) * (right - left + 1);

                if (sumResult && ele > maxl) {
                    fup = starti[0];
                    fdown = endj[0];
                    fleft = left;
                    fright = right;
                    maxl = ele;
                }
            }
        }
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        if (fup == 0 && fdown == 0 && fleft == 0 && fright == 0 && a[0][0] != 0) {
            return ans;
        }
        for (int j = fup; j <= fdown; j++) {
            ArrayList<Integer> cnt = new ArrayList<>();
            for (int i = fleft; i <= fright; i++){
                cnt.add(a[j][i]);
            }
            ans.add(cnt);
        }
        return ans;
    }
}
