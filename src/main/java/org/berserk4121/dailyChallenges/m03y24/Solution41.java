package org.berserk4121.dailyChallenges.m03y24;

public class Solution41 {
    //TC O(n)
    //SC O(1)
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        for(int i = 0; i < n; i++){
            if(nums[i] <= 0 || nums[i] > n) nums[i] = n+1; 
        }
        for(int i : nums){
            int ind = Math.abs(i)-1;
            if(ind < n && nums[ind] > 0){
                nums[ind] *= -1;
            }
        }
        for(int i = 0; i< n ; i++){
            if(nums[i] > 0 ) return i + 1;
        }
        return n + 1;
    }
}
/*
41. First Missing Positive

Hard

Given an unsorted integer array nums. Return the smallest positive integer that is not present in nums.

You must implement an algorithm that runs in O(n) time and uses O(1) auxiliary space.

 

Example 1:

Input: nums = [1,2,0]
Output: 3
Explanation: The numbers in the range [1,2] are all in the array.
Example 2:

Input: nums = [3,4,-1,1]
Output: 2
Explanation: 1 is in the array but 2 is missing.
Example 3:

Input: nums = [7,8,9,11,12]
Output: 1
Explanation: The smallest positive integer 1 is missing.
 

Constraints:

1 <= nums.length <= 105
-231 <= nums[i] <= 231 - 1
 */
