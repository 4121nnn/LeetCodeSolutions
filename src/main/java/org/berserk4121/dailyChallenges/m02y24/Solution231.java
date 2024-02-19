package org.berserk4121.dailyChallenges.m02y24;

public class Solution231 {
    // Time Complexity: O(1) This is because the Integer.bitCount(n)
    //                      method in Java uses a sophisticated
    //                      algorithm to count bits in a binary
    //                      representation of a number, and this
    //              operation is independent of the size of the input n.
    // Space Complexity: O(1)
    public boolean isPowerOfTwo(int n) {
        //return n > 0 && ((n & (n-1)) == 0);
        return n > 0 && Integer.bitCount(n) == 1;

    }
}
/*
231. Power of Two

Easy

Given an integer n, return true if it is a power of two. Otherwise, return false.

An integer n is a power of two, if there exists an integer x such that n == 2x.



Example 1:

Input: n = 1
Output: true
Explanation: 20 = 1
Example 2:

Input: n = 16
Output: true
Explanation: 24 = 16
Example 3:

Input: n = 3
Output: false


Constraints:

-231 <= n <= 231 - 1


Follow up: Could you solve it without loops/recursion?
 */
