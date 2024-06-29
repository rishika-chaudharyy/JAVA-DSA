//Write a program to iterate on hash maps

import java.util.*;

public class IterateHashMaps {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US", 50);
        hm.put("Bhutan", 6);
        hm.put("Nepal", 5);

        // Create a set of keys to iterate

        Set<String> keys = hm.keySet();
        System.out.println(keys);

        for (String key : keys) {
            System.out.println("key" + "=" + key + "," + "value" + "=" + hm.get(key));
        }
    }
}