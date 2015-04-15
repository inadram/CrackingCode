package test;


import main.dataStructures.LinkedLists.Lib.LinkedListNode;
import main.dataStructures.LinkedLists.Two.KthToLastRecursive;
import main.dataStructures.LinkedLists.Two.kthToLastRunnerRecursive;
import org.junit.Before;
import org.junit.Test;

import static org.testng.Assert.assertEquals;

public class kthToLastRunnerRecursiveTest  {
    LinkedListNode linkedListNode;
    @Before
    public void setUp(){
        linkedListNode=new LinkedListNode(101);
        linkedListNode.appendToTail(102);
        linkedListNode.appendToTail(103);
        linkedListNode.appendToTail(104);
        linkedListNode.appendToTail(105);
        linkedListNode.appendToTail(106);
        linkedListNode.appendToTail(107);
        linkedListNode.appendToTail(108);
        linkedListNode.appendToTail(109);
        linkedListNode.appendToTail(110);
        linkedListNode.appendToTail(111);
        linkedListNode.appendToTail(112);
        linkedListNode.appendToTail(113);
        linkedListNode.appendToTail(114);
        linkedListNode.appendToTail(115);
    }

    @Test
    public void test_kth_element_to_last_return(){

        kthToLastRunnerRecursive kthToLast =new kthToLastRunnerRecursive();
        int actualData=kthToLast.get(linkedListNode, 8);

        assertEquals(actualData,108);
    }

    @Test
    public void test_out_of_boundary_kth_element_to_last_return(){

        kthToLastRunnerRecursive kthToLast =new kthToLastRunnerRecursive();
        int actualData=kthToLast.get(linkedListNode, 16);

        assertEquals(actualData,-1);
    }

}