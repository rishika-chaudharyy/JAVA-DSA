//We have a BST and target node k , the task is to find the node with minimum absolute difference with given target value k

public class ClosestElementInBST {
    static int min_diff;
    static int min_diff_key;

    static class Node {
        int key;
        Node left, right;

        Node(int key) {
            this.key = key;
            this.left = this.right = null;
        }
    }

    static Node newNode(int key) {
        return new Node(key);
    }

    static void maxDiffUtil(Node ptr, int k) {
        if (ptr == null) {
            return;
        }

        // If the current node's key is equal to k, we found the closest key
        if (ptr.key == k) {
            min_diff_key = k;
            return;
        }

        // Update min_diff and min_diff_key if the current node is closer
        if (min_diff > Math.abs(ptr.key - k)) {
            min_diff = Math.abs(ptr.key - k);
            min_diff_key = ptr.key;
        }

        // Recur down the tree
        if (k < ptr.key) {
            maxDiffUtil(ptr.left, k);
        } else {
            maxDiffUtil(ptr.right, k);
        }
    }

    static int maxDiff(Node root, int k) {
        min_diff = Integer.MAX_VALUE; // Use Integer.MAX_VALUE for better readability
        min_diff_key = -1;
        maxDiffUtil(root, k);
        return min_diff_key;
    }

    public static void main(String args[]) {
        Node root = newNode(9);
        root.left = newNode(4);
        root.right = newNode(17);
        root.left.left = newNode(3);
        root.left.right = newNode(6);
        root.left.right.left = newNode(5);
        root.left.right.right = newNode(7);
        root.right.right = newNode(22);
        root.right.right.left = newNode(20);

        int k = 18;
        System.out.println("Closest value to " + k + " is " + maxDiff(root, k)); // Expected output: 17
    }
}
