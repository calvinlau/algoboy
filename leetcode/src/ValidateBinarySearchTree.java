/**
 * Given a binary tree, determine if it is a valid binary search tree (BST).
 * Assume a BST is defined as follows:
 *   The left subtree of a node contains only nodes with keys less than the node's key.
 *   The right subtree of a node contains only nodes with keys greater than the node's key.
 *   Both the left and right subtrees must also be binary search trees.
 *
 * @author kevinliu
 * @Solution Divide and conquer
 * 
 */
public class ValidateBinarySearchTree {
	public boolean isValidBST(TreeNode root) {
		return isValidBST(root, null, null);
	}

	private boolean isValidBST(TreeNode node, TreeNode left, TreeNode right) {
		if (node == null) {
			return true;
		}
		if (left != null && node.val <= left.val) {
			return false;
		}
		if (right != null && node.val >= right.val) {
			return false;
		}
		return isValidBST(node.left, left, node) && isValidBST(node.right, node, right);
	}
}
