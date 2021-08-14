import java.util.Stack;

import com.cloudtale.algo.leetcode.tree.TreeNode;

/**
 * Implement an iterator over a binary search tree (BST). Your iterator will be
 * initialized with the root node of a BST.
 * 
 * Calling next() will return the next smallest number in the BST.
 * 
 * Note: next() and hasNext() should run in average O(1) time and uses O(h)
 * memory, where h is the height of the tree.
 * 
 * @author calvinliu
 * @Solution Use stack to save every level's smallest node
 */
public class BSTIterator {
	private Stack<TreeNode> stack = new Stack<>();
	private TreeNode current;

	// @param root: The root of binary tree.
	public BSTIterator(TreeNode root) {
		current = root;
	}

	// @return: True if there has next node, or false
	public boolean hasNext() {
		return (current != null || !stack.isEmpty());
	}

	// @return: return next node
	public TreeNode next() {
		while (current != null) {
			stack.push(current);
			current = current.left;
		}
		current = stack.pop();
		TreeNode node = current;
		current = current.right;
		return node;
	}
}

/**
 * Your BSTIterator will be called like this: BSTIterator i = new
 * BSTIterator(root); while (i.hasNext()) v[f()] = i.next();
 */
