package dataStructures.LinkedLists.Five.Lib;

import  dataStructures.LinkedLists.Lib.LinkedListNode;

public class SumWrapper {
    public int passToNext =0;
    public LinkedListNode sumNode=null;

    public void set(LinkedListNode first, LinkedListNode second){
        int sum = Sanity.sum(first, second, this.passToNext);
        int mod = sum % 10;
        this.passToNext=sum / 10;
        if (this.sumNode == null) {
            this.sumNode =new LinkedListNode(mod);
        } else {
            this.sumNode.appendToTail(mod);
        }
    }

    public LinkedListNode setPassToNextIfExist() {
        if(this.passToNext != 0){
            this.sumNode.appendToTail(this.passToNext);
        }
        return this.sumNode;
    }
}
