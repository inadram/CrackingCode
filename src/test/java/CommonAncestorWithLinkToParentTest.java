import  dataStructures.treesAndGraphs.lib.tree.TreeNode;
import  dataStructures.treesAndGraphs.Seven.CommonAncestorWithLinkToParent;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CommonAncestorWithLinkToParentTest {

    @Test
    public void test_find_common_ancestor_between_two_node(){

         /*
                100
             50     150
           40  65
                 70
              68    99
            66     80
                77  88
        */

        TreeNode treeNode = new TreeNode(100);
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
        treeNode.left = node_50;
        node_50.parent = treeNode;
        treeNode.right = node_150;
        node_150.parent = treeNode;
        node_50.left = node_40;
        node_40.parent = node_50;
        node_50.right = node_65;
        node_65.parent= node_50;
        node_65.right = node_70;
        node_70.parent = node_65;
        node_70.right= node_99;
        node_99.parent = node_70;
        node_70.left= node_68;
        node_68.parent = node_70;
        node_68.left = node_66;
        node_66.parent= node_68;
        node_99.left = node_80;
        node_80.parent = node_99;
        node_80.left = node_77;
        node_77.parent= node_80;
        node_80.right = node_88;
        node_88.parent = node_80;

        CommonAncestorWithLinkToParent commonAncestor = new CommonAncestorWithLinkToParent();
        assertEquals(node_70, commonAncestor.find(node_66, node_88));
    }

}