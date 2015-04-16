package main.dataStructures.LinkedLists.Two;

import main.dataStructures.LinkedLists.Lib.LinkedListNode;
import main.dataStructures.LinkedLists.Two.Lib.Kth;

public class KthToLast {
    public int get(LinkedListNode linkedListNode, int kthToLastElement) {
        int kthElement = Kth.get(linkedListNode, kthToLastElement);
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


}
