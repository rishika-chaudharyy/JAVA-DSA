//Write a porgram to store multiple lists in a single list. Create a miltidimensional ArrayList

import java.util.*;

public class MultiDimensionalArrayList {
    public static void main(String args[]) {
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>(); // creating multidimensional list

        // creating sublists
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

        // adding elements in sublists
        // list 1
        for (int i = 1; i <= 5; i++) {
            list1.add(i);
        }

        // list 2
        for (int i = 1; i <= 5; i++) {
            list2.add(2 * i);
        }

        // list 3
        for (int i = 1; i <= 5; i++) {
            list3.add(3 * i);

        }

        // printing sublists
        System.out.println(list1);
        System.out.println(list2);
        System.out.println(list3);

        // adding sublists to main list
        mainList.add(list1);
        mainList.add(list2);
        mainList.add(list3);

        // printing main list
        System.out.println(mainList);

        // printing each element in mainList
        for (int i = 0; i < mainList.size(); i++) {
            ArrayList<Integer> curr = mainList.get(i);
            for (int j = 0; j < curr.size(); j++) {
                System.out.print(curr.get(j) + " ");
            }
            System.out.println();
        }

    }
}
