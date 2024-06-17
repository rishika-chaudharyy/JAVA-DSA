// Given a binary tree, find the maximum path sum. A path in this context is defined as any sequence of nodes from some starting node to any node in the tree along the parent-child connections. The path must contain at least one node and does not need to go through the root.

public class MaximumPathSum {
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

    // Global variable to store the maximum path sum found so far
    static int max_sum = Integer.MIN_VALUE;

    public static int findMaxSumPath(Node root) {
        if (root == null) {
            return 0;
        }

        // Recursively compute maximum path sums for left and right subtrees
        int l = findMaxSumPath(root.left);
        int r = findMaxSumPath(root.right);

        // Calculate the maximum path sum that ends at the current node
        int max_single = Math.max(Math.max(l, r) + root.data, root.data);

        // Calculate the maximum path sum that may include the current node and its
        // children
        int max_top = Math.max(max_single, l + r + root.data);

        // Update the global maximum path sum found so far
        max_sum = Math.max(max_sum, max_top);

        // Return the maximum path sum that ends at the current node for recursion
        return max_single;
    }

    public static void main(String[] args) {
        // Construct the example binary tree
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        // Call the function to find the maximum path sum
        findMaxSumPath(root);

        // Print the maximum path sum found
        System.out.println("Maximum Path Sum: " + max_sum); // Expected output: 18
    }
}
