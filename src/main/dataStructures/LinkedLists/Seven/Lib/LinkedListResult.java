package main.dataStructures.LinkedLists.Seven.Lib;

import main.dataStructures.LinkedLists.Lib.LinkedListNode;

public class LinkedListResult {
    public LinkedListResult(LinkedListNode node,boolean status){
        this.node = node;
        this.status =status;
    }
    public LinkedListNode node;
    public boolean status;
}
