package dataStructures.treesAndGraphs.Five;

import dataStructures.treesAndGraphs.lib.tree.TreeNode;

/*
            100
         50       150
       40  65  (98)
             70
               102(99)

    */
public class BinarySearchTreeDFS {
	public int previous = Integer.MIN_VALUE;

	public boolean check(TreeNode treeNode) {
		return inOrderDFS(treeNode);
	}

	private boolean inOrderDFS(TreeNode treeNode) {
		if (treeNode == null) return true;
		if (!inOrderDFS(treeNode.left)) return false;
		System.out.println("prev: " + previous);
		System.out.println("data: " + treeNode.data);
		if (previous > treeNode.data) return false;
		previous = treeNode.data;

		if (!inOrderDFS(treeNode.right)) return false;
		return true;
	}
}
