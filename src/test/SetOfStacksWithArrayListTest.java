package test;

import junit.framework.TestCase;
import main.dataStructures.StacksAndQueues.Three.SetOfStacks;
import main.dataStructures.StacksAndQueues.Three.SetOfStacksWithArrayList;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class SetOfStacksWithArrayListTest{

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

        assertEquals(14,setOfStacks.pop());
        assertEquals(13,setOfStacks.pop());
        assertEquals(12,setOfStacks.pop());
        assertEquals(11,setOfStacks.pop());
        assertEquals(10,setOfStacks.pop());
    }

}