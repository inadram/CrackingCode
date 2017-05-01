package dataStructures.LinkedLists.Seven;

import dataStructures.LinkedLists.Lib.LinkedListNode;
import dataStructures.LinkedLists.Lib.NodeEquality;
import dataStructures.LinkedLists.Lib.Revers;
import dataStructures.LinkedLists.Lib.Size;

public class Palindrome {
	public boolean check(LinkedListNode palindromeLinkedList) {
		int halfSize = Size.get(palindromeLinkedList) / 2;
		LinkedListNode reversNode = Revers.get(palindromeLinkedList);
		return NodeEquality.check(reversNode, palindromeLinkedList, halfSize);
	}
}
