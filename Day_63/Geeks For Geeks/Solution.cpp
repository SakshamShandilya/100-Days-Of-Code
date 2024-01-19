class Solution
{
  public:
    vector<vector<int>> kTop(vector<int>&a, int n, int k)
    {
        vector<int> top(k + 1);
        vector<vector<int>> ans;
        unordered_map<int, int> freq;
        for (int m = 0; m < n; m++) {
            vector<int>temp;
            freq[a[m]]++;
            top[k] = a[m];
            auto it = find(top.begin(), top.end() - 1, a[m]);
            for (int i = distance(top.begin(), it) - 1; i >= 0; --i) {
                if (freq[top[i]] < freq[top[i + 1]])
                    swap(top[i], top[i + 1]);
                else if ((freq[top[i]] == freq[top[i + 1]])
                         && (top[i] > top[i + 1]))
                    swap(top[i], top[i + 1]);
                else
                    break;
            }
            for (int i = 0; i < k && top[i] != 0; ++i)
                temp.push_back(top[i]);
            ans.push_back(temp);
        }
        return ans;
    }
};
