package org.berserk4121.dailyChallenges.m03y24;

import org.berserk4121.ListNode;

public class Solution234 {
    //TC O(n)
    //SC O(1)
    public boolean isPalindrome(ListNode head) {
        var slow = head;
        var fast = head;
        ListNode prev = null;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            ListNode temp = slow.next;
            slow.next = prev;
            prev = slow;
            slow = temp;
        }
        while(fast != null){
            fast = fast.next;
            slow = slow.next;
        }
        while(slow != null){
            if(slow.val != prev.val) return false;
            slow = slow.next;
            prev = prev.next;
        }
        return true;
    }
}
