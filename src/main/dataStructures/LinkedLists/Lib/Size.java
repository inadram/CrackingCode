package main.dataStructures.LinkedLists.Lib;

public class Size {
    public static int get(LinkedListNode linkedListNode) {
        int size = 0;
        while (linkedListNode != null) {
            size++;
            linkedListNode = linkedListNode.next;
        }
        return size;
    }
}
