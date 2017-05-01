package dataStructures.StacksAndQueues.Lib;

import dataStructures.LinkedLists.Lib.LinkedListNode;

public class Queue {
	LinkedListNode head = null;
	LinkedListNode tail = null;

	public void enQueue(int i) {
		if (tail == null) {
			tail = new LinkedListNode(i);
			head = tail;
		} else {
			tail.next = new LinkedListNode(i);
			tail = tail.next;
		}

	}

	public int peek() {
		return head.data;
	}

	public int deQueue() {
		if (head != null) {
			int data = head.data;
			head = head.next;
			return data;
		} else {
			return -1;
		}
	}
}
