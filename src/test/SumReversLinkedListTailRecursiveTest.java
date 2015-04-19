package test;

import main.dataStructures.LinkedLists.Five.SumReversLinkedListTailRecursive;
import main.dataStructures.LinkedLists.Lib.LinkedListNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class SumReversLinkedListTailRecursiveTest {

    @Test
    public void test_sum_two_revers_linked_list(){
        SumReversLinkedListTailRecursive sumLinkedList=new SumReversLinkedListTailRecursive();
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

        LinkedListNode actual =sumLinkedList.execute(first,second);

        // expected sum => 10825
        LinkedListNode expected =new LinkedListNode(5);
        expected.appendToTail(2);
        expected.appendToTail(8);
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