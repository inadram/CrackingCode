package dataStructures.treesAndGraphs.Five;

import dataStructures.treesAndGraphs.lib.tree.TreeNode;

import java.util.ArrayList;

/*
            100
         50     150
       40  65
             70

    */
public class BinarySearchTreeDFSArray {
	public boolean check(TreeNode treeNode) {
		ArrayList<Integer> arrayList = inOrderDFS(treeNode, new ArrayList<Integer>());
		return isSorted(arrayList, 1);
	}

	private boolean isSorted(ArrayList<Integer> arrayList, int index) {
		return arrayList.size() <= index || arrayList.get(index) >= arrayList.get(index - 1) && isSorted(arrayList, index + 1);
	}

	private ArrayList<Integer> inOrderDFS(TreeNode treeNode, ArrayList<Integer> arrayList) {
		if (treeNode == null) return arrayList;
		arrayList = inOrderDFS(treeNode.left, arrayList);
		arrayList.add(treeNode.data);
		return inOrderDFS(treeNode.right, arrayList);
	}
}
