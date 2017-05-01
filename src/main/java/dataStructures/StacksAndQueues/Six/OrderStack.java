package dataStructures.StacksAndQueues.Six;


import java.util.Stack;

public class OrderStack {
	Stack<Integer> temp = new Stack();

	public Stack<Integer> ascend(Stack<Integer> someStack) {
		while (!someStack.isEmpty()) {
			int current = someStack.pop();
			while (!temp.isEmpty() && temp.peek() > current) someStack.push(temp.pop());
			temp.push(current);
		}
		return temp;
	}
}
