package main.dataStructures.TreesAndGraphs.Four;

import main.dataStructures.LinkedLists.Lib.LinkedListNode;
import main.dataStructures.TreesAndGraphs.Lib.Tree.TreeNode;

import java.util.ArrayList;

public class BinaryTreeToLinkedList {
    public ArrayList<LinkedListNode> convert(TreeNode treeNode, ArrayList<LinkedListNode> linkedLists, int index) {
        if(treeNode==null){
            return linkedLists;
        }
        if(linkedLists.size()>index) {
        linkedLists.get(index).appendToTail(treeNode.data);
        }else{
            linkedLists.add(index,new LinkedListNode(treeNode.data));
        }

        linkedLists=convert(treeNode.left,linkedLists, index+1);
        return convert(treeNode.right,linkedLists, index+1);
    }
}
