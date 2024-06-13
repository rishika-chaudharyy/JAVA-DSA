// You are given N activities with their start and end , Select the maximum
// number of activities that can be performed by a single person , assuming that
// the person can work on a single activity at a time . Activities are sorted
// according to end time
//TC is O(n) is sorted according to end time
//TC is O(nlogN) if not sorted and we need to sort it

// import java.util.*;

// public class ActivitySelection {
//     public static void main(String args[]) {
//         int start[] = { 1, 3, 0, 5, 8, 5 };
//         int end[] = { 2, 4, 6, 7, 9, 9 };

//         int maxAct = 0;
//         ArrayList<Integer> ans = new ArrayList<>();

//         maxAct = 1;
//         ans.add(0);
//         int lastEnd = end[0];
//         for (int i = 1; i < end.length; i++) {
//             if (start[i] >= lastEnd) {
//                 maxAct++;
//                 ans.add(i);
//                 lastEnd = end[i];
//             }
//         }
//         System.out.println("Max activities are : " + maxAct+ " ");

//         for (int i = 0; i < ans.size(); i++) {
//             System.out.print("A" + ans.get(i)+" ");
//         }
//         System.out.println();
//     }
// }

//if not sorted
import java.util.*;

public class ActivitySelection {
    public static void main(String args[]) {
        int start[] = { 1, 3, 0, 5, 8, 5 };
        int end[] = { 2, 4, 6, 7, 9, 9 };

        int maxAct = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        int activities[][] = new int[start.length][3];

        for (int i = 0; i < start.length; i++) {
            activities[i][0] = i;
            activities[i][1] = start[i];
            activities[i][2] = end[i];
        }

        Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));

        maxAct = 1;
        ans.add(activities[0][0]);
        int lastEnd = activities[0][2];
        for (int i = 1; i < end.length; i++) {
            if (activities[i][1] >= lastEnd) {
                maxAct++;
                ans.add(activities[i][0]);
                lastEnd = activities[i][2];
            }
        }
        System.out.println("Max activities are : " + maxAct + " ");

        for (int i = 0; i < ans.size(); i++) {
            System.out.print("A" + ans.get(i) + " ");
        }
        System.out.println();
    }
}