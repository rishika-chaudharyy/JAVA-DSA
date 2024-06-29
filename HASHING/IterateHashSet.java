//Write a program to iterate on HashSet

import java.util.*;

public class IterateHashSet {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Delhi");
        set.add("Mumbai");
        set.add("Jalore");
        set.add("Banglore");

        for (String s : set) {
            System.out.println(s);
        }
        // Iterator it = set.iterator(); // starts from null

        // while (it.hasNext()) {
        // System.out.println(it.next()); // checks for next , prints and updates itself
        // }
    }
}
