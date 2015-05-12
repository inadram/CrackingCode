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
        int popValue = setOfStacks.get(index).pop();
        while (setOfStacks.size()-1 > index) {
            int bottom = getBottom(index+1);
            setOfStacks.get(index).push(bottom);
            index++;
        }
        return popValue;
    }

    private int getBottom(int index) {
        Stack<Integer> stack = setOfStacks.get(index);
        Stack<Integer> temp =reversStack(stack);
        int bottom =temp.pop();
        setOfStacks.set(index,reversStack(temp));
        return bottom;
    }

    private Stack<Integer> reversStack(Stack<Integer> stack) {
        Stack<Integer> temp = new Stack<Integer>();

        while (!stack.isEmpty()){
            temp.push(stack.pop());
        }
        return temp;
    }


    private Stack<Integer> getLastStack(ArrayList<Stack<Integer>> setOfStacks) {
        return setOfStacks.get(setOfStacks.size()-1);
    }

    private boolean isStackFull(Stack stack) {
        return stack.size() >= limit;
    }

}
