import java.util.ArrayList;
import java.util.List;

/**
 * Given a binary tree, return the inorder traversal of its nodes' values.
 * 
 * @author calvinliu
 * @Solution: Recursion
 * 
 */
public class BinaryTreeInorderTraversal {

	public List<Integer> inorderTraversal(TreeNode root) {
		List<Integer> ret = new ArrayList<Integer>();
		if (root != null) {
			inorderTraversal(root, ret);
		}
		return ret;
	}

	private void inorderTraversal(TreeNode root, List<Integer> ret) {
		if (root.left != null) {
			inorderTraversal(root.left, ret);
		}
		ret.add(root.val);
		if (root.right != null) {
			inorderTraversal(root.right, ret);
		}
	}
}
