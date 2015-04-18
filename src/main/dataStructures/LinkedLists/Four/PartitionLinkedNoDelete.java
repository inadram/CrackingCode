package main.dataStructures.LinkedLists.Four;

import main.dataStructures.LinkedLists.Lib.LinkedListNode;

public class PartitionLinkedNoDelete {
    public LinkedListNode execute(LinkedListNode linkedlistNode, int partitionBy) {
        LinkedListNode smaller = null;
        LinkedListNode smallerIterate = null;
        LinkedListNode bigger = null;
        LinkedListNode biggerIterate = null;

        while (linkedlistNode != null) {
            LinkedListNode next = linkedlistNode.next;
            linkedlistNode.next =null;
            if (linkedlistNode.data < partitionBy) {
                if (smaller == null) {
                    smaller = linkedlistNode;
                    smallerIterate = smaller;
                } else {
                    smallerIterate.next = linkedlistNode;
                    smallerIterate = linkedlistNode;
                }
            } else if(linkedlistNode.data>partitionBy){
                if (bigger == null) {
                    bigger = linkedlistNode;
                    biggerIterate = bigger;
                } else {
                    biggerIterate.next =linkedlistNode;
                    biggerIterate = linkedlistNode;
                }
            }

            linkedlistNode = next;
        }
        LinkedListNode partition = new LinkedListNode(partitionBy);
        partition.next = bigger;

        if(smallerIterate==null){
            return partition;
        }

        smallerIterate.next =partition;
        return smaller;

    }

    public LinkedListNode executeOptimised(LinkedListNode node, int partitionBy) {
        LinkedListNode smaller = null;
        LinkedListNode bigger = null;

        while (node != null) {
            LinkedListNode next = node.next;
            if (node.data < partitionBy) {
                    node.next = smaller;
                    smaller = node;

            } else if(node.data>partitionBy){
                    node.next =bigger;
                    bigger = node;
            }

            node = next;
        }
        LinkedListNode partition = new LinkedListNode(partitionBy);
        partition.next = bigger;

        if(smaller==null){
            return partition;
        }
        LinkedListNode head =smaller;
        while (smaller.next!=null){
            smaller = smaller.next;
        }
        smaller.next =partition;
        return head;
    }
}
