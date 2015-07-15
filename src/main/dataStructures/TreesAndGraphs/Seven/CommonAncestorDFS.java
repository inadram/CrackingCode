package main.dataStructures.TreesAndGraphs.Seven;

import main.dataStructures.TreesAndGraphs.Lib.Tree.TreeNode;

public class CommonAncestorDFS {

    /*
               100
            50     150
          40  65
                70
             68    99
           66     80
               77  88
       */

    public TreeNode find(TreeNode treeNode, TreeNode first, TreeNode second) {
        if (treeNode == null) {
            return null;
        }
        boolean firstIsLeft = isContainsNodes(treeNode.left, first);
        boolean secondIsLeft = isContainsNodes(treeNode.left, second);
        if (firstIsLeft ^ secondIsLeft) return treeNode;
        TreeNode node = (firstIsLeft) ? treeNode.left : treeNode.right;
        return find(node, first, second);
    }


    private boolean isContainsNodes(TreeNode treeNode, TreeNode node) {
        if (node == treeNode) return true;
        if (treeNode == null) return false;
        return isContainsNodes(treeNode.left, node) || isContainsNodes(treeNode.right, node);
    }
}
