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
public class BinaryTreeInorderTraversal {

    // Recursive & LinkedList
    private final List<Integer> ret = new ArrayList<>();

    public List<Integer> inorderTraversal(TreeNode root) {
        if (root == null) {
            return ret;
        }
        inorderTraversal(root.left);
        ret.add(root.val);
        inorderTraversal(root.right);
        return ret;
    }

    // Iterate & LinkedList
    public List<Integer> inorderTraversal_2(TreeNode root) {
        List<Integer> list = new LinkedList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;

        while (cur != null || !stack.isEmpty()) {
            while (cur != null) {
                stack.add(cur);
                cur = cur.left;
            }
            cur = stack.pop();
            list.add(cur.val);
            cur = cur.right;
        }
        return list;
    }
}
