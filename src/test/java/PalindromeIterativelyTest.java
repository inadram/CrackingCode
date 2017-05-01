import  dataStructures.LinkedLists.Lib.DoublyLinkedList;
import  dataStructures.LinkedLists.Seven.PalindromeIteratively;
import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertTrue;

public class PalindromeIterativelyTest{


    @Test
    public void test_odd_linkedList_is_palindrome_iteratively(){
        PalindromeIteratively palindrome = new PalindromeIteratively();

        DoublyLinkedList palindromeLinkedList=new DoublyLinkedList(1);
        palindromeLinkedList.appendToTail(2);
        palindromeLinkedList.appendToTail(3);
        palindromeLinkedList.appendToTail(4);
        palindromeLinkedList.appendToTail(3);
        palindromeLinkedList.appendToTail(2);
        palindromeLinkedList.appendToTail(1);
        assertTrue(palindrome.check(palindromeLinkedList));
    }

    @Test
    public void test_even_linkedList_is_palindrome_iteratively(){
        PalindromeIteratively palindrome = new PalindromeIteratively();

        DoublyLinkedList palindromeLinkedList=new DoublyLinkedList(1);
        palindromeLinkedList.appendToTail(2);
        palindromeLinkedList.appendToTail(3);
        palindromeLinkedList.appendToTail(4);
        palindromeLinkedList.appendToTail(4);
        palindromeLinkedList.appendToTail(3);
        palindromeLinkedList.appendToTail(2);
        palindromeLinkedList.appendToTail(1);
        assertTrue(palindrome.check(palindromeLinkedList));
    }

    @Test
    public void test_linkedList_is_not_palindrome_iteratively(){
        PalindromeIteratively palindrome = new PalindromeIteratively();

        DoublyLinkedList palindromeLinkedList=new DoublyLinkedList(1);
        palindromeLinkedList.appendToTail(2);
        palindromeLinkedList.appendToTail(3);
        palindromeLinkedList.appendToTail(4);
        palindromeLinkedList.appendToTail(3);
        palindromeLinkedList.appendToTail(3);
        palindromeLinkedList.appendToTail(2);
        palindromeLinkedList.appendToTail(1);
        assertFalse(palindrome.check(palindromeLinkedList));
    }

    @Test
    public void test_odd_linkedList_is_palindrome_iteratively_with_stack(){
        PalindromeIteratively palindrome = new PalindromeIteratively();

        DoublyLinkedList palindromeLinkedList=new DoublyLinkedList(1);
        palindromeLinkedList.appendToTail(2);
        palindromeLinkedList.appendToTail(3);
        palindromeLinkedList.appendToTail(4);
        palindromeLinkedList.appendToTail(3);
        palindromeLinkedList.appendToTail(2);
        palindromeLinkedList.appendToTail(1);
        assertTrue(palindrome.checkWithStack(palindromeLinkedList));
    }

    @Test
    public void test_even_linkedList_is_palindrome_iteratively_with_stack(){
        PalindromeIteratively palindrome = new PalindromeIteratively();

        DoublyLinkedList palindromeLinkedList=new DoublyLinkedList(1);
        palindromeLinkedList.appendToTail(2);
        palindromeLinkedList.appendToTail(3);
        palindromeLinkedList.appendToTail(4);
        palindromeLinkedList.appendToTail(4);
        palindromeLinkedList.appendToTail(3);
        palindromeLinkedList.appendToTail(2);
        palindromeLinkedList.appendToTail(1);
        assertTrue(palindrome.checkWithStack(palindromeLinkedList));
    }

    @Test
    public void test_linkedList_is_not_palindrome_iteratively_with_stack(){
        PalindromeIteratively palindrome = new PalindromeIteratively();

        DoublyLinkedList palindromeLinkedList=new DoublyLinkedList(1);
        palindromeLinkedList.appendToTail(2);
        palindromeLinkedList.appendToTail(3);
        palindromeLinkedList.appendToTail(4);
        palindromeLinkedList.appendToTail(3);
        palindromeLinkedList.appendToTail(3);
        palindromeLinkedList.appendToTail(2);
        palindromeLinkedList.appendToTail(1);
        assertFalse(palindrome.checkWithStack(palindromeLinkedList));
    }


}