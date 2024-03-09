package org.berserk4121.dailyChallenges.m03y24;

public class Solution2540 {
    //TC O(n)
    //SC O(1)
    public int getCommon(int[] a, int[] b) {
        int i1 = 0, i2 = 0, l1 = a.length, l2 =  b.length;
        while(i1 < l1 && i2 < l2){
            int n1 = a[i1], n2 = b[i2];
            if(n1 == n2){
                return n1;
            }else if(n1 > n2){
                i2++;
            }else{
                i1++;
            }
        }
        return -1;
    }
}
/*
 2540. Minimum Common Value

Easy

Given two integer arrays nums1 and nums2, sorted in non-decreasing order, return the minimum integer common to both arrays. If there is no common integer amongst nums1 and nums2, return -1.
Note that an integer is said to be common to nums1 and nums2 if both arrays have at least one occurrence of that integer.

 
Example 1:
Input: nums1 = [1,2,3], nums2 = [2,4]
Output: 2
Explanation: The smallest element common to both arrays is 2, so we return 2.

Example 2:
Input: nums1 = [1,2,3,6], nums2 = [2,3,4,5]
Output: 2
Explanation: There are two common elements in the array 2 and 3 out of which 2 is the smallest, so 2 is returned.
 

Constraints:

1 <= nums1.length, nums2.length <= 105
1 <= nums1[i], nums2[j] <= 109
Both nums1 and nums2 are sorted in non-decreasing order.
 */
