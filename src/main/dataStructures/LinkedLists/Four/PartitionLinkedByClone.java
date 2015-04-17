package main.dataStructures.LinkedLists.Four;

import main.dataStructures.LinkedLists.Lib.LinkedListNode;
import main.dataStructures.LinkedLists.Lib.Size;

public class PartitionLinkedByClone {
    public LinkedListNode execute(LinkedListNode linkedListNode, int partitionBy) {
        LinkedListNode partition = new LinkedListNode(partitionBy);
        int size=Size.get(linkedListNode);
        for(int i=0;i<size;i++){
            if(linkedListNode.data<partitionBy){
              LinkedListNode prev = new LinkedListNode(linkedListNode.data);
              prev.next =partition;
              partition = prev;

            }
            else if(linkedListNode.data>partitionBy) {
                partition.appendToTail(linkedListNode.data);
            }
            linkedListNode = linkedListNode.next;
        }
        return partition;
    }
}
