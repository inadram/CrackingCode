import  dataStructures.LinkedLists.Lib.LinkedListNode;
import  dataStructures.LinkedLists.Six.CircularLinkedList;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class CircularLinkedListTest {

    @Test
    public void test_find_beginning_of_a_circular_linked_list(){
        LinkedListNode circularNode = new LinkedListNode(101);
        circularNode.appendToTail(102);
        circularNode.appendToTail(103);
        circularNode.appendToTail(104);
        circularNode.next.next.next.next =circularNode;

        CircularLinkedList circularLinkedList = new CircularLinkedList();
        int beginning= circularLinkedList.find(circularNode);
        assertEquals(101,beginning);
    }

    @Test
    public void test_find_beginning_of_a_circular_linked_list_with_one_node_out(){
        LinkedListNode circularNode = new LinkedListNode(101);
        circularNode.appendToTail(102);
        circularNode.appendToTail(103);
        circularNode.appendToTail(104);
        circularNode.next.next.next.next =circularNode.next;

        CircularLinkedList circularLinkedList = new CircularLinkedList();
        int beginning= circularLinkedList.find(circularNode);
        assertEquals(102,beginning);
    }

}