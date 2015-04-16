package main.dataStructures.LinkedLists.Two;

import main.dataStructures.LinkedLists.Lib.LinkedListNode;
import main.dataStructures.LinkedLists.Two.Lib.Kth;

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
