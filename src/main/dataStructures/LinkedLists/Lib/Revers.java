package main.dataStructures.LinkedLists.Lib;

public class Revers {
    public static LinkedListNode get(LinkedListNode palindromeLinkedList) {
        if (palindromeLinkedList == null) {
            return null;
        }
        LinkedListNode revers = get(palindromeLinkedList.next);
        if (revers == null) {
            revers = new LinkedListNode(palindromeLinkedList.data);
        } else {
            revers.appendToTail(palindromeLinkedList.data);
        }
        return revers;
    }
}
