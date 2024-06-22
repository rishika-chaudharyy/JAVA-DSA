//We have a binary search tree consisting of N nodes , two postive integers left and right , the task is to find the sum of values of all the nodes that lie in the range [left,right].

public class RangeSumOfBST {
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

    public static int rangeSumBST(Node root, int left, int right) {
        if (root == null) {
            return 0;
        }

        int sum = 0;

        // If the current node's data is within the range, add it to the sum
        if (left <= root.data && right >= root.data) {
            sum += root.data;
        }

        // If the current node's data is greater than the left bound, explore the left
        // subtree
        if (left < root.data) {
            sum += rangeSumBST(root.left, left, right);
        }

        // If the current node's data is less than the right bound, explore the right
        // subtree
        if (right > root.data) {
            sum += rangeSumBST(root.right, left, right);
        }

        return sum;
    }

    public static void main(String[] args) {
        Node root = new Node(8);
        root.left = new Node(6);
        root.left.left = new Node(5);
        root.left.left.left = new Node(3);

        root.right = new Node(10);
        root.right.right = new Node(11);
        root.right.right.right = new Node(12);

        System.out.println(rangeSumBST(root, 3, 8)); // Output should be the sum of 3, 5, 6, and 8
    }
}
