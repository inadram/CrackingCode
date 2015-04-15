package test;

import main.dataStructures.LinkedLists.One.Duplicate;
import org.junit.Before;
import org.junit.Test;
import main.dataStructures.LinkedLists.Lib.*;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNull;


public class DuplicateTest {

    LinkedListNode linkedListNode;
    LinkedListNode expectedLinkedList;
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

        expectedLinkedList=new LinkedListNode(2);
        expectedLinkedList.appendToTail(4);
        expectedLinkedList.appendToTail(6);
        expectedLinkedList.appendToTail(8);
        expectedLinkedList.appendToTail(10);
        expectedLinkedList.appendToTail(12);
        expectedLinkedList.appendToTail(16);
    }

    @Test
    public void test_duplicate_node_of_link_list_get_removed(){
        Duplicate duplicate =new Duplicate();
        duplicate.removeDuplicate(linkedListNode);

        while (expectedLinkedList!=null){
            assertEquals(linkedListNode.data,expectedLinkedList.data);
            linkedListNode= linkedListNode.next;
            expectedLinkedList= expectedLinkedList.next;
        }
        assertNull(linkedListNode);
    }

    @Test
    public void test_duplicate_node_of_link_list_get_removed_in_place(){
        Duplicate duplicate =new Duplicate();
        duplicate.removeDuplicateInPlace(linkedListNode);

        while (expectedLinkedList!=null){
            assertEquals(linkedListNode.data,expectedLinkedList.data);
            linkedListNode= linkedListNode.next;
            expectedLinkedList= expectedLinkedList.next;
        }
        assertNull(linkedListNode);
    }
}
