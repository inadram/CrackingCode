package main.Moderate.Thirteen;

public class BiNodeDataStructure {

    public BiNode fromTreeToDoubleLinkedList(BiNode treeNode) {
        if(treeNode ==null) return null;
        BiNode first =fromTreeToDoubleLinkedList(treeNode.first);
        BiNode second = fromTreeToDoubleLinkedList(treeNode.second);

        // connect tree node second to tail of first
        if(first != null){
           BiNode tail =getTail(first);
            tail.second = treeNode;
           treeNode.first = tail;

        }
        // connect tail of root to second head
        if(second !=null){
            treeNode.second = second;
            second.first = treeNode;
        }

        return (first==null)?treeNode:first;
    }

    private BiNode getTail(BiNode first) {
        while (first.second!=null){
            first = first.second;
        }
        return first;
    }
}
