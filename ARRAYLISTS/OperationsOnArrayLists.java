//Write a program to create an Arraylist and perform various operations on Arraylist

import java.util.ArrayList; //package that contains Arraylists

public class OperationsOnArrayLists {
    public static void main(String args[]) {
        // creating an arraylist
        ArrayList<Integer> list = new ArrayList<>();

        // add operation O(1)
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        // add at specific index O(n)
        list.add(6, 7);

        // printing the list
        System.out.println(list);

        // get operation O(1)
        System.out.println(list.get(6));

        // remove operation O(n)
        list.remove(6);
        System.out.println(list);

        // set operation O(n)
        list.set(5, 3);
        System.out.println(list);

        // contains operation O(n)
        System.out.println(list.contains(2));
        System.out.println(list.contains(6));

        // size operation
        System.out.println(list.size());
    }
}