package test;

import main.dataStructures.LinkedLists.Four.PartitionLinkedByClone;
import main.dataStructures.LinkedLists.Four.PartitionLinkedInPlace;
import main.dataStructures.LinkedLists.Lib.LinkedListNode;
import org.junit.Before;
import org.junit.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNull;

public class PartitionLinkedInPlaceTest {
    LinkedListNode linkedListNode;
    LinkedListNode expectedLinkedListNode;

    @Before
    public void setUp(){
        linkedListNode=new LinkedListNode(101);
        linkedListNode.appendToTail(102);
        linkedListNode.appendToTail(106);
        linkedListNode.appendToTail(104);
        linkedListNode.appendToTail(103);
        linkedListNode.appendToTail(105);

        expectedLinkedListNode=new LinkedListNode(103);
        expectedLinkedListNode.appendToTail(102);
        expectedLinkedListNode.appendToTail(101);
        expectedLinkedListNode.appendToTail(104);
        expectedLinkedListNode.appendToTail(106);
        expectedLinkedListNode.appendToTail(105);
    }

    @Test
    public void test_partition_linkedList_by_value_x(){
        PartitionLinkedInPlace partitionLinkedList=new PartitionLinkedInPlace();
        partitionLinkedList.execute(linkedListNode, 104);
        while (expectedLinkedListNode!=null){
            assertEquals(expectedLinkedListNode.data,linkedListNode.data);
            expectedLinkedListNode= expectedLinkedListNode.next;
            linkedListNode = linkedListNode.next;
        }
        assertNull(linkedListNode);
    }

}