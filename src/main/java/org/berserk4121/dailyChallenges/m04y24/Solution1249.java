package org.berserk4121.dailyChallenges.m04y24;

import java.util.LinkedList;

public class Solution1249 {
    //TC O(n)
    //SC O(n)
    public String minRemoveToMakeValid(String s) {
        int i = 0;
        var q = new LinkedList<Integer>();
        var sb = new StringBuilder();
        for(char c : s.toCharArray()){
            if(c == '('){
                q.add(i);
            }else if(c == ')'){
                if(!q.isEmpty()){
                    sb.insert((int) q.poll(), "(");
                    sb.append(')');
                }else{
                    i--;
                }
            }else{
                sb.append(c);
            }
            i++;
        }
        return sb.toString();
    }
}
/*
1249. Minimum Remove to Make Valid Parentheses

Medium

Given a string s of '(' , ')' and lowercase English characters.

Your task is to remove the minimum number of parentheses ( '(' or ')', in any positions ) so that the resulting parentheses string is valid and return any valid string.

Formally, a parentheses string is valid if and only if:

It is the empty string, contains only lowercase characters, or
It can be written as AB (A concatenated with B), where A and B are valid strings, or
It can be written as (A), where A is a valid string.
 

Example 1:

Input: s = "lee(t(c)o)de)"
Output: "lee(t(c)o)de"
Explanation: "lee(t(co)de)" , "lee(t(c)ode)" would also be accepted.
Example 2:

Input: s = "a)b(c)d"
Output: "ab(c)d"
Example 3:

Input: s = "))(("
Output: ""
Explanation: An empty string is also valid.
 

Constraints:

1 <= s.length <= 105
s[i] is either'(' , ')', or lowercase English letter.
 */
