package dataStructures.treesAndGraphs.six;

import dataStructures.treesAndGraphs.lib.tree.TreeNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NextNodeTest {
	public void get_next_node() {

         /*
                100
             50     150
           40  65
                 70

        */

		TreeNode treeNode = new TreeNode(100);
		TreeNode node_50 = new TreeNode(50);
		TreeNode node_40 = new TreeNode(40);
		TreeNode node_65 = new TreeNode(65);
		TreeNode node_70 = new TreeNode(70);
		TreeNode node_150 = new TreeNode(150);
		treeNode.left = node_50;
		node_50.parent = treeNode;
		treeNode.right = node_150;
		node_150.parent = treeNode;
		node_50.left = node_40;
		node_40.parent = node_50;
		node_50.right = node_65;
		node_65.parent = node_50;
		node_65.right = node_70;
		node_70.parent = node_65;
		NextNode nextNode = new NextNode();

		assertEquals(50, nextNode.get(treeNode.left.left));
		assertEquals(65, nextNode.get(treeNode.left));
		assertEquals(100, nextNode.get(treeNode.left.right.right));
		assertEquals(70, nextNode.get(treeNode.left.right));
		assertEquals(0, nextNode.get(treeNode.right));
	}

	@Test
	public void test_get_next_node_complex() {
	      /*
                100
             50     150
           40  65
                 70
                   99
                80
              77  88
        */

		TreeNode treeNode = new TreeNode(100);
		TreeNode node_50 = new TreeNode(50);
		TreeNode node_40 = new TreeNode(40);
		TreeNode node_65 = new TreeNode(65);
		TreeNode node_70 = new TreeNode(70);
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
		node_65.parent = node_50;
		node_65.right = node_70;
		node_70.parent = node_65;
		node_70.right = node_99;
		node_99.parent = node_70;
		node_99.left = node_80;
		node_80.parent = node_99;
		node_80.left = node_77;
		node_77.parent = node_80;
		node_80.right = node_88;
		node_88.parent = node_80;

		NextNode nextNode = new NextNode();

		assertEquals(50, nextNode.get(treeNode.left.left));
		assertEquals(65, nextNode.get(treeNode.left));
		assertEquals(100, nextNode.get(treeNode.left.right.right.right));
		assertEquals(77, nextNode.get(treeNode.left.right.right));

	}
}