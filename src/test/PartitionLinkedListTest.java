package test;

import junit.framework.TestCase;
import main.dataStructures.LinkedLists.Four.PartitionLinkedList;
import main.dataStructures.LinkedLists.Lib.LinkedListNode;
import main.dataStructures.LinkedLists.Three.DeleteNode;
import org.junit.Before;
import org.junit.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNull;

public class PartitionLinkedListTest {
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

        expectedLinkedListNode=new LinkedListNode(101);
        expectedLinkedListNode.appendToTail(102);
        expectedLinkedListNode.appendToTail(103);
        expectedLinkedListNode.appendToTail(104);
        expectedLinkedListNode.appendToTail(106);
        expectedLinkedListNode.appendToTail(105);
    }

    @Test
    public void test_partition_linkedList_by_value_x(){
        PartitionLinkedList partitionLinkedList=new PartitionLinkedList();
        LinkedListNode actualLinkedListNode= partitionLinkedList.execute(linkedListNode, 104);
        while (expectedLinkedListNode!=null){
            assertEquals(expectedLinkedListNode.data,actualLinkedListNode.data);
            expectedLinkedListNode= expectedLinkedListNode.next;
            actualLinkedListNode = actualLinkedListNode.next;
        }
        assertNull(actualLinkedListNode);
    }

}