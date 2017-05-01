package dataStructures.TreesAndGraphs.Nine;

import  dataStructures.TreesAndGraphs.Lib.Tree.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;

public class SumOfTreeNodeLevel {

    public void findSum(TreeNode node, int sum, int[] path, int level) {
        if (node == null) {
            return;
        }

		/* Insert current node into path */
        path[level] = node.data;

        int t = 0;
        for (int i = level; i >= 0; i--){
            t += path[i];
            if (t == sum) {
                print(path, i, level);
            }
        }

        findSum(node.left, sum, path, level + 1);
        findSum(node.right, sum, path, level + 1);

		/* Remove current node from path. Not strictly necessary, since we would
		 * ignore this value, but it's good practice.
		 */
        path[level] = Integer.MIN_VALUE;
    }

    public int depth(TreeNode node) {
        if (node == null) {
            return 0;
        } else {
            return 1 + Math.max(depth(node.left), depth(node.right));
        }
    }

    public ArrayList<LinkedList<Integer>> findSum(TreeNode node, int sum) {
        int depth = depth(node);
        int[] path = new int[depth];
        findSum(node, sum, path, 0);
        return allPath;
    }

    ArrayList<LinkedList<Integer>> allPath = new ArrayList<LinkedList<Integer>>();
    private void print(int[] path, int start, int end) {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        for (int i = start; i <= end; i++) {
            linkedList.add(path[i]);
        }
        allPath.add(linkedList);
    }

}
