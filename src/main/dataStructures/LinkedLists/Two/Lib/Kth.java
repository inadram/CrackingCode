package main.dataStructures.LinkedLists.Two.Lib;

import main.dataStructures.LinkedLists.Lib.LinkedListNode;

public class Kth {

    public static int get(LinkedListNode linkedListNode, int kthToLast) {
        return getSize(linkedListNode)-kthToLast;
    }

    private static int getSize(LinkedListNode linkedListNode) {
        int size = 0;
        while (linkedListNode != null) {
            size++;
            linkedListNode = linkedListNode.next;
        }
        return size;
    }
}
