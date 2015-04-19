package main.dataStructures.LinkedLists.Two;

import main.dataStructures.LinkedLists.Lib.LinkedListNode;
import main.dataStructures.LinkedLists.IntWrapper;

public class KthToLastWrapper {
    public int get(LinkedListNode linkedListNode, int kthToLast) {
        LinkedListNode node =getKthVNode(linkedListNode, kthToLast, new IntWrapper());
        return (node!=null)?node.data:-1;
    }

    private LinkedListNode getKthVNode(LinkedListNode linkedListNode, int kthToLast, IntWrapper intWrapper) {
        if(linkedListNode==null){
            return null;
        }

        LinkedListNode node = getKthVNode(linkedListNode.next, kthToLast, intWrapper);
        intWrapper.setId(intWrapper.getId()+1);
        if(intWrapper.getId()==kthToLast){
           return linkedListNode;
        }else{
            return node;
        }
    }

}
