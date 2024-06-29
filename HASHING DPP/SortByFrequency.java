// Given a string s, sort it in decreasing order based on the frequency of the characters. The frequency of a character is the number of times it appears in the string. Return the sorted string. If there are multiple answers, return any of them.

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class SortByFrequency {
    public String frequencySort(String s) {
        // Create a HashMap to store the frequency of each character
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); ++i) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        // Create a PriorityQueue to sort the characters by frequency
        PriorityQueue<Map.Entry<Character, Integer>> pq = new PriorityQueue<>(
                (a, b) -> b.getValue().equals(a.getValue()) ? a.getKey() - b.getKey() : b.getValue() - a.getValue());

        // Add all the entries from the map to the priority queue
        for (Map.Entry<Character, Integer> e : map.entrySet()) {
            pq.add(e);
        }

        // Build the result string
        StringBuilder res = new StringBuilder();
        while (!pq.isEmpty()) {
            Map.Entry<Character, Integer> entry = pq.poll();
            char ch = entry.getKey();
            int val = entry.getValue();
            while (val > 0) {
                res.append(ch);
                val--;
            }
        }

        // Return the result string
        return res.toString();
    }

    public static void main(String[] args) {
        SortByFrequency solution = new SortByFrequency();
        String s = "tree";
        String sortedString = solution.frequencySort(s);

        System.out.println("Sorted string by frequency: " + sortedString);
    }
}
