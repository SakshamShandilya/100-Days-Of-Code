class Solution
{
    static public boolean dfs(ArrayList<ArrayList<Integer>> adjList, int numCourses, int index, boolean[] visited, boolean[] recStack, Stack<Integer> topologicalStack){
        visited[index] = true;
        recStack[index] = true;
        for(Integer courseIndex : adjList.get(index)){
            if(!visited[courseIndex]){
                boolean isCycle = dfs(adjList, numCourses, courseIndex, visited, recStack, topologicalStack );
                if(isCycle){
                    return true;
                }
            }else if(recStack[courseIndex]){
                return true;
            }
        }
        recStack[index] = false;
        topologicalStack.push(index);
        return false;
    }
    static public ArrayList<ArrayList<Integer>> getadjList(int numCourses, ArrayList<ArrayList<Integer>> prerequisites){
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<ArrayList<Integer>>(numCourses);
        for(int index = 0; index< numCourses; index++){
            adjList.add(new ArrayList<Integer>());
        }
        for(ArrayList<Integer> prereqPair:  prerequisites){
             adjList.get(prereqPair.get(1)).add(prereqPair.get(0));
         }
        return adjList;
    }
    static int[] findOrder(int n, int m, ArrayList<ArrayList<Integer>> prerequisites) 
    {
        boolean[] visited = new boolean[n];
        boolean[] recStack = new boolean[n];
        boolean isCycle = false;
        Stack<Integer> topologicalStack = new Stack<Integer>();
        ArrayList<ArrayList<Integer>> adjList =  getadjList(n, prerequisites);
        for(int i=0; i<n;i++){
            if(!visited[i])
                isCycle = isCycle | dfs(adjList, n, i, visited, recStack, topologicalStack);
        }
        if(!isCycle){
            int[] courseOrder = new int[n];
            for(int i=0; i< n; i++){
                courseOrder[i] = topologicalStack.pop();            
            }
            return courseOrder;
        }else{
            int[] courseOrder = {};
            return courseOrder;
        }
    }
}
