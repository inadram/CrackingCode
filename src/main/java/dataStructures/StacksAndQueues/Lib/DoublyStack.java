package dataStructures.StacksAndQueues.Lib;

import dataStructures.LinkedLists.Lib.DoublyLinkedList;

public class DoublyStack {
	public DoublyLinkedList head = null;
	DoublyLinkedList tail = null;
	private int size = 0;

	public void push(int i) {
		size++;
		DoublyLinkedList node = new DoublyLinkedList(i);
		node.next = head;
		if (size == 1) tail = node;
		if (head != null) head.prev = node;
		head = node;

	}

	public int peek() {
		return head.data;
	}

	public int pop() {
		size--;
		if (head != null) {
			int data = head.data;
			head = head.next;
			return data;
		} else {
			return -1;
		}
	}

	public boolean isEmpty() {
		return head == null || size == 0;
	}

	public int size() {
		return size;
	}

	public int popBottom() {
		size--;
		DoublyLinkedList bottom = tail;
		tail = (tail.prev != null) ? tail.prev : null;
		return bottom.data;
	}
}
