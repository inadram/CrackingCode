package dataStructures.LinkedLists.Two;

import dataStructures.LinkedLists.Lib.LinkedListNode;
import dataStructures.LinkedLists.Two.Lib.Kth;

public class KthToLast {
	public int get(LinkedListNode linkedListNode, int kthToLastElement) {
		int kthElement = Kth.get(linkedListNode, kthToLastElement);
		return getKthValue(linkedListNode, kthElement);
	}

	private int getKthValue(LinkedListNode linkedListNode, int kthElement) {
		if (kthElement > 0) {
			for (int i = 1; i <= kthElement; i++) {
				linkedListNode = linkedListNode.next;
			}
			return linkedListNode.data;
		}
		return -1;
	}


}
