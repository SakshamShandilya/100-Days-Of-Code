class Solution {
public:
    std::vector<std::vector<int>> permute(std::vector<int>& nums) {
        std::vector<std::vector<int>> result;
        std::vector<int> currentPermutation;
        std::vector<bool> used(nums.size(), false); 

        generatePermutations(nums, used, currentPermutation, result);

        return result;
    }
private:
    void generatePermutations(const std::vector<int>& nums, std::vector<bool>& used, std::vector<int>& currentPermutation, std::vector<std::vector<int>>& result) {
        if (currentPermutation.size() == nums.size()) {
            result.push_back(currentPermutation);
            return;
        }

        for (int i = 0; i < nums.size(); ++i) {
            if (!used[i]) {
                used[i] = true;
                currentPermutation.push_back(nums[i]);

                generatePermutations(nums, used, currentPermutation, result);

                used[i] = false;
                currentPermutation.pop_back();
            }
        }
    }
};
