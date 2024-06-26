package org.berserk4121.dailyChallenges.m03y24;

import org.berserk4121.ListNode;

public class Solution876 {
    //TC O(n)
    //SC O(1)
    public ListNode middleNode(ListNode head) {
        int n = 0, i = 0;
        var end = head;

        while(end != null){
            n++;
            end = end.next;
        }
        n = n/2;
        while( i++ != n)
            head = head.next;

        return head;
    }
}
/*
876. Middle of the Linked List

Easy

Given the head of a singly linked list, return the middle node of the linked list.
If there are two middle nodes, return the second middle node.

 

Example 1:
Input: head = [1,2,3,4,5]
Output: [3,4,5]
Explanation: The middle node of the list is node 3.

Example 2:
Input: head = [1,2,3,4,5,6]
Output: [4,5,6]
Explanation: Since the list has two middle nodes with values 3 and 4, we return the second one.
 

Constraints:

The number of nodes in the list is in the range [1, 100].
1 <= Node.val <= 100
 */
