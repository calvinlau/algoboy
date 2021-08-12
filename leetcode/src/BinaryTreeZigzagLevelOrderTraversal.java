import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

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

	public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
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
