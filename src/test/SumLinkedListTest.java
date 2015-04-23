package test;

import main.dataStructures.LinkedLists.Five.SumLinkedList;
import main.dataStructures.LinkedLists.Lib.LinkedListNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class SumLinkedListTest {

    @Test
    public void test_sum_two_linked_list(){
        SumLinkedList sumLinkedList=new SumLinkedList();
        // first  => 6502
        LinkedListNode first = new LinkedListNode(6);
        first.appendToTail(5);
        first.appendToTail(0);
        first.appendToTail(2);

        // second => 9678
        LinkedListNode second =new LinkedListNode(9);
        second.appendToTail(6);
        second.appendToTail(7);
        second.appendToTail(8);

        LinkedListNode actual =sumLinkedList.execute(first, second);

        // expected sum => 16180
        LinkedListNode expected =new LinkedListNode(0);
        expected.appendToTail(8);
        expected.appendToTail(1);
        expected.appendToTail(6);
        expected.appendToTail(1);

        while (expected!=null){
            assertEquals(actual.data,expected.data);
            actual = actual.next;
            expected = expected.next;
        }
        assertNull(actual);
    }

    @Test
    public void test_sum_two_different_size_linked_list(){
        SumLinkedList sumLinkedList=new SumLinkedList();
        // first  => 6502
        LinkedListNode first = new LinkedListNode(6);
        first.appendToTail(5);
        first.appendToTail(0);
        first.appendToTail(2);

        // second => 96789
        LinkedListNode second =new LinkedListNode(9);
        second.appendToTail(6);
        second.appendToTail(7);
        second.appendToTail(8);
        second.appendToTail(9);

        LinkedListNode actual =sumLinkedList.execute(first, second);

        // expected sum => 103291
        LinkedListNode expected =new LinkedListNode(1);
        expected.appendToTail(9);
        expected.appendToTail(2);
        expected.appendToTail(3);
        expected.appendToTail(0);
        expected.appendToTail(1);

        while (expected!=null){
            assertEquals(actual.data,expected.data);
            actual = actual.next;
            expected = expected.next;
        }
        assertNull(actual);
    }

}