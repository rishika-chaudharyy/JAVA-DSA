// Given a binary tree, find all duplicate subtrees. For each duplicate subtree found, return the root node of any one of them.

import java.util.*;

public class FindAllDuplicateSubtrees {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static HashMap<String, Integer> map;

    public static String inorder(Node root) {
        if (root == null) {
            return "";
        }

        String str = "(";
        str += inorder(root.left);
        str += Integer.toString(root.data);
        str += inorder(root.right);
        str += ")";
        
        // Check if this subtree string has been seen before
        if (map.containsKey(str)) {
            // If seen for the first time, print the root node
            if (map.get(str) == 1) {
                System.out.print(root.data + " ");
            }
            // Increment the count of this subtree string
            map.put(str, map.get(str) + 1);
        } else {
            // Add this subtree string to the map with count 1
            map.put(str, 1);
        }

        return str;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(2);
        root.right.left = new Node(2);
        root.right.right = new Node(7);

        map = new HashMap<>();
        
        System.out.println("Duplicate subtrees:");
        inorder(root);
    }
}
