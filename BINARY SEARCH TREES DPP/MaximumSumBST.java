//We have a binary tree ,the task is to print maximum sum of nodes of a sub tree which is also a binary tree
class MaximumSumBST {
    static class Node {
        int key;
        Node left, right;

        Node(int key) {
            this.key = key;
            this.left = this.right = null;
        }
    }

    static class Result {
        int maxSum;

        Result() {
            this.maxSum = 0;
        }
    }

    static class SubtreeInfo {
        boolean isBST;
        int sum;
        int min;
        int max;

        SubtreeInfo(boolean isBST, int sum, int min, int max) {
            this.isBST = isBST;
            this.sum = sum;
            this.min = min;
            this.max = max;
        }
    }

    static SubtreeInfo maxSumBSTUtil(Node root, Result result) {
        if (root == null) {
            return new SubtreeInfo(true, 0, Integer.MAX_VALUE, Integer.MIN_VALUE);
        }

        SubtreeInfo leftInfo = maxSumBSTUtil(root.left, result);
        SubtreeInfo rightInfo = maxSumBSTUtil(root.right, result);

        if (leftInfo.isBST && rightInfo.isBST && root.key > leftInfo.max && root.key < rightInfo.min) {
            int sum = root.key + leftInfo.sum + rightInfo.sum;
            result.maxSum = Math.max(result.maxSum, sum);
            int min = (root.left != null) ? leftInfo.min : root.key;
            int max = (root.right != null) ? rightInfo.max : root.key;
            return new SubtreeInfo(true, sum, min, max);
        } else {
            return new SubtreeInfo(false, 0, 0, 0);
        }
    }

    static int maxSumBST(Node root) {
        Result result = new Result();
        maxSumBSTUtil(root, result);
        return result.maxSum;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(4);
        root.right = new Node(3);
        root.left.left = new Node(2);
        root.left.right = new Node(4);
        root.right.left = new Node(2);
        root.right.right = new Node(5);
        root.right.right.left = new Node(4);
        root.right.right.right = new Node(6);

        System.out.println("Maximum sum of nodes in a BST subtree: " + maxSumBST(root)); // Expected output: 20
    }
}
