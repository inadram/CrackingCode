package main.dataStructures.LinkedLists.Five;

import main.dataStructures.LinkedLists.Five.Lib.Sanity;
import main.dataStructures.LinkedLists.Lib.LinkedListNode;

public class SumLinkedList {

    public LinkedListNode execute(LinkedListNode first, LinkedListNode second) {
        int sum = Sanity.sum(first, second, 0);
        int passToNext = sum/10;
        int mod =sum % 10;
        return executeSum(first.next, second.next,new LinkedListNode(mod),passToNext);
    }

    private LinkedListNode executeSum(LinkedListNode first, LinkedListNode second, LinkedListNode sumNode, int passToNext) {
        if (first == null && second == null) {
            if(passToNext>0){
                sumNode.appendToTail(passToNext);
            }
            return sumNode;
        }
        int sum = Sanity.sum(first, second, passToNext);
        passToNext = sum/10;
        int mod =sum % 10;
        sumNode.appendToTail(mod);

        if (first != null) {
            first = first.next;
        }
        if (second != null) {
            second = second.next;
        }
        return executeSum(first, second, sumNode, passToNext);

    }

}
