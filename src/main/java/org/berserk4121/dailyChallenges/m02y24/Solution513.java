package org.berserk4121.dailyChallenges.m02y24;
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution513 {
    //TC O(n)
    //SC O(h) h - max height of tree
    private int leftMost = -1;
    private int row = -1;
    public int findBottomLeftValue(TreeNode root) {
        dfs(root, 0);
        return leftMost;
    }
    public void dfs(TreeNode root, int depth){
        if(root == null) return;
        if(depth > row){
            row = depth;
            leftMost = root.val;
        }
        dfs(root.left, depth + 1);
        dfs(root.right, depth + 1) ;
    }
}