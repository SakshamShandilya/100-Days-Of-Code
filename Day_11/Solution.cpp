class Solution {
public:

int firstOcc(vector<int>&nums, int target){
    int n=nums.size() , low=0, high=n-1;
    while(low <= high){
        int mid = (low + high)/2;
        if(nums[mid] > target)high = mid - 1;
        else if(nums[mid] < target)low = mid + 1;
        else
        {
            if(mid == 0 || nums[mid-1]!=nums[mid])return mid;
            else
            high = mid - 1;
        }
    }
    return -1;
}
int lastOcc(vector<int>&nums, int target){
    int n=nums.size() , low=0, high=n-1;
    while(low <= high){
        int mid = (low + high)/2;
        if(nums[mid] > target)high = mid - 1;
        else if(nums[mid] < target)low = mid + 1;
        else
        {
            if(mid == n-1 || nums[mid+1]!=nums[mid])return mid;
            else
            low = mid + 1;
        }
    }
    return -1;
}

    vector<int> searchRange(vector<int>& nums, int target) {
        return {firstOcc(nums , target) , lastOcc(nums , target)};
    }
};