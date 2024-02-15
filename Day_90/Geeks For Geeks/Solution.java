class Solution {
    public int isPossible(int[][] paths) {
        boolean f = true;
        for (int i = 0; i < paths.length; i++) {
            int cntOfOne = 0;
            for (int j = 0; j < paths[i].length; j++) {
                cntOfOne += paths[i][j] == 1 ? 1 : 0;
            }
            if ((cntOfOne & 1) != 0 || cntOfOne == 0) {
                f = false;
            }
        }
        if (paths.length == 1) {
            return 1;
        }
        return f ? 1 : 0;
    }
}
