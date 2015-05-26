package main.dataStructures.StacksAndQueues.Lib;

import main.dataStructures.LinkedLists.Lib.LinkedListNode;

public class Stack {
    LinkedListNode head = null;
    LinkedListNode tail = null;
    int size=0;

    public void push(int i) {
        head = new LinkedListNode(i);
        head.next = tail;
        tail = head;
        size++;

    }

    public int peek() {
        return head.data;
    }

    public int pop() {
        size--;
        if (head != null) {
            int data = head.data;
            head = head.next;
            tail = tail.next;
            return data;
        } else {
            return -1;
        }
    }

    public boolean isEmpty(){
        return head==null;
    }

    public int size() {
        return this.size;
    }
}
