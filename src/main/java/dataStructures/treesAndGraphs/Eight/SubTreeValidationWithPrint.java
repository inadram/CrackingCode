package dataStructures.treesAndGraphs.Eight;

import dataStructures.treesAndGraphs.lib.tree.TreeNode;

import java.util.ArrayList;

public class SubTreeValidationWithPrint {
	public boolean check(TreeNode t1, TreeNode t2) {
		ArrayList<Integer> parent = getNodes(t1, new ArrayList<Integer>());
		ArrayList<Integer> child = getNodes(t2, new ArrayList<Integer>());
		return parent.containsAll(child);
	}

	/*
			100
		 50     150
	   40  65
			 70
		  68    99
		66     80
			77  88
	*/
	private ArrayList<Integer> getNodes(TreeNode t1, ArrayList<Integer> nodes) {
		if (t1 == null) {
			return nodes;
		}
		nodes.add(t1.data);
		nodes = getNodes(t1.left, nodes);
		return getNodes(t1.right, nodes);
	}


}
