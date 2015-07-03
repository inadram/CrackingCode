package main.dataStructures.TreesAndGraphs.Four;

import main.dataStructures.TreesAndGraphs.Lib.Tree.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeToLinkedListBFSAlternative {
    public ArrayList<LinkedList> convert(TreeNode treeNode) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        ArrayList<LinkedList> linkedLists = new ArrayList<LinkedList>();
        if (treeNode != null) {
            queue.add(treeNode);
        }

        while (queue.size() > 0) {
            Queue<TreeNode> tempQueue = new LinkedList<TreeNode>();
            LinkedList<TreeNode> linkedList = new LinkedList<TreeNode>();
            while (queue.size() > 0) {
                TreeNode currentNode = queue.remove();
                linkedList.add(currentNode);
                if (currentNode.left != null) tempQueue.add(currentNode.left);
                if (currentNode.right != null) tempQueue.add(currentNode.right);
            }
            linkedLists.add(linkedList);
            queue = tempQueue;
        }
        return linkedLists;
    }


}
