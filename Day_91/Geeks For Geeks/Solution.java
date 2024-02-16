class Solution {
    private Node prev;

    private void inorder(Node curr) {
        if (curr == null)
            return;
        inorder(curr.left);
        prev.left = null;
        prev.right = curr;
        prev = curr;
        inorder(curr.right);
    }

    public Node flattenBST(Node root) {
        Node dummy = new Node(-1);
        prev = dummy;

        inorder(root);

        prev.left = null;
        prev.right = null;
        Node ret = dummy.right;

        return ret;
    }
}
