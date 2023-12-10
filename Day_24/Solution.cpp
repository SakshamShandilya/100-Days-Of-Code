class Solution {
public:
    vector<int> rightSideView(TreeNode* root) {
        if (root == NULL) {
            return {};
        }
        queue<TreeNode*> q;
        q.push(root);        
        vector<int> result;        
        while (!q.empty()) {
            int n = q.size();            
            for (int i = n; i > 0; i--) {
                TreeNode* node = q.front();
                q.pop();                
                if (i == n) {
                    result.push_back(node->val);
                }                
                if (node->right != NULL) {
                    q.push(node->right);
                }
                if (node->left != NULL) {
                    q.push(node->left);
                }
            }
        }        
        return result;
    }
};
