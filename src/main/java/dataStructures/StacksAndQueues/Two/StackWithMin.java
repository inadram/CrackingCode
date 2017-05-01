package dataStructures.StacksAndQueues.Two;

import dataStructures.StacksAndQueues.Lib.Stack;

public class StackWithMin extends Stack {
	Stack stackWithMin;

	public StackWithMin() {
		stackWithMin = new Stack();
	}

	public void push(int i) {
		super.push(i);
		if (stackWithMin.isEmpty() || i < stackWithMin.peek()) {
			stackWithMin.push(i);
		}
	}

	public int pop() {
		int value = super.pop();
		if (value == min()) {
			stackWithMin.pop();
		}
		return value;
	}

	public int peek() {
		return super.peek();
	}

	public int min() {
		if (stackWithMin.isEmpty()) {
			return Integer.MAX_VALUE;
		}
		return stackWithMin.peek();
	}
}
