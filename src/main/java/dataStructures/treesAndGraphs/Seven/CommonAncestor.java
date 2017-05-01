package dataStructures.treesAndGraphs.Seven;

import  dataStructures.treesAndGraphs.lib.tree.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class CommonAncestor {

    /*
               100
            50     150
          40  65
                70
             68    99
           66     80
               77  88
       */

    boolean firstFound = false;
    boolean secondFound = false;
    TreeNode commonAncestor =null;

    public TreeNode find(TreeNode treeNode,TreeNode first, TreeNode second) {
          BFS(treeNode,first,second);
        return commonAncestor;
    }

    private void BFS(TreeNode treeNode,TreeNode first, TreeNode second) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(treeNode);
        while (queue.size()!=0){
           TreeNode currentNode= queue.remove();
            firstFound =false;
            secondFound =false;
           if( isContainsNodes(currentNode, first, second)) commonAncestor=currentNode;
           if(currentNode.left!=null) queue.add(currentNode.left);
           if(currentNode.right!=null) queue.add(currentNode.right);
        }

    }

    private boolean isContainsNodes(TreeNode treeNode, TreeNode first, TreeNode second) {
        if(treeNode!=null) {
            if(first==treeNode) firstFound=true;
            if(second==treeNode) secondFound=true;
            if(!(firstFound&&secondFound))isContainsNodes(treeNode.left, first, second);
            if(!(firstFound&&secondFound))isContainsNodes(treeNode.right, first, second);
        }
        return firstFound&&secondFound;
    }
}
