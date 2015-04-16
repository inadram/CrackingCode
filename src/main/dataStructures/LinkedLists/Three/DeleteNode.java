package main.dataStructures.LinkedLists.Three;

import main.dataStructures.LinkedLists.Lib.LinkedListNode;

public class DeleteNode {

    public void execute(LinkedListNode n){
        LinkedListNode next = n.next;
        n.next =next.next;
        n.data = next.data;

    }
}
