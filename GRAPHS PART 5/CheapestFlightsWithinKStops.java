//There are n cities connected by some number of flights . You are given an array and flights where flights[i]=[from,to,price] . You are also given src,dest and k , return the cheapest flight from src to dest with at most k stops , If none then return -1. All values are positive.

import java.util.*;

public class CheapestFlightsWithinKStops {
    static class Edge {
        int src;
        int dest;
        int wt;

        public Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    @SuppressWarnings("unchecked")
    public static void createGraph(int flights[][], ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < flights.length; i++) {
            int src = flights[i][0];
            int dest = flights[i][1];
            int wt = flights[i][2];

            Edge e = new Edge(src, dest, wt);
            graph[src].add(e);
        }
    }

    static class Info {
        int v;
        int cost;
        int stops;

        Info(int v, int c, int s) {
            this.v = v;
            this.cost = c;
            this.stops = s;
        }
    }

    public static int cheapestFlight(int n, int src, int dest, int k, int flights[][]) {
        ArrayList<Edge>[] graph = new ArrayList[n];
        createGraph(flights, graph);

        int[] dist = new int[n];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;

        Queue<Info> q = new LinkedList<>();
        q.add(new Info(src, 0, 0));

        while (!q.isEmpty()) {
            Info curr = q.poll();

            if (curr.stops > k) {
                continue;
            }

            for (Edge e : graph[curr.v]) {
                int nextCost = curr.cost + e.wt;
                if (nextCost < dist[e.dest]) {
                    dist[e.dest] = nextCost;
                    q.add(new Info(e.dest, nextCost, curr.stops + 1));
                } else if (curr.stops < k) {
                    q.add(new Info(e.dest, nextCost, curr.stops + 1));
                }
            }
        }

        return dist[dest] == Integer.MAX_VALUE ? -1 : dist[dest];
    }

    public static void main(String[] args) {
        int n = 4;
        int flights[][] = { { 0, 1, 100 }, { 1, 2, 100 }, { 2, 0, 100 }, { 1, 3, 600 }, { 2, 3, 200 } };
        int src = 0, dest = 3, k = 1;

        int result = cheapestFlight(n, src, dest, k, flights);
        System.out.println("The cheapest price is: " + result);
    }
}
