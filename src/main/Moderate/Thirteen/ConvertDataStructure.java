package main.Moderate.Thirteen;

public class ConvertDataStructure {

    public BiNode fromTreeToDoubleLinkedList(BiNode treeNode) {
        BiNode doubleBiNode = new BiNode();
        navigateInOrderDFS(treeNode, doubleBiNode);
        return doubleBiNode;
    }

    private void navigateInOrderDFS(BiNode treeNode, BiNode doubleBiNode) {
        if (treeNode != null) {
            navigateInOrderDFS(treeNode.first, doubleBiNode);

            while (doubleBiNode.first != null) {
                doubleBiNode = doubleBiNode.first;
            }
            if(doubleBiNode.data==0){
                doubleBiNode.data = treeNode.data;
            } else {
                BiNode next = doubleBiNode.addFirst(treeNode.data);
                next.second = doubleBiNode;
            }
            navigateInOrderDFS(treeNode.second, doubleBiNode);
        }
    }
}
