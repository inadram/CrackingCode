package dataStructures.treesAndGraphs.Five;

import dataStructures.treesAndGraphs.lib.tree.TreeNode;

/*
            100
         50     150
       40  65
             70
               102
    */


public class BinarySearchTreeMinMaxDFS {
	public boolean check(TreeNode treeNode) {
		return minMaxDFS(treeNode, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}

	private boolean minMaxDFS(TreeNode treeNode, int minValue, int maxValue) {
		if (treeNode == null) {
			return true;
		}
		if (treeNode.data < minValue || treeNode.data > maxValue) {
			return false;
		}

		return minMaxDFS(treeNode.left, minValue, treeNode.data) && minMaxDFS(treeNode.right, treeNode.data, maxValue);
	}


}
