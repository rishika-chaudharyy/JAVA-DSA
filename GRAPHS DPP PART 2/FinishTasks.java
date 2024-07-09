// Given n tasks labelled from 0 to n-1 and a list of prerequisite pairs, determine whether it is possible to finish all tasks.

// Input
// int n: The total number of tasks.
// int[][] prerequisites: A list of prerequisite pairs where prerequisites[i] = [a, b] indicates that task a depends on task b.
// Output
// boolean: Return true if it is possible to finish all tasks, otherwise return false.
// Example
// Input 1:

// n = 2
// prerequisites = [[1, 0], [0, 1]]
// Output 1:
// false
// Input 2:

// n = 2
// prerequisites = [[1, 0]]
// Output 2:
// true
import java.util.*;

public class FinishTasks {

    static int[][] makeGraph(int numTasks, int[][] prerequisites) {
        int[][] graph = new int[numTasks][numTasks];
        for (int[] pre : prerequisites) {
            graph[pre[1]][pre[0]] = 1;
        }
        return graph;
    }

    static int[] computeIndegree(int[][] graph) {
        int[] degrees = new int[graph.length];
        for (int i = 0; i < graph.length; i++) {
            for (int j = 0; j < graph.length; j++) {
                if (graph[i][j] == 1) {
                    degrees[j]++;
                }
            }
        }
        return degrees;
    }

    static boolean canFinish(int numTasks, int[][] prerequisites) {
        int[][] graph = makeGraph(numTasks, prerequisites);
        int[] degrees = computeIndegree(graph);
        for (int i = 0; i < numTasks; i++) {
            int j = 0;
            while (j < numTasks && degrees[j] != 0) {
                j++;
            }
            if (j == numTasks) {
                return false;
            }
            degrees[j] = -1;
            for (int k = 0; k < numTasks; k++) {
                if (graph[j][k] == 1) {
                    degrees[k]--;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int numTasks = 4;
        int[][] prerequisites = { { 1, 0 }, { 2, 1 }, { 3, 2 } };
        if (canFinish(numTasks, prerequisites)) {
            System.out.println("Possible to finish all tasks");
        } else {
            System.out.println("Impossible to finish all tasks");
        }
    }
}
