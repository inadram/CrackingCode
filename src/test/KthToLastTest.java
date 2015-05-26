package test;

import main.dataStructures.LinkedLists.Lib.LinkedListNode;
import main.dataStructures.LinkedLists.Two.KthToLast;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KthToLastTest {

    LinkedListNode linkedListNode;
    @Before
    public void setUp(){
        linkedListNode=new LinkedListNode(2);
        linkedListNode.appendToTail(2);
        linkedListNode.appendToTail(2);
        linkedListNode.appendToTail(4);
        linkedListNode.appendToTail(6);
        linkedListNode.appendToTail(6);
        linkedListNode.appendToTail(8);
        linkedListNode.appendToTail(10);
        linkedListNode.appendToTail(2);
        linkedListNode.appendToTail(6);
        linkedListNode.appendToTail(10);
        linkedListNode.appendToTail(12);
        linkedListNode.appendToTail(10);
        linkedListNode.appendToTail(2);
        linkedListNode.appendToTail(16);
    }

    @Test
    public void test_kth_element_to_last_return(){

        KthToLast kthToLast =new KthToLast();
        int actualData=kthToLast.get(linkedListNode, 7);

        assertEquals(actualData,2);
    }

    @Test
    public void test_out_of_boundary_kth_element_to_last_return(){

        KthToLast kthToLast =new KthToLast();
        int actualData=kthToLast.get(linkedListNode, 16);

        assertEquals(actualData,-1);
    }
}

