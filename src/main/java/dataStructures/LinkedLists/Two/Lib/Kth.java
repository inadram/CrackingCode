package dataStructures.LinkedLists.Two.Lib;

import  dataStructures.LinkedLists.Lib.LinkedListNode;
import  dataStructures.LinkedLists.Lib.Size;

public class Kth {

    public static int get(LinkedListNode linkedListNode, int kthToLast) {
        return Size.get(linkedListNode)-kthToLast;
    }

}
