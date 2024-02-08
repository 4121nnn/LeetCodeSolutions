package org.berserk4121.dailyChallenges;
// Time complexity O(n * sqrt(n))
// Space Complexity O(n)
public class Solution279 {
    public int numSquares(int n) {
        return find(n, new Integer[n+1]);
    }
    int find(int n, Integer[] memo){
        if(n == 0) return 0;
        if(memo[n] != null) return memo[n];

        int min = n;
        for(int i = 1; i * i <= n; i++){
            if(n - i * i >= 0){
                int cur = find(n - i * i, memo) + 1;
                min = Math.min(min, cur);
            }
        }
        return memo[n] = min;
    }
}
/*
279. Perfect Squares

Medium

Given an integer n, return the least number of perfect square numbers that sum to n.

A perfect square is an integer that is the square of an integer; in other words,
it is the product of some integer with itself. For example, 1, 4, 9, and 16 are perfect
squares while 3 and 11 are not.

Example 1:
Input: n = 12
Output: 3
Explanation: 12 = 4 + 4 + 4.


Example 2:
Input: n = 13
Output: 2
Explanation: 13 = 4 + 9.

*/