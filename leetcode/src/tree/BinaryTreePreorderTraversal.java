package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * Given a binary tree, return the inorder traversal of its nodes' values.
 *
 * @author kevinliu
 * @Solution: Recursion
 */
public class BinaryTreePreorderTraversal {

    // Recursive & LinkedList
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

    // Iterate & LinkedList
    public List<Integer> preorderTraversal_2(TreeNode root) {
        List<Integer> res = new LinkedList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;
        while (cur != null || !stack.isEmpty()) {
            if (cur != null) {
                res.add(cur.val);
                stack.push(cur.right);
                cur = cur.left;
            } else {
                cur = stack.pop();
            }
        }
        return res;
    }
}
