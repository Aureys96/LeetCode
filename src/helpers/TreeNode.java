package helpers;

import java.util.LinkedList;
import java.util.Queue;

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public static void main(String[] args) {
        TreeNode root = new TreeNode(15);
        TreeNode left = new TreeNode(10);
        TreeNode right = new TreeNode(25);
        TreeNode rightRight = new TreeNode(45);
        TreeNode rightLeft = new TreeNode(39);
        TreeNode leftRight = new TreeNode(-255);
        root.left = left;
        root.right = right;
        root.right.right = rightRight;
        root.right.left = rightLeft;
        root.left.right = leftRight;

        System.out.println(root);
    }

    public TreeNode() {
    }

    public TreeNode(int val) {
        this.val = val;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(this);
        StringBuilder sb = new StringBuilder();
        while (!q.isEmpty()) {
            final TreeNode node = q.poll();
            if (node == null) {
                sb.append("null ");
                continue;
            }
            sb.append(node.val).append(" ");
            q.offer(node.left);
            q.offer(node.right);
        }

        return sb.toString();
    }
}
