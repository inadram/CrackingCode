package dataStructures.LinkedLists.Two;

import  dataStructures.LinkedLists.Lib.IntWrapper;
import  dataStructures.LinkedLists.Lib.LinkedListNode;

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
