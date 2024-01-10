class Solution{
    int longSubarrWthSumDivByK(int a[], int n, int k) {
        HashMap<Integer, Integer> um = new HashMap<>();
        int[] mod_arr = new int[n];
        int max = 0, curr_sum = 0;
        for(int i=0; i<n; i++) {
            curr_sum += a[i];
            mod_arr[i] = ((curr_sum%k) + k) % k;
        }
        for(int i=0; i<n; i++) {
            if(mod_arr[i] == 0)
                max = i + 1;
            else if(!um.containsKey(mod_arr[i]))
                um.put(mod_arr[i], i);
            else if(max < (i - um.get(mod_arr[i])))
                max = i - um.get(mod_arr[i]);
        }
        return max;
    } 
}
