/**
 * Input: root = [3,9,20,null,null,15,7]
 * Output: 24
 *
 * Explanation: There are two left leaves in the binary tree, with values 9 and 15 respectively.
 *
 * @author kevinliu
 * @Solution DFS
 * 
 */
public class SumofLeftLeaves {

	public int sumOfLeftLeaves(TreeNode root) {
		return root == null ? 0 : dfs(root, false);
	}

	private int dfs(TreeNode node, boolean isLeft) {
		int ret = 0;
		if (node.left == null && node.right == null) {
			ret += isLeft ? node.val : 0;
			return ret;
		}
		if (node.left != null) {
			ret += dfs(node.left, true);
		}
		if (node.right != null) {
			ret += dfs(node.right, false);
		}
		return ret;
	}
}
