//Write a program to calculate the height of the tree
//TC is O(n)

public class HeightOfTheTree {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.right = null;
            this.left = null;
        }
    }

    public static int heightOfTheTree(Node root) {
        if (root == null) {
            return 0;
        }
        int lh = heightOfTheTree(root.left);
        int rh = heightOfTheTree(root.right);
        int height = Math.max(lh, rh);
        return height + 1;
    }

    public static void main(String args[]) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        int result = heightOfTheTree(root);
        int edge = result - 1;
        System.out.println("Height of the tree in terms of nodes is : " + result);
        System.out.println("Height of the tree in terms of egde is : " + edge);
    }
}
