import  dataStructures.LinkedLists.Lib.DoublyLinkedList;
import  dataStructures.LinkedLists.Lib.IntWrapper;
import  dataStructures.LinkedLists.Lib.LinkedListNode;
import  dataStructures.LinkedLists.Seven.PalindromeRecursive;
import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertTrue;

public class PalindromeRecursiveTest {


    @Test
    public void test_odd_linkedList_is_palindrome_Recursive(){
        PalindromeRecursive palindrome = new PalindromeRecursive();

        DoublyLinkedList palindromeLinkedList=new DoublyLinkedList(1);
        palindromeLinkedList.appendToTail(2);
        palindromeLinkedList.appendToTail(3);
        palindromeLinkedList.appendToTail(4);
        palindromeLinkedList.appendToTail(3);
        palindromeLinkedList.appendToTail(2);
        palindromeLinkedList.appendToTail(1);
        assertTrue(palindrome.check(palindromeLinkedList, palindromeLinkedList, palindromeLinkedList, new IntWrapper()));
    }

    @Test
    public void test_even_linkedList_is_palindrome_Recursive(){
        PalindromeRecursive palindrome = new PalindromeRecursive();

        DoublyLinkedList palindromeLinkedList=new DoublyLinkedList(1);
        palindromeLinkedList.appendToTail(2);
        palindromeLinkedList.appendToTail(3);
        palindromeLinkedList.appendToTail(4);
        palindromeLinkedList.appendToTail(4);
        palindromeLinkedList.appendToTail(3);
        palindromeLinkedList.appendToTail(2);
        palindromeLinkedList.appendToTail(1);
        assertTrue(palindrome.check(palindromeLinkedList, palindromeLinkedList, palindromeLinkedList, new IntWrapper()));
    }

    @Test
    public void test_linkedList_is_not_palindrome_Recursive(){
        PalindromeRecursive palindrome = new PalindromeRecursive();

        DoublyLinkedList palindromeLinkedList=new DoublyLinkedList(1);
        palindromeLinkedList.appendToTail(2);
        palindromeLinkedList.appendToTail(3);
        palindromeLinkedList.appendToTail(4);
        palindromeLinkedList.appendToTail(3);
        palindromeLinkedList.appendToTail(3);
        palindromeLinkedList.appendToTail(2);
        palindromeLinkedList.appendToTail(1);
        assertFalse(palindrome.check(palindromeLinkedList, palindromeLinkedList, palindromeLinkedList, new IntWrapper()));
    }

    @Test
    public void test_odd_linkedList_is_palindrome_Recursive_with_length(){
        PalindromeRecursive palindrome = new PalindromeRecursive();

        LinkedListNode palindromeLinkedList=new LinkedListNode(1);
        palindromeLinkedList.appendToTail(2);
        palindromeLinkedList.appendToTail(3);
        palindromeLinkedList.appendToTail(4);
        palindromeLinkedList.appendToTail(3);
        palindromeLinkedList.appendToTail(2);
        palindromeLinkedList.appendToTail(1);
        assertTrue(palindrome.checkWithLength(palindromeLinkedList));
    }

    @Test
    public void test_even_linkedList_is_palindrome_Recursive_with_length(){
        PalindromeRecursive palindrome = new PalindromeRecursive();

        LinkedListNode palindromeLinkedList=new LinkedListNode(1);
        palindromeLinkedList.appendToTail(2);
        palindromeLinkedList.appendToTail(3);
        palindromeLinkedList.appendToTail(4);
        palindromeLinkedList.appendToTail(4);
        palindromeLinkedList.appendToTail(3);
        palindromeLinkedList.appendToTail(2);
        palindromeLinkedList.appendToTail(1);
        assertTrue(palindrome.checkWithLength(palindromeLinkedList));
    }

    @Test
    public void test_linkedList_is_not_palindrome_Recursive_with_length(){
        PalindromeRecursive palindrome = new PalindromeRecursive();

        LinkedListNode palindromeLinkedList=new LinkedListNode(1);
        palindromeLinkedList.appendToTail(2);
        palindromeLinkedList.appendToTail(3);
        palindromeLinkedList.appendToTail(4);
        palindromeLinkedList.appendToTail(3);
        palindromeLinkedList.appendToTail(3);
        palindromeLinkedList.appendToTail(2);
        palindromeLinkedList.appendToTail(1);
        assertFalse(palindrome.checkWithLength(palindromeLinkedList));
    }

}