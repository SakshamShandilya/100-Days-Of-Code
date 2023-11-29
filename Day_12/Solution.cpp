class Solution {
public:
    #define DPSolver ios_base::sync_with_stdio(0),cin.tie(0),cout.tie(0);
    int searchInsert(vector<int>& nums, int trgt) {
        DPSolver;
        int b = 0; int e = nums.size(); int m = (e+b) / 2; 
        while (e > b){
            if (nums[m] == trgt)
                return m; 
            else if (nums[m] > trgt)
                e = m; 
            else 
                b = m + 1; 
            m = (b+e)/ 2;
        }
        // if( m < nums.size() && m > )
        return m; 
    }
};
