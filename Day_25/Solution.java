class Solution {
    public TreeNode invertTree(TreeNode root) {
        if(root == null){
            return root;
        }
        invertTree(root.left);
        invertTree(root.right);
        TreeNode curr = root.left;
        root.left = root.right;
        root.right = curr;
        return root;
    }
}
