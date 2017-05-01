package dataStructures.treesAndGraphs.lib.tree;

public class TreeHeight {
    public static int get(TreeNode tree) {
        if (tree == null) {
            return 0;
        }
        int leftHeight = get(tree.left);
        int rightHeight = get(tree.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }
}
