package org.berserk4121.dailyChallenges;

//Time complexity O((n/2) * m) , n is max length of word in array, m is array length
//Space complexity O(1)
public class Solution2108 {
    public String firstPalindrome(String[] words) {
        for(String s : words){
            if(isPal(s))
                return s;
        }
        return "";
    }
    public boolean isPal(String s){
        int i = 0, j = s.length()-1;
        while(i < j)
            if(s.charAt(i++) != s.charAt(j--))
                return false;

        return true;
    }

}
/*
2108. Find First Palindromic String in the Array

easy

Given an array of strings words, return the first palindromic string in the array. If there is no such string, return an empty string "".
A string is palindromic if it reads the same forward and backward.



Example 1:
Input: words = ["abc","car","ada","racecar","cool"]
Output: "ada"
Explanation: The first string that is palindromic is "ada".
Note that "racecar" is also palindromic, but it is not the first.

Example 2:
Input: words = ["notapalindrome","racecar"]
Output: "racecar"
Explanation: The first and only string that is palindromic is "racecar".

Example 3:
Input: words = ["def","ghi"]
Output: ""
Explanation: There are no palindromic strings, so the empty string is returned.


Constraints:

1 <= words.length <= 100
1 <= words[i].length <= 100
words[i] consists only of lowercase English letters.
 */
