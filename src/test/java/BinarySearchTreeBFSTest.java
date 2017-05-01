import  dataStructures.TreesAndGraphs.Five.BinarySearchTreeBFS;
import  dataStructures.TreesAndGraphs.Lib.Tree.TreeNode;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class BinarySearchTreeBFSTest {

     @Test
    public void check_if_a_binary_search_tree_valid(){

         /*
                100
             50     150
           40  65
                 70

        */


         BinarySearchTreeBFS binarySearchTree=new BinarySearchTreeBFS();
         TreeNode treeNode = new TreeNode(100);
         TreeNode node_50 = new TreeNode(50);
         TreeNode node_40 = new TreeNode(40);
         TreeNode node_65 = new TreeNode(65);
         TreeNode node_70 = new TreeNode(70);
         TreeNode node_150 = new TreeNode(150);
         treeNode.left = node_50;
         treeNode.right = node_150;
         node_50.left = node_40;
         node_50.right = node_65;
         node_65.right = node_70;
         assertTrue(binarySearchTree.check(treeNode));
    }

    @Test
    public void check_if_a_not_binary_search_tree_valid(){

         /*
                100
             50     150
           40  65
                 70
                   102
        */


        BinarySearchTreeBFS binarySearchTree=new BinarySearchTreeBFS();
        TreeNode treeNode = new TreeNode(100);
        TreeNode node_50 = new TreeNode(50);
        TreeNode node_40 = new TreeNode(40);
        TreeNode node_65 = new TreeNode(65);
        TreeNode node_70 = new TreeNode(70);
        TreeNode node_102 = new TreeNode(102);
        TreeNode node_150 = new TreeNode(150);
        treeNode.left = node_50;
        treeNode.right = node_150;
        node_50.left = node_40;
        node_50.right = node_65;
        node_65.right = node_70;
        node_70.right= node_102;
        assertFalse(binarySearchTree.check(treeNode));
    }
}