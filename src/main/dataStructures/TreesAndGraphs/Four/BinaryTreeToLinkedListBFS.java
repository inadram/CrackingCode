package main.dataStructures.TreesAndGraphs.Four;

import main.dataStructures.TreesAndGraphs.Lib.Tree.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeToLinkedListBFS {
    public ArrayList<LinkedList> convert(TreeNode treeNode) {
        ArrayList<Integer> nodesValue=getNodesValues(treeNode);
        ArrayList<LinkedList> nodesValuesLinkList =nodesValueToLinkedList(nodesValue,1, new ArrayList<LinkedList>());
        return nodesValuesLinkList;
    }

    private ArrayList<LinkedList> nodesValueToLinkedList(ArrayList<Integer> nodesValue, int to, ArrayList<LinkedList> linkedListNodes) {
       if(nodesValue.size()==0){
           return linkedListNodes;
       }
        LinkedList<Integer> currentLinkedList = new LinkedList<Integer>();
        for(int i =0;i<to &&nodesValue.size()!=0;i++){
            Integer nodeValue = nodesValue.remove(0);
            if(nodeValue !=0){
               currentLinkedList.add(nodeValue);
            }
        }
        if(currentLinkedList.size()>0) {
            linkedListNodes.add(currentLinkedList);
        }
       return nodesValueToLinkedList(nodesValue,to*2,linkedListNodes);
    }

    private ArrayList<Integer> getNodesValues(TreeNode treeNode) {
        Queue<TreeNode> treeNodeQueue = new LinkedList<TreeNode>();
        treeNodeQueue.add(treeNode);
        ArrayList<Integer> nodesValue = new ArrayList<Integer>();

        while (treeNodeQueue.size() != 0) {
            TreeNode currentNode = treeNodeQueue.remove();
            if (currentNode == null) {
                nodesValue.add(0);
            } else {
               nodesValue.add(currentNode.data);
                treeNodeQueue.add(currentNode.left);
                treeNodeQueue.add(currentNode.right);
            }
        }
        return nodesValue;
    }
}
