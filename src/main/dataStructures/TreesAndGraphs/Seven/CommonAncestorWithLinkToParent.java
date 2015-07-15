package main.dataStructures.TreesAndGraphs.Seven;

import main.dataStructures.TreesAndGraphs.Lib.Tree.TreeNode;

public class CommonAncestorWithLinkToParent {

    /*
               100
            50     150
          40  65
                70
             68    99
           66     80
               77  88
       */

    TreeNode commonAncestor = null;

    public TreeNode find(TreeNode first, TreeNode second) {
        findFirst(first, second);
        return commonAncestor;
    }

    private void findFirst(TreeNode first, TreeNode second) {
        if (first != null && commonAncestor==null) {
            findSecond(first, second);
            findFirst(first.parent, second);
        }
    }

    private void findSecond(TreeNode first, TreeNode second) {
        if (second != null) {
            if (first == second) commonAncestor = first;
            findSecond(first, second.parent);
        }

    }
}
