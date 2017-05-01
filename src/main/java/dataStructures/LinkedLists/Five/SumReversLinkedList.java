package dataStructures.LinkedLists.Five;

import  dataStructures.LinkedLists.Five.Lib.Sanity;
import  dataStructures.LinkedLists.Lib.LinkedListNode;

public class SumReversLinkedList {


    public LinkedListNode execute(LinkedListNode first, LinkedListNode second, int passToNext) {
        if (first == null && second == null) {
            return new LinkedListNode(passToNext);
        }
        int sum = Sanity.sum(first, second, passToNext);
        passToNext = sum/10;
        int mod =sum % 10;

        if (first != null) {
            first = first.next;
        }
        if (second != null) {
            second = second.next;
        }
        LinkedListNode sumNode= execute(first, second, passToNext);
        sumNode.appendToTail(mod);
        return sumNode;
    }


}
