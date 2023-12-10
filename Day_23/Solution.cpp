
class Solution {
public:
    void flatten(TreeNode* root) {
        if (root) revPreOrder(root);
    }
private:
    TreeNode* head = nullptr;
    void revPreOrder(TreeNode* node) {
        if (node->right) revPreOrder(node->right);
        if (node->left) revPreOrder(node->left);
        node->left = nullptr, node->right = head, head = node;
    }
};
