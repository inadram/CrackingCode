import dataStructures.LinkedLists.Lib.LinkedListNode;
import dataStructures.LinkedLists.Seven.Palindrome;
import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertTrue;

public class PalindromeTest {

	@Test
	public void test_linkedList_is_palindrome() {
		Palindrome palindrome = new Palindrome();

		LinkedListNode palindromeLinkedList = new LinkedListNode(1);
		palindromeLinkedList.appendToTail(2);
		palindromeLinkedList.appendToTail(3);
		palindromeLinkedList.appendToTail(4);
		palindromeLinkedList.appendToTail(3);
		palindromeLinkedList.appendToTail(2);
		palindromeLinkedList.appendToTail(1);
		assertTrue(palindrome.check(palindromeLinkedList));
	}

	@Test
	public void test_linkedList_is_not_palindrome() {
		Palindrome palindrome = new Palindrome();

		LinkedListNode palindromeLinkedList = new LinkedListNode(1);
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