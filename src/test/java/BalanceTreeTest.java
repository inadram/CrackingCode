import  dataStructures.treesAndGraphs.lib.tree.TreeNode;
import  dataStructures.treesAndGraphs.One.BalanceTree;
import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertTrue;

public class BalanceTreeTest {

    @Test
    public void test_if_a_tree_is_balance(){

        /*
             100
         50       150
      40   60   90   160
          55       155
        */

        TreeNode t1 = new TreeNode(100);
        TreeNode node_50 = new TreeNode(50);
        TreeNode node_150 = new TreeNode(150);
        TreeNode node_40 = new TreeNode(40);
        TreeNode node_60 = new TreeNode(60);
        TreeNode node_90 = new TreeNode(90);
        TreeNode node_160 = new TreeNode(160);
        TreeNode node_55 = new TreeNode(55);
        TreeNode node_155 = new TreeNode(155);
        t1.left = node_50;
        t1.right = node_150;

        node_50.left = node_40;
        node_50.right = node_60;

        node_60.left= node_55;

        node_150.left= node_90;
        node_150.right = node_160;

        node_160.left = node_155;


        BalanceTree balanceTree = new BalanceTree();
        assertTrue(balanceTree.check(t1));
    }

    @Test
    public void test_if_a_tree_is_not_balance(){

     /*
             100
         50       150
      40   60   90   160
          55       155
                     158
     */

        TreeNode t1 = new TreeNode(100);
        TreeNode node_50 = new TreeNode(50);
        TreeNode node_150 = new TreeNode(150);
        TreeNode node_40 = new TreeNode(40);
        TreeNode node_60 = new TreeNode(60);
        TreeNode node_90 = new TreeNode(90);
        TreeNode node_160 = new TreeNode(160);
        TreeNode node_55 = new TreeNode(55);
        TreeNode node_155 = new TreeNode(155);
        TreeNode node_158 = new TreeNode(158);
        t1.left = node_50;
        t1.right = node_150;

        node_50.left = node_40;
        node_50.right = node_60;

        node_60.left= node_55;

        node_150.left= node_90;
        node_150.right = node_160;

        node_160.left = node_155;
        node_155.right=node_158;


        BalanceTree balanceTree = new BalanceTree();
        assertFalse(balanceTree.check(t1));
    }

}