class Solution {
public:
    vector<vector<int>> combinationSum(vector<int>& candidates, int target) {
        vector<vector<int>> result;
        vector<int> currentCombination;

        sort(candidates.begin(), candidates.end());

        backtrack(candidates, target, 0, currentCombination, result);

        return result;
    }

private:
    void backtrack(const vector<int>& candidates, int target, int start,
                   vector<int>& currentCombination, vector<vector<int>>& result) {
        if (target == 0) {
            result.push_back(currentCombination);
            return;
        }

        for (int i = start; i < candidates.size() && candidates[i] <= target; ++i) {
            if (i > start && candidates[i] == candidates[i - 1]) {
                continue;
            }

            currentCombination.push_back(candidates[i]);

            backtrack(candidates, target - candidates[i], i, currentCombination, result);

            currentCombination.pop_back();
        }
    }
};
