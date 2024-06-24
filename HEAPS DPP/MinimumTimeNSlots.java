
// Minimum time required to fill given N slotsWehaveanintegerNwhichdenotesthenumberofslots,andanarrayarr[]consistingofKintegersintherange[1,N]repreand.Eachelementofthearrayareintherange[1,N]whichrepresentstheindicesofthefilledslots.Ateachunitoftime,theindexwithfilledslotfillstheadjacent empty slots. The task is to find the minimum time taken to fill all the N slots.
import java.util.*;

public class MinimumTimeNSlots {
    public static void minTime(int arr[], int N, int K) {
        Queue<Integer> q = new LinkedList<>();
        boolean vis[] = new boolean[N + 1];
        int time = 0;

        for (int i = 0; i < K; i++) {
            q.add(arr[i]);
            vis[arr[i]] = true;
        }

        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                int curr = q.poll();
                if (curr - 1 >= 1 && !vis[curr - 1]) {
                    vis[curr - 1] = true;
                    q.add(curr - 1);
                }
                if (curr + 1 <= N && !vis[curr + 1]) {
                    vis[curr + 1] = true;
                    q.add(curr + 1);
                }
            }
            time++;
        }

        System.out.println(time - 1);
    }

    public static void main(String[] args) {
        int N = 6;
        int arr[] = { 2, 6 };
        int K = arr.length;
        minTime(arr, N, K);
    }
}
