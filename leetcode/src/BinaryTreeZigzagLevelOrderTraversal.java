import java.util.*;

/**
 * Given a binary tree, return the zigzag level order traversal of its nodes' values. 
 * (ie, from left to right, then right to left for the next level and alternate between).
 * For example:
 *   Given binary tree {3,9,20,#,#,15,7},
 * Return:
 *   [
 *     [3],
 *     [20,9],
 *     [15,7]
 *   ]
 *   
 * @author calvinliu
 * @Solution: BFS - Queue
 * 
 */
public class BinaryTreeZigzagLevelOrderTraversal {

	private final List<List<Integer>> ret = new ArrayList<>();

	public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
		preOrder(root, 0);
		for (int i = 0; i < ret.size(); i++) {
			if (i % 2 != 0) {
				Collections.reverse(ret.get(i));
			}
		}
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

	public static List<List<Integer>> zigzagLevelOrder_2(TreeNode root) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		if (root == null) {
			return result;
		}
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.offer(root);
		while (!queue.isEmpty()) {
			List<Integer> level = new ArrayList<Integer>();
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
		for (int i = 0; i < result.size(); i++) {
			if (i % 2 != 0) {
				List<Integer> tmpList = result.get(i);
				for (int j = 0, k = tmpList.size() - 1; j < k; j++, k--) {
					Integer tmp = tmpList.get(j);
					tmpList.set(j, tmpList.get(k));
					tmpList.set(k, tmp);
				}
			}
		}
		return result;
	}
}
