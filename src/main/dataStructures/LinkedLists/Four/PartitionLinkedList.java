package main.dataStructures.LinkedLists.Four;

import main.dataStructures.LinkedLists.Lib.LinkedListNode;

public class PartitionLinkedList {

    public LinkedListNode execute(LinkedListNode linkedListNode, int partitionBy) {
        LinkedListNode bigger = null;
        LinkedListNode smaller = null;
        while (linkedListNode != null) {
            if (linkedListNode.data > partitionBy) {
                bigger = addDataToTail(bigger, linkedListNode.data);
            } else if (linkedListNode.data < partitionBy) {
                smaller = addDataToTail(smaller, linkedListNode.data);
            }
            linkedListNode = linkedListNode.next;
        }
        if (smaller != null) {
            smaller.appendToTail(partitionBy);
            while (bigger != null) {
                smaller.appendToTail(bigger.data);
                bigger = bigger.next;
            }
            return smaller;
        } else {
            return bigger;
        }

    }

    private LinkedListNode addDataToTail(LinkedListNode node, int data) {
        if (node == null) {
            node = new LinkedListNode(data);
        } else {
            node.appendToTail(data);
        }
        return node;
    }
}

