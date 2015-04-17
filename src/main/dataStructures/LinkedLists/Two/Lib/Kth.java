package main.dataStructures.LinkedLists.Two.Lib;

import main.dataStructures.LinkedLists.Lib.LinkedListNode;
import main.dataStructures.LinkedLists.Lib.Size;

public class Kth {

    public static int get(LinkedListNode linkedListNode, int kthToLast) {
        return Size.get(linkedListNode)-kthToLast;
    }

}
