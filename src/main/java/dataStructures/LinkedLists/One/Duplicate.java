package dataStructures.LinkedLists.One;

import dataStructures.LinkedLists.Lib.LinkedListNode;

import java.util.HashSet;

public class Duplicate {
	public void removeDuplicate(LinkedListNode linkedListNode) {
		HashSet uniqueData = new HashSet();
		LinkedListNode prev = null;
		LinkedListNode current = linkedListNode;
		while (current != null) {
			if (uniqueData.contains(current.data)) {
				prev.next = current.next;
			} else {
				prev = current;
				uniqueData.add(prev.data);
			}
			current = current.next;
		}
	}

	public void removeDuplicateInPlace(LinkedListNode linkedListNode) {
		if (linkedListNode == null) return;
		LinkedListNode current = linkedListNode;
		LinkedListNode next = linkedListNode;
		while (current.next != null) {
			while (next.next != null) {
				if (current.data == next.next.data) {
					next.next = next.next.next;
				} else {
					next = next.next;
				}
			}
			current = current.next;
			next = current;
		}
	}
}
