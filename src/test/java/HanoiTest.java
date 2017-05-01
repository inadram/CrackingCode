import junit.framework.TestCase;
import  dataStructures.StacksAndQueues.Four.Hanoi;
import  dataStructures.StacksAndQueues.Lib.Stack;
import org.junit.Test;

public class HanoiTest extends TestCase {

    @Test
    public void test_disks_move_from_tower_1_to_3() {
        Hanoi hanoi = new Hanoi(3);
        java.util.Stack actual = hanoi.stacks[2];
        hanoi.move();
        Stack expected = new Stack();
        expected.push(30);
        expected.push(20);
        expected.push(10);
        while (!actual.isEmpty()) {
            assertEquals(actual.pop(), expected.pop());
        }
        assertTrue(actual.empty());

    }

    @Test
    public void test_two_disks_move_from_tower_1_to_3() {
        Hanoi hanoi = new Hanoi(2);
        java.util.Stack actual = hanoi.stacks[2];
        hanoi.move();
        Stack expected = new Stack();
        expected.push(20);
        expected.push(10);
        while (!actual.isEmpty()) {
            assertEquals(actual.pop(), expected.pop());
        }
        assertTrue(actual.empty());

    }

    @Test
    public void test_four_disks_move_from_tower_1_to_3() {
        Hanoi hanoi = new Hanoi(4);
        java.util.Stack actual = hanoi.stacks[2];
        hanoi.move();
        Stack expected = new Stack();
        expected.push(40);
        expected.push(30);
        expected.push(20);
        expected.push(10);
        while (!actual.isEmpty()) {
            assertEquals(actual.pop(), expected.pop());
        }
        assertTrue(actual.empty());

    }


}