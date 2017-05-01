package Moderate.Thirteen;

public class PairDataStructure {

    public PairNode fromTreeToDoubleLinkedList(BiNode treeNode) {
        if(treeNode ==null) return null;
        PairNode first =fromTreeToDoubleLinkedList(treeNode.first);
        PairNode second = fromTreeToDoubleLinkedList(treeNode.second);

        // connect tree node second to tail of first
        if(first != null){
            first.tail.second = treeNode;
            treeNode.first = first.tail;

        }
        // connect tail of root to second head
        if(second !=null){
            treeNode.second =second.head;
            second.head.first = treeNode;
        }

        return new PairNode(first == null ? treeNode: first.head , second == null ? treeNode:second.tail);
    }
}
