package dataStructures.treesAndGraphs.six;

import dataStructures.treesAndGraphs.lib.tree.TreeNode;

public class NextNode {
   /*
                100
             50     150
           40  65
                 70
                   99
                80
              77  88
        */

	public int get(TreeNode node) {
		if (node == null) return 0;
		if (hasRightNode(node)) return getLeftMost(node.right);
		else return getParent(node, node.data);
	}

	private int getLeftMost(TreeNode node) {
		while (node.left != null) {
			node = node.left;
		}
		return node.data;
	}

	private boolean hasRightNode(TreeNode node) {
		return node.right != null;
	}


	private int getParent(TreeNode node, int data) {
		if (node == null) {
			return 0;
		}
		while (data > node.parent.data) {
			node = node.parent;
			if (node.parent == null) return 0;
		}
		return node.parent.data;
	}

}
