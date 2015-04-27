package main.dataStructures.StacksAndQueues.Lib;

import main.dataStructures.LinkedLists.Lib.LinkedListNode;

public class Stack {
    LinkedListNode head = null;
    LinkedListNode tail = null;

    public void push(int i) {
        head = new LinkedListNode(i);
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
