package dataStructures.LinkedLists.Three;

import  dataStructures.LinkedLists.Lib.LinkedListNode;

public class DeleteNode {

    public void execute(LinkedListNode n){
        LinkedListNode next = n.next;
        n.next =next.next;
        n.data = next.data;

    }
}
