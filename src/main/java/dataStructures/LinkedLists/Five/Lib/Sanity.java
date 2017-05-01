package dataStructures.LinkedLists.Five.Lib;

import dataStructures.LinkedLists.Lib.LinkedListNode;

public class Sanity {

	public static int sum(LinkedListNode first, LinkedListNode second, int passToNext) {
		int firstValue = 0;
		int secondValue = 0;
		if (first != null) {
			firstValue = first.data;
		}
		if (second != null) {
			secondValue = second.data;
		}
		return firstValue + secondValue + passToNext;
	}

}
