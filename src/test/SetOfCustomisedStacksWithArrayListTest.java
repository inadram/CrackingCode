package test;

import main.dataStructures.StacksAndQueues.Three.SetOfStacksWithArrayList;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class SetOfCustomisedStacksWithArrayListTest {

    @Test
    public void test_push_to_setOfStacks_go_to_next_stack_when_its_exceeds_capacity(){

        SetOfStacksWithArrayList setOfStacks=new SetOfStacksWithArrayList(3);
        setOfStacks.push(10);
        setOfStacks.push(11);
        setOfStacks.push(12);
        setOfStacks.push(13);
        setOfStacks.push(14);

        assertEquals(14,setOfStacks.peek());
    }

    @Test
    public void test_pop_from_setOfStacks_get_value_from_prev_stack_when_its_run_out_of_value(){

        SetOfStacksWithArrayList setOfStacks=new SetOfStacksWithArrayList(3);
        setOfStacks.push(10);
        setOfStacks.push(11);
        setOfStacks.push(12);
        setOfStacks.push(13);
        setOfStacks.push(14);

        assertEquals(14, setOfStacks.pop());
        assertEquals(13, setOfStacks.pop());
        assertEquals(12, setOfStacks.pop());
        assertEquals(11, setOfStacks.pop());
        assertEquals(10,setOfStacks.pop());
    }

    @Test
    public void test_popAt_from_setOfStacks_get_value_from_specified_stack() {

        SetOfStacksWithArrayList setOfStacks = new SetOfStacksWithArrayList(3);
        setOfStacks.push(10);
        setOfStacks.push(11);
        setOfStacks.push(12);
        setOfStacks.push(13);
        setOfStacks.push(14);
        setOfStacks.push(15);
        setOfStacks.push(16);
        setOfStacks.push(17);
        setOfStacks.push(18);

        assertEquals(12, setOfStacks.popAt(0));
        assertEquals(13, setOfStacks.popAt(0));
        assertEquals(14, setOfStacks.popAt(0));
        assertEquals(15, setOfStacks.popAt(0));
        assertEquals(16, setOfStacks.popAt(0));
        assertEquals(17, setOfStacks.popAt(0));
        assertEquals(18, setOfStacks.popAt(0));
        assertEquals(11, setOfStacks.popAt(0));
        assertEquals(10, setOfStacks.popAt(0));
    }

}