package test;

import main.dataStructures.LinkedLists.Four.PartitionLinkedNoDelete;
import main.dataStructures.LinkedLists.Lib.LinkedListNode;
import org.junit.Before;
import org.junit.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNull;

public class PartitionLinkedNoDeleteTest {

    LinkedListNode linkedListNode;
    LinkedListNode expectedLinkedListNode;

    @Before
    public void setUp(){
        linkedListNode=new LinkedListNode(105);
        linkedListNode.appendToTail(102);
        linkedListNode.appendToTail(106);
        linkedListNode.appendToTail(104);
        linkedListNode.appendToTail(103);
        linkedListNode.appendToTail(101);

        expectedLinkedListNode=new LinkedListNode(102);
        expectedLinkedListNode.appendToTail(103);
        expectedLinkedListNode.appendToTail(101);
        expectedLinkedListNode.appendToTail(104);
        expectedLinkedListNode.appendToTail(105);
        expectedLinkedListNode.appendToTail(106);
    }

    @Test
    public void test_partition_linkedList_by_value_x(){
        PartitionLinkedNoDelete partitionLinkedList=new PartitionLinkedNoDelete();
        LinkedListNode actualLinkedListNode= partitionLinkedList.execute(linkedListNode, 104);
        while (expectedLinkedListNode!=null){
            assertEquals(expectedLinkedListNode.data,actualLinkedListNode.data);
            expectedLinkedListNode= expectedLinkedListNode.next;
            actualLinkedListNode = actualLinkedListNode.next;
        }
        assertNull(actualLinkedListNode);
    }

    @Test
    public void test_partition_linkedList_by_value_x_optimised(){

        expectedLinkedListNode=new LinkedListNode(101);
        expectedLinkedListNode.appendToTail(103);
        expectedLinkedListNode.appendToTail(102);
        expectedLinkedListNode.appendToTail(104);
        expectedLinkedListNode.appendToTail(106);
        expectedLinkedListNode.appendToTail(105);

        PartitionLinkedNoDelete partitionLinkedList=new PartitionLinkedNoDelete();
        LinkedListNode actualLinkedListNode= partitionLinkedList.executeOptimised(linkedListNode, 104);
        while (expectedLinkedListNode!=null){
            assertEquals(expectedLinkedListNode.data,actualLinkedListNode.data);
            expectedLinkedListNode= expectedLinkedListNode.next;
            actualLinkedListNode = actualLinkedListNode.next;
        }
        assertNull(actualLinkedListNode);
    }

}