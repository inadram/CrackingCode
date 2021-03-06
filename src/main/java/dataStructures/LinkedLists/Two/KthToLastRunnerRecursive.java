package dataStructures.LinkedLists.Two;

import dataStructures.LinkedLists.Lib.LinkedListNode;

public class KthToLastRunnerRecursive {
	public int get(LinkedListNode linkedListNode, int kth) {
		return getByRunner(linkedListNode, linkedListNode, kth);
	}

	private int getByRunner(LinkedListNode fastRunner, LinkedListNode slowRunnerNode, int kthToLast) {
		if (fastRunner == null) {
			return (kthToLast <= 0) ? slowRunnerNode.data : -1;
		} else if (kthToLast <= 0) {
			slowRunnerNode = slowRunnerNode.next;
		}

		return getByRunner(fastRunner.next, slowRunnerNode, --kthToLast);
	}
}
