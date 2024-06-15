//Write a program to calculate the diameter of the tree
//TC is O(n^2) as we travel each node and calculate height at each node so we travel n nodes and perform and operation of O(n) at each node

public class DiameterOfTreeApproach1 {
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

    public static int height(Node root) {
        if (root == null) {
            return 0;
        }
        int lh = height(root.left);
        int rh = height(root.right);
        int ht = Math.max(rh, lh);
        return ht + 1;
    }

    public static int diameter(Node root) {
        if (root == null) {
            return 0;
        }
        int lh = height(root.left);
        int rh = height(root.right);
        int rd = diameter(root.right);
        int ld = diameter(root.left);

        int selfDiam = lh + rh + 1;
        return Math.max(selfDiam, Math.max(rd, ld));
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println(diameter(root));
    }
}