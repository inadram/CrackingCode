package dataStructures.LinkedLists.Two;

import  dataStructures.LinkedLists.Lib.LinkedListNode;
import  dataStructures.LinkedLists.Two.Lib.Kth;

public class KthToLastRecursive {
    public int get(LinkedListNode linkedListNode, int kthToLast) {
        int kth = Kth.get(linkedListNode, kthToLast);
        return (kth>0)?getKthValue(linkedListNode, kth):-1;

    }

    private int getKthValue(LinkedListNode linkedListNode, int kth) {
        if (kth == 0) {
            return linkedListNode.data;
        }
        return getKthValue(linkedListNode.next, --kth);
    }

}
