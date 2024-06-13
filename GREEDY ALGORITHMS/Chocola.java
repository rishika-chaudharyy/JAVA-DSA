//We are given a bar of chocolate composed of m x n square peices . One should break the chocolate into single squares> each break  part of the chocolate is cj=harges as a cost expressed by a positive integer . This cost does not depend on the size of the part that is being broken but on the line the break goes along. Calculate the minimal cost of breaking wholce chocolate into single squares

import java.util.Arrays;
import java.util.Collections;

public class Chocola {
    public static void main(String args[]) {
        // int n = 4, m = 6;
        Integer costVert[] = { 2, 1, 3, 1, 4 };
        Integer costHort[] = { 4, 1, 2 };

        // Sort the arrays in descending order
        Arrays.sort(costVert, Collections.reverseOrder());
        Arrays.sort(costHort, Collections.reverseOrder());

        int h = 0, v = 0;
        int hp = 1, vp = 1; // Start with 1 piece to represent the whole chocolate bar
        int cost = 0;

        while (h < costHort.length && v < costVert.length) {
            if (costVert[v] >= costHort[h]) {
                cost += costVert[v] * hp;
                vp++;
                v++;
            } else {
                cost += costHort[h] * vp;
                hp++;
                h++;
            }
        }

        // Handle remaining vertical cuts
        while (v < costVert.length) {
            cost += costVert[v] * hp;
            vp++;
            v++;
        }

        // Handle remaining horizontal cuts
        while (h < costHort.length) {
            cost += costHort[h] * vp;
            hp++;
            h++;
        }

        System.out.println("Cost is " + cost);
    }
}
