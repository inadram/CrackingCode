package main.dataStructures.LinkedLists.Lib;

public class LinkedListNode  {
    public LinkedListNode next;
    public int data;
    public LinkedListNode(int data){
        this.data=data;
    }

    public void appendToTail(int data){
        LinkedListNode linkedListNode = this;
        while (linkedListNode.next!=null){
            linkedListNode = linkedListNode.next;
        }
        linkedListNode.next = new LinkedListNode(data);
    }

}
