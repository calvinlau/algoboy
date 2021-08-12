/**
 * Two elements of a binary search tree (BST) are swapped by mistake.
 * Recover the tree without changing its structure.
 * 
 * @author calvinliu
 * @Solution Find first and secound, then swap
 * 
 */
public class RecoverBinarySearchTree {
	private TreeNode firstElement = null;
	private TreeNode secondElement = null;
	private TreeNode lastElement = new TreeNode(Integer.MIN_VALUE);

	private void traverse(TreeNode root) {
		if (root == null) {
			return;
		}
		traverse(root.left);
		if (firstElement == null && root.val < lastElement.val) {
			firstElement = lastElement;
		}
		if (firstElement != null && root.val < lastElement.val) {
			secondElement = root;
		}
		lastElement = root;
		traverse(root.right);
	}

	public void recoverTree(TreeNode root) {
		traverse(root);
		int temp = firstElement.val;
		firstElement.val = secondElement.val;
		secondElement.val = temp;
	}
}
