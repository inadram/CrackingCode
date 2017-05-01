package dataStructures.treesAndGraphs.six;

import dataStructures.treesAndGraphs.lib.tree.TreeNode;

public class NextNodeRecursive {
	/*
				 100
			  50     150
			40  65
				  70
					99
				 80
			   77  88
		 */
	public int get(final TreeNode current) {
		if (current.right != null) return leftMost(current.right);
		return topParent(current.data, current.parent);
	}

	private int leftMost(final TreeNode current) {
		if (current.left == null) return current.data;
		return leftMost(current.left);
	}

	private int topParent(final int childData, final TreeNode current) {
		if (current == null) throw new RuntimeException("not found");
		if (childData < current.data) return current.data;
		return topParent(childData, current.parent);
	}
}
