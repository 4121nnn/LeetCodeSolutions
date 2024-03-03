package org.berserk4121.dailyChallenges.m03y24;

import org.berserk4121.ListNode;

public class Solution19 {
    //TC O(n)
    //SC O(1)
    public ListNode removeNthFromEnd(ListNode head, int n) {
        var len = head;
        var cut = head;
        int count  = 0;
        while(len != null){
            if(count > n){
                cut = cut.next;
            }
            len = len.next;
            count++;
        }
        if(n == count){
            return head.next;
        }
        cut.next = cut.next.next;
        return head;
    }
}
/*
 19. Remove Nth Node From End of List

Medium

Given the head of a linked list, remove the nth node from the end of the list and return its head.

Example 1:


Input: head = [1,2,3,4,5], n = 2
Output: [1,2,3,5]
Example 2:

Input: head = [1], n = 1
Output: []
Example 3:

Input: head = [1,2], n = 1
Output: [1]
 

Constraints:

The number of nodes in the list is sz.
1 <= sz <= 30
0 <= Node.val <= 100
1 <= n <= sz
 

Follow up: Could you do this in one pass?
 */
