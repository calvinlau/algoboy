import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * Given a binary tree, return the postorder traversal of its nodes' values.
 *
 * @author kevinliu
 * @Solution: Recursion
 */
public class BinaryTreePostorderTraversal {

    // Recursive & LinkedList
    private final List<Integer> ret = new ArrayList<>();

    public List<Integer> postorderTraversal(TreeNode root) {
        if (root == null) {
            return ret;
        }
        postorderTraversal(root.left);
        postorderTraversal(root.right);
        ret.add(root.val);
        return ret;
    }

    // Iterate & LinkedList
    public List<Integer> postorderTraversal_2(TreeNode root) {
        List<Integer> res = new LinkedList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;
        while (cur != null || !stack.isEmpty()) {
            if (cur != null) {
                stack.add(new TreeNode(cur.val));
                if (cur.right != null) {
                    stack.add(cur.right);
                }
                cur = cur.left;
            } else {
                cur = stack.peek();
                if (cur.right == null && cur.left == null) {
                    res.add(stack.pop().val);
                    cur = null;
                } else {
                    cur = stack.pop();
                }
            }
        }
        return res;
    }
}
