package org.berserk4121.patterns;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class graph {
    Map<Integer, List<Integer>> createGraph(int[][] edges){
        int n = edges.length;
        Map<Integer,List<Integer>> graph = new HashMap<>();
        
        for(int i = 0 ; i < n ; i++) graph.put(i, new ArrayList());
         //construct graph, add bidirectional vertex
        for(int[] edge : edges){
           graph.get(edge[0]).add(edge[1]);
           graph.get(edge[1]).add(edge[0]);
        }
        return graph;
    
    }
    
    //graph traversal
    void dfs(Map<Integer, List<Integer>> graph, int cur, Set<Integer> visited) {
        if (visited.contains(cur)) return;
        visited.add(cur);
        System.out.print(cur + " ");
        for (int next : graph.get(cur)) {
            dfs(graph, next, visited);
        }
    }

    //graph traversal
    void bfs(Map<Integer, List<Integer>> graph, int node) {
        Deque<Integer> q = new ArrayDeque<>();
        Set<Integer> visited = new HashSet<>();
        q.addLast(node);
        visited.add(node);
  
        while (q.isEmpty() == false) {
            int cur = q.removeFirst();
            System.out.print(cur + " ");
            for (int next : graph.get(cur)) {
                if (visited.contains(next)) continue;
                q.addLast(next);
                visited.add(next);
            }
        }
    }
}
