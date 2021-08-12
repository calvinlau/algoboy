import java.util.ArrayList;
import java.util.List;

/**
 * Given a binary tree, return the postorder traversal of its nodes' values.
 * 
 * @author calvinliu
 * @Solution: Recursion
 * 
 */
public class BinaryTreePostorderTraversal {

	public List<Integer> postorderTraversal(TreeNode root) {
		List<Integer> ret = new ArrayList<Integer>();
		if (root != null) {
			postorderTraversal(root, ret);
		}
		return ret;
	}

	private void postorderTraversal(TreeNode root, List<Integer> ret) {
		if (root.left != null) {
			postorderTraversal(root.left, ret);
		}
		if (root.right != null) {
			postorderTraversal(root.right, ret);
		}
		ret.add(root.val);
	}
}
