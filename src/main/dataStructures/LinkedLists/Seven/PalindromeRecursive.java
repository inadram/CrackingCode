package main.dataStructures.LinkedLists.Seven;

import main.dataStructures.LinkedLists.Lib.DoublyLinkedList;
import main.dataStructures.LinkedLists.Lib.IntWrapper;
import main.dataStructures.LinkedLists.Lib.Size;

import java.util.Stack;

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

}
