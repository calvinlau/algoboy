package tree;

/**
 * Given the root of a binary tree, return the length of the diameter of the tree.
 *
 * The diameter of a binary tree is the length of the longest path between any two nodes in a tree. This path may or may not pass through the root.
 *
 * Input: root = [1,2,3,4,5]
 * Output: 3
 * Explanation: 3 is the length of the path [4,2,1,3] or [5,2,1,3].
 *
 * @author kevinliu
 * @Solution Divide and conquer, get height firstly then compare left and right diff
 */
public class DiameterofBinaryTree {

    int ret = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        if (root != null) dfs(root);
        return ret;
    }

    int dfs(TreeNode node) {
        if (node.left == null && node.right == null) {
            return 0;
        }
        int left = node.left != null ? dfs(node.left) + 1 : 0;
        int right = node.right != null ? dfs(node.right) + 1 : 0;
        ret = Math.max(ret, left + right);
        return Math.max(left, right);
    }
}
