package tree;

/**
 * 235. Lowest Common Ancestor of a Binary Search Tree
 *
 * Given a binary search tree (BST), find the lowest common ancestor (LCA) of
 * two given nodes in the BST.
 * 
 * @author kevinliu
 * @Solution Divide and conquer, using BST property
 * 
 */
public class LowestCommonAncestorofaBinarySearchTree {

	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		if (root.val < Math.min(p.val, q.val)) {
			return lowestCommonAncestor(root.right, p, q);
		} else if (root.val > Math.max(p.val, q.val)) {
			return lowestCommonAncestor(root.left, p, q);
		}
		return root;
	}
}
