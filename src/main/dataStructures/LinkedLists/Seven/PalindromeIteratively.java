package main.dataStructures.LinkedLists.Seven;

import main.dataStructures.LinkedLists.Lib.DoublyLinkedList;
import main.dataStructures.LinkedLists.Lib.Size;

public class PalindromeIteratively {
    public boolean check(DoublyLinkedList node) {
        int size = Size.get(node);
        int halfSize = size / 2;
        for (int i = 1; i <= halfSize; i++) {
            node = node.next;
        }
        DoublyLinkedList prevNode = (size%2==0)?node.prev:node;
        for (int i = 1; i <= halfSize; i++) {
            if (node.data != prevNode.data) {
                return false;
            }
            node = node.next;
            prevNode = prevNode.prev;
        }
        return true;
    }
}
