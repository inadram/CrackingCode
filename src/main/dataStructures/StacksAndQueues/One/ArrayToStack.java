package main.dataStructures.StacksAndQueues.One;

public class ArrayToStack {
    int[] first=new int[5];
    int[] second=new int[5];
    int[] third=new int[5];
    int position =-1;
    int[][] array = {first,second,third};

    public void push(int value) {
        position++;
        array[getColumn()][getRow()] = value;
    }

    public int pop(){
        int popValue=  array[getColumn()][getRow()];
        position --;
        return popValue;
    }

    private int getRow() {
        return position%5;
    }

    private int getColumn() {
        return (int) Math.floor(position/5);
    }

    public int peek() {
        return  array[getColumn()][getRow()];
    }
}
