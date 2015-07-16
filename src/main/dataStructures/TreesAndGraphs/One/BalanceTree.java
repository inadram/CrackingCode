package main.dataStructures.TreesAndGraphs.One;

import main.dataStructures.TreesAndGraphs.Lib.Tree.TreeNode;

public class BalanceTree {
    public boolean check(TreeNode t1) {
        if(t1==null) return true;
        if(t1.left!=null && t1.right!=null) {
            if (Math.abs(getHeight(t1.left) - getHeight(t1.right)) > 1) {
                return false;
            }
        }
        boolean status= check(t1.left);
        if(!status) return false;
        status=check(t1.right);
        if(!status) return false;
        return status;
    }

    private int getHeight(TreeNode t1) {
        if(t1==null){
            return 0;
        }
        int leftHeight= getHeight(t1.left)+1;
        int rightHeight= getHeight(t1.right)+1;
        return Math.max(leftHeight,rightHeight);

    }

       /*
             100
         50       150
      40   60   90   160
          55       155
        */
}
