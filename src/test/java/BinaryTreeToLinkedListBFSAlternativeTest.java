import  dataStructures.TreesAndGraphs.Four.BinaryTreeToLinkedListBFSAlternative;
import  dataStructures.TreesAndGraphs.Lib.Tree.TreeNode;
import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;

import static org.junit.Assert.assertEquals;

public class BinaryTreeToLinkedListBFSAlternativeTest {

    /*
                  20
              10
            15  22
     */

    @Test
    public void convert_each_row_of_binary_tree_to_DLink_list_with_BFS_alternative(){
        BinaryTreeToLinkedListBFSAlternative binaryTreeToLinkedList=new BinaryTreeToLinkedListBFSAlternative();
        TreeNode treeNode=new TreeNode(20);
        TreeNode tree_10 = new TreeNode(10);
        TreeNode tree_15 = new TreeNode(15);
        TreeNode tree_22 = new TreeNode(22);
        treeNode.left = tree_10;
        tree_10.left = tree_15;
        tree_10.right = tree_22;
        ArrayList<LinkedList> linkedLists= binaryTreeToLinkedList.convert(treeNode);

        assertEquals(3,linkedLists.size());
    }

}