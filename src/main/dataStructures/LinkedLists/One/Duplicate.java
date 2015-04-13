package main.dataStructures.LinkedLists.One;

import main.dataStructures.LinkedLists.Lib.LinkedListNode;

import java.util.HashSet;

public class Duplicate {
    public void removeDuplicate(LinkedListNode linkedListNode) {
        HashSet uniqueData=new HashSet();
        LinkedListNode current = null;
        LinkedListNode next = linkedListNode;
        while (next!=null){
            if(uniqueData.contains(next.data)){
                current.next =next.next;
            }
            else{
                current = next;
                uniqueData.add(current.data);
            }
            next= next.next;
        }
    }
}
