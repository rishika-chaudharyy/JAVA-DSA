//Write a program to solve the container with most water problem using two pointer approach
//TC is O(n)

import java.util.ArrayList;

public class ContainerWithMostWaterTwoPointerApproach {
    public static int containerWithMostWater(ArrayList<Integer> height) {
        int maxWater = 0;
        int lp = 0;
        int rp = height.size() - 1;

        while (lp < rp) {
            int ht = Math.min(height.get(lp), height.get(rp));
            int width = rp - lp;
            int currWater = ht * width;
            maxWater = Math.max(currWater, maxWater);
            if (height.get(lp) < height.get(rp)) {
                lp++;
            } else {
                rp--;
            }

        }
        return maxWater;
    }

    public static void main(String args[]) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        System.out.println(containerWithMostWater(height));
    }
}
