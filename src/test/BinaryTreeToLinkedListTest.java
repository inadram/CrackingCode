package test;

import main.dataStructures.LinkedLists.Lib.LinkedListNode;
import main.dataStructures.TreesAndGraphs.Four.BinaryTreeToLinkedList;
import main.dataStructures.TreesAndGraphs.Lib.Tree.TreeNode;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BinaryTreeToLinkedListTest {

    /*
                  20
              10
            15  22
     */

    @Test
    public void convert__each_row_of_binary_tree_to_DLink_list(){
        BinaryTreeToLinkedList binaryTreeToLinkedList=new BinaryTreeToLinkedList();
        TreeNode treeNode=new TreeNode(20);
        TreeNode tree_10 = new TreeNode(10);
        TreeNode tree_15 = new TreeNode(15);
        TreeNode tree_22 = new TreeNode(22);
        treeNode.left = tree_10;
        tree_10.left = tree_15;
        tree_10.right = tree_22;
        ArrayList<LinkedListNode> linkedLists= binaryTreeToLinkedList.convert(treeNode,new ArrayList<LinkedListNode>(),0);

        assertEquals(3,linkedLists.size());
    }

}