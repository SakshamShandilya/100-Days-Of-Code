class Solution {
    int time = 0;
    public ArrayList<ArrayList<Integer>> criticalConnections(int v, ArrayList<ArrayList<Integer>> adj) {
        int[] id = new int[v];
        boolean[] visited = new boolean[v];
        int[] low = new int[v];
        ArrayList<ArrayList<Integer>> out = new ArrayList<>();
        for (int i = 0; i < v; i++) {
            if (!visited[i]) {
                DFSUtil(i, -1, adj, visited, id, low, out);
            }
        }
        Collections.sort(out, new Comparator<ArrayList<Integer>>() {
            public int compare(ArrayList<Integer> o1, ArrayList<Integer> o2) {
                return (o1.get(0) - o2.get(0) == 0) ? o1.get(1) - o2.get(1) : o1.get(0) - o2.get(0);
            }
        });
        
        return out;
    }
    private void DFSUtil(int u, int parent, ArrayList<ArrayList<Integer>> adj, boolean[] visited, int[] id, int[] low,
        ArrayList<ArrayList<Integer>> out) {
        visited[u] = true;
        id[u] = low[u] = ++time; 
        Iterator<Integer> it = adj.get(u).iterator();
        while (it.hasNext()) {
            int v = it.next();
            if (v == parent)
                continue;
            if (!visited[v]) {
                DFSUtil(v, u, adj, visited, id, low, out);
                low[u] = Math.min(low[v], low[u]);
                if (low[v] > id[u]) {
                    ArrayList<Integer> edge = new ArrayList<Integer>();
                    edge.add(u < v ? u : v);
                    edge.add(u < v ? v : u);
                    out.add(edge);
                }
            } else {
                low[u] = Math.min(id[v], low[u]);
            }
        }
    }
}
