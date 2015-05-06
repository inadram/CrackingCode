package main.dataStructures.StacksAndQueues.Three;


import java.util.ArrayList;
import java.util.Stack;

public class SetOfStacksWithArrayList {
    ArrayList<Stack<Integer>> setOfStacks = new ArrayList<Stack<Integer>>();
    private int limit;

    public SetOfStacksWithArrayList(int limit) {
        this.limit = limit;
    }

    public void push(int i) {
        if (setOfStacks.isEmpty() || isStackFull(getLastStack(setOfStacks))) {
            setOfStacks.add(new Stack<Integer>());
        }
        getLastStack(setOfStacks).push(i);
    }

    public int peek() {
        return getLastStack(setOfStacks).peek();
    }

    public int pop() {
        if(getLastStack(setOfStacks).isEmpty()){
            setOfStacks.remove(setOfStacks.size()-1);
        }
        return getLastStack(setOfStacks).pop();
    }

    public int popAt(int index) {
        if (getLastStack(setOfStacks).isEmpty()) {
            setOfStacks.remove(setOfStacks.size() - 1);
        }
        int popValue = setOfStacks.get(index - 1).pop();
        if (setOfStacks.size() > index) {
            int top = getTopOfPreviousStack(index);
            pushToBottomOfCurrentStack(top, index);
        }
        return popValue;
    }

    private void pushToBottomOfCurrentStack(int top, int index) {
        Stack<Integer> temp = new Stack<Integer>();

        Stack<Integer> currentStack = setOfStacks.get(index - 1);
        while (!currentStack.isEmpty()) {
            temp.push(currentStack.pop());
        }
        temp.push(top);
        while (!temp.isEmpty()) {
            currentStack.push(temp.pop());
        }
        setOfStacks.set(index - 1, currentStack);
    }

    private int getTopOfPreviousStack(int index) {
        return setOfStacks.get(index - 2).pop();
    }


    private Stack<Integer> getLastStack(ArrayList<Stack<Integer>> setOfStacks) {
        return setOfStacks.get(setOfStacks.size()-1);
    }

    private boolean isStackFull(Stack stack) {
        return stack.size() >= limit;
    }

}
