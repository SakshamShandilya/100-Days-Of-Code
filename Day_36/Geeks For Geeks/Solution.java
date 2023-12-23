class Solution {
    public int countOccurence(int[] arr, int n, int k) {
        int requiredFrequency = n / k;
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            frequencyMap.put(arr[i], frequencyMap.getOrDefault(arr[i], 0) + 1);
        }

        int count = 0;
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > requiredFrequency) {
                count++;
            }
        }

        return count;
    }
}
