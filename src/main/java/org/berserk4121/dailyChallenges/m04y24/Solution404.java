package org.berserk4121.dailyChallenges.m04y24;

public class Solution404 {
    //TC O(n)
    //SC o(h) h - height of tree
    // public int sumOfLeftLeaves(TreeNode root) {
        if(root == null) return 0;
    
        if(root.left != null && root.left.left == null && root.left.right == null)
           return root.left.val + sumOfLeftLeaves(root.right);
        
        return sumOfLeftLeaves(root.left) + sumOfLeftLeaves(root.right);
    }
}
