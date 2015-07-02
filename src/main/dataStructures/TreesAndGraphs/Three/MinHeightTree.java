package main.dataStructures.TreesAndGraphs.Three;

import main.dataStructures.TreesAndGraphs.Lib.Tree.TreeNode;

public class MinHeightTree {

    public TreeNode create(int[] sortedArray) {
        return addNode(sortedArray, 0, sortedArray.length - 1);
    }

    private TreeNode addNode(int[] sortedArray, int start, int end) {
        if (start > end) {
            return null;
        }
        int middle = (start + end) / 2;
        TreeNode root = new TreeNode(sortedArray[middle]);
        root.left = addNode(sortedArray, start, middle - 1);
        root.right = addNode(sortedArray, middle + 1, end);
        return root;
    }
}
