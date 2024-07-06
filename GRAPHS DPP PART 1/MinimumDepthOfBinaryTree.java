// Given a binary tree, find its minimum depth. The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node. 

import java.util.LinkedList;
import java.util.Queue;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

public class MinimumDepthOfBinaryTree {
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int depth = 1;

        while (!queue.isEmpty()) {
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                TreeNode currentNode = queue.remove();

                // Check if it's a leaf node
                if (currentNode.left == null && currentNode.right == null) {
                    return depth;
                }

                // Add children to the queue
                if (currentNode.left != null) {
                    queue.add(currentNode.left);
                }

                if (currentNode.right != null) {
                    queue.add(currentNode.right);
                }
            }

            depth++;
        }

        return depth;
    }

    public static void main(String[] args) {
        // Example usage:
        // Constructing the tree:
        // 1
        // / \
        // 2 3
        // / \
        // 4 5

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        MinimumDepthOfBinaryTree solution = new MinimumDepthOfBinaryTree();
        int minDepth = solution.minDepth(root);
        System.out.println("Minimum depth of the binary tree is: " + minDepth); // Output: 2
    }
}
