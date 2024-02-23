package org.berserk4121.dailyChallenges.m02y24;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Solution787 {
    /*
    Time complexity: O(V + E*K)
    The time complexity of this code is O(V + E*K) where E is the number of flights, and V is the number of cities.
    The reason for this is that the outer while loop runs for at most V iterations, and in each iteration, the inner
    while loop runs for at most E iterations.However, the maximum number of times an edge can be processed is limited
    by K.
    Space complexity: O(V + E)
    he space complexity of this code is O(V + E), as it uses two data structures to store the graph (a list of lists)
    and the minimum cost to reach each node (an array of integers). The queue used to keep track of the next node to
    visit also takes up O(V) space.
     */
        public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
            List<List<int[]>> adj = new ArrayList<>();
            for(int i = 0; i < n; i++) adj.add(new ArrayList<>());
            for(int[] a : flights) adj.get(a[0]).add(new int[]{a[1], a[2]});
            var q = new LinkedList<int[]>();
            int stops = 0;
            q.add(new int[]{src, 0});
            int[] price = new int[n+1];
            Arrays.fill(price, -1);
            while(!q.isEmpty() && stops <= k){
                int size =  q.size();
                for(int i = 0; i < size; i++){
                    int[] cur = q.poll();
                    for(int[] a: adj.get(cur[0])){
                        int newPrice = cur[1] + a[1];
                        if(price[a[0]] != -1 && price[a[0]] <= newPrice) continue;
                        price[a[0]] = newPrice;
                        q.offer(new int[]{a[0] , newPrice});
                    }
                }
                stops++;
            }
            return price[dst];

        }
}
/*
787. Cheapest Flights Within K Stops

Medium

There are n cities connected by some number of flights. You are given an array flights where flights[i] = [fromi, toi, pricei] indicates that there is a flight from city fromi to city toi with cost pricei.

You are also given three integers src, dst, and k, return the cheapest price from src to dst with at most k stops. If there is no such route, return -1.


Example 1:
Input: n = 4, flights = [[0,1,100],[1,2,100],[2,0,100],[1,3,600],[2,3,200]], src = 0, dst = 3, k = 1
Output: 700
Explanation:
The graph is shown above.
The optimal path with at most 1 stop from city 0 to 3 is marked in red and has cost 100 + 600 = 700.
Note that the path through cities [0,1,2,3] is cheaper but is invalid because it uses 2 stops.

Example 2:
Input: n = 3, flights = [[0,1,100],[1,2,100],[0,2,500]], src = 0, dst = 2, k = 1
Output: 200
Explanation:
The graph is shown above.
The optimal path with at most 1 stop from city 0 to 2 is marked in red and has cost 100 + 100 = 200.

Example 3:
Input: n = 3, flights = [[0,1,100],[1,2,100],[0,2,500]], src = 0, dst = 2, k = 0
Output: 500
Explanation:
The graph is shown above.
The optimal path with no stops from city 0 to 2 is marked in red and has cost 500.


Constraints:

1 <= n <= 100
0 <= flights.length <= (n * (n - 1) / 2)
flights[i].length == 3
0 <= fromi, toi < n
fromi != toi
1 <= pricei <= 104
There will not be any multiple flights between two cities.
0 <= src, dst, k < n
src != dst
 */
