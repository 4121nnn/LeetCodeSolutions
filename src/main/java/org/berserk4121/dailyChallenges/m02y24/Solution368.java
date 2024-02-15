package org.berserk4121.dailyChallenges.m02y24;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution368 {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        int n = nums.length;
        int[] index = new int[n];
        int[] length = new int[n];
        Arrays.sort(nums);
        int max = 0;
        for(int i = 0; i< nums.length; i++){
            length[i] = 1;
            index[i] = -1;
            for(int j = 0; j < i; j++){
                if(nums[i] % nums[j] == 0){
                    if(length[i] < length[j] + 1){
                        length[i] = length[j] + 1;
                        index[i] = j;
                    }
                }
            }
            if(length[i] > length[max]) max = i;
        }
        List<Integer> list = new ArrayList<>();
        while(max != -1){
            list.add(0, nums[max]);
            max = index[max];
        }
        return list;

    }
}
/*
368. Largest Divisible Subset

Medium

Given a set of distinct positive integers nums, return the largest subset answer such that
 every pair (answer[i], answer[j]) of elements in this subset satisfies:
answer[i] % answer[j] == 0, or
answer[j] % answer[i] == 0
If there are multiple solutions, return any of them.


Example 1:
Input: nums = [1,2,3]
Output: [1,2]
Explanation: [1,3] is also accepted.

Example 2:
Input: nums = [1,2,4,8]
Output: [1,2,4,8]


 */