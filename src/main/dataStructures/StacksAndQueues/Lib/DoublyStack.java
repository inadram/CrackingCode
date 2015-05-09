package main.dataStructures.StacksAndQueues.Lib;

import main.dataStructures.LinkedLists.Lib.DoublyLinkedList;
import main.dataStructures.LinkedLists.Lib.LinkedListNode;

public class DoublyStack {
    DoublyLinkedList head = null;
    DoublyLinkedList tail = null;

    public void push(int i) {
        head = new DoublyLinkedList(i);
        head.next = tail;
        tail = head;

    }

    public int peek() {
        return head.data;
    }

    public int pop() {
        if (head != null) {
            int data = head.data;
            head = head.next;
            return data;
        } else {
            return -1;
        }
    }

    public boolean isEmpty(){
        return head==null;
    }

}
