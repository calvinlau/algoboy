/**
 * Given a binary tree, determine if it is a valid binary search tree (BST).
 * Assume a BST is defined as follows:
 *   The left subtree of a node contains only nodes with keys less than the node's key.
 *   The right subtree of a node contains only nodes with keys greater than the node's key.
 *   Both the left and right subtrees must also be binary search trees.
 *
 * @author calvinliu
 * @Solution Divide and conquer
 * 
 */
public class ValidateBinarySearchTree {
	public boolean isValidBST(TreeNode root) {
		if (root == null)
			return true;
		return validate(root.left, Long.MIN_VALUE, (long) root.val) && validate(root.right, (long) root.val, Long.MAX_VALUE);
	}

	private boolean validate(TreeNode root, Long min, Long max) {
		if (root == null)
			return true;
		if (root.val > min && root.val < max) {
			return validate(root.left, min, (long) root.val) && validate(root.right, (long) root.val, max);
		} else {
			return false;
		}
	}
}
