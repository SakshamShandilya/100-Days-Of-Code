class Solution{
    int ctr;
    boolean visited[] = new boolean[100001];
    public void kDistantFromLeafUtil(Node root, int len, int k){
        if (root == null) return;
        visited[len] = false;
        len++;
        if (root.left == null && root.right == null &&
            len-k-1 >= 0 && visited[len-k-1] == false)
        {
            ctr++;
            visited[len-k-1] = true;
            return;
        }
        kDistantFromLeafUtil(root.left, len, k);
        kDistantFromLeafUtil(root.right, len, k);
    }
    public int printKDistantfromLeaf(Node root, int k)
    {
        ctr = 0;
        Arrays.fill(visited, false);
        kDistantFromLeafUtil(root, 0, k);
        return ctr;
    }

}
