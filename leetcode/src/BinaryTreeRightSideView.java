import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Given a binary tree, imagine yourself standing on the right side of it,
 * return the values of the nodes you can see ordered from top to bottom.
 * 
 * @author calvinliu
 * @Solution 1. BFS - Queue
 * 
 */
public class BinaryTreeRightSideView {

	public List<Integer> rightSideView(TreeNode root) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		if (root == null)
			return result;
		LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(root);
		while (queue.size() > 0) {
			int size = queue.size();
			for (int i = 0; i < size; i++) {
				TreeNode top = queue.remove();
				// the first element in the queue (right-most of the tree)
				if (i == 0) {
					result.add(top.val);
				}
				if (top.right != null) {
					queue.add(top.right);
				}
				if (top.left != null) {
					queue.add(top.left);
				}
			}
		}
		return result;
	}
}
