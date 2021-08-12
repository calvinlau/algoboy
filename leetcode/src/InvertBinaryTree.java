/**
 * Invert a binary tree.
 *      4
 *    /   \
 *   2     7
 *  / \   / \
 * 1   3 6   9
 * to
 *      4
 *    /   \
 *   7     2
 *  / \   / \
 * 9   6 3   1
 * 
 * @author calvinliu
 * @Solution Recursion
 * 
 */
public class InvertBinaryTree {

	public TreeNode invertTree(TreeNode root) {
		if (root != null) {
			helper(root);
		}
		return root;
	}

	public void helper(TreeNode p) {
		TreeNode temp = p.left;
		p.left = p.right;
		p.right = temp;
		if (p.left != null)
			helper(p.left);
		if (p.right != null)
			helper(p.right);
	}
}
