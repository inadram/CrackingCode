package dataStructures.LinkedLists.Five;

import dataStructures.LinkedLists.Five.Lib.SumWrapper;
import dataStructures.LinkedLists.Lib.LinkedListNode;
import dataStructures.LinkedLists.Lib.Size;

public class SumLinkedList {


	public LinkedListNode execute(LinkedListNode first, LinkedListNode second) {

		int firstSize = Size.get(first);
		int secondSize = Size.get(second);
		int differentSize = Math.abs(firstSize - secondSize);
		if (firstSize > secondSize) {
			second = addPadding(second, differentSize);
		} else if (secondSize > firstSize) {
			first = addPadding(first, differentSize);
		}
		SumWrapper sumWrapper = executeSum(first, second);
		return sumWrapper.setPassToNextIfExist();
	}

	private LinkedListNode addPadding(LinkedListNode node, int differentSize) {
		LinkedListNode paddedNode = new LinkedListNode(0);
		for (int i = 1; i < differentSize; i++) {
			paddedNode.appendToTail(0);
		}
		while (node != null) {
			paddedNode.appendToTail(node.data);
			node = node.next;
		}
		return paddedNode;

	}

	private SumWrapper executeSum(LinkedListNode first, LinkedListNode second) {
		if (first == null) {
			return new SumWrapper();
		}
		SumWrapper sumWrapper = executeSum(first.next, second.next);
		sumWrapper.set(first, second);
		return sumWrapper;
	}


}


