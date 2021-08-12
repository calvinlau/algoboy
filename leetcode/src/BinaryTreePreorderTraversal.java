import java.util.ArrayList;
import java.util.List;

/**
 * Given a binary tree, return the inorder traversal of its nodes' values.
 * 
 * @author calvinliu
 * @Solution: Recursion
 * 
 */
public class BinaryTreePreorderTraversal {

	public List<Integer> preorderTraversal(TreeNode root) {
		List<Integer> ret = new ArrayList<Integer>();
		if (root != null) {
			preorderTraversal(root, ret);
		}
		return ret;
	}

	private void preorderTraversal(TreeNode root, List<Integer> ret) {
		ret.add(root.val);
		if (root.left != null) {
			preorderTraversal(root.left, ret);
		}
		if (root.right != null) {
			preorderTraversal(root.right, ret);
		}
	}
}
