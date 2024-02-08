class Leaf {
    int leaflevel = 0;
}
class Solution {
    boolean checkutil(Node node, int level, Leaf leafLevel) {
        if (node == null)
            return true;
        if (node.left == null && node.right == null) {
            if (leafLevel.leaflevel == 0) {
                leafLevel.leaflevel = level;
                return true;
            }
            return (level == leafLevel.leaflevel);
        }
        return (checkutil(node.left, level + 1, leafLevel) && checkutil(node.right, level + 1, leafLevel));
    }
    boolean check(Node root) {
        Leaf mylevel = new Leaf();
        int level = 0;
        return checkutil(root, level, mylevel);
    }
}
