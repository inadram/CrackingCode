package main.dataStructures.TreesAndGraphs.Nine;

import main.dataStructures.TreesAndGraphs.Lib.Tree.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class SumOfTreeNode {
    public ArrayList<LinkedList<Integer>> find(TreeNode t1, int sum) {
        Queue<TreeNode> treeNodeQueue =new LinkedList<TreeNode>();
        treeNodeQueue.add(t1);
        ArrayList<LinkedList<Integer>> allPath = new ArrayList<LinkedList<Integer>>();
        while (treeNodeQueue.size()>0){
           TreeNode currentNode= treeNodeQueue.remove();
            allPath= findPAth(currentNode,0, sum, new LinkedList<Integer>(),allPath);
            if(currentNode.left!=null) treeNodeQueue.add(currentNode.left);
            if(currentNode.right!=null) treeNodeQueue.add(currentNode.right);
        }
        return allPath;
    }

    private ArrayList<LinkedList<Integer>> findPAth(TreeNode currentNode,int total, int sum, LinkedList<Integer> arrayList, ArrayList<LinkedList<Integer>> allPath) {
        if(currentNode==null){
            return allPath;
        }

        if(total==sum){
           allPath.add(arrayList);
           return allPath;
       }

        total+=currentNode.data;
        arrayList.add(currentNode.data);
       allPath= findPAth(currentNode.left,total,sum,arrayList,allPath);
        return findPAth(currentNode.right,total,sum,arrayList,allPath);
    }
}
