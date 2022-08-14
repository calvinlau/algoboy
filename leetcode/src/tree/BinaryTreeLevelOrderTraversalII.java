package tree;

import java.util.*;

/**
 * Given a binary tree, return the bottom-up level order traversal of its nodes' values. (ie, from left to right, level by level from leaf to root).
 * For example:
 *   Given binary tree {3,9,20,#,#,15,7},
 * Return:
 *   [
 *    [15,7],
 *    [9,20],
 *    [3]
 *   ]
 *   
 * @author kevinliu
 * @Solution: BFS - Queue
 *   
 */
public class BinaryTreeLevelOrderTraversalII {

	private final List<List<Integer>> ret = new ArrayList<>();

	public List<List<Integer>> levelOrderBottom(TreeNode root) {
		preOrder(root, 0);
		Collections.reverse(ret);
		return ret;
	}

	private void preOrder(TreeNode root, int level) {
		if (root == null) {
			return;
		}
		if (ret.size() == level) {
			ret.add(new ArrayList<>());
		}
		ret.get(level).add(root.val);
		preOrder(root.left, level + 1);
		preOrder(root.right, level + 1);
	}

	public static List<List<Integer>> levelOrder(TreeNode root) {
		List<List<Integer>> result = new ArrayList<>();
		if (root == null) {
			return result;
		}
		Queue<TreeNode> queue = new LinkedList<>();
		queue.offer(root);
		while (!queue.isEmpty()) {
			List<Integer> level = new ArrayList<>();
			int size = queue.size();
			for (int i = 0; i < size; i++) {
				TreeNode head = queue.poll();
				level.add(head.val);
				if (head.left != null) {
					queue.offer(head.left);
				}
				if (head.right != null) {
					queue.offer(head.right);
				}
			}
			result.add(level);
		}
		for (int i = 0, j = result.size() - 1; i < j; i++, j--) {
			List<Integer> tmp = result.get(i);
			result.set(i, result.get(j));
			result.set(j, tmp);
		}
		return result;
	}
}
