package main.dataStructures.LinkedLists.Two;

import main.dataStructures.LinkedLists.Lib.LinkedListNode;

public class KthToLastRecursive {
    public int get(LinkedListNode linkedListNode, int kthToLast) {
        int kth =getKth(linkedListNode,kthToLast);
        return (kth>0)?getKthValue(linkedListNode, kth):-1;

    }

    private int getKthValue(LinkedListNode linkedListNode, int kth) {
        if (kth == 0) {
            return linkedListNode.data;
        }
        return getKthValue(linkedListNode.next, --kth);
    }

    private int getKth(LinkedListNode linkedListNode, int kthToLast) {
        return getSize(linkedListNode,0) -kthToLast;
    }

    private int getSize(LinkedListNode linkedListNode, int size) {
        if(linkedListNode==null){
            return size;
        }
        return getSize(linkedListNode.next,++size);
    }
}
