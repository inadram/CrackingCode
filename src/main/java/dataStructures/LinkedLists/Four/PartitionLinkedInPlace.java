package dataStructures.LinkedLists.Four;

import dataStructures.LinkedLists.Lib.LinkedListNode;
import dataStructures.LinkedLists.Lib.Size;

public class PartitionLinkedInPlace {
	public void execute(LinkedListNode linkedListNode, int partitionBy) {
		int size = Size.get(linkedListNode);
		linkedListNode.appendToTail(partitionBy);
		for (int i = 0; i < size; i++) {
			if (linkedListNode.data > partitionBy) {
				linkedListNode.appendToTail(linkedListNode.data);
				deleteNode(linkedListNode);
			} else if (linkedListNode.data == partitionBy) {
				deleteNode(linkedListNode);
			} else {
				linkedListNode = linkedListNode.next;
			}
		}

	}

	private void deleteNode(LinkedListNode linkedListNode) {
		LinkedListNode next = linkedListNode.next;
		linkedListNode.data = next.data;
		linkedListNode.next = next.next;
	}
}
