class Solution {
    public static ArrayList<Integer> maxMeetings(int N, int[] S, int[] F) {
        ArrayList<Integer> result = new ArrayList<>();
        int[][] meetings = new int[N][3];
        for (int i = 0; i < N; i++) {
            meetings[i][0] = S[i];
            meetings[i][1] = F[i];
            meetings[i][2] = i + 1;
        }
        Arrays.sort(meetings, Comparator.comparingInt(a -> a[1]));

        result.add(meetings[0][2]);
        int prevFinishTime = meetings[0][1];

        for (int i = 1; i < N; i++) {
            int currentStartTime = meetings[i][0];

            if (currentStartTime > prevFinishTime) {
                result.add(meetings[i][2]);
                prevFinishTime = meetings[i][1];
            }
        }
        result.sort(null);
        return result;
    }
}
