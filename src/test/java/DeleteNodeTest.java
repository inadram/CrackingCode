import dataStructures.LinkedLists.Lib.LinkedListNode;
import dataStructures.LinkedLists.Three.DeleteNode;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;


public class DeleteNodeTest {

	LinkedListNode linkedListNode;
	LinkedListNode expectedLinkedListNode;

	@Before
	public void setUp() {
		linkedListNode = new LinkedListNode(101);
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

		expectedLinkedListNode = new LinkedListNode(101);
		expectedLinkedListNode.appendToTail(102);
		expectedLinkedListNode.appendToTail(104);
		expectedLinkedListNode.appendToTail(105);
		expectedLinkedListNode.appendToTail(106);
		expectedLinkedListNode.appendToTail(107);
		expectedLinkedListNode.appendToTail(108);
		expectedLinkedListNode.appendToTail(109);
		expectedLinkedListNode.appendToTail(110);
		expectedLinkedListNode.appendToTail(111);
		expectedLinkedListNode.appendToTail(112);
		expectedLinkedListNode.appendToTail(113);
		expectedLinkedListNode.appendToTail(114);
		expectedLinkedListNode.appendToTail(115);
	}

	@Test
	public void test_delete_head_node_of_a_singly_link_list() {
		DeleteNode deleteNode = new DeleteNode();
		deleteNode.execute(linkedListNode.next.next);
		while (expectedLinkedListNode != null) {
			assertEquals(expectedLinkedListNode.data, linkedListNode.data);
			expectedLinkedListNode = expectedLinkedListNode.next;
			linkedListNode = linkedListNode.next;
		}
		assertNull(linkedListNode);
	}

}