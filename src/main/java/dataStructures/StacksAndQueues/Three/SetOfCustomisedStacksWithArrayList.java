package dataStructures.StacksAndQueues.Three;


import dataStructures.StacksAndQueues.Lib.DoublyStack;

import java.util.ArrayList;

public class SetOfCustomisedStacksWithArrayList extends SetOfStacksWithArrayList {

	ArrayList<DoublyStack> setOfStacks = new ArrayList<DoublyStack>();
	private int limit;

	public SetOfCustomisedStacksWithArrayList(int limit) {
		super(limit);
		this.limit = limit;
	}

	public void push(int i) {
		if (setOfStacks.isEmpty() || isStackFull(getLastStackCustomise(setOfStacks))) {
			setOfStacks.add(new DoublyStack());
		}
		getLastStackCustomise(setOfStacks).push(i);
	}

	public int popAt(int index) {
		if (getLastStackCustomise(setOfStacks).isEmpty()) {
			setOfStacks.remove(setOfStacks.size() - 1);
		}
		int popValue = setOfStacks.get(index).pop();
		while (setOfStacks.size() - 1 > index) {
			int bottom = getBottomWithStack(index + 1);
			setOfStacks.get(index).push(bottom);
			index++;
		}
		return popValue;
	}

	DoublyStack getLastStackCustomise(ArrayList<DoublyStack> setOfStacks) {
		return setOfStacks.get(setOfStacks.size() - 1);
	}

	private int getBottomWithStack(int index) {
		return setOfStacks.get(index).popBottom();
	}

	boolean isStackFull(DoublyStack stack) {
		return stack.size() >= limit;
	}

}
