//Given the weights and values of N items , put these items in a knapsack of capacity W to get the maximum total value in Knapsack

import java.util.*;

public class FractionalKnapsack {
    public static void main(String args[]) {
        int value[] = { 60, 100, 120 };
        int weight[] = { 10, 20, 30 };
        int W = 50;

        double ratio[][] = new double[value.length][2];

        for (int i = 0; i < value.length; i++) {
            ratio[i][0] = i;
            ratio[i][1] = value[i] / (double) weight[i];
        }

        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));

        int capacity = W;
        int finalAns = 0;

        for (int i = ratio.length - 1; i >= 0; i--) {
            int idx = (int) ratio[i][0];

            if (capacity >= weight[idx]) {
                finalAns += value[idx];
                capacity -= weight[idx];
            } else {
                finalAns += (ratio[i][1] * capacity);
                capacity = 0;
                break;
            }
        }
        System.out.println("Final answer is " + finalAns);
    }
}
