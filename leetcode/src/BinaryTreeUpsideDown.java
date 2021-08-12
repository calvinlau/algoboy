import java.util.Stack;

/**
 * Given a binary tree where all the right nodes are either leaf nodes with a
 * sibling (a left node that shares the same parent node) or empty, flip it
 * upside down and turn it into a tree where the original right nodes turned
 * into left leaf nodes. Return the new root. For example: Given a binary tree
 * {1,2,3,4,5},
 * Given a binary tree {1,2,3,4,5},
 *     1
 *    / \
 *   2   3
 *  / \
 * 4   5
 * return the root of the binary tree [4,5,2,#,#,3,1].
 *    4
 *   / \
 *  5   2
 *     / \
 *    3   1  
 * @author calvinliu
 * @solution 1. Stack
 *           2. Recursion
 */
public class BinaryTreeUpsideDown {

	public TreeNode upsidedown_1(TreeNode root) {
		Stack<TreeNode> stack = new Stack<TreeNode>();
		TreeNode node = root;
		while(node != null) {
			stack.push(node);
			node = node.left;
		}
		TreeNode ret = stack.peek();
		while(!stack.isEmpty()) {
			node = stack.pop();
			if (stack.peek() != null) {
				node.left = stack.peek().right;
				node.right = stack.peek();
			} else {
				node.left = null;
				node.right = null;
			}
		}
		return ret;
	}
	
	public TreeNode upsidedown_2(TreeNode root) {
		return dfs(root, null);
	}

	private TreeNode dfs(TreeNode node, TreeNode parent) {
		if (node == null) return parent;
		TreeNode root = dfs(node.left, node);
		node.left = parent == null ? parent : parent.right;
		node.right = parent;
		return root;
	}
}

