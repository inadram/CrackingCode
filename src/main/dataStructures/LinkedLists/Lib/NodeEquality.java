package main.dataStructures.LinkedLists.Lib;

public class NodeEquality {

    public static boolean check(LinkedListNode first, LinkedListNode second) {
        while (first!=null){
            if(first.data!=second.data){
                return false;
            }
            first = first.next;
            second = second.next;
        }
        return true;
    }
}
