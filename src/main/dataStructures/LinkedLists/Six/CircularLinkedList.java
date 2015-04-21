package main.dataStructures.LinkedLists.Six;

import main.dataStructures.LinkedLists.Lib.LinkedListNode;

public class CircularLinkedList {
    public int find(LinkedListNode circularLinkedList) {
        LinkedListNode head = circularLinkedList;
        LinkedListNode slowRunner = circularLinkedList;
        LinkedListNode fastRunner = circularLinkedList.next;
        while(slowRunner!=fastRunner && slowRunner.next!=null && fastRunner.next.next!=null){
            slowRunner=slowRunner.next;
            fastRunner = fastRunner.next.next;
        }
        slowRunner = slowRunner.next;
        while (head!=slowRunner){
            head=head.next;
            slowRunner= slowRunner.next;
        }

         return head.data;
    }
}
