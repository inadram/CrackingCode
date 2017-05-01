package dataStructures.StacksAndQueues.Three;


import java.util.Stack;

public class SetOfStacks {
	Stack<Stack<Integer>> setOfStacks = new Stack<Stack<Integer>>();
	private int limit;

	public SetOfStacks(int limit) {
		this.limit = limit;
	}

	public void push(int i) {
		if (setOfStacks.isEmpty() || isStackFull(getLastStack(setOfStacks))) {
			setOfStacks.push(new Stack<Integer>());
		}
		getLastStack(setOfStacks).push(i);
	}

	public int peek() {
		return getLastStack(setOfStacks).peek();
	}

	public int pop() {
		if (getLastStack(setOfStacks).isEmpty()) {
			setOfStacks.pop();
		}
		return getLastStack(setOfStacks).pop();
	}

	private Stack<Integer> getLastStack(Stack<Stack<Integer>> setOfStacks) {
		return setOfStacks.peek();
	}

	private boolean isStackFull(Stack stack) {
		return stack.size() >= limit;
	}

}
