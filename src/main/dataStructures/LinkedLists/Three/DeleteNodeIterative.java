package main.dataStructures.LinkedLists.Three;

import main.dataStructures.LinkedLists.Lib.LinkedListNode;

public class DeleteNodeIterative {

    public void execute(LinkedListNode linkedListNode) {
        if (linkedListNode.next.next!=null) {
            linkedListNode.data = linkedListNode.next.data;
            execute(linkedListNode.next);
        }else {
            linkedListNode.data = linkedListNode.next.data;
            linkedListNode.next =null;
        }
    }
}
