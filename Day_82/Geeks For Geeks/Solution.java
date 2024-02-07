class GfG {
    Node LCA(Node root, int n1, int n2) {
        if (root == null) return null;
        if (root.data == n1 || root.data == n2) return root;
        Node l = LCA(root.left, n1, n2);
        Node r = LCA(root.right, n1, n2);
        if (l != null && r != null) return root;
        if (l == null && r == null) return null;
        return (l != null) ? l : r;
    }
    int findDist(Node root, int a, int b) {
        int x = pathLength(root, a) - 1;
        int y = pathLength(root, b) - 1;
        int lcadata = LCA(root, a, b).data;
        int lcaDistance = pathLength(root, lcadata) - 1;
        return (x + y) - 2 * lcaDistance;
    }
    int pathLength(Node root, int n1) {
        if (root == null)
            return 0;
        else {
            int x = 0;
            if ((root.data == n1) || (x = pathLength(root.left, n1)) > 0 ||
                (x = pathLength(root.right, n1)) > 0)
                return x + 1;
        }
        return 0;
    }
}
