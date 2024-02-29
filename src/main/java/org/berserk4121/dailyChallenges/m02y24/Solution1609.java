package org.berserk4121.dailyChallenges.m02y24;

import java.util.LinkedList;
import java.util.Queue;

public class Solution1609 {
    //TC O(n)
    //SC O(w) w - max width of tree
    public boolean isEvenOddTree(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
	    q.add(root);
	    int level = 0;
	    while(!q.isEmpty()){
	        int size = q.size();
	        int prev = (level & 1) != 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
	        for(int i =0; i < size; i++){
	            TreeNode cur = q.poll();
	            if((level & 1) == 0){
	                if((cur.val & 1) == 0 || prev >= cur.val) return false;
	            }else{
	                if((cur.val & 1) != 0 || prev <= cur.val) return false;
	            }
                prev = cur.val;
	            if(cur.left != null ) q.offer(cur.left);
	            if(cur.right != null) q.offer(cur.right);
	        }
	        level++;
	    }
	    
	   return true;
    }
}
