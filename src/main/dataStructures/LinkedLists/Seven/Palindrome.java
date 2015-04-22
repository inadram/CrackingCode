package main.dataStructures.LinkedLists.Seven;

import main.dataStructures.LinkedLists.Lib.LinkedListNode;
import main.dataStructures.LinkedLists.Lib.NodeEquality;
import main.dataStructures.LinkedLists.Lib.Revers;

public class Palindrome {
    public boolean check(LinkedListNode palindromeLinkedList) {
        LinkedListNode reversNode = Revers.get(palindromeLinkedList);
        return NodeEquality.check(reversNode, palindromeLinkedList);
    }
}
