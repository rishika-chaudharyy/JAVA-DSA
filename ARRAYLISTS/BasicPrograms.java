//Write a program to perform some basic programs using Arraylist

import java.util.ArrayList;

public class BasicPrograms {
    public static void reverseArraylist(ArrayList<Integer> list) {
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }

    public static void findMaximumElement(ArrayList<Integer> list) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < list.size(); i++) {
            if (max < list.get(i)) {
                max = list.get(i);
            }
        }
        System.out.println("Maximum element is : " + max);
    }

    public static void findMinimumElement(ArrayList<Integer> list) {
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < list.size(); i++) {
            if (min > list.get(i)) {
                min = list.get(i);
            }
        }
        System.out.println("Minimum element is : " + min);
    }

    public static void swapElements(ArrayList<Integer> list, int idx1, int idx2) {
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
    }

    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(8);

        reverseArraylist(list);
        findMaximumElement(list);
        findMinimumElement(list);

        System.out.println(list);
        int idx1 = 1;
        int idx2 = 3;
        swapElements(list, idx1, idx2);
        System.out.println(list);
    }
}
