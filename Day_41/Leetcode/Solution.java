class Solution {
    public int lengthOfLIS(int[] nums) {
        int[] tails = new int[nums.length];
        int size = 0;
        for (int x : nums) {
            int i = Arrays.binarySearch(tails, 0, size, x);
            if (i < 0) {
                i = -(i + 1);
            }
            tails[i] = x;
            if (i == size) {
                ++size;
            }
        }
        return size;
    }
}
