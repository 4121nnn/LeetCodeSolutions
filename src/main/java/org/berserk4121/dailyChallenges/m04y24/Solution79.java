package org.berserk4121.dailyChallenges.m04y24;


public class Solution79 {
    //TC O(n * m * 4 * k)
    //SC O(k)
    boolean res = false;
    public boolean exist(char[][] board, String word) {
        for(int i = 0; i < board.length; i++)
            for(int j = 0; j < board[0].length; j++)
                backtrack(board, word, i, j, 0);
            
        return res;
    }
    public void backtrack(char[][] board, String s, int i, int j, int k){
        if(i < 0 || j < 0 || i >= board.length || j >= board[0].length || 
                res || s.charAt(k) != board[i][j] || board[i][j] == '*') return;
        if(k == s.length() - 1) res = true;
        char temp = board[i][j];
        board[i][j] = '*';
        backtrack(board, s, i-1, j, k + 1);
        backtrack(board, s, i, j-1, k + 1);
        backtrack(board, s, i+1, j, k + 1);
        backtrack(board, s, i, j+1, k + 1);
        board[i][j] = temp;
    }
}
/*
 79. Word Search

Medium

Given an m x n grid of characters board and a string word, return true if word exists in the grid.

The word can be constructed from letters of sequentially adjacent cells, where adjacent cells are horizontally or vertically neighboring. The same letter cell may not be used more than once.


Example 1:

Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "ABCCED"
Output: true
Example 2:


Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "SEE"
Output: true
Example 3:


Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "ABCB"
Output: false
 

Constraints:

m == board.length
n = board[i].length
1 <= m, n <= 6
1 <= word.length <= 15
board and word consists of only lowercase and uppercase English letters.
 

Follow up: Could you use search pruning to make your solution faster with a larger board?
 */