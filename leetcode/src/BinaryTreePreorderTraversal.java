import java.util.ArrayList;
import java.util.List;

/**
 * Given a binary tree, return the inorder traversal of its nodes' values.
 *
 * @author kevinliu
 * @Solution: Recursion
 */
public class BinaryTreePreorderTraversal {

	private final List<Integer> ret = new ArrayList<>();

	public List<Integer> preorderTraversal(TreeNode root) {
        if (root == null) {
            return ret;
        }
		ret.add(root.val);
		preorderTraversal(root.left);
		preorderTraversal(root.right);
        return ret;
    }
}
