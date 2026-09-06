/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        Deque<TreeNode> stack = new ArrayDeque<>();
        stack.offer(root);

        int depth = 0;

        while (!stack.isEmpty()) {
            int size = stack.size();
            depth++;

            for (int i = 0; i < size; i++) {
                TreeNode node = stack.poll();

                if (node.left != null)
                    stack.offer(node.left);

                if (node.right != null)
                    stack.offer(node.right);
            }
        }

        return depth;
    }
}
