//Write a program to find the lowest common ancestor
//TC is O(n)

public class LowestCommonAncestorApproach2 {
    static class Node {
        int data;
        Node right;
        Node left;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static Node lowestCommonAncestor(Node root, int n1, int n2) {
        if (root == null || root.data == n1 || root.data == n2) {
            return root;
        }
        Node leftLca = lowestCommonAncestor(root.left, n1, n2);
        Node rightLca = lowestCommonAncestor(root.right, n1, n2);

        if (rightLca == null) {
            return leftLca;
        }

        if (leftLca == null) {
            return rightLca;
        }
        return root;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println(lowestCommonAncestor(root, 4, 6).data);
    }
}
