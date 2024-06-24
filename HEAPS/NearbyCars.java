//We are given n points in a 2d plane  which are locations of N cars. If we are at origin print the nearedt  cars

import java.util.*;

public class NearbyCars {
    static class Point implements Comparable<Point> {
        int x;
        int y;
        int distsq;
        int idx;

        public Point(int x, int y, int distsq, int idx) {
            this.x = x;
            this.y = y;
            this.distsq = distsq;
            this.idx = idx;
        }

        public int compareTo(Point p2) {
            return this.distsq - p2.distsq;
        }
    }

    public static void main(String[] args) {
        int pts[][] = { { 3, 3 }, { 5, -1 }, { -2, 4 } };
        int k = 2;
        PriorityQueue<Point> pq = new PriorityQueue<>();
        for (int i = 0; i < pts.length; i++) {
            int dist = pts[i][0] * pts[i][0] + pts[i][1] * pts[i][1];
            pq.add(new Point(pts[i][0], pts[i][1], dist, i));
        }

        for (int i = 0; i < k; i++) {
            System.out.println("C" + pq.remove().idx);
        }
    }
}
