package tree;

import java.util.Stack;

/**
 * Given the root of a Binary Search Tree (BST), return the minimum absolute difference between the values of any two different nodes in the tree.
 *
 * Input: root = [1,0,48,null,null,12,49]
 * Output: 1
 *
 * @author kevinliu
 * @Solution BFS
 * 
 */
public class MinimumAbsoluteDifferenceinBST {

	public int getMinimumDifference(TreeNode root) {
		int min = Integer.MAX_VALUE;
		Stack<TreeNode> stack = new Stack<>();
		TreeNode pre = null;
		while (root != null || !stack.isEmpty()) {
			while (root != null) {
				stack.add(root);
				root = root.left;
			}
			TreeNode cur = stack.pop();
			if (pre != null) {
				min = Math.min(min, Math.abs(cur.val - pre.val));
			}
			pre = cur;
			root = cur.right;
		}
		return min;
	}
}
