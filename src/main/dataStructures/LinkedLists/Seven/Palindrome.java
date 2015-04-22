package main.dataStructures.LinkedLists.Seven;

import main.dataStructures.LinkedLists.Lib.LinkedListNode;
import main.dataStructures.LinkedLists.Lib.NodeEquality;
import main.dataStructures.LinkedLists.Lib.Revers;
import main.dataStructures.LinkedLists.Lib.Size;

public class Palindrome {
    public boolean check(LinkedListNode palindromeLinkedList) {
        int halfSize = (int) Math.floor(Size.get(palindromeLinkedList) / 2);
        LinkedListNode reversNode = Revers.get(palindromeLinkedList);
        return NodeEquality.check(reversNode, palindromeLinkedList,halfSize);
    }
}
