package main.dataStructures.LinkedLists.Seven;

import main.dataStructures.LinkedLists.Lib.DoublyLinkedList;
import main.dataStructures.LinkedLists.Lib.IntWrapper;
import main.dataStructures.LinkedLists.Lib.LinkedListNode;
import main.dataStructures.LinkedLists.Lib.Size;
import main.dataStructures.LinkedLists.Seven.Lib.LinkedListResult;

public class PalindromeRecursive {
    public boolean check(DoublyLinkedList node,DoublyLinkedList prev,DoublyLinkedList next, IntWrapper isPalindrome) {
       if(node.next!=null && node.next.next!=null){
           check(node.next.next,prev.next,next.next,isPalindrome);
       }else if(node.next!=null){
           check(node.next,prev,next.next,isPalindrome);
       } else if(next!=null){
           if(prev.data != next.data){
               isPalindrome.setId(1);
           } else {
               check(node, prev.prev, next.next,isPalindrome);
           }
       }
        return isPalindrome.getId()==0;
    }

    public boolean checkWithLength(LinkedListNode palindromeLinkedList) {
        int length =Size.get(palindromeLinkedList);
        return recursiveResult(palindromeLinkedList, length).status;
    }

    private LinkedListResult recursiveResult(LinkedListNode node, int length) {
        if(length==0){
            return new LinkedListResult(null,true);
        }
        if(length==1){
            return new LinkedListResult(node.next,true);
        }
        if(length ==2){
            return new LinkedListResult(node.next.next,node.data==node.next.data);
        }

        LinkedListResult result = recursiveResult(node.next,length-2);
        if(result.status && result.node !=null){
            result.status = (result.node.data ==node.data);
            result.node = result.node.next;
        }
        return result;
    }
}
