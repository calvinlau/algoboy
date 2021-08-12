import java.util.ArrayList;
import java.util.List;

/**
 * Given a binary tree, flatten it to a linked list in-place.
 * 
 * @author calvinliu
 * @Solution Pre-order
 * 
 */
public class FlattenBinaryTreetoLinkedList {

	public void flatten(TreeNode root) {
		List<TreeNode> ret = preorderTraversal(root);
		for (int i = 0; i < ret.size(); i++) {
			ret.get(i).left = null;
			if (i != ret.size() - 1) {
				ret.get(i).right = ret.get(i + 1);
			} else {
				ret.get(i).right = null;
			}
		}
	}

	public List<TreeNode> preorderTraversal(TreeNode root) {
		List<TreeNode> ret = new ArrayList<TreeNode>();
		if (root != null) {
			preorderTraversal(root, ret);
		}
		return ret;
	}

	private void preorderTraversal(TreeNode root, List<TreeNode> ret) {
		ret.add(root);
		if (root.left != null) {
			preorderTraversal(root.left, ret);
		}
		if (root.right != null) {
			preorderTraversal(root.right, ret);
		}
	}
}
