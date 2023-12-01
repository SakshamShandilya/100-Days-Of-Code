class Solution {
    static int max_sum;
    public static int calc(TreeNode root){
        if(root==null) return 0;
        int left=calc(root.left);
        int right=calc(root.right);
        int root_left=root.val+left;
        int root_right=root.val+right;
        int all=root.val+left+right;
        max_sum=Math.max(max_sum,Math.max(Math.max(root_left,root_right),Math.max(all,root.val)));
        return Math.max(Math.max(root.val+left,root.val+right),root.val);
    }
    public int maxPathSum(TreeNode root) {
        max_sum=Integer.MIN_VALUE;
        calc(root);
        int temp=max_sum;
        max_sum=Integer.MIN_VALUE;
        return temp;
    }
}
