package dataStructures.treesAndGraphs.Four;

import dataStructures.LinkedLists.Lib.LinkedListNode;
import dataStructures.treesAndGraphs.lib.tree.TreeNode;

import java.util.ArrayList;

public class BinaryTreeToLinkedList {
	public ArrayList<LinkedListNode> convert(TreeNode treeNode, ArrayList<LinkedListNode> linkedLists, int index) {
		if (treeNode == null) {
			return linkedLists;
		}
		if (linkedLists.size() > index) {
			linkedLists.get(index).appendToTail(treeNode.data);
		} else {
			linkedLists.add(index, new LinkedListNode(treeNode.data));
		}

		linkedLists = convert(treeNode.left, linkedLists, index + 1);
		return convert(treeNode.right, linkedLists, index + 1);
	}
}
