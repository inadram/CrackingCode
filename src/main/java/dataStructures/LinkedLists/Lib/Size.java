package dataStructures.LinkedLists.Lib;

public class Size {
	public static int get(LinkedListNode linkedListNode) {
		int size = 0;
		while (linkedListNode != null) {
			size++;
			linkedListNode = linkedListNode.next;
		}
		return size;
	}

	public static int get(DoublyLinkedList linkedListNode) {
		int size = 0;
		while (linkedListNode != null) {
			size++;
			linkedListNode = linkedListNode.next;
		}
		return size;
	}
}
