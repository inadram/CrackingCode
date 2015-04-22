package test;

import main.dataStructures.LinkedLists.Lib.LinkedListNode;
import main.dataStructures.LinkedLists.Seven.Palindrome;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertFalse;
import static org.testng.AssertJUnit.assertTrue;

public class PalindromeTest {

    @Test
    public void test_linkedList_is_palindrome(){
        Palindrome palindrome = new Palindrome();

        LinkedListNode palindromeLinkedList=new LinkedListNode(1);
        palindromeLinkedList.appendToTail(2);
        palindromeLinkedList.appendToTail(3);
        palindromeLinkedList.appendToTail(4);
        palindromeLinkedList.appendToTail(3);
        palindromeLinkedList.appendToTail(2);
        palindromeLinkedList.appendToTail(1);
        assertTrue(palindrome.check(palindromeLinkedList));
    }

    @Test
    public void test_linkedList_is_not_palindrome(){
        Palindrome palindrome = new Palindrome();

        LinkedListNode palindromeLinkedList=new LinkedListNode(1);
        palindromeLinkedList.appendToTail(2);
        palindromeLinkedList.appendToTail(3);
        palindromeLinkedList.appendToTail(4);
        palindromeLinkedList.appendToTail(3);
        palindromeLinkedList.appendToTail(3);
        palindromeLinkedList.appendToTail(2);
        palindromeLinkedList.appendToTail(1);
        assertFalse(palindrome.check(palindromeLinkedList));
    }

}