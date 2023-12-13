class Solution {
    int ans=0;
    int count=0;
    public int kthSmallest(TreeNode root, int k) {
        inOrder(root,k);
        return ans;
        
    }
    public void inOrder(TreeNode root,int k){
        if(root==null) return;
        
        inOrder(root.left,k);
        count++;
        if(count==k){
            ans=root.val;
            return;
        }
        inOrder(root.right,k);

    }

}
