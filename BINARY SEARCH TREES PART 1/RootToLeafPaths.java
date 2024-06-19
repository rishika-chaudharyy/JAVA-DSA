//Write a program to print root to leaf paths

import java.util.*;

public class RootToLeafPaths {
    static class Node {
        int data;
        Node right;
        Node left;

        Node(int data) {
            this.data = data;
            this.right = null;
            this.left = null;
        }
    }

    public static Node buildBST(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }

        if (root.data > val) {
            root.left = buildBST(root.left, val); // Corrected: Insert into the left subtree
        } else if (root.data < val) {
            root.right = buildBST(root.right, val); // Corrected: Insert into the right subtree
        }
        return root;
    }

    public static void inorder(Node root) {
        if (root == null) {
            return;
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void printPaths(ArrayList<Integer> paths) {
        for (int i = 0; i < paths.size(); i++) {
            System.out.print(paths.get(i) + (i == paths.size() - 1 ? "" : "->"));
        }
        System.out.println();
    }

    public static void printRootToLeafPaths(Node root, ArrayList<Integer> paths) {
        if (root == null) {
            return;
        }
        paths.add(root.data); // Add current node to the path
        if (root.right == null && root.left == null) {
            printPaths(paths); // Print path when leaf node is reached
        } else {
            printRootToLeafPaths(root.left, paths); // Recursive call for left subtree
            printRootToLeafPaths(root.right, paths); // Recursive call for right subtree
        }
        paths.remove(paths.size() - 1); // Remove current node from path (backtrack)
    }

    public static void main(String args[]) {
        int values[] = { 8, 5, 3, 1, 4, 6, 10, 11, 14 };
        Node root = null;

        for (int i = 0; i < values.length; i++) {
            root = buildBST(root, values[i]);
        }

        printRootToLeafPaths(root, new ArrayList<>());
    }
}
