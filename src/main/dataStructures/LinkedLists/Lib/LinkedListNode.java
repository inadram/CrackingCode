package main.dataStructures.LinkedLists.Lib;

public class LinkedListNode implements Cloneable {
    public LinkedListNode next;
    public int data;
    public LinkedListNode(int data){
        this.data=data;
    }

    public LinkedListNode(LinkedListNode linkedListNode) {
        this(linkedListNode.data);
    }

    public void appendToTail(int data){
        LinkedListNode linkedListNode = this;
        while (linkedListNode.next!=null){
            linkedListNode = linkedListNode.next;
        }
        linkedListNode.next = new LinkedListNode(data);
    }

    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
