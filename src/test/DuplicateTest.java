package test;

import main.dataStructures.LinkedLists.One.Duplicate;
import org.junit.Test;
import main.dataStructures.LinkedLists.Lib.*;

import static org.testng.Assert.assertEquals;


public class DuplicateTest {

    @Test
    public void test_duplicate_node_of_link_list_get_removed(){
        Duplicate duplicate =new Duplicate();

        LinkedListNode linkedListNode=new LinkedListNode(2);
        linkedListNode.appendToTail(4);
        linkedListNode.appendToTail(6);
        linkedListNode.appendToTail(8);
        linkedListNode.appendToTail(10);
        linkedListNode.appendToTail(2);
        linkedListNode.appendToTail(6);
        linkedListNode.appendToTail(10);
        duplicate.removeDuplicate(linkedListNode);
        LinkedListNode expectedLinkedList=new LinkedListNode(2);
        expectedLinkedList.appendToTail(4);
        expectedLinkedList.appendToTail(6);
        expectedLinkedList.appendToTail(8);
        expectedLinkedList.appendToTail(10);

        while (expectedLinkedList!=null){
            assertEquals(linkedListNode.data,expectedLinkedList.data);
            linkedListNode= linkedListNode.next;
            expectedLinkedList= expectedLinkedList.next;
        }
        assertEquals(expectedLinkedList,linkedListNode);
    }
}
