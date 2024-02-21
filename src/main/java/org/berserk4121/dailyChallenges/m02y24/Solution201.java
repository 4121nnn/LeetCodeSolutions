package org.berserk4121.dailyChallenges.m02y24;

public class Solution201 {
    //TC O(nlogn)  for integer max iteration 31 times
    //SC O(1)
    public int rangeBitwiseAnd(int left, int right) {

        int count = 0;
        // Continue looping until the left and right numbers are equal
        while (left != right) {
            // Right shift both left and right numbers by 1 bit
            left = left >>> 1;
            right = right >>> 1;

            count++;
        }

        // After the loop, left contains the common leftmost bits of the original left and right numbers
        // Shift the left bits left by the count to restore the bits that were shifted right
        return left << count;
    }
}
/*
201. Bitwise AND of Numbers Range

Medium

Given two integers left and right that represent the range [left, right], return the bitwise AND of all numbers in this range, inclusive.



Example 1:

Input: left = 5, right = 7
Output: 4
Example 2:

Input: left = 0, right = 0
Output: 0
Example 3:

Input: left = 1, right = 2147483647
Output: 0


Constraints:

0 <= left <= right <= 231 - 1
 */
