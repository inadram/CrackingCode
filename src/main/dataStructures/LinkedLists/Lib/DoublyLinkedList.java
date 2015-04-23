package main.dataStructures.LinkedLists.Lib;

public class DoublyLinkedList {
    public DoublyLinkedList next;
    public DoublyLinkedList prev;
    public int data;
    public DoublyLinkedList(int data){
             this.data = data;
    }

    public void appendToTail(int data){
        DoublyLinkedList node = this;
        while (node.next!=null){
            node = node.next;
        }
        DoublyLinkedList nextNode =new DoublyLinkedList(data);
        node.next = nextNode;
        nextNode.prev = node;
    }
}
