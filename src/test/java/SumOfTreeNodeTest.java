import  dataStructures.treesAndGraphs.lib.tree.TreeNode;
import  dataStructures.treesAndGraphs.Nine.SumOfTreeNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SumOfTreeNodeTest {

    @Test
    public void find_all_path_of_specific_sum(){
        /*
                10
             20     10
           10  15
                 30
              40    20
            10    5
                20 15
        */

        TreeNode t1 = new TreeNode(10);
        TreeNode node_20_1 = new TreeNode(20);
        TreeNode node_10_1 = new TreeNode(10);
        TreeNode node_15_1 = new TreeNode(15);
        TreeNode node_30_1 = new TreeNode(30);
        TreeNode node_40_1 = new TreeNode(40);
        TreeNode node_10_2 = new TreeNode(10);
        TreeNode node_20_2 = new TreeNode(20);
        TreeNode node_5_1 = new TreeNode(5);
        TreeNode node_20_3 = new TreeNode(20);
        TreeNode node_15_2 = new TreeNode(15);
        TreeNode node_10_3 = new TreeNode(10);
        t1.left = node_20_1;
        t1.right = node_10_3;
        node_20_1.left = node_10_1;
        node_20_1.right = node_15_1;
        node_15_1.right = node_30_1;
        node_30_1.right= node_20_2;
        node_30_1.left= node_40_1;
        node_40_1.left = node_10_2;
        node_20_2.left = node_5_1;
        node_5_1.left = node_20_3;
        node_5_1.right = node_15_2;
        SumOfTreeNode sumOfTreeNode = new SumOfTreeNode();
        assertEquals(3, sumOfTreeNode.find(t1, 45).size());
    }

}