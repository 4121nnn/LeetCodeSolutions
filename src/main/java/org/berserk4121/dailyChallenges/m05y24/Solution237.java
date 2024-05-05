package org.berserk4121.dailyChallenges.m05y24;

import org.berserk4121.ListNode;

public class Solution237 {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
// time O(1)
// space O(1)

