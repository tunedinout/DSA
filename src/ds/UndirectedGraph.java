package ds;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Node
 */
 class Node {

    
}
public class UndirectedGraph {
    private Map<Integer, Set<Integer>> adjList;
    public int vertices;

    public UndirectedGraph(int n){
        vertices = n;
        adjList = new HashMap<>();
        
        for (int i = 1; i <= n ; i++ ){
            adjList.put(i, new HashSet<>());
        }
    }

    public void addEdge(int u, int v){
        adjList.get(u).add(v);
        adjList.get(v).add(u);
    }

    public void removeEdge(int u , int v){
        adjList.get(u).remove(v);
        adjList.get(v).remove(u);
    }

    public Set<Integer> getNeighbors(int v){
        return adjList.get(v);
    }

    public void printGraph() {
        for(int i = 1; i <= vertices; i++ ){
            Set<Integer> neighbors = adjList.get(i);
            System.out.print(i + " -> ");
            for(int neighbor: neighbors ){
                System.out.print(neighbor + " -> ");
            }

            System.out.println();
        }
    }
}
