//Given the root of BST , integer k , return the kth smallest value(1-indexed) of all the values of node in a tree

public class KthSmallestElement {
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

    int ans;
    int K;

    public void inorder(Node root) {
        if (root == null) {
            return;
        }

        inorder(root.left);

        // Only process the current node if K is greater than 0
        if (K > 0) {
            K--;
            if (K == 0) {
                ans = root.data;
                return; // Exit once we find the kth smallest element
            }
        }

        inorder(root.right);
    }

    public int KthSmallest(Node root, int k) {
        ans = 0;
        K = k;
        inorder(root);
        return ans;
    }

    public static void main(String[] args) {
        Node root = new Node(8);
        root.left = new Node(6);
        root.left.left = new Node(5);
        root.left.left.left = new Node(3);

        root.right = new Node(10);
        root.right.right = new Node(11);
        root.right.right.right = new Node(12);

        KthSmallestElement finder = new KthSmallestElement();
        System.out.println(finder.KthSmallest(root, 3)); // Should print the 3rd smallest element
    }
}
