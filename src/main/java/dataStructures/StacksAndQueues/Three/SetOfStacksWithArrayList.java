package dataStructures.StacksAndQueues.Three;


import dataStructures.StacksAndQueues.Lib.Stack;

import java.util.ArrayList;

public class SetOfStacksWithArrayList {
	ArrayList<Stack> setOfStacks = new ArrayList<Stack>();
	private int limit;

	public SetOfStacksWithArrayList(int limit) {
		this.limit = limit;
	}

	public void push(int i) {
		if (setOfStacks.isEmpty() || isStackFull(getLastStack(setOfStacks))) {
			setOfStacks.add(new Stack());
		}
		getLastStack(setOfStacks).push(i);
	}

	public int peek() {
		return getLastStack(setOfStacks).peek();
	}

	public int pop() {
		if (getLastStack(setOfStacks).isEmpty()) {
			setOfStacks.remove(setOfStacks.size() - 1);
		}
		return getLastStack(setOfStacks).pop();
	}

	public int popAt(int index) {
		if (getLastStack(setOfStacks).isEmpty()) {
			setOfStacks.remove(setOfStacks.size() - 1);
		}
		int popValue = setOfStacks.get(index).pop();
		while (setOfStacks.size() - 1 > index) {
			int bottom = getBottom(index + 1);
			setOfStacks.get(index).push(bottom);
			index++;
		}
		return popValue;
	}

	private int getBottom(int index) {
		Stack stack = setOfStacks.get(index);
		Stack temp = reversStack(stack);
		int bottom = temp.pop();
		setOfStacks.set(index, reversStack(temp));
		return bottom;
	}

	private Stack reversStack(Stack stack) {
		Stack temp = new Stack();

		while (!stack.isEmpty()) {
			temp.push(stack.pop());
		}
		return temp;
	}


	Stack getLastStack(ArrayList<Stack> setOfStacks) {
		return setOfStacks.get(setOfStacks.size() - 1);
	}

	boolean isStackFull(Stack stack) {
		return stack.size() >= limit;
	}

}
