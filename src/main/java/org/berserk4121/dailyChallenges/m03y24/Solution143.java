package org.berserk4121.dailyChallenges.m03y24;

import org.berserk4121.ListNode;

public class Solution143 {
    //TC O(n)
    //SC O(1)
    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;

        while(fast != null && fast.next != null){
            prev = slow;
            fast = fast.next.next;
            slow = slow.next;
        }
        if(fast != null){
            prev = slow;
            slow = slow.next;
        }
        prev.next = null;
        prev = null;
        while(slow != null){
            ListNode temp = slow.next;
            slow.next = prev;
            prev = slow;
            slow = temp;
        }
        while(prev != null){
            ListNode temp1 = head.next;
            ListNode temp2 = prev.next;
            head.next = prev;
            prev.next = temp1;
            head = temp1;
            prev = temp2;
        }
    }
}
/*
143. Reorder List

Medium

You are given the head of a singly linked-list. The list can be represented as:

L0 → L1 → … → Ln - 1 → Ln
Reorder the list to be on the following form:

L0 → Ln → L1 → Ln - 1 → L2 → Ln - 2 → …
You may not modify the values in the list's nodes. Only nodes themselves may be changed.

 

Example 1:


Input: head = [1,2,3,4]
Output: [1,4,2,3]
Example 2:


Input: head = [1,2,3,4,5]
Output: [1,5,2,4,3]
 

Constraints:

The number of nodes in the list is in the range [1, 5 * 104].
1 <= Node.val <= 1000
 */
