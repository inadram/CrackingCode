package test;

import main.dataStructures.LinkedLists.Lib.DoublyLinkedList;
import main.dataStructures.LinkedLists.Lib.IntWrapper;
import main.dataStructures.LinkedLists.Seven.PalindromeIteratively;
import main.dataStructures.LinkedLists.Seven.PalindromeRecursive;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertFalse;
import static org.testng.AssertJUnit.assertTrue;

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

}