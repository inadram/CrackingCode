import  dataStructures.treesAndGraphs.Eight.SubTreeValidationWithPrint;
import  dataStructures.treesAndGraphs.lib.tree.TreeNode;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SubTreeValidationWithPrintTest {

    @Test
    public void test_if_t2_is_a_subtree_of_t1(){

         /*
                100
             50     150
           40  65
                 70
              68    99
            66     80
                77  88
        */

        TreeNode t1 = new TreeNode(100);
        TreeNode node_50 = new TreeNode(50);
        TreeNode node_40 = new TreeNode(40);
        TreeNode node_65 = new TreeNode(65);
        TreeNode node_70 = new TreeNode(70);
        TreeNode node_68 = new TreeNode(68);
        TreeNode node_66 = new TreeNode(66);
        TreeNode node_99 = new TreeNode(99);
        TreeNode node_80 = new TreeNode(80);
        TreeNode node_77 = new TreeNode(77);
        TreeNode node_88 = new TreeNode(88);
        TreeNode node_150 = new TreeNode(150);
        TreeNode node_300 = new TreeNode(300);
        t1.left = node_50;
        t1.right = node_150;
        node_50.left = node_40;
        node_50.right = node_65;
        node_65.right = node_70;
        node_70.right= node_99;
        node_70.left= node_68;
        node_68.left = node_66;
        node_99.left = node_80;
        node_80.left = node_77;
        node_80.right = node_88;

        SubTreeValidationWithPrint subTreeValidation=new SubTreeValidationWithPrint();
        assertTrue(subTreeValidation.check(t1, node_99));
        assertFalse(subTreeValidation.check(node_50 , t1));

    }

}