//Write a program to implement union find and check if the directed graph has cycle.

public class UnionFind {
    static int n = 7;
    static int[] par = new int[n];
    static int[] rank = new int[n];

    public static void init() {
        for (int i = 0; i < n; i++) {
            par[i] = i;
            rank[i] = 0;
        }
    }

    public static int find(int x) {
        if (x == par[x]) {
            return x;
        }
        // path compression
        return par[x] = find(par[x]);
    }

    public static boolean union(int a, int b) {
        int parA = find(a);
        int parB = find(b);

        if (parA == parB) {
            return false; // Cycle detected
        }

        if (rank[parA] == rank[parB]) {
            par[parB] = parA;
            rank[parA]++;
        } else if (rank[parA] < rank[parB]) {
            par[parA] = parB;
        } else {
            par[parB] = parA;
        }
        return true;
    }

    public static void main(String[] args) {
        init();
        int[][] edges = {
                { 0, 1 }, { 1, 2 }, { 2, 3 }, { 3, 4 }, { 4, 5 }, { 5, 6 }, { 6, 1 } // The last edge creates a cycle
        };

        boolean hasCycle = false;

        for (int i = 0; i < edges.length; i++) {
            int u = edges[i][0];
            int v = edges[i][1];
            if (!union(u, v)) {
                hasCycle = true;
                break;
            }
        }

        if (hasCycle) {
            System.out.println("The graph contains a cycle.");
        } else {
            System.out.println("The graph does not contain a cycle.");
        }
    }
}
