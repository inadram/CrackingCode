import dataStructures.StacksAndQueues.Six.OrderStack;
import org.junit.Test;

import java.util.Stack;

import static junit.framework.TestCase.assertEquals;

public class OrderStackTest {

	@Test
	public void test_if_stack_ordered() {

		Stack<Integer> someStack = new Stack<Integer>();
		someStack.push(100);
		someStack.push(10);
		someStack.push(150);
		someStack.push(120);
		someStack.push(220);
		someStack.push(320);
		someStack.push(20);
		someStack.push(820);
		someStack.push(82);
		someStack.push(72);
		someStack.push(65);
		someStack.push(900);

		Stack<Integer> ascendingOrder = new Stack<Integer>();
		ascendingOrder.push(10);
		ascendingOrder.push(20);
		ascendingOrder.push(65);
		ascendingOrder.push(72);
		ascendingOrder.push(82);
		ascendingOrder.push(100);
		ascendingOrder.push(120);
		ascendingOrder.push(150);
		ascendingOrder.push(220);
		ascendingOrder.push(320);
		ascendingOrder.push(820);
		ascendingOrder.push(900);

		OrderStack orderStack = new OrderStack();
		Stack actual = orderStack.ascend(someStack);

		while (!actual.isEmpty()) {
			assertEquals(ascendingOrder.pop(), actual.pop());
		}

		assertEquals(ascendingOrder.size(), actual.size());

	}

}