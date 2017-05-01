package dataStructures.StacksAndQueues.Five;

import java.util.Stack;

public class MyQueue {
	Stack<Integer> pushStack = new Stack<Integer>();
	Stack<Integer> peekStack = new Stack<Integer>();

	public void enQueue(int i) {
		pushStack.add(i);
	}

	public int peek() {
		int peek = 0;
		if (peekStack.size() > 0) {
			peek = peekStack.peek();
		} else {
			moveToPeek();
			peek = peekStack.peek();
		}
		return peek;
	}

	private void moveToPeek() {
		while (pushStack.size() > 0) {
			peekStack.push(pushStack.pop());
		}

	}

	public int deQueue() {
		int pop = 0;
		if (peekStack.size() > 0) {
			pop = peekStack.pop();
		} else {
			moveToPeek();
			pop = peekStack.pop();
		}
		return pop;
	}
}
