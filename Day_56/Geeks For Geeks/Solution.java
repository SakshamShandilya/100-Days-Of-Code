class GfG {
    public Queue<Integer> modifyQueue(Queue<Integer> q, int k) {
        Stack<Integer> s = new Stack<>();
        Queue<Integer> qq = new LinkedList<>();
        while (k-- > 0) {
            int a = q.peek();
            q.poll();
            s.push(a);
        }
        while (!s.isEmpty()) {
            int a = s.peek();
            s.pop();
            qq.add(a);
        }
        while (!q.isEmpty()) {
            int a = q.peek();
            q.poll();
            qq.add(a);
        }
        return qq;
    }
}
