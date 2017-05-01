package dataStructures.TreesAndGraphs.Eight;

import  dataStructures.TreesAndGraphs.Lib.Tree.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class SubTreeValidation {
    public boolean check(TreeNode t1, TreeNode t2) {
        Queue<TreeNode> treeNodeQueue = new LinkedList<TreeNode>();
        treeNodeQueue.add(t1);
        boolean isSubtree = false;
        while (treeNodeQueue.size()>0){
           TreeNode currentNode= treeNodeQueue.remove();
            if(currentNode==t2) isSubtree =isMatch(currentNode,t2);
            if(!isSubtree) {
                if (currentNode.left != null) treeNodeQueue.add(currentNode.left);
                if (currentNode.right != null) treeNodeQueue.add(currentNode.right);
            }
        }
        return isSubtree;
    }

    private boolean isMatch(TreeNode t1, TreeNode t2) {
        if(t1 ==null ^ t2==null) return false;
        if(t1 == null) return true;
        if(t1.data!=t2.data) return false;
        isMatch(t1.left,t2.left);
      return isMatch(t1.right,t2.right);
    }
}
