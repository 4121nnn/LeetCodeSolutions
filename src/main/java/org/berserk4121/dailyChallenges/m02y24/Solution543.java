package org.berserk4121.dailyChallenges.m02y24;



class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
 }
 
class Solution543 {
    //TC O(n)
    //SC O(n) - worst case and O(logn) for balanced tree
    int max = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        dfs(root);
        return max;
    }
    public int dfs(TreeNode root){
        if(root == null) return 0;

        int left  = dfs(root.left) ;
        int right = dfs(root.right);

        max = Math.max(max, left + right);
        return Math.max(left, right) + 1;
    }
}