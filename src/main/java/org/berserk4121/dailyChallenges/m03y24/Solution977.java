package org.berserk4121.dailyChallenges.m03y24;

public class Solution977 {
    //TC O(n)
    //SC O(n)
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] sort = new int[n];
        int l = 0, r = n - 1, i = n - 1;
        while(l <= r){
            int cur;
            if(Math.abs(nums[l]) > Math.abs(nums[r])){ 
                cur = nums[l++];
            }else{
                cur = nums[r--];
            }
            sort[i--] = cur * cur;
        }
        
        return sort;

        // return Arrays.stream(nums).map(Math::abs).sorted().map(i -> i * i).toArray();
    }
    
}
/*
977. Squares of a Sorted Array

Easy

Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.

Example 1:

Input: nums = [-4,-1,0,3,10]
Output: [0,1,9,16,100]
Explanation: After squaring, the array becomes [16,1,0,9,100].
After sorting, it becomes [0,1,9,16,100].
Example 2:

Input: nums = [-7,-3,2,3,11]
Output: [4,9,9,49,121]
 

Constraints:

1 <= nums.length <= 104
-104 <= nums[i] <= 104
nums is sorted in non-decreasing order.
 */
