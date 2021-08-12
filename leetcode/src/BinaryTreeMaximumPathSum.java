/**
 * Given a binary tree, find the maximum path sum.
 * 
 * For this problem, a path is defined as any sequence of nodes from some
 * starting node to any node in the tree along the parent-child connections. The
 * path does not need to go through the root.
 * 
 * @author calvinliu
 * @Solution Divide and conquer
 * 
 */
public class BinaryTreeMaximumPathSum {
	int max;

	public int maxPathSum(TreeNode root) {
		max = (root == null) ? 0 : root.val;
		findMax(root);
		return max;
	}

	private int findMax(TreeNode root) {
		if (root == null) {
			return 0;
		}
		int left = Math.max(findMax(root.left), 0);
		int right = Math.max(findMax(root.right), 0);
		max = Math.max(max, root.val + left + right);
		return root.val + Math.max(left, right);
	}
}
