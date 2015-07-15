package main.dataStructures.TreesAndGraphs.Seven;

import main.dataStructures.TreesAndGraphs.Lib.Tree.TreeNode;

public class CommonAncestorDFSOptimised {

    boolean commonAncestorFound = false;
    public  TreeNode find(TreeNode treeNode, TreeNode first, TreeNode second) {
         /*
               100
            50     150
          40  65
                70
             68    99
           66     80
               77  88
       */

        ResultNode result= commonAncestor(treeNode, first, second);
       return  (result.isCommonAncestor)?result.node:null ;
    }

    private ResultNode commonAncestor(TreeNode treeNode, TreeNode first, TreeNode second) {
        if (treeNode == null) return new ResultNode(null,false);

        if (treeNode == first && treeNode == second) {
            return new ResultNode(treeNode,true);
        }
        ResultNode x = commonAncestor(treeNode.left, first, second);
        if (x.node!=null && x.isCommonAncestor) { // Found common ancestor
            return x;
        }
        ResultNode y = commonAncestor(treeNode.right, first, second);
        if (y.node != null && y.isCommonAncestor) {
            return y;
        }

        if (x.node != null && y.node != null) {
            return new ResultNode(treeNode,true); // This is the common ancestor
        } else if (treeNode == first || treeNode == second) {
            return new ResultNode(treeNode,false);
        } else {
            return x.node == null ? y : x;
        }
    }


}

class ResultNode {
    public  TreeNode node;
    public  boolean isCommonAncestor;

    public ResultNode(TreeNode node, boolean isCommonAncestor){
        this.node = node;
        this.isCommonAncestor = isCommonAncestor;
    }
}
