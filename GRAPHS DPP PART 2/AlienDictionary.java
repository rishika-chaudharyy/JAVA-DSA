// Alien Dictionary

// We have a sorted dictionary of an alien language having N words and K starting alphabets of standard dictionary. Find the order of characters in the alien language. Many orders may be possible for a particular test case, thus you may return any valid order and output will be 1 if the order of string returned by the function is correct else 0 denoting incorrect string returned.

// Sample Input 1:
// N = 3, K = 3
// dict = {"caa","aaa","aab"}

// Sample Output 1:
// 1

// Sample Input 2:
// N = 5, K = 4
// dict = {"baa","abcd","abca","cab","cad"}

// Sample Output 2:
// 1

import java.util.*;

public class AlienDictionary {

    public String alienOrder(String[] words) {
        Map<Character, Set<Character>> map = new HashMap<>();
        Map<Character, Integer> degree = new HashMap<>();
        StringBuilder result = new StringBuilder();

        // Initialize degree map for all characters
        for (String s : words) {
            for (char c : s.toCharArray()) {
                degree.put(c, 0);
            }
        }

        // Build the graph and degree map
        for (int i = 0; i < words.length - 1; i++) {
            String curr = words[i];
            String next = words[i + 1];
            int minLength = Math.min(curr.length(), next.length());

            for (int j = 0; j < minLength; j++) {
                char c1 = curr.charAt(j);
                char c2 = next.charAt(j);

                if (c1 != c2) {
                    Set<Character> set = map.getOrDefault(c1, new HashSet<>());
                    if (!set.contains(c2)) {
                        set.add(c2);
                        map.put(c1, set);
                        degree.put(c2, degree.getOrDefault(c2, 0) + 1);
                    }
                    break; // Only the first differing pair matters
                }
            }
        }

        // Topological sorting using Kahn's algorithm
        Queue<Character> queue = new LinkedList<>();
        for (char c : degree.keySet()) {
            if (degree.get(c) == 0) {
                queue.add(c);
            }
        }

        while (!queue.isEmpty()) {
            char c = queue.poll();
            result.append(c);
            if (map.containsKey(c)) {
                for (char next : map.get(c)) {
                    degree.put(next, degree.get(next) - 1);
                    if (degree.get(next) == 0) {
                        queue.add(next);
                    }
                }
            }
        }

        // If result length equals the number of unique characters, return result as
        // string
        if (result.length() == degree.size()) {
            return result.toString();
        } else {
            return ""; // Cycle detected, invalid order
        }
    }

    public static void main(String[] args) {
        AlienDictionary solution = new AlienDictionary();

        // Example usage:
        String[] words1 = { "caa", "aaa", "aab" };
        System.out.println(solution.alienOrder(words1)); // Output: "cab"

        String[] words2 = { "baa", "abcd", "abca", "cab", "cad" };
        System.out.println(solution.alienOrder(words2)); // Output: "bdac"
    }
}
