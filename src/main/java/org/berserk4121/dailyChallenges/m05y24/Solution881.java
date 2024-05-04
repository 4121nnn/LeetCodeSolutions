package org.berserk4121.dailyChallenges.m05y24;

import java.util.Arrays;

public class Solution881 {
    // time O(nlogn)
    // space O(1)
    public int numRescueBoats(int[] people, int limit) {
        int i = 0, j = people.length-1, count = 0;
        Arrays.sort(people);
        while(i <= j){
            if(people[i] + people[j] <= limit) i++;
            j--;
            count++;
        }
        return count;
    }
}
