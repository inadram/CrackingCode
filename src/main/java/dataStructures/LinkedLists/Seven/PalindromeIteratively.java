package dataStructures.LinkedLists.Seven;

import dataStructures.LinkedLists.Lib.DoublyLinkedList;
import dataStructures.LinkedLists.Lib.Size;

import java.util.Stack;

public class PalindromeIteratively {
	public boolean check(DoublyLinkedList node) {
		int size = Size.get(node);
		int halfSize = size / 2;
		for (int i = 1; i <= halfSize; i++) {
			node = node.next;
		}
		DoublyLinkedList prevNode = (size % 2 == 0) ? node.prev : node;
		for (int i = 1; i <= halfSize; i++) {
			if (node.data != prevNode.data) {
				return false;
			}
			node = node.next;
			prevNode = prevNode.prev;
		}
		return true;
	}

	public boolean checkWithStack(DoublyLinkedList node) {
		Stack<Integer> firstHalf = new Stack<Integer>();
		DoublyLinkedList fast = node;
		DoublyLinkedList slow = node;
		boolean isOdd = false;
		while (fast != null && fast.next != null) {
			firstHalf.push(slow.data);
			fast = fast.next.next;
			slow = slow.next;
			isOdd = !isOdd;
		}
		if (isOdd) {
			slow = slow.next;
		}
		while (!firstHalf.empty()) {
			if (slow.data != firstHalf.peek()) {
				return false;
			}
			firstHalf.pop();
			slow = slow.next;
		}
		return true;
	}
}
