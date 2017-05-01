package dataStructures.TreesAndGraphs.Five;

import  dataStructures.TreesAndGraphs.Lib.Tree.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/*
            100
         50     150
       40  65
             70
               102
    */
public class BinarySearchTreeBFS {
    public boolean check(TreeNode treeNode) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(treeNode);
        boolean isBinarySearchTree = true;

        while (queue.size()!=0 && isBinarySearchTree){
            TreeNode root= queue.remove();
            isBinarySearchTree = BFS(root.data,root.left,false) && BFS(root.data,root.right,true);
            if(root.left!=null)queue.add(root.left);
            if(root.right!=null)queue.add(root.right);
        }
        return isBinarySearchTree;
    }

    private boolean BFS(int data,TreeNode node, boolean shouldBeSmaller) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        boolean isBinarySearchTree = true;
        if(node!=null) {
            queue.add(node);
        }
        while (queue.size()!=0 && isBinarySearchTree){
           TreeNode root= queue.remove();
           isBinarySearchTree=(data<root.data ==shouldBeSmaller);
           if(root.left!=null)queue.add(root.left);
           if(root.right!=null)queue.add(root.right);
        }
        return isBinarySearchTree;
    }
}
