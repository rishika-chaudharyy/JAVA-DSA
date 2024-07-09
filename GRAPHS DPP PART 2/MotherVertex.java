// Given a directed graph, find a Mother Vertex if it exists. A Mother Vertex is a vertex from which we can reach all the other vertices of the graph.

import java.util.*;

class Solution {

    // Method to add an edge to the graph
    static void addEdge(int u, int v, ArrayList<ArrayList<Integer>> adj) {
        adj.get(u).add(v);
    }

    // Utility method for Depth First Search (DFS)
    static void DFSUtil(ArrayList<ArrayList<Integer>> g, int v, boolean[] visited) {
        visited[v] = true;
        for (int i = 0; i < g.get(v).size(); i++) {
            int x = g.get(v).get(i);
            if (!visited[x]) {
                DFSUtil(g, x, visited);
            }
        }
    }

    // Method to find the Mother Vertex
    static int motherVertex(ArrayList<ArrayList<Integer>> g, int V) {
        boolean[] visited = new boolean[V];
        int v = -1;

        // Perform DFS for each vertex to find the last finished vertex
        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                DFSUtil(g, i, visited);
                v = i;
            }
        }

        // Check if the last finished vertex is a Mother Vertex
        boolean[] check = new boolean[V];
        DFSUtil(g, v, check);
        for (int i = 0; i < V; i++) {
            if (!check[i]) {
                return -1; // No Mother Vertex found
            }
        }
        return v; // Return the Mother Vertex
    }

    public static void main(String[] args) {
        int V = 7;
        int E = 8;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<Integer>());
        }

        // Adding edges to the graph
        addEdge(0, 1, adj);
        addEdge(0, 2, adj);
        addEdge(1, 3, adj);
        addEdge(4, 1, adj);
        addEdge(6, 4, adj);
        addEdge(5, 6, adj);
        addEdge(5, 2, adj);
        addEdge(6, 0, adj);

        // Finding and printing the Mother Vertex
        System.out.println("The mother vertex is " + motherVertex(adj, V));
    }
}
