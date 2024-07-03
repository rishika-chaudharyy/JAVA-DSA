//Write a program to check if the graph is bipartite or not
// TC is (OV+E) and SC is O(V)

import java.util.*;

public class BipartiteGraphs {
    static class Edge {
        int src;
        int dest;

        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;

        }
    }

    static void createGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        // 0-vertex
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));

        // 1-vertex
        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3));

        // 2-vertex
        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 4));

        // 3-vertex
        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 4));

        // 4-vertex
        graph[4].add(new Edge(4, 2));
        graph[4].add(new Edge(4, 3));

    }

    public static boolean isBipartite(ArrayList<Edge>[] graph) {
        int color[] = new int[graph.length];
        for (int i = 0; i < color.length; i++) {
            color[i] = -1;
        }

        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < graph.length; i++) {
            if (color[i] == -1) {
                q.add(i);
                color[i] = 0;
                while (!q.isEmpty()) {
                    int curr = q.remove();
                    for (int j = 0; j < graph[curr].size(); j++) {
                        Edge e = graph[curr].get(j);

                        if (color[e.dest] == -1) {
                            int newColor = color[curr] == 0 ? 1 : 0;
                            color[e.dest] = newColor;
                            q.add(e.dest);
                        } else if (color[e.dest] == color[curr]) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int V = 7;
        ArrayList<Edge>[] graph = new ArrayList[V]; // null is stored
        createGraph(graph);
        System.out.println(isBipartite(graph));
    }
}
