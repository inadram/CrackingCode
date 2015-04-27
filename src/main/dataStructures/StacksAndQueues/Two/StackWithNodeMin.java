package main.dataStructures.StacksAndQueues.Two;

class NodeWithMin {
    public int min = Integer.MAX_VALUE;
    public int value;
    public NodeWithMin(int value, int min){
      this.min = min;
      this.value = value;
    }
}

public class StackWithNodeMin extends java.util.Stack<NodeWithMin> {

    public void push(int i){
        super.push(new NodeWithMin(i,Math.min(i,min())));
    }

    public int min(){
        if(isEmpty()){
            return Integer.MAX_VALUE;
        }else{
            return peek().min;
        }
    }
}



