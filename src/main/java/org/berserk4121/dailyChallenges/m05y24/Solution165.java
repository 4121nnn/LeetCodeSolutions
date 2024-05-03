package org.berserk4121.dailyChallenges.m05y24;

public class Solution165 {
    // time O(n)
    // space O(1)
    public int compareVersion(String version1, String version2) {
        int l1 = version1.length(), l2 = version2.length();
        int i = 0, j = 0;
        while(i < l1 || j < l2){
            int n1 = 0;
            while(i < l1 && version1.charAt(i) != '.'){
                n1 = n1 * 10 + (version1.charAt(i++) - '0');
            }
            i++;
            int n2 = 0;
            while(j < l2 && version2.charAt(j) != '.'){
                n2 = n2 * 10 + (version2.charAt(j++) - '0');
            }
            j++;
            if(n1 < n2) return -1;
            if(n1 > n2) return 1;
        }
        return 0;
    }
}
