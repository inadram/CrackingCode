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

    private Stack<Integer> getLastStack(ArrayList<Stack<Integer>> setOfStacks) {
        return setOfStacks.get(setOfStacks.size()-1);
    }

    private boolean isStackFull(Stack stack) {
        return stack.size() >= limit;
    }

}
