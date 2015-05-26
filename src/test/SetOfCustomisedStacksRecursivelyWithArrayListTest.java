package test;

import main.dataStructures.StacksAndQueues.Three.SetOfCustomisedStacksRecursivelyWithArrayList;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class SetOfCustomisedStacksRecursivelyWithArrayListTest {


    @Test
    public void test_popAt_from_setOfStacks_get_value_from_specified_stack() {

        SetOfCustomisedStacksRecursivelyWithArrayList setOfStacks = new SetOfCustomisedStacksRecursivelyWithArrayList(3);
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