class Solution{
    Node cloneGraph(Node source){
        Queue<Node> q = new LinkedList<Node>();
        q.add(source);
        HashMap<Node,Node> hm =
                        new HashMap<Node,Node>();
        hm.put(source,new Node(source.val));
        while (!q.isEmpty())
        {
            Node u = q.poll();
            Node cloneNodeU = hm.get(u);
            if (u.neighbors != null)
            {
                ArrayList<Node> v = u.neighbors;
                for (Node graphNode : v)
                {
                    Node cloneNodeG = hm.get(graphNode);
                    if (cloneNodeG == null)
                    {
                        q.add(graphNode);
                        cloneNodeG = new Node(graphNode.val);
                        hm.put(graphNode,cloneNodeG);
                    }
                    cloneNodeU.neighbors.add(cloneNodeG);
                }
            }
        }
        return hm.get(source);
    }
}
