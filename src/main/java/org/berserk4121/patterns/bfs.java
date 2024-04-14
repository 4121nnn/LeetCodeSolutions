package org.berserk4121.patterns;

import java.util.ArrayDeque;
import java.util.Deque;

import javax.swing.tree.TreeNode;

public class bfs {
    
    void levelorder(TreeNode root) {
        if (root == null) return;
        Deque<TreeNode> q = new ArrayDeque<>();
        q.addLast(root);
        while (q.isEmpty() == false) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = q.removeFirst();
                System.out.println(node.val + " ");
                if (node.left != null) q.addLast(node.left);
                if (node.right != null) q.addLast(node.right);
            }
            System.out.println();
        }
    }
}
