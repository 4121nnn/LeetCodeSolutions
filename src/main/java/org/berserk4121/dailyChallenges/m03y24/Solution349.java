public class Solution349 {
    //TC O(n + m)
    //SC O(1001)
    public int[] intersection(int[] nums1, int[] nums2) {
        int[] map = new int[1001];
        for(int i : nums1){
            map[i] = 1;
        }
        int n = 0;
        for(int i : nums2){
            if(map[i] == 1){
                map[i] = -1;
                n++;
            }
        }
        int[] res = new int[n];
        int j = 0;
        int[] nums = nums1.length > nums2.length ? nums2 : nums1;
        for(int i : nums){
            if(map[i] == -1){
                map[i] = -2;
                res[j++] = i;
            }
        }
        return res;

    }
}
/*
 349. Intersection of Two Arrays

Easy

Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must be unique and you may return the result in any order.


Example 1:

Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]
Example 2:

Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [9,4]
Explanation: [4,9] is also accepted.
 

Constraints:

1 <= nums1.length, nums2.length <= 1000
0 <= nums1[i], nums2[i] <= 1000
 */