class Solution {
    public boolean isTree(int n, int m, ArrayList<ArrayList<Integer>> edges) 
    {
        if (m != n - 1)
            return false;
        boolean[] vis = new boolean[n];
        ArrayList<Integer>[] adj = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            adj[i] = new ArrayList<>();
        }
        for (ArrayList<Integer> edge : edges) {
            adj[edge.get(0)].add(edge.get(1));
            adj[edge.get(1)].add(edge.get(0));
        }
        int node = 0;
        Queue<Integer> q = new LinkedList<>();
        vis[node] = true;
        int visited = 1;
        q.offer(node);
        while (!q.isEmpty()) {
            int curr = q.poll();
            for (int neighbor : adj[curr]) {
                if (!vis[neighbor]) {
                    vis[neighbor] = true;
                    visited++;
                    q.offer(neighbor);
                }
            }
        }
        return visited == n;
    }
}
