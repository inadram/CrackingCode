package test;

import main.dataStructures.LinkedLists.Five.SumReversLinkedList;
import main.dataStructures.LinkedLists.Lib.LinkedListNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class SumReversLinkedListTest {

    @Test
    public void test_sum_two_revers_linked_list(){
        SumReversLinkedList sumLinkedList=new SumReversLinkedList();
        // first  => 2056
        LinkedListNode first = new LinkedListNode(6);
        first.appendToTail(5);
        first.appendToTail(0);
        first.appendToTail(2);

        // second => 8769
        LinkedListNode second =new LinkedListNode(9);
        second.appendToTail(6);
        second.appendToTail(7);
        second.appendToTail(8);

        LinkedListNode actual =sumLinkedList.execute(first, second, 0);

        // expected sum => 10825
        LinkedListNode expected =new LinkedListNode(1);
        expected.appendToTail(0);
        expected.appendToTail(8);
        expected.appendToTail(2);
        expected.appendToTail(5);

        while (expected!=null){
            assertEquals(actual.data,expected.data);
            actual = actual.next;
            expected = expected.next;
        }
        assertNull(actual);
    }

    @Test
    public void test_sum_two_different_size_revers_linked_list(){
        SumReversLinkedList sumLinkedList=new SumReversLinkedList();
        // first  => 2056
        LinkedListNode first = new LinkedListNode(6);
        first.appendToTail(5);
        first.appendToTail(0);
        first.appendToTail(2);

        // second => 98769
        LinkedListNode second =new LinkedListNode(9);
        second.appendToTail(6);
        second.appendToTail(7);
        second.appendToTail(8);
        second.appendToTail(9);

        LinkedListNode actual =sumLinkedList.execute(first, second, 0);

        // expected sum => 100825
        LinkedListNode expected =new LinkedListNode(1);
        expected.appendToTail(0);
        expected.appendToTail(0);
        expected.appendToTail(8);
        expected.appendToTail(2);
        expected.appendToTail(5);

        while (expected!=null){
            assertEquals(actual.data,expected.data);
            actual = actual.next;
            expected = expected.next;
        }
        assertNull(actual);
    }

}