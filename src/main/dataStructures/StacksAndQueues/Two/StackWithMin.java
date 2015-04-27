package main.dataStructures.StacksAndQueues.Two;

import main.dataStructures.StacksAndQueues.Lib.Stack;

public class StackWithMin {
    Stack stack =new Stack();
    Stack stackWithMin = new Stack();
    public void push(int i) {
        stack.push(i);
        if(stackWithMin.isEmpty() || i<stackWithMin.peek()){
            stackWithMin.push(i);
        }
    }

    public int pop(){
       int value = stack.pop();
        if(value==stackWithMin.peek()){
            stackWithMin.pop();
        }
        return value;
    }

    public int peek(){
       return stack.peek();
    }

    public int min() {
        return stackWithMin.peek();
    }
}
