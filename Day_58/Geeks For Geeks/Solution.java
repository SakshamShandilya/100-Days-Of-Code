class Solution {
    static class Trie {
        boolean leaf;
        Trie[] children;
        Trie() {
            children = new Trie[2];
            leaf = false;
        }
    }
    static boolean insert(Trie head, int[] arr, int N) {
        Trie curr = head;
        for (int i = 0; i < N; i++) {
            if (curr.children[arr[i]] == null)
                curr.children[arr[i]] = new Trie();
            curr = curr.children[arr[i]];
        }
        if (curr.leaf)
            return false;
        return (curr.leaf = true);
    }
    public static ArrayList<Integer> repeatedRows(int[][] matrix, int m, int n) {
        Trie head = new Trie();
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < m; i++)
            if (!insert(head, matrix[i], n))
                ans.add(i);
        return ans;
    }
}
