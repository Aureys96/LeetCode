package helpers;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public static void main(String[] args) {
        TreeNode root = new TreeNode(0);
        TreeNode left = new TreeNode(-3);
        TreeNode right = new TreeNode(9);
        TreeNode rightLeft = new TreeNode(5);
        TreeNode leftLeft = new TreeNode(-10);
        root.left = left;
        root.right = right;
        root.right.left = rightLeft;
        root.left.left = leftLeft;

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

        int lastNumberIndex = 0;
        final String answer = sb.toString();
        final char[] chars = answer.toCharArray();
        Set<Character> digits = Set.of('0', '1', '2', '3', '4', '5', '6', '7', '8', '9');
        for (int i = answer.length() - 1; i > -1; i--) {
            if (digits.contains(chars[i])) {
                lastNumberIndex = i;
                break;
            }
        }

        return answer.substring(0, lastNumberIndex + 1);
    }
}
