package main.dataStructures.LinkedLists.Two;

import main.dataStructures.LinkedLists.Lib.LinkedListNode;

public class KthToLast {
    public int get(LinkedListNode linkedListNode, int kthToLastElement) {
        int kthElement = getKth(linkedListNode, kthToLastElement);
        return getKthValue(linkedListNode, kthElement);
    }

    private int getKthValue(LinkedListNode linkedListNode, int kthElement) {
       if(kthElement>0) {
           for (int i = 1; i <= kthElement; i++) {
               linkedListNode = linkedListNode.next;
           }
           return linkedListNode.data;
       }
        return -1;
    }

    private int getKth(LinkedListNode linkedListNode, int kthToLast) {
        return getSize(linkedListNode)-kthToLast;
    }

    private int getSize(LinkedListNode linkedListNode) {
        int size = 0;
        while (linkedListNode != null) {
            size++;
            linkedListNode = linkedListNode.next;
        }
        return size;
    }
}
