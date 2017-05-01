import  dataStructures.TreesAndGraphs.Three.MinHeightTree;
import  dataStructures.TreesAndGraphs.Lib.Tree.TreeHeight;
import  dataStructures.TreesAndGraphs.Lib.Tree.TreeNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MinHeightTreeTest {

    /*
                     50
              20            70
           10    30      60    80
                   40            90
     */
    @Test
    public void test_given_array_should_create_tree_with_min_height(){
        MinHeightTree minHeightTree=new MinHeightTree();
        int[] sortedArray= new int[]{10,20,30,40,50,60,70,80,90};
        TreeNode binarySearchTree=minHeightTree.create(sortedArray);
        assertEquals(4, TreeHeight.get(binarySearchTree));
    }

}